package clases;

import interfaz.Walkable;

public class WalkablesTest {
	public static void main(String[] args) {
		Walkable[] w = new Walkable[4];
		w[0] = new Persona("Jack");
		w[1] = new Pato("Jeff");
		w[2] = new Persona("John");
		w[3] = new Gato ("Lopez");
 
		// Let everyone walk
		Walkables.letThemWalk(w);
	}
}