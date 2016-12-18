/**
 * Created by mgustran on 2/12/16.
 */

var $producte = 0;
var $columnes = 0;
var $files = 0;


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


    }

};



/* ----------------------------

 Validity Checks

 The arrays of validity checks for each input
 Comprised of three things
 1. esInvalid() - La funcio determina si l'input pasa els requeriments
 2. invalidityMessage - missatge d'error a colorejar tant si es true o false
 3. element - l'element que conte el requeriment

 ---------------------------- */

var validacionsEmail = [
    {
        esInvalid: function(input) {
            return !input.value.match(/^([A-Z|a-z|0-9](\.|_){0,1})+[A-Z|a-z|0-9]\@([A-Z|a-z|0-9])+((\.){0,1}[A-Z|a-z|0-9]){2}\.[a-z]{2,3}$/gm);
        },
        invalidityMessage: "L'email ha de tenir el següent format :  (aaaa@bbbb.cc)",
        element: document.querySelector('label[for="email"] .input-requirements li:nth-child(1)')
    }
];

var validacionsColumnes = [
    {
        esInvalid: function(input) {
            $columnes = input.value;
            return !input.value.match(/[2-6]/);
        },
        invalidityMessage: 'Ha de ser un nombre enter entre 2 i 6 ambdos inclosos',
        element: document.querySelector('label[for="number1"] .input-requirements li:nth-child(1)')
    },

    {
        esInvalid: function(input) {
            $producte = $files * input.value;
            return ($producte % 2 == 1);
        },
        invalidityMessage: 'El producte de files i $columnes ha de ser parell',
        element: document.querySelector('label[for="number2"] .input-requirements li:nth-child(2)')
    }
];

var validacionsFiles = [
    {
        esInvalid: function(input) {
            return !input.value.match(/[2-6]/);
        },
        invalidityMessage: 'Ha de ser un nombre enter entre 2 i 6 ambdos inclosos',
        element: document.querySelector('label[for="number2"] .input-requirements li:nth-child(1)')
    },

    {
        esInvalid: function(input) {
            $files = input.value;
            $producte = $columnes * input.value;
            return ($producte % 2 == 1);
        },
        invalidityMessage: 'El producte de files i $columnes ha de ser parell',
        element: document.querySelector('label[for="number2"] .input-requirements li:nth-child(2)')
    }
];




/* ----------------------------


 Aqui es configura ValidacioPersonal per a cada input
Es selecciona l'array corresponent per a la seleccio de validacions
 ---------------------------- */

var inputEmail = document.getElementById('email');
var inputColumnes = document.getElementById('number1');
var inputFiles = document.getElementById('number2');

inputEmail.CustomValidation = new ValidacioPersonal(inputEmail);
inputEmail.CustomValidation.validacions = validacionsEmail;

inputColumnes.CustomValidation = new ValidacioPersonal(inputColumnes);
inputColumnes.CustomValidation.validacions = validacionsColumnes;

inputFiles.CustomValidation = new ValidacioPersonal(inputFiles);
inputFiles.CustomValidation.validacions = validacionsFiles;




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

submit.addEventListener('click', validate);
formulari.addEventListener('submit', validate);