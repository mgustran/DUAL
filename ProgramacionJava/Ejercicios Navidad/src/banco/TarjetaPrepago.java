package banco;
import dnicif.DniCif;
import fechaHora.Hora;


public class TarjetaPrepago {
	private String telefono;
	private DniCif dni;
	private Double saldo;
	private Hora consumo;

	public TarjetaPrepago(){}

	public TarjetaPrepago(String telefono, Double saldo,DniCif dni, Hora consumo){
		this.telefono	= telefono;
		this.dni		= dni;
		this.saldo		= saldo;	
		this.consumo	= consumo;
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

	public Hora getConsumo() {
		return consumo;
	}

	public void setConsumo(Hora consumo) {
		this.consumo = consumo;
	}


	void enviarMensaje(Integer mensajes){
		this.saldo =- 0.09 * mensajes;
	}
	
	void realizarLlamada(Integer segundos){
		this.saldo =- 0.15 + (0.01 * segundos);
		this.contadorConsumo(segundos);
	}
	
	void ingresarSaldo(Double cantidad){
		this.saldo =+ cantidad;
	}
	
	
	void consultarTarjeta(){
		System.out.println("Telefono --> " + this.getTelefono());
		System.out.println("Saldo Tarjeta --> " + this.getSaldo());
	}
	
	void contadorConsumo(Integer segundosLlamada){
		Integer horas		= consumo.getHora();
		Integer minutos		= consumo.getMinutos();
		Integer segundos	= consumo.getSegundos() + segundosLlamada;
		
		if (segundos >= 60){
			minutos += segundos /60;
			
		if (minutos >= 60){
			horas += minutos /60;
		
		if (horas < 0)
			horas = 0;
		}
		}
		
		if (minutos >= 60){
			horas += minutos /60;
		
		if (horas < 0)
			horas = 0;
		}
		
		this.consumo.setHora(horas, minutos, segundos);
	}
}