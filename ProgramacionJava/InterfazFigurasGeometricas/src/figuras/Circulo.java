package figuras;

import draw.Drawable;

public class Circulo extends FiguraGeometrica implements Drawable {
	private String name = "Circulo";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private double radio = 0d;
	// el valor de la propiedad PI no puede variar => final
	private final double PI = Math.PI;
	
	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Circulo(){
		super();
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}

	@Override
	public double area() {
		// math.pow(numero, potencia) = elevar un número a una potencia
		return PI * Math.pow(this.radio, 2);
	}
	public void draw() {
		System.out.println(getName() + "  is drawed.");
	}
	
	public void applyTheme() {
		System.out.println(getName() + " theme is applied.");
	}
}


