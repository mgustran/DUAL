class Dni():
    def __init__(self, cadena = ""):
        self.dni  = cadena
        self.sano = False

    def setDni(self, cadena):
        self.dni = cadena

    def getDni(self):
        return self.dni


    def setSano(self, valor):
        self.sano = valor


    def checkDni(self):
        if self.checkLongitud() and self.checkNumero() and self.checkLetra():
            self.setSano(True)

    def checkLongitud(self):
        return len(self.dni) == 9

    def checkNumero(self):
        return self.dni[:-1].isdigit()

    def checkLetra(self):
        return self.dni[-1].isupper() and not self.dni[-1].isdigit()