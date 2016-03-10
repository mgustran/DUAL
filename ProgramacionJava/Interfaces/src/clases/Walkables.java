package clases;

import interfaz.Walkable;

public class Walkables {
	public static void letThemWalk(Walkable[] list) {
		for (Walkable w : list) {
			w.walk();
		}
	}
}