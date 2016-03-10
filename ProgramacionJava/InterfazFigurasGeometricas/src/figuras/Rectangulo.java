package figuras;

import draw.Drawable;

public class Rectangulo extends FiguraGeometrica implements Drawable {

	private double altura 	= 0d;
	private double anchura 	= 0d;
	private String name = "Rectangulo";

	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rectangulo(){
		super(); /* invocamos al constructor sin parámetro de la superclase FiguraGeometrica */
	}
		
	public Rectangulo(double altura, double anchura){
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(String nombre, double altura, double anchura){
		super(nombre); /* invocamos al constructor con parámetro String nombre de la superclase */
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.altura = anchura;
	}
	
	@Override
	public double area() {
		// encapsulación de la información => acceder a las propiedades mediante get
		return getAltura() * getAnchura();
	}
	
	public void draw() {
		System.out.println(getName() + " (a rectancle) is drawed.");
	}
	
	public void applyTheme() {
		System.out.println(getName() + " theme is applied.");
	}

}
