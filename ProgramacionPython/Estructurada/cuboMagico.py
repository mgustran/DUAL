

#Logica

def scanCarasCubo():
	n = input('Introducir numero impar --> ')
	while isinstance(n, int) != True:
		try:
			if int(n) % 2 != 0 :
				n =int(n)
			else:
				n = input('Eso no es UN numero impar, repite --> ')
		except:
			n = input('Eso no es UN numero impar, repite --> ')
		else:
			pass
	return n

def crearCarasCubo(n):
	carasCubo=[]
	for fila in range(0,n):
		carasCubo.append(['n'])
		for columna in range(0,n-1):
			carasCubo[fila].append('n')
	return carasCubo

def insertarNumCubo(carasCubo):
	if len(carasCubo) == 1:
		return [1]
	else:
		fila = 0
		columna = int(len(carasCubo)/2)
		for numero in range(1,(len(carasCubo)**2)+1):
			if numero % len(carasCubo) != 0:
				carasCubo[fila][columna]=numero
				fila -= 1
				columna += 1
				if fila == -1:
					fila=len(carasCubo)-1
				if columna == len(carasCubo):
					columna=0
			if numero % len(carasCubo) == 0:
				carasCubo[fila][columna]=numero
				fila += 1
				if fila == -1:
					fila=len(carasCubo)-1
				if columna == len(carasCubo):
					columna=0
		return carasCubo

n = scanCarasCubo()
carasCubo = crearCarasCubo(n)
print(insertarNumCubo(carasCubo))

#casoTest
if __name__ == '__main__':

 casoTest=[[4,[['n', 'n', 'n', 'n'], ['n', 'n', 'n', 'n'], ['n', 'n', 'n', 'n'], ['n', 'n', 'n', 'n']]],[1,[['n']]]]
def testCrearCarasCubo(casoTest):
	for caso in casoTest:
		if crearCarasCubo(caso[0]) == caso[1]:
			print('PASS')
		else:
			print('FAIL')
#casoTest 
casoTest=[[['n'],[1]],
[[['n','n','n'],['n','n','n'],['n','n','n']],[[8,1,6],[3,5,7],[4,9,2]]]]
def testInsertarNumCubo(casoTest):
	for caso in casoTest:
		if insertarNumCubo(caso[0]) == caso[1]:
			print('PASS')
		else:
			print('FAIL')

