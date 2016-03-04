class TarjetaPrepago():
        def __init__(self, numeroTelefono, nif, saldo):
                self.numeroTelefono = numeroTelefono
                self.dni            = dni
                self.saldo          = ""
                self.consumo        = 0
                #self.consumo        = Hora()



#Setters y Getters

        def setNumeroTelefono(self, numeroTelefono):
                self.numeroTelefono = numeroTelefono

        def getNumeroTelefono(self):
                return self.numeroTelefono

        def setNif(self, nif):
                self.nif = nif

        def getNif(self):
                return self.nif

        def setSaldo(self, saldo):
                self.saldo = saldo

        def getSaldo(self):
                return self.saldo

        def setConsumo(self, consumo):
                self.consumo = consumo

        def getConsumo(self):
                return self.consumo

        #Logica

        def ingresarSaldo(self, cantidad):
                self.saldo = saldo + cantidad

        def enviarMensaje(self, numeroMensajes):
                self.saldo = (saldo - (numeroMensajes * 9))

        def realizarLlamada(self, segundosHablados):
                self.saldo = (saldo - (15 + 1 * segundosHablados))
                                              
        def consultarTarjeta(self):
                print ("Numero--> ", getNumeroTelefono(), "\nDNI--> ", getNumeroTelefono(), "\nSaldo--> ", getSaldo(), "\nConsumo--> ", getConsumo())

        #Casos Test
        if __name__ == '__main__':
                        tarjeta = TarjetaPrepago()
                        tarjeta.numeroTelefono("697968370")
                        tarjeta.nif("43230867K")
                        tarjeta.saldo("50")
                        tarjeta.consumo(30)

                        print (consultarTarjeta())
        from Hora import *

        class TarjetaPrepago():
                def __init__(self, numeroTelefono, nif, saldo):
                        self.numeroTelefono = ""
                        self.nif            = ""
                        self.saldo          = ""
                        self.consumo        = 0
                        self.consumo        = Hora()



        #Setters y Getters

                def setNumeroTelefono(self, numeroTelefono):
                        self.numeroTelefono = numeroTelefono

                def getNumeroTelefono(self):
                        return self.numeroTelefono

                def setNif(self, nif):
                        self.nif = nif

                def getNif(self):
                        return self.nif

                def setSaldo(self, saldo):
                        self.saldo = saldo

                def getSaldo(self):
                        return self.saldo

                def setConsumo(self, consumo):
                        self.consumo = consumo

                def getConsumo(self):
                        return self.consumo

        #Logica

                def ingresarSaldo(self, cantidad):
                        self.saldo = saldo + cantidad

                def enviarMensaje(self, numeroMensajes):
                        self.saldo = (saldo - (numeroMensajes * 9))

                def realizarLlamada(self, segundosHablados):
                        self.saldo = (saldo - (15 + 1 * segundosHablados))
                                      
                def consultarTarjeta(self):
                        print ("Numero--> ", getNumeroTelefono(), "\nDNI--> ", getNumeroTelefono(), "\nSaldo--> ", getSaldo(), "\nConsumo--> ", getConsumo())

        #Casos Test
        if __name__ == '__main__':

                        tarjeta = TarjetaPrepago()
                        tarjeta.numeroTelefono("697968370")
                        tarjeta.nif("43230867K")
                        tarjeta.saldo("50")
                        tarjeta.consumo(30)

                        print (consultarTarjeta())
