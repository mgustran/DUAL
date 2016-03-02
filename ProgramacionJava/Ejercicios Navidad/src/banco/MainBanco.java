package banco;

public class MainBanco {
	
	public static void main(String[] args) {
		testCuentaCorriente();
		testTarjetaPrepago();
	}
		public static void testCuentaCorriente(){
			CuentaCorriente cuenta = new CuentaCorriente();
			cuenta.setNombre("Miquel");
			cuenta.setApellido("Gustrán");
			cuenta.setDireccion("C/ Patronat Obrer 1");
			cuenta.setTelefono("697 968 370");
			cuenta.setSaldo(1000.00);
			cuenta.ingresarDinero(600.00);
			cuenta.sacarDinero(10.00);
			cuenta.consultarCuenta();
		}
	

	
		public static void testTarjetaPrepago(){
			TarjetaPrepago tarjeta = new TarjetaPrepago();
			tarjeta.setTelefono("971 53 08 67");
			tarjeta.setSaldo(10.00);
			tarjeta.consultarTarjeta();
	}
}