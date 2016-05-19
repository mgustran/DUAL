
var w = 500;
var h = 300;
var padding = 30;

//     dataset aleatorio
var dataset = [];
var numDataPoints = 50;
var maxRange = Math.random() * 1000;
for (var i = 0; i < numDataPoints; i++) {
    var newNumber1 = Math.floor(Math.random() * maxRange);
    var newNumber2 = Math.floor(Math.random() * maxRange);
    dataset.push([newNumber1, newNumber2]);
}

var xScale = d3.scale.linear()
    .domain([0, d3.max(dataset, function(d) { return d[0]; })])
    .range([padding, w - padding * 2]);
var yScale = d3.scale.linear()
    .domain([0, d3.max(dataset, function(d) { return d[1]; })])
    .range([h - padding, padding]);
//Define X axis
var xAxis = d3.svg.axis()
    .scale(xScale)
    .orient("bottom")
    .ticks(5);
//Define Y axis
var yAxis = d3.svg.axis()
    .scale(yScale)
    .orient("left")
    .ticks(5);
var rScale = d3.scale.linear()
    .domain([0, d3.max(dataset, function(d) { return d[1]; })])
    .range([4, 9]);
//     SVG
var svg = d3.select("body")
    .append("svg")
    .attr("width", w)
    .attr("height", h);
svg.append("clipPath")
    .attr("id", "chart-area")
    .append("rect")
    .attr("x", padding)
    .attr("y", padding)
    .attr("width", w - padding * 3)
    .attr("height", h - padding * 2);
//Create circles
svg.selectAll("circle")
    .data(dataset)
    .enter()
    .append("circle")
    .attr("clip-path", "url(#chart-area)")
    .attr("cx", function(d) {
        return xScale(d[0]);
    })
    .attr("cy", function(d) {
        return yScale(d[1]);
    })
    .attr("r", function(d) {
        return rScale(d[1]);
    })
    .attr("fill", "blue")


//Create X axis
svg.append("g")
    .attr("class", "x axis")
    .attr("transform", "translate(0," + (h - padding) + ")")
    .call(xAxis);

//       Y AXIS
svg.append("g")
    .attr("class", "y axis")
    .attr("transform", "translate(" + padding + ",0)")
    .call(yAxis);
//     RECARGA		
d3.select("p")
    .on("click", function() {
        var numValues = dataset.length;
        var maxRange = Math.random() * 1000;
        dataset = [];
        for (var i = 0; i < numValues; i++) {
            var newNumber1 = Math.floor(Math.random() * maxRange);
            var newNumber2 = Math.floor(Math.random() * maxRange);
            dataset.push([newNumber1, newNumber2]);								}

        //     recarga escalas
        xScale.domain([0, d3.max(dataset, function(d) { return d[0]; })]);
        yScale.domain([0, d3.max(dataset, function(d) { return d[1]; })]);
        //       recarga circulos
        svg.selectAll("circle")
            .data(dataset)
            .transition()
            .duration(1000)
            .attr("cx", function(d) {
                return xScale(d[0]);
            })
            .attr("cy", function(d) {
                return yScale(d[1]);
            })
            .attr("r", function(d) {
                return rScale(d[1])


            });
        //      recarga  X AXIS
        svg.select(".x.axis")
            .transition()
            .duration(1000)
            .call(xAxis);

        //     recarga   Y AXIS
        svg.select(".y.axis")
            .transition()
            .duration(1000)
            .call(yAxis);
    });