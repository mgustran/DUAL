package DniNie;

public class TablaAsignacion {
	
	char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' }; 
	// No es necesario el constructor, ya que utilizamos el por defecto.

	public char getLetra(int posicion){
		// excepcion 
		//try{
			return this.tabla[posicion];
		//}
		//catch(ExceptionClassName parameterName){
		//	return 'Posicion letra fuera de rango';
		//}
	}
	
	public int getModulo(){
		return this.tabla.length;
	}
	
	public Boolean letraPermitida(char letra){
		String tablaString = String.valueOf(tabla);
		// contains() requiere una secuencia de caracteres: convertir el caracter letra a un string
		return tablaString.contains( Character.toString(letra) );
	}
	
	public char calcularLetra(String DNINIE){
		// Obtener el numero del dni del string => dni sano
		// Dividirlo por el número de letras (actualmente 23) y obtener el resto (división módulo)
		// Consultar TablaAsignacion con ese resto = posicion
		int dniNie = Integer.parseInt(DNINIE);
		int posicion = dniNie % getModulo();
		return getLetra(posicion);
	}
	
	public int getValorPrimeraLetraNie(char letra){
		switch (letra){
			case 'X':
				return 0;
			case 'Y':
				return 1;
			case 'Z':
				return 2;
			default:
				return -1;
		}
		
	}
	public void mostrarTabla(){
		System.out.println(this.tabla); 
	}
}
