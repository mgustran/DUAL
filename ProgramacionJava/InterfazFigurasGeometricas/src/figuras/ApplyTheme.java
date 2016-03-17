package figuras;

import draw.Drawable;

public class ApplyTheme {
	public static void aplicarTema(Drawable[] list) {
		for (Drawable d : list) {
			try{
			
				d.applyTheme();
				}
				catch(UnsupportedOperationException excepcion){
					

					FiguraGeometrica figura = (FiguraGeometrica) d;

					System.out.println(excepcion.getMessage() + " para la figura: " + figura.getNombre());
		
			
		}
	}}}



