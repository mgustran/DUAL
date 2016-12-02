/**
 * Created by mgustran on 2/12/16.
 */



function CustomValidation(input) {
    this.invalidities = [];
    this.validityChecks = [];

    //add reference to the input node
    this.inputNode = input;

    //trigger method to attach the listener
    this.registerListener();
}

CustomValidation.prototype = {
    addInvalidity: function(message) {
        this.invalidities.push(message);
    },
    getInvalidities: function() {
        return this.invalidities.join('. \n');
    },
    checkValidity: function(input) {
        for ( var i = 0; i < this.validityChecks.length; i++ ) {

            var isInvalid = this.validityChecks[i].isInvalid(input);
            if (isInvalid) {
                this.addInvalidity(this.validityChecks[i].invalidityMessage);
            }

            var requirementElement = this.validityChecks[i].element;

            if (requirementElement) {
                if (isInvalid) {
                    requirementElement.classList.add('invalid');
                    requirementElement.classList.remove('valid');
                } else {
                    requirementElement.classList.remove('invalid');
                    requirementElement.classList.add('valid');
                }

            } // end if requirementElement
        } // end for
    },
    checkInput: function() { // checkInput now encapsulated

        this.inputNode.CustomValidation.invalidities = [];
        this.checkValidity(this.inputNode);

        if ( this.inputNode.CustomValidation.invalidities.length === 0 && this.inputNode.value !== '' ) {
            this.inputNode.setCustomValidity('');
        } else {
            var message = this.inputNode.CustomValidation.getInvalidities();
            this.inputNode.setCustomValidity(message);
        }
    },
    registerListener: function() { //register the listener here

        var CustomValidation = this;

        this.inputNode.addEventListener('keyup', function() {
            CustomValidation.checkInput();
        });


    }

};



/* ----------------------------

 Validity Checks

 The arrays of validity checks for each input
 Comprised of three things
 1. isInvalid() - the function to determine if the input fulfills a particular requirement
 2. invalidityMessage - the error message to display if the field is invalid
 3. element - The element that states the requirement

 ---------------------------- */

var emailValidityChecks = [
    {
        isInvalid: function(input) {
            return !input.value.match(/^([A-Z|a-z|0-9](\.|_){0,1})+[A-Z|a-z|0-9]\@([A-Z|a-z|0-9])+((\.){0,1}[A-Z|a-z|0-9]){2}\.[a-z]{2,3}$/gm);
        },
        invalidityMessage: 'it must be an email with an email format (aaaa@bbbb.cc)',
        element: document.querySelector('label[for="email"] .input-requirements li:nth-child(1)')
    }
];

var number1ValidityChecks = [
    {
        isInvalid: function(input) {
            return !input.value.match(/[2-6]/);
        },
        invalidityMessage: 'Ha de ser un nombre enter entre 2 i 6 ambdos inclosos',
        element: document.querySelector('label[for="number1"] .input-requirements li:nth-child(1)')
    }
];

var number2ValidityChecks = [
    {
        isInvalid: function(input) {
            return !input.value.match(/[2-6]/);
        },
        invalidityMessage: 'Ha de ser un nombre enter entre 2 i 6 ambdos inclosos',
        element: document.querySelector('label[for="number2"] .input-requirements li:nth-child(1)')
    }
];


/* ----------------------------

 Setup CustomValidation

 Setup the CustomValidation prototype for each input
 Also sets which array of validity checks to use for that input

 ---------------------------- */

var emailInput = document.getElementById('email');
var numberInput = document.getElementById('number1');
var passwordRepeatInput = document.getElementById('number2');

emailInput.CustomValidation = new CustomValidation(emailInput);
emailInput.CustomValidation.validityChecks = emailValidityChecks;

numberInput.CustomValidation = new CustomValidation(numberInput);
numberInput.CustomValidation.validityChecks = number1ValidityChecks;

passwordRepeatInput.CustomValidation = new CustomValidation(passwordRepeatInput);
passwordRepeatInput.CustomValidation.validityChecks = number2ValidityChecks;




/* ----------------------------

 Event Listeners

 ---------------------------- */

var inputs = document.querySelectorAll('input:not([type="submit"])');
var submit = document.querySelector('input[type="submit"');
var form = document.getElementById('registration');

function validate() {
    for (var i = 0; i < inputs.length; i++) {
        inputs[i].CustomValidation.checkInput();
    }
}

submit.addEventListener('click', validate);
form.addEventListener('submit', validate);
