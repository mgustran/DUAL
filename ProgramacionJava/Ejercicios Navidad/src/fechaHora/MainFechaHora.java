package fechaHora;

public class MainFechaHora {

	public static void main(String[] args) {
		testGettersSetters();
		testSetFecha();
		testGetFecha();
		testLetraMes();
		testIncrementarFecha();
		testImprimirFecha();
		
	    }
	
	public static void testGettersSetters(){
		Fecha testFecha =new Fecha(15,12,1996);
		int[][]test= {{testFecha.getDia(),15},
					  {testFecha.getMes(),12},
					  {testFecha.getAño(),1996}};
		for (int[] caso : test){
			if (caso[0]==caso[1]){
				System.out.println("test Getters y Setters PASS");
			}
			else{
				System.out.println("test Getters y Setters FAIL");
			}
		}
	}
	
	
	public static void testLetraMes(){
		Fecha fechaTest =new Fecha(15,12,1996);
		if (fechaTest.getLetraMes().equals("D")){
			System.out.println("test Letra del Mes PASS");
		}
		else{
			System.out.println("test Letra del Mes FAIL");
		}
		
	}


	public static void testSetFecha(){
		Fecha fechaTest =new Fecha(29,6,1990);
		fechaTest.setFecha(5, 5, 1990);
		int[][]test= {{fechaTest.getDia(),5},
				  {fechaTest.getMes(),5},
				  {fechaTest.getAño(),1990}};
	for (int[] opcion : test){
		if (opcion[0]==opcion[1]){
			System.out.println("test del Setter de Fecha PASS");
		}
		else{
			System.out.println("test del Setter Fecha FAIL");
		}}
		
		
	}
	public static void testGetFecha(){
		Fecha fechaTest =new Fecha(29,12,1990);
		if(fechaTest.getFecha().equals("29-12-1990")){
			System.out.println("test del Getter de Fecha PASS");
		}
		else{
			System.out.println("test del Getter de Fecha FAIL");
		}
	}
	
	public static void testIncrementarFecha(){
		Fecha fechaTest =new Fecha(29,2,1992);
		fechaTest.incrementarFecha(31);
		if(fechaTest.getFecha().equals("31-3-1992")){
			System.out.println("Test de Incremento de la Fecha PASS");
		}
		else{
			System.out.println("Test de Incremento de la Fecha FAIL");
		}
	}
	public static void testImprimirFecha(){
		Fecha fechaTest =new Fecha(15,12,1996);
		System.out.println("Fecha introducida -->");
		fechaTest.imprimirFecha();
		System.out.println("15-D-1996 si son iguales PASS");
	}

	
}

