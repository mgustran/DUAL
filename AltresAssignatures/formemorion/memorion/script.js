/**
 * Created by mgustran on 14/12/2016.
 */


var text = document.getElementById('text');
var segons = 00;
var desenes = 00;
var afegirDesenes = document.getElementById("tens");
var afegirSegons = document.getElementById("seconds");
var Interval ;
var $columnes = 0;
var $files = 0;
var $producte = 0;
var $email = '';


// Seleccionam el contenedor de les fitxes
var fitxes = document.getElementById('container');

// preparam un array per a les parelles
var emparellats = [];
var contador = 0;

// Aquests seran els identificadors per a les imatges
var imatgesFull = [
    'sass',
    'git',
    'gulp',
    'css3',
    'grunt',
    'go',
    'angular',
    'bootstrap',
    'bower',
    'csharp',
    'java',
    'mysql',
    'node',
    'oracle',
    'python',
    'ruby',
    'tux',
    'windows'
];

var imatges = [];


// Copiam a l'array el nombre de fitxes necessaries segons les files i $columnes especificades
function copiarImatges() {
    var numFitxes = 18 - ( $producte / 2);
    imatges = imatgesFull.slice(numFitxes );
}

//Executam les funcions que ens permeten la comunicacio amb el formulari , el control sobre
// les columnes i files i el repartiment de les mateixes a la taula html
llegeixURI();
copiarImatges();
controlCss();


// Agafa l'array d'imatges y el duplica
var imgCopiades = imatges.slice(0);

// Junta les copies
var fitxesFull = imatges.concat(imgCopiades);


// Llegeix les dades enviades des del formulari
function llegeixURI() {
    var srchString = decodeURI(location.search.substring(1, location.search.length));
    var emailPos = srchString.search('l=');
    var emailEndPos = srchString.search('&n');
    var emailString = srchString.substring(emailPos + 2, emailEndPos);
    $email = emailString.replace('%40', '@');
    var number1pos = srchString.search('1=');
    var number1string = srchString.substring(number1pos+2,number1pos+4);
    $columnes = parseInt(number1string);
    var number2pos = srchString.search('2=');
    var number2string = srchString.substring(number2pos+2);
    $files = parseInt(number2string);
    if (srchString.length > 0) {
        $producte = $columnes * $files;
    }
}

// Executa el contador del temps en  segons
function disparaContador () {
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
}

// reparteix les fitxes
function reparteix(posicio){
    for(var j, x, i = posicio.length; i; j = Math.floor(Math.random() * i), x = posicio[--i],   posicio[i] = posicio[j], posicio[j] = x);
    return posicio;
}
reparteix(fitxesFull);

//  Aqui es crea el div que contendra les fitxes i reparteix aquestes mateixes dins el div
for (var i = 0; i < fitxesFull.length; i++) {
    fitxa = document.createElement('div');
    fitxa.dataset.item = fitxesFull[i];
    fitxa.dataset.view = "fitxa";
    fitxes.appendChild(fitxa);

    // Aqui esta el disparador que dona comensament al joc
    fitxa.onclick = function () {

        // Amb aquesta sentencia el subtitol desapareixera en comensar el joc
        document.getElementById("subtitol").style.display= 'none';

        //  Destria els emparellats dels que encara no ho estan a l'hora de clicar
        if (this.className != 'girat' && this.className != 'ok'){
            this.className = 'girat';
            var resultat = this.dataset.item;
            emparellats.push(resultat);
            clearInterval(Interval);
            Interval = setInterval(disparaContador, 10);
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

// Verifica la situacio de les fitxes
var verifica = function(clase) {
    var x = document.getElementsByClassName("girat");
    setTimeout(function() {
        for(var i = (x.length - 1); i >= 0; i--) {
            x[i].className = clase;
        }
    },500);
};

// Quan s'acaben d'emparellar es dibuixa una felicitacio i el resultat
var jocAcabat = function () {
    if(contador === $producte/2) {
        clearInterval(Interval);
        text.innerHTML ='Enhorabona ' + $email + ", Has emprat " + segons + ":" + desenes + ' segons';
    }
};


// Controla el div i les columnes per colocar les fitxes correctament
// ( Canvia l'ample del div per ajustar les columnes, com que l'script
// fa el calcul sobre el producte del dos nombres per crear les fitxes,
//  no es necessari canviar res per controlar les files.  )
function controlCss() {
    switch ($columnes) {
        case 2:
            document.getElementById("container").style.width= '250px';
            break;
        case 3:
            document.getElementById("container").style.width= '370px';
            break;
        case 4:
            document.getElementById("container").style.width= '490px';
            break;
        case 5:
            document.getElementById("container").style.width= '630px';
            break;
        case 6:
            document.getElementById("container").style.width= '740px';
            break;
    }
}