# test a=0#



def resolverEcuacionSegGrado(a,b,c):
	if a == 0 or b == 0 and -c / a < 0:
		return None
	raiz = math.sqrt(b * b - (4 * a * c))
	x1 = (-b + raiz) / (2 * a)
	x2 = (-b - raiz) / (2 * a)
	return x1, x2


#Casos Test#
#caso a=0#

if None == resolverEcuacionSegGrado(0,b,c):
	print ('Pass')
else:
	print ('Fail')

# caso C = 0, a = 1, b = -1, c = 0#
test1 = 1.0, 0
if test1 == resolverEcuacionSegGrado(1, -1, 0):
	print ('Pass')
else:
	print ('Fail')
# caso b y c igual a 0#
test3 = 0, 0
if test3 == resolverEcuacionSegGrado(a,0,0):
	print ('Pass')
else:
	print ('Fail')
# si b=0 y -c/a<0, test aplicando que a = 1, b = 0 y c = 1#
if None == resolverEcuacionSegGrado (1, 0, 1):
	print ('Pass')
else:
	print ('Fail')
# caso normal, por fin, a=2, b=-1, c=-1#
test2 = 1.0, -0.5
if test2 == resolverEcuacionSegGrado (2, -1, -1):
	print ('Pass')
else:
	print ('Fail')


