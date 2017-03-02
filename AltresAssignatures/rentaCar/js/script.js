function ValidacioPersonal(input) {
    this.invalidacions = [];
    this.validacions = [];


    // Afegim una referencia al node de l'input
    this.nodeInput = input;

    //  Disparador per a enregistrar el listener
    this.enregistrarListener();
}

ValidacioPersonal.prototype = {
    afegirInvalideses: function(message) {
        this.invalidacions.push(message);
    },
    recollirInvalideses: function() {
        return this.invalidacions.join('. \n');
    },
    confirmarValidacio: function(input) {
        for (var i = 0; i < this.validacions.length; i++ ) {

            var esInvalid = this.validacions[i].esInvalid(input);
            if (esInvalid) {
                this.afegirInvalideses(this.validacions[i].invalidityMessage);
            }

            var requeriments = this.validacions[i].element;

            if (requeriments) {
                if (esInvalid) {
                    requeriments.classList.add('invalid');
                    requeriments.classList.remove('valid');
                } else {
                    requeriments.classList.remove('invalid');
                    requeriments.classList.add('valid');
                }

            }
        }
    },
    validaInput: function() { // Aqui es concentra la funcio de validacio de l'input

        this.nodeInput.CustomValidation.invalidacions = [];
        this.confirmarValidacio(this.nodeInput);

        if ( this.nodeInput.CustomValidation.invalidacions.length === 0 && this.nodeInput.value !== '' ) {
            this.nodeInput.setCustomValidity('');
        } else {
            var message = this.nodeInput.CustomValidation.recollirInvalideses();
            this.nodeInput.setCustomValidity(message);
        }
    },
    enregistrarListener: function() { //  Aqui esta la funcio que enregistra el listener

        var ValidacioPersonal = this;

        this.nodeInput.addEventListener('keyup', function() {
            ValidacioPersonal.validaInput();
        });
        this.nodeInput.addEventListener('click', function() {
            ValidacioPersonal.validaInput();
        });


    }

};

/* ----------------------------

 Validity Checks

 Son els arrais que comprenen els metode s de validacio
 Contenen 3 elements
 1. esInvalid() - La funcio determina si l'input pasa els requeriments
 2. invalidityMessage - missatge d'error a colorejar tant si es true o false
 3. element - l'element que conte el requeriment

 ---------------------------- */

var validacionsMatricula = [
    {
        esInvalid: function(input) {
            return !input.value.match(/^([E](\-){1})+[0-9]{4}\-([^AEIOU]{3})$/gm);
        },
        invalidityMessage: "La matricula ha de tenir el següent format:  'E-0000-PCB'",
        element: document.querySelector('label[for="matricula"] .input-requirements li:nth-child(1)')
    }
];

var validacionsColumnes = [
    {
        esInvalid: function(input) {
            $columnes = input.value;
            return !input.value.match(/[2-6]/);
        },
        invalidityMessage: 'Ok',
        element: document.querySelector('label[for="number1"] .input-requirements li:nth-child(1)')
    }
];

/* ----------------------------


 Aqui es configura ValidacioPersonal per a cada input
 Es selecciona l'array corresponent per a la seleccio de validacions
 ---------------------------- */

var inputMatricula = document.getElementById('matricula');
var inputColumnes = document.getElementById('number1');

inputMatricula.CustomValidation = new ValidacioPersonal(inputMatricula);
inputMatricula.CustomValidation.validacions = validacionsMatricula;

inputColumnes.CustomValidation = new ValidacioPersonal(inputColumnes);
inputColumnes.CustomValidation.validacions = validacionsColumnes;

/* ----------------------------

 Listeners

 ---------------------------- */

var inputs = document.querySelectorAll('input:not([type="submit"])');
var submit = document.querySelector('input[type="submit"');
var formulari = document.getElementById('registration');

function validate() {
    for (var i = 0; i < inputs.length; i++) {
        inputs[i].CustomValidation.validaInput();
    }
}

// Aqui s'escolta el submit, que a l'html s'especifica que es amb el metode GET
submit.addEventListener('click', validate);
formulari.addEventListener('submit', validate);


/* ----------------------------

 Controlador dels selects

 ---------------------------- */

// function getModels(marcax) {
//     var marca = document.getElementById('marca').value;
//     var cars = require('../cars/cars.json');
//
//     for (var i = 0; i < cars; i++) {
//         if (cars[i] == marca) {
//             var modelsSelect = document.getElementById('model');
//             var shit = cars[i].models[0];
//             for (var j= 0; j < models.length; j++) {
//                 var model = cars[i].models[0];
//                 models.options.add(new Option(model.name, j));
//             }
//             break;
//         }
//     }
// }
//
// function loadModels() {
//
// }
