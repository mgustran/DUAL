package appalma;


//Importaciones
import java.util.concurrent.ThreadLocalRandom;
import appalma.Bicicleta;

public class Estacion {
	//Atributos
	
	private Integer id = 0;
	private String direccion = null;
	private Integer numeroAnclajes = 0; 
	private Integer anclajesLibres = 0;
	Bicicleta[] anclajes;
	
	//Constructores
	
	public Estacion(){
		
	}
	
	public Estacion(Integer id, String direccion, Integer numeroAnclajes){
		this.setId(id);
		this.setDireccion(direccion);
		this.setNumeroAnclajes(numeroAnclajes);
		anclajes = new Bicicleta[numeroAnclajes];
	}

	//Getters y Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getNumeroAnclajes() {
		return numeroAnclajes;
	}
	public void setNumeroAnclajes(Integer numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}
	
	public Integer getAnclajesLibres() {
		return anclajesLibres;
	}
	
	public void setAnclajesLibres(Integer anclajesLibres) {
		this.anclajesLibres = anclajesLibres;
	}
	
	//Logica
	
	

	public void consultarEstacion(){
		System.out.println("id: " + this.getId());
		System.out.println("direccion: " + this.getDireccion());
		System.out.println("Numero de anclajes: " + this.getNumeroAnclajes());
	}
	
	public Integer anclajesLibres(){
		for(int i = 0; i < anclajes.length; i++){
			if(anclajes[i] == null){
				this.setAnclajesLibres(this.getAnclajesLibres() + 1);
			} else{
				//En caso de no estar libre no harï¿½ nada.
			}
		}
		return (this.getAnclajesLibres());
	}
	

	public void consultarAnclajes(){
		for(int i = 0; i < anclajes.length; i++){
			if(anclajes[i] != null){
				System.out.println("Anclaje " + i + " " + anclajes[i].getId()); 
			}else{
				System.out.println("Anclaje " + i + " libre");
			}
		}
		
	}
	
	public void anclarBicicleta(Bicicleta bicicleta){
		for(int i = 0; i < anclajes.length; i++){
			if(anclajes[i] == null){
				anclajes[i] = bicicleta;
				mostrarAnclaje(bicicleta, i);
				break;
			}else{
				
				}
		}
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
		
			System.out.println(bicicleta.getId() + " anclada en el anclaje: " + numeroAnclaje);
				
			
		}
	public Integer generarAnclaje(){
		
	return ThreadLocalRandom.current().nextInt(0, getNumeroAnclajes());
	
	}
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		if(tarjetaUsuario.getActivada() == true){
			return true;
		}else{
			return false;
		}
		
	}
		
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if(tarjetaUsuario.getActivada() == true){
			System.out.println("Tu tarjeta está activada.");
			int numeroAnclaje = generarAnclaje();
			Bicicleta bicicleta;
			System.out.println(mostrarBicicleta(bicicleta, numeroAnclaje); 
			anclajes[numeroAnclaje] = null;
			
		}else{ 
			System.out.println("Tu tarjeta no está activada. Para usar este servicio es necesario que la tarjeta esté activada.");
			System.out.println("Para más información dirigase al Ayuntamiento.");
		}
	}
	
	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println("Bicicleta retirada " + bicicleta.getId() + " del anclaje: " + numeroAnclaje + 1);
	}
	
}













