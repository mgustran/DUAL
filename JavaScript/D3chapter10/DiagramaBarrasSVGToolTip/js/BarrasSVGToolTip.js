/**
 * Created by mgustran on 31/05/2016.
 */
var w = 600;
var h = 250;

var dataset = [ 5, 10, 13, 19, 21, 25, 22, 18, 15, 13,
    11, 12, 15, 20, 18, 17, 16, 18, 23, 25 ];
var xScale = d3.scale.ordinal()
    .domain(d3.range(dataset.length))
    .rangeRoundBands([0, w], 0.05);
var yScale = d3.scale.linear()
    .domain([0, d3.max(dataset)])
    .range([0, h]);

//       SVG
var svg = d3.select("body")
    .append("svg")
    .attr("width", w)
    .attr("height", h);

//       Barras
svg.selectAll("rect")
    .data(dataset)
    .enter()
    .append("rect")
    .attr("x", function(d, i) {
        return xScale(i);
    })
    .attr("y", function(d) {
        return h - yScale(d);
    })
    .attr("width", xScale.rangeBand())
    .attr("height", function(d) {
        return yScale(d);
    })
    .attr("fill", function(d) {
        return "rgb(0, "+ (d * 12) +", 0 )";
    })
    .on("mouseover", function(d) {

        //   Aqui se definen dos variables que adoptaran la posicion deseada de las etiquetas basandose en la posicion x/y de las barras, luego se pasan como atributos para el text
        var xPosition = parseFloat(d3.select(this).attr("x")) + xScale.rangeBand() / 2;
        var yPosition = parseFloat(d3.select(this).attr("y")) + 14;

        //           ETIQUETA TOOLTIP 
        svg.append("text")
            .attr("id", "tooltip")
            .attr("x", xPosition)
            .attr("y", yPosition)
            .attr("text-anchor", "middle")
            .attr("font-family", "arial")
            .attr("font-size", "13px")
            .attr("font-weight", "bold")
            .attr("fill", "white")
            .text(d);
    })

    // Elimina la etiqueta en quitar el raton de la barra  
    .on("mouseout", function() {
        d3.select("#tooltip").remove();

    })
    .on("click", function() {
        sortBars();
    });


var ordenDescendiente = false;

//         Ordenacion de las  barras
var sortBars = function() {
    ordenDescendiente = !ordenDescendiente;
    svg.selectAll("rect")
        .sort(function(a, b) {
            if (ordenDescendiente) {
                return d3.ascending(a, b);
            } else {
                return d3.descending(a, b);
            }
        })
        .transition()
        .delay(function(d, i) {
            return i * 50;
        })
        .duration(1400)
        .attr("x", function(d, i) {
            return xScale(i);
        });
};			