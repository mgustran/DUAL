package test;

import static org.junit.Assert.*;

import org.junit.Test;

import draw.Drawable;
import figuras.ApplyTheme;
import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Elipse;
import figuras.Rectangulo;

public class ApplyThemeTest {

	@Test
	public void themeTest() {
		Drawable[] d = new Drawable[4];
		d[0] = new Circulo("Circulo", 0);
		d[1] = new Cuadrado("Cuadrado", 0);
		d[2] = new Elipse("Elipse", 0, 0);
		d[3] = new Rectangulo("Rectangle", 0, 0);

		ApplyTheme.aplicarTema(d);

}}
	


