package dnicif;

public class TablaAsignacion {
	char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' }; 


	public char getLetra(int i){
			return this.tabla[i];
	}
	
	public int getModulo(){
		return this.tabla.length;
	}
	
	public Boolean letraPermitida(char letra){
		String tablaString = String.valueOf(tabla);
		return tablaString.contains( Character.toString(letra) );
	}
	
	public char calcularLetra(String DNI){
		int dni = Integer.parseInt(DNI);
		int posicion = dni % getModulo();
		return getLetra(posicion);
	}
	
	public void mostrarTabla(){
		System.out.println(this.tabla); 
	}
}