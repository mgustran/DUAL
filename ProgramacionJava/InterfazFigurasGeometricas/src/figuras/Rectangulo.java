package figuras;

import draw.Drawable;

public class Rectangulo extends FiguraGeometrica implements Drawable {
	private double altura 	= 0d;
	private double anchura 	= 0d;

	public Rectangulo(){
		super(); 
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
		System.out.println(getNombre() + " (a rectancle) is drawed.");
	}
	
	public void applyTheme() {
		System.out.println(getNombre() + " theme is applied.");
	}

}
