/**
 * Created by mgustran on 19/05/2016.
 */
var visual = {
    w : 600,
    h : 250,
    dataset : [ 5, 10, 13, 19, 21, 25, 22, 18, 15, 13,
        11, 12, 15, 20, 18, 17, 16, 18, 23, 25 ]};


var xScale = d3.scale.ordinal()
    .domain(d3.range(visual.dataset.length))
    .rangeRoundBands([0, visual.w], 0.05);
var yScale = d3.scale.linear()
    .domain([0, d3.max(visual.dataset)])
    .range([0, visual.h]);

var svg = d3.select("body")
    .append("svg")
    .attr("width", visual.w)
    .attr("height", visual.h);

svg.selectAll("rect")
    .data(visual.dataset)
    .enter()
    .append("rect")
    .attr("x", function(d, i) {
        return xScale(i);
    })
    .attr("y", function(d) {
        return visual.h - yScale(d);
    })
    .attr("width", xScale.rangeBand())
    .attr("height", function(d) {
        return yScale(d);
    })
    .attr("fill", function(d) {
        return "rgb(0, "+ (d * 10) +", 0 )";
    });
//Crear etiquetas

svg.selectAll("text")
    .data(visual.dataset)
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
        return visual.h - yScale(d) + 14;
    })
    .attr("font-family", "sans-serif")
    .attr("font-size", "11px")
    .attr("fill", "white");
//Click + transiciones
d3.select("p")
    .on("click", function() {

        var numValues = visual.dataset.length;
        visual.dataset = [];
        for (var i = 0; i < numValues; i++) {
            var newNumber = Math.floor(Math.random() * 25);
            visual.dataset.push(newNumber);
        }
        //Actualiza
        svg.selectAll("rect")
            .data(visual.dataset)
            .transition()
            .delay(function(d, i) {
                return i / visual.dataset.length * 1000;
            })
            .duration(500)
            .attr("y", function(d) {
                return visual.h - yScale(d);
            })
            .attr("height", function(d) {
                return yScale(d);
            })
            .attr("fill", function(d) {
                return "rgb(0, "+ (d * 10) +", 0 )"; + ")";
            });

        svg.selectAll("text")
            .data(visual.dataset)
            .transition()
            .delay(function(d, i) {
                return i / visual.dataset.length * 1000;
            })
            .duration(500)
            .text(function(d) {
                return d;
            })
            .attr("x", function(d, i) {
                return xScale(i) + xScale.rangeBand() / 2;
            })
            .attr("y", function(d) {
                return visual.h - yScale(d) + 14;
            });

    });