package figuras;

import draw.Drawable;

public class Drawables {
		public static void dibujarFiguras(Drawable[] list) {
			for (Drawable d : list) {
				d.draw();
			}
		}


}