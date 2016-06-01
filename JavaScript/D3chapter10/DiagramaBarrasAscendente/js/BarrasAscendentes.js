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

//          SVG
var svg = d3.select("body")
    .append("svg")
    .attr("width", w)
    .attr("height", h);
//         Barras
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
    })
    .on("mouseover", function() {
        d3.select(this)
            .attr("fill", "orange");
    })
    .on("mouseover", function() {
        d3.select(this)
            .attr("fill", "blue");
    })
    .on("mouseout", function(d) {
        d3.select(this)
            .transition()
            .duration(250)
            .attr("fill", "rgb(0, "+ (d * 10) +", 0 )");
    })
    .on("click", function() {
        sortBarsAndText()

    })

;

//           Etiquetas
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
    .attr("font-family", "arial")
    .attr("font-size", "13px")
    .attr("fill", "black")
    .attr("font-weight","bold");

//          FUNCION Orden Ascendente
var sortBarsAndText = function() {
    svg.selectAll("rect")
        .sort(function(a, b) {
            return d3.ascending(a, b);
        })
        .transition()
        .duration(1000)
        .attr("x", function(d, i) {
            return xScale(i);
        });
    svg.selectAll("text")
        .sort(function(a,b){
            return d3.ascending(a,b);
        })
        .transition()
        .duration(500)
        .attr("x", function(d, i) {
            return xScale(i) + xScale.rangeBand() / 2;
        })
}
       
			   
			   
			   
