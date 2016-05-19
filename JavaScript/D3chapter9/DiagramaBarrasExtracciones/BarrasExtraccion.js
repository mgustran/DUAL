//     Variables Dist
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

//         SVG 
var svg = d3.select("body")
    .append("svg")
    .attr("width", w)
    .attr("height", h);
//          Barras
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
        return "rgb(0, "+ (d * 10) +", 0 )";
    });
//      Etiquetas
svg.selectAll("text")
    .data(dataset)
    .enter()
    .append("text")
    .text(function(d) {
        return d;
    })
    .attr("text-anchor", "middle")
    .attr("x", function(d, i) {
        return xScale(i) + xScale.rangeBand() / 2;
    })
    .attr("y", function(d) {
        return h - yScale(d) + 14;
    })
    .attr("font-family", "sans-serif")
    .attr("font-size", "13px")
    .attr("font-weight", "bold")
    .attr("fill", "red");
//        Click + Recarga
d3.select("p")
    .on("click", function() {
        dataset.shift();
        xScale.domain(d3.range(dataset.length));
        yScale.domain([0, d3.max(dataset)]);
        //       Select Barras
        var bars = svg.selectAll("rect")
            .data(dataset);

        //     Barra Siguiente        
        bars.enter()
            .append("rect")
            .attr("x", w)
            .attr("y", function(d) {
                return h - yScale(d);
            })
            .attr("width", xScale.rangeBand())
            .attr("height", function(d) {
                return yScale(d);
            })


        svg.selectAll("text")
            .data(dataset)
            .transition()
            .duration(250)
            .text(function(d) {
                return d;
            })

            .attr("y", function(d) {
                return h - yScale(d) +14;
            });





        //         Recarga     Barras
        bars.transition()
            .duration(500)
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
                return "rgb(0, "+ (d * 10) +", 0 )";
            })


        //      transicion etiquetas
        var lab = svg.selectAll("text").data(dataset)
        lab.enter()
            .append("text")

        lab
            .attr("x", function(d, i) {
                return xScale(i) + xScale.rangeBand() / 2;
            });

        lab.exit()
            .remove();


        ;
        //        Salida Barras
        bars.exit()
            .transition()


            .duration(500)
            .attr("x", w)

            .remove();

    });