
package banco;
import dnicif.DniCif;

public class CuentaCorriente {
	private String nombre;
	private String apellido;
	private String telefono;
	private DniCif dni;
	private Double saldo;
	private String direccion;
	private Boolean numRojos = false;

	public CuentaCorriente(){}

	public CuentaCorriente(String nombre, String apellido, 
			String direccion, String telefono,DniCif dni, Double saldo){
	
		this.nombre		= nombre;
		this.apellido	= apellido;
		this.telefono	= telefono;
		this.dni		= dni;
		this.saldo		= saldo;
		this.direccion	= direccion;
	}





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public DniCif getDni() {
		return dni;
	}

	public void setDni(DniCif dni) {
		this.dni = dni;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getNumerosRojos() {
		return numRojos;
	}

	public void setNumerosRojos(Boolean numerosRojos) {
		this.numRojos = numerosRojos;
	}

	void sacarDinero(Double cantidad){
		this.saldo -= cantidad;
		this.getNumerosRojos();
	}

	void ingresarDinero(Double cantidad){
		this.saldo += cantidad;
	}

	void consultarCuenta(){
		System.out.println("Nombre --> " + this.getNombre());
		System.out.println("Apellido --> " + this.getApellido());
		System.out.println("Telefono --> " + this.getTelefono());
		System.out.println("Saldo cuenta --> " + this.getSaldo());
		System.out.println("Direccion --> " + this.getDireccion());
	}

	boolean saldoNegativo(){
		return this.numRojos;
	}
}