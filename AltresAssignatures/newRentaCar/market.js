//***GLOBAL VARIBELS***
var geocoder; 
var map; // google map
var lat; // geolocation lat cord
var lon; // geolocation lon cord
var myLatlng; //cord object
var origin; 
var destination;	
var directionsDisplay; 
var directionsService;
var result;
var user_distance; //distanse in meters
var curent_id = 0;
var curent_gear; 
var curent_car;
var curent_DBid;
var player;
//***SING IN AND REGESTRATION SCRIPTS***

function exit() //login out from system
	{
	localStorage.loginState = 0;	
	}

// ***CARS DATABASE & TEMPLATES & FUNCTIONS***
		function buy(id,gear,car)
		{
		  curent_id=id;
		  curent_gear=gear;
		  curent_car=car;
		  curent_AraayPosition= getAraayPosition(id);
		  loadMapPage();
		}
		function getAraayPosition(id){
			id=(id%100000)-1;
			return id;
		}
		var cars = [
				// gear_type: 1 =autoatic gear_type: 0 = manual
				{product_name:'Mazda 3' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTv-LCAAbWNUHfc1npX3Yt1V7oVnHt3DFVnQOftW_tr1ip8K60QJA',carID:100001 ,gear_type:1,stock:1},

				{product_name:'Suzuki Swift' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTM98TERrxHjXuTULSHqeKahBvLG7HlfjSepx89VnTH5ftjDWyJ',carID:100002 ,gear_type:1,stock:1},

				{product_name:'Mazda 6' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTv-LCAAbWNUHfc1npX3Yt1V7oVnHt3DFVnQOftW_tr1ip8K60QJA',carID:100003 ,gear_type:1,stock:1},

				{product_name:'Toyota Corola' ,image_source:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkbM6hJGxWF3oJjf-Ew3Kag3e9mPImIjxQ3X42Qd7xvT8Q4PDa-w',carID:100004 ,gear_type:1,stock:1},

				{product_name:'Nissan Micra' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT5l3zVrdoEvZqCC-13A97oxWmmMSIojL2sVHaSGBMtVtM2Rv_2QQ',carID:100005 ,gear_type:1,stock:1},

				{product_name:'Alfa Romeo Julieta' ,image_source:'http://upload.wikimedia.org/wikipedia/en/2/24/Alfa_Romeo.svg',carID:100006 ,gear_type:1,stock:1},

				{product_name:'Ford Jazz' ,image_source:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_xSPUIOEW17oAsh-EVTd6Onl-yje0KQsSjNivjDkJuuhvjT8r',carID:100007 ,gear_type:1,stock:1},

				{product_name:'BMW 990' ,image_source:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFaFBY9Rfd6CsihAK0SU-LjOkSEUYvHoqW-RwXtvlcXcxy2VkO',carID:100008 ,gear_type:1,stock:1},

				{product_name:'Mitsubishi Lanser' ,image_source:'http://bwoodyperformance.com/images/zzzMitsubishi-Motors-logo.jpg',carID:100009 ,gear_type:1,stock:1},
				{product_name:'Mazda 3' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTv-LCAAbWNUHfc1npX3Yt1V7oVnHt3DFVnQOftW_tr1ip8K60QJA',carID:100010 ,gear_type:0,stock:1},

				{product_name:'Suzuki Swift' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTM98TERrxHjXuTULSHqeKahBvLG7HlfjSepx89VnTH5ftjDWyJ',carID:100011 ,gear_type:0,stock:1},

				{product_name:'Mazda 6' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTv-LCAAbWNUHfc1npX3Yt1V7oVnHt3DFVnQOftW_tr1ip8K60QJA',carID:100012 ,gear_type:0,stock:1},

				{product_name:'Toyota Corola' ,image_source:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkbM6hJGxWF3oJjf-Ew3Kag3e9mPImIjxQ3X42Qd7xvT8Q4PDa-w',carID:100013 ,gear_type:0,stock:1},

				{product_name:'Nissan Micra' ,image_source:'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT5l3zVrdoEvZqCC-13A97oxWmmMSIojL2sVHaSGBMtVtM2Rv_2QQ',carID:100014 ,gear_type:0,stock:1},

				{product_name:'Alfa Romeo Julieta' ,image_source:'http://upload.wikimedia.org/wikipedia/en/2/24/Alfa_Romeo.svg',carID:100015 ,gear_type:0,stock:1},

				{product_name:'Ford Jazz' ,image_source:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_xSPUIOEW17oAsh-EVTd6Onl-yje0KQsSjNivjDkJuuhvjT8r',carID:100016 ,gear_type:0,stock:1},

				{product_name:'BMW 990' ,image_source:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFaFBY9Rfd6CsihAK0SU-LjOkSEUYvHoqW-RwXtvlcXcxy2VkO',carID:100017 ,gear_type:0,stock:1},
				
				{product_name:'Mitsubishi Lanser' ,image_source:'http://bwoodyperformance.com/images/zzzMitsubishi-Motors-logo.jpg',carID:100018 ,gear_type:0,stock:1},
					];	
		function getTemplate (templateId, context) 
			{
				var source = $("#"+templateId).html();
				var template = 	Handlebars.compile(source);
				var html = template(context);
				return html;
			};
// ***GEOLOCATION & MAP & COST CALCULATION SCRIPTS***


			function getLocation() //check if user browser support geolocation 
			{
					if (navigator.geolocation)
					    {
					    navigator.geolocation.getCurrentPosition(showPosition);
					    }
			 		 else{alert('You must enable geolocation in your browser!');}
			};

			function showPosition(position) //get user cordinates and lunch map!
			{
					lat = position.coords.latitude;
					lon = position.coords.longitude;  
					initialize();
			}

  
			function initialize() //create map 
			{
				
					directionsService  = new google.maps.DirectionsService(); //create DS
					directionsDisplay = new google.maps.DirectionsRenderer(); //create DD
					var myLatlng = new google.maps.LatLng(lat,lon); //create googleMaps cordinatin object
							var mapOptions = 
					  		{
					          center: myLatlng,
					          zoom: 13,
					          mapTypeId: google.maps.MapTypeId.ROADMAP
					        }; //onCreate map options
					geocoder = new google.maps.Geocoder(); //create geocoding service
					map = new google.maps.Map(document.getElementById("map-canvas"),mapOptions);
				
					directionsDisplay.setMap(map); // set DD on map

				var userPositionMarker = new google.maps.Marker({ //create marker with user curent position
	   	 			position: myLatlng,	//set user cordinates
	   				map: map,
	   				animation: google.maps.Animation.DROP,
	  		  		title:"You are here!"
					});
				userPositionMarker.setMap(map); //Add user curent position marker

			}; 
			function calcRoute() { //get strings from user input + user position and show directions on map 
						if (curent_id != 0)
						{
						var start = lat+","+lon;
						var end = document.getElementById('address').value;
						var request = {
						      origin:start,
						      destination:end,
						      travelMode: google.maps.TravelMode.DRIVING
						};
						directionsService.route(request, function(response, status) {
						    if (status == google.maps.DirectionsStatus.OK) {
						      	directionsDisplay.setDirections(response);

						    	}
						  	});
						  calculateDistances(start,end); //run distance calculator with curent position data
						}
						else
						{
							alert('Chose car before calculate trip cost!');
							loadCarsPage();
						}
					  
			}
			function calculateDistances(start,end) { //calculate distances by two strings
					  var service = new google.maps.DistanceMatrixService();
					  service.getDistanceMatrix(
					    {
					      origins: [start],
					      destinations: [end],
					      travelMode: google.maps.TravelMode.DRIVING,
					      unitSystem: google.maps.UnitSystem.METRIC,
					      avoidHighways: false,
					      avoidTolls: false
					    }, callback);
					}
			function callback(response, status) {		//check work status and get results!
					  if (status != google.maps.DistanceMatrixStatus.OK) {
					    alert('Error was: ' + status);
					  }
					  else
					  {
					    var origins = response.originAddresses;
					    var destinations = response.destinationAddresses;
					    var output = document.getElementById('output');
					    n_response = response;
					    result = response.rows[0].elements[0];
					   
					    
					    user_distance = result.distance.value;
					    output.innerHTML = 'Calculating rent cost from ' + origins + ' to '
					    + destinations +' for ' + result.distance.text  
					    +' distance' + '<br/><br/>' + 'Our servers run on windows so relax and hear some music =) <br/>' ; 
						

						calcUX();	//hide calculator button + play music


						setTimeout(function() //like worker  
							{
							output.innerHTML += "This trip cost is " + calcCost() +' nis '+ "<input type='submit' value='Click to rent!' onclick='finish()'> Or check cost of another destination" ;
							$('#calcbtn').fadeIn();
							if(curent_gear==0)
							{
								output.innerHTML += "<br> Manual gear chose saved to you 10%! <br>";
							}
							else
							{
								output.innerHTML += "<br> If you have license to manual car you can save up to 10% on rent price! <input type='submit' value='Back to cars' onclick='loadCarsPage()'> <br>";
							}
							},4000);

					  }
					};

					function calcUX()
					{
						$('#calcbtn').fadeOut();
						player = document.getElementById('yonatanSong');
						player.play();
					}
					function finish()	// update DB and reset global variabls
					{
						var updateDB = JSON.parse(localStorage["carsArray"]);
						updateDB[curent_AraayPosition].stock=0;
						localStorage["carsArray"] = JSON.stringify(updateDB);
						player.pause();
       					player.currentTime = 0;
       					alert("Congratulations you rent "+curent_car+ "! For return enter your car ID at *Return Car* menu! ***Your car ID is "+ curent_id +"***");
       					curent_id = 0;
       					loadHomePage();
					}
					function returnCar() 
					{
						var return_id = document.getElementById('returnId').value;
						if (return_id<100001&&return_id>100018)
						{
							alert('You enter invalid car ID! Try Again!');
						}
						else
						{	
							var dbArrayPosition = getAraayPosition(return_id);
							var updateDB = JSON.parse(localStorage["carsArray"]);
							updateDB[dbArrayPosition].stock=1;
							localStorage["carsArray"] = JSON.stringify(updateDB);
							alert('Thx for using FlyCar services!');
							loadHomePage();
						}

					}
//***Calulating cost script***

			function calcCost()
			{
				var output = document.getElementById('output');
				var cost;
				var i = user_distance;
				if(i<9000)
				{
					cost = parseInt((i/1000)*1.2);
				}
				else
				{
					cost = parseInt((i/1000)*0.9);
				}

				if(curent_gear==0)
				{
					cost = parseInt((i/100)*90);	
				}
						
					
				return cost;
					
			}

// ***NAVIGATION AJAX SCRIPTS***
			function loadHomePage()
			{
				$( "#content" ).load("pages/home.html");
			}

			function loadCarsPage()
			{
				if(localStorage.loginState == 1)
				{
				$( "#content" ).load("pages/cars.html");
				}
				else
				{
				$("#content").load("pages/loginreq.html")
				}
			}

			function loadMapPage()
			{
				if(localStorage.loginState == 1)
				{
				$( "#content" ).load("pages/map.html");
				}
				else
				{
				$("#content").load("pages/loginreq.html")
				}
			}

			function loadLoginPage()
			{

					if (localStorage.loginState == 0)
				{
					$("#content").load("pages/singupin.html");
				}
				else
				{
					localStorage.loginState = 0;
					$( "#content" ).load("pages/home.html");
				}

			}


			function loadReturnPage()
			{
				if(localStorage.loginState == 1)
				{
				$( "#content" ).load("pages/return.html");
				}
				else
				{
				exit();
				}
			}
				    
