package ejercicio2;
import java.util.TreeSet;


public class Conjunto {


	public static void main(String[] args) {
		
		TreeSet<Character> Cadena = new TreeSet<Character> (); 
		String cadena="dabale arroz a la zorra el abad";
		
		for (int n=0; n<cadena.length (); n++){ 
			char letraDeTexto = cadena.charAt (n);
			Character letraNueva= new Character(letraDeTexto);
			Cadena.add(letraNueva);
		}
		
		for (Character letra: Cadena) {
			System.out.println(letra);
		}
	}
}

