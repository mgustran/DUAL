from dni import *


class CuentaCorriente:


    # Inicializador 

    def __init__(self, nombre="", apellido="",direccion="", telefono="",dni="", saldo=0.0, numRojos=""):
        self.nombre = nombre
        self.apellido = apellido
        self.direccion = direccion
        self.telefono = telefono
        self.dni = Dni()
        self.saldo = saldo
        self.numRojos = numRojos


# Setters y Getters
    
    def setNombre(self, nombre):
        self.nombre = nombre

    def getNombre(self):
        return self.nombre

    def setApellido(self, apellido):
        self.apellido = apellido

    def getApellido(self):
        return self.apellido

    def setDireccion(self, direccion):
        self.direccion = direccion

    def getDireccion(self):
        return self.direccion

    def setTelefono(self, telefono):
        self.telefono = telefono

    def getTelefono(self):
        return self.telefono

    def setDni(self, dni):
        self.dni = dni

    def getDni(self):
        return self.dni

    def setSaldo(self, saldo):
        self.saldo = saldo

    def getSaldo(self):
        return self.saldo

    def setNumRojos(self, numRojos):
        self.numRojos = numRojos

    def getNumRojos(self):
        return self.numRojos

# Comportamientos de la Cuenta Corriente

    def retirarDinero(self, cantidadRetirada):
        dineroRestante = (self.getSaldo() - cantidadRetirada)
        self.setSaldo(dineroRestante)
        return (cantidadRetirada, dineroRestante)

    def ingresarDinero(self, cantidadIngresada):
        dineroTotal = (self.getSaldo() + cantidadIngresada)
        self.setSaldo(dineroTotal)
        return (cantidadIngresada, dineroTotal)

    def checkDni(self):
        self.dni.checkDni()

    def consultarCuenta(self):
        print ("Propietario de la Cuenta--> ", self.getNombre(), self.getApellido() ,"\nDni--> ", self.getDni())
        print ("Direccion --> ", self.getDireccion(), "\nTelefono--> ", self.getTelefono())
        print ("Saldo --> ", self.getSaldo())

    def saldoNegativo(self, numRojos):
        if self.saldo < 0:
            return numRojos + "Rojo"
        else:
            return numRojos + "Verde"



if __name__ == '__main__':
        
# CASO TEST de la consulta

        cuenta = CuentaCorriente()
        cuenta.setNombre("Miquel")
        cuenta.setApellido("Gustran")
        cuenta.setDireccion("c/Patronat Obrer nº1")
        cuenta.setTelefono("697968370")
        cuenta.setDni("43230867K")
        cuenta.setSaldo(400)

        print (cuenta.consultarCuenta())
        

# CASO TEST del saldo negativo (boolean)
    
        cuenta.setSaldo(400)
        print ("\nestado de los fondos--> ",cuenta.saldoNegativo(cuenta.getNumRojos()))

# CASO TEST de la retirada y el ingreso de dinero

        cuenta.setSaldo(400)
        cuenta.retirarDinero(250)
        if cuenta.getSaldo() == 150:
            print ("Test retirada dinero PASS")
        else:
            print ("Test retirada de dinero FAIL")
        cuenta.setSaldo(400)
        cuenta.ingresarDinero(400)
        if cuenta.getSaldo() == 800:
            print ("Test ingreso de dinero PASS")
        else:
            print ("Test ingreso de dinero FAIL")
