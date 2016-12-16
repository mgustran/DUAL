/**
 * Created by mgustran on 14/12/2016.
 */


var text = document.getElementById('text');
var segons = 00;
var desenes = 00;
var afegirDesenes = document.getElementById("tens");
var afegirSegons = document.getElementById("seconds");
var Interval ;
var $number1 = 0;
var $number2 = 0;
var $product = 0;

// Seleccionam el contenedor de les fitxes
var fitxes = document.getElementById('container');

// preparam un array per a les parelles
var emparellats = [];
var contador = 0;

// Aquests seran els identificadors per a les imatges
var imatges = [
    'sass',
    'git',
    'gulp',
    'css3',
    'grunt'
];

var imgCopiades = imatges.slice(0); // Agafa l'array d'imatges y el duplica
var fitxesFull = imatges.concat(imgCopiades); // Junta les copies


function reparteix(posicio){     // reparteix les fitxes
    for(var j, x, i = posicio.length; i; j = Math.floor(Math.random() * i), x = posicio[--i],   posicio[i] = posicio[j], posicio[j] = x);
    return posicio;
}
reparteix(fitxesFull);

for (var i = 0; i < fitxesFull.length; i++) {
    fitxa = document.createElement('div');
    fitxa.dataset.item = fitxesFull[i];
    fitxa.dataset.view = "fitxa";
    fitxes.appendChild(fitxa);

    fitxa.onclick = function () {

        if (this.className != 'girat' && this.className != 'ok'){
            this.className = 'girat';
            var resultat = this.dataset.item;
            emparellats.push(resultat);
            clearInterval(Interval);
            Interval = setInterval(startTimer, 10);
        }
        if (emparellats.length > 1) {

            if (emparellats[0] === emparellats[1]) {
                verifica("ok");
                contador ++;
                jocAcabat();
                emparellats = [];
            } else {
                verifica("revers");
                emparellats = [];
            }
        }
    }
}


var verifica = function(clase) {
    var x = document.getElementsByClassName("girat");
    setTimeout(function() {
        for(var i = (x.length - 1); i >= 0; i--) {
            x[i].className = clase;
        }
    },500);
};

var jocAcabat = function () {
    if(contador === 5) {
        clearInterval(Interval);
        text.innerHTML = "Et queda" + segons + ":" + desenes;
    }
};

function startTimer () {
    desenes++;

    if(desenes < 9){
        afegirDesenes.innerHTML = "0" + desenes;
    }
    if (desenes > 9){
        afegirDesenes.innerHTML = desenes;

    }
    if (desenes > 99) {
        segons++;
        afegirSegons.innerHTML = "0" + segons;
        desenes = 0;
        afegirDesenes.innerHTML = "0" + 0;
    }
    if (segons > 9){
        afegirSegons.innerHTML = segons;
    }

    function readData( ) {
        try{
            var srchString = decodeURI(location.search.substring(1, location.search.length));
            var number1pos = srchString.search('1=');
            var number1string = srchString.substring(number1pos+2,number1pos+4);
            $number1 = parseInt(number1string);
            var number2pos = srchString.search('2=');
            var number2string = srchString.substring(number2pos+2);
            $number2 = parseInt(number2string);
            if (srchString.length > 0) {
                $product = $number1 * $number2;
            }
        } catch (err) {
            console.log('ha petat u bloc principal')
        }

    }

    readData();
}
