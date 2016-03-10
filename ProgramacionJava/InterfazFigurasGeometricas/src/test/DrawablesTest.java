package test;

import static org.junit.Assert.*;

import org.junit.Test;

import draw.Drawable;
import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Drawables;
import figuras.Elipse;
import figuras.Rectangulo;

public class DrawablesTest {

	@Test
	public void DrawTest() {
		Drawable[] d = new Drawable[4];
		d[0] = new Circulo();
		d[1] = new Cuadrado();
		d[2] = new Elipse();
		d[3] = new Rectangulo();

		Drawables.dibujarFiguras(d);

}}
