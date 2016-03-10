package figuras;
import draw.Drawable;

public class Cuadrado extends FiguraGeometrica implements Drawable{
	
	/* Cuadrado no hereda de Rectángulo porque la relación IS-A o ES-Una 
	 * trata sobre el comportamiento de objeto. 
	 * Un cuadrado no se comporta como un rectángulo. 
	 * El comportamiento determina la programación por contrato de la clase Cuadrado y sus métodos.
	 * Una instancia de Rectángulo no verificaría la condición anchura = altura,
	 * por lo que se violaría el principio de substitución de Liskov (LSP).
	 * */
	private String name = "Cuadrado";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double lado = 0d;

	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
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
		System.out.println(getName() + " (a square) is drawed.");
	}
	
	public void applyTheme() {
		System.out.println(getName() + " theme is applied.");
	}
	
}
