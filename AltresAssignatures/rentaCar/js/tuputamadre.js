function ControladorForm() {
    this.loadModels = loadModels;

    function init() {

    }
    init();
    function loadModels(marca) {
        var models;
        for (marques in cars){
            if (marques == marca){
                models = marques;
            }
        }
        return models;
    }


var cars = [
    {
        "volvo": {
            "models": [
                {
                    "xc60": "001",
                    "v40": "002",
                    "c30": "003",
                    "v60xc": "004"
                }
            ],
            "modelImages": [
                {
                    "xc60": "001",
                    "v40": "002",
                    "c30": "003",
                    "v60xc": "004"
                }
            ]
        }
    },
    {
        "fiat": {
            "models": [
                {
                    "trekking": "005",
                    "124 spider": "006",
                    "500c": "007",
                    "500riva": "008"
                }
            ],
            "modelImages": [
                {
                    "trekking": "005",
                    "124 spider": "006",
                    "500c": "007",
                    "500riva": "008"
                }
            ]
        }
    },
    {
        "opel": {
            "models": [
                {
                    "mokaX": "009",
                    "corsa": "010",
                    "karl": "011",
                    "astra": "012"
                }
            ],
            "modelImages": [
                {
                    "mokaX": "009",
                    "corsa": "010",
                    "karl": "011",
                    "astra": "012"
                }
            ]
        }
    },
    {
        "audi": {
            "models": [
                {
                    "a1": "013",
                    "a3": "014",
                    "q3": "015",
                    "s1": "016"
                }
            ],
            "modelImages": [
                {
                    "a1": "013",
                    "a3": "014",
                    "q3": "015",
                    "s1": "016"
                }
            ]
        }
    }
];

}
