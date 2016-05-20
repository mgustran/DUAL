# Casos test:
# x2 +2x + 1 = 0     x = -1              a = 1, b = 2, c = 1
# x2 = 0             x = 0               a = 1, b = 0, c = 0
# 2x2 -7x +3 = 0     x = 3, x = 0.5      a = 2, b = -7, c = 3
# x2 -5x +6 = 0      x = 3, x = 2        a = 1, b = -5, c = 6
# x2 + x = 0         x = -1 x = 0              a = 1, b = 1, c = 0
# x2 + x + 1 = 0     la ecuación no tiene solución real  a = 1, b = 1, c = 1
# x2 + 1 = 0         la ecuación no tiene solución real  a = 1, b = 0, c = 1
# x + 1 = 0          x = -1              a = 0, b = 1, c = 1



######### HAY QUE IMPLEMENTAR LA EQUACION DE PRIMER GRADO #########


import math


def raicesEcuacionSegundoGrado(a, b, c, soluciones):
    try:
        d = ((-b)**2) - (4*a*c)
        e = math.sqrt(d)
    except ValueError:
        print("Error: Ha fallado la raiz del discriminante ( valor negativo )")
        print (d)
    d = ((-b)**2) - (4*a*c)     # discriminante
    
    
    try:
        soluciones.append((-b + math.sqrt(d))/(2*a))
        if d != 0:
            soluciones.append((-b - math.sqrt(d))/(2*a))
        
    except (ValueError):
        print("Error: la equacion no tiene solución real.")
    except (ZeroDivisionError):
        print("Error: el indice a no puede ser 0")
    return


def test():

    print("Introduce los coeficientes de la ecuacion del modo ax2 + bx +c = 0")
    a = float(input('a -> '))
    b = float(input('b -> '))
    c = float(input('c -> '))

    soluciones = []

    raicesEcuacionSegundoGrado(a, b, c, soluciones)

    for x in soluciones:
        print("x = ", '{:.2f}'.format(x))

test()
