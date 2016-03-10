package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

import draw.Drawable;

public class ApplyThemeTest {

	@Test
	public void themeTest() {
		Drawable[] d = new Drawable[4];
		d[0] = new Circulo();
		//d[1] = new Cuadrado();
		//d[2] = new Elipse();
		//d[3] = new Rectangulo();

		ApplyTheme.aplicarTema(d);

}}
	


