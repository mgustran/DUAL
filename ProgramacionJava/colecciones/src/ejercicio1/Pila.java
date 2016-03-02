package ejercicio1;

import java.util.Stack;


public class Pila {

	public static void main(String[] args) {

		String cadena = "Esto es una Pila";
		Stack<Character> pila = new Stack<Character>();
		for (int i = 0; i < cadena.length(); i++){
			pila.add(cadena.charAt(i));
			}

		while (!pila.isEmpty()){
			System.out.print(pila.pop());

		}



	}



}

