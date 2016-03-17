package figuras;
import draw.Drawable;

public class Cuadrado extends FiguraGeometrica implements Drawable{
	double lado = 0d;

	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public void setlado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double area(){
		return Math.pow(getLado(), 2);
	}
	
	public void draw() {
		System.out.println(getNombre() + " (a square) is drawed.");
	}
	
	public void applyTheme() {
		System.out.println(getNombre() + " theme is applied.");
	}
	
}
