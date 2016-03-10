package figuras;

import java.util.ArrayList;

public class MainFiguras {

	public static void main(String[] args) {
		
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		
		// test constructores 
		
		Rectangulo rectanguloConstructorSuper = new Rectangulo(4, 5);
		Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 4, 5);
		
		Circulo circuloConstructorSuper = new Circulo(5);
		Circulo circuloConstructorLocal = new Circulo("círculo", 5);
		
		Cuadrado cuadradoConstructorSuper = new Cuadrado(2);
		Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 2);
		
		Elipse elipseConstructorSuper = new Elipse(3, 4);
		Elipse elipseConstructorLocal = new Elipse("elipse", 3, 4);
		
		// test herencia y polimorfismo 
		
		figuras.add(rectanguloConstructorSuper);
		figuras.add(rectanguloConstructorLocal);
		figuras.add(circuloConstructorSuper);
		figuras.add(circuloConstructorLocal);
		figuras.add(cuadradoConstructorSuper);
		figuras.add(cuadradoConstructorLocal);
		figuras.add(elipseConstructorSuper);
		figuras.add(elipseConstructorLocal);
				
		for (FiguraGeometrica figura : figuras){
			System.out.println("Area del " + figura.getNombre() + " = " + figura.area());
		}

	}

}
