package clases;
import interfaz.Walkable;

public class Persona implements Walkable {
	private String name;

		public Persona(String name) {
			this.name = name;
		}
		
		public void walk() {
			System.out.println(name + " (a person) is walking.");
		}
}
