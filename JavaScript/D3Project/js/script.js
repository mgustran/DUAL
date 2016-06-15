/**
 * Created by mgustran on 12/06/2016.
 */

var m = [20, 120, 20, 120],
    w = 2000 - m[1] - m[3],
    h = 800 - m[0] - m[2],
    i = 0,
    suspenso=4,
    aprobado=5,
    root;

var arbol = d3.layout.tree()
    .size([h, w]);

var diagonal = d3.svg.diagonal()
    .projection(function(d) { return [d.y, d.x]; });

var vis = d3.select("#body").append("svg:svg")
    .attr("width", w + m[1] + m[3])
    .attr("height", h + m[0] + m[2])
    .append("svg:g")
    .attr("transform", "translate(" + m[3] + "," + m[0] + ")");

d3.json("json/notasCurso.json", function(json) {
    root = json;
    root.x0 = h / 2;
    root.y0 = 0;


    function toggleAll(d) {
        if (d.children) {
            d.children.forEach(toggleAll);
            toggle(d);
        }
    }

    // Seleccion de los nodos a INICIAR
    root.children.forEach(toggleAll);
    // toggle(root.children[1]);
    // toggle(root.children[1].children[2]);
    // toggle(root.children[5]);
    // toggle(root.children[5].children[0]);

    update(root);
});

function update(source) {
    var duration = 3000;

    // Inicializacion nodos
    var nodes = arbol.nodes(root).reverse();

    // Tamaño pantalla de visualizacion elemento
    nodes.forEach(function(d) { d.y = d.depth * 320; });

    // Update de nodos
    var nodo = vis.selectAll("g.node")
        .data(nodes, function(d) { return d.id || (d.id = ++i); });

    // Acceder al nodo hijo
    var nodoEnter = nodo.enter().append("svg:g")
        .attr("class", "node")
        .attr("transform", function(d) { return "translate(" + source.y0 + "," + source.x0 + ")"; })
        .on("click", function(d) { toggle(d); update(d); });

    nodoEnter.append("svg:circle")
        .attr("r", 1e-6)
        .style("fill", function(d) { return d._children ? "#2fff00" : "#fff"
        })
        .style("stroke", function(d) {
            if (d.mark < suspenso) {
                return "red";
            } else if (d.mark < aprobado) {
                return "orange";
            } else {
                return "green";
            }
        })
        .style("stroke-width", 10);

    nodoEnter.append("svg:text")
        .attr("x", function(d) { return d.children || d._children ? -10 : 10; })
        .attr("dy", ".35em")
        .attr("text-anchor", function(d) { return d.children  || d._children ? "start" : "start"; })
        // .style("font-size", "14")
        .style("font-weight", "bold")
        // .style("font-family", )
        .text(function(d) { return d.name; })
        .style("fill-opacity", 1e-6);

    // Transicion a la nueva actualizacion
    var nodoUpdate = nodo.transition()
        .duration(duration)
        .attr("transform", function(d) { return "translate(" + d.y + "," + d.x + ")"; });

    nodoUpdate.select("circle")
        .attr("r", function(d) { return Math.sqrt(d.size) /5 })
        .style("fill", function(d) { return d._children ? "#2fff00" : "#fff"; });

    nodoUpdate.select("text")
        .style("fill-opacity", 1)
        .style("fontSize", 14);

    // Salida del nodo hijo
    var salidaNodo = nodo.exit().transition()
        .duration(duration)
        .attr("transform", function(d) { return "translate(" + source.y + "," + source.x + ")"; })
        .remove();

    salidaNodo.select("circle")
        .attr("r", 1e-6);

    salidaNodo.select("text")
        .style("fill-opacity", 1e-6);

    // Actualizar enlaces de los nodos
    var link = vis.selectAll("path.link")
        .data(arbol.links(nodes), function(d) { return d.target.id; });

    // Entrada de enlaces de nodo al elemento svg
    link.enter().insert("svg:path", "g")
        .attr("class", "link")
        .attr("d", function(d) {
            var o = {x: source.x0, y: source.y0};
            return diagonal({source: o, target: o});
        })
        .transition()
        .duration(duration)
        .attr("d", diagonal);

    // Transicion a la nueva actualizacion
    link.transition()
        .duration(duration)
        .attr("d", diagonal);

    link.exit().transition()
        .duration(duration)
        .attr("d", function(d) {
            var o = {x: source.x, y: source.y};
            return diagonal({source: o, target: o});
        })
        .remove();

    nodes.forEach(function(d) {
        d.x0 = d.x;
        d.y0 = d.y;
    });
}

function toggle(d) {
    if (d.children) {
        d._children = d.children;
        d.children = null;
    } else {
        d.children = d._children;
        d._children = null;
    }
}