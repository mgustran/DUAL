package appalma;

import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
	int id;
	String direccion;
	int numeroAnclajes;
	Bicicleta anclajes[];
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
		
	}
	


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}

	public void setNumeroAnclajes(int numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}
	
	public Bicicleta[] getAnclajes() {
		return anclajes;
	}

	public void setAnclajes(Bicicleta[] anclajes) {
		this.anclajes = anclajes;
	}

	
	public void consultarEstacion(){
		System.out.println("ID --> " + this.getId());
		System.out.println("DIRECCION --> " + this.getDireccion());
		System.out.println("NUM ANCLAJE --> " + this.getNumeroAnclajes());
	}
	
	
	public int anclajesLibres(){
		int anclajesLibres = 0;
		for (int i = 0; i < getAnclajes().length; i++) {
			if(getAnclajes()[i] == null){
				anclajesLibres = anclajesLibres + 1;
		   }else{}
			
	   }
		return anclajesLibres;
	}
	
	
	public void consultarAnclajes() {
		for (int i = 0; i < getAnclajes().length; i++) {
			if(getAnclajes()[i] != null){
				int anclaje = i + 1;
				System.out.println("EN EL ANCLAJE " + anclaje + " BICI ID --> " + getAnclajes()[i].getId());
		   }else{
			   int anclaje = i + 1;
				System.out.println("ANCLAJE " + anclaje + " LIBRE");

		   }
			
		}
		
	}
	
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		for (int i = 0; i < getAnclajes().length; i++) {
			if (getAnclajes()[i] == null){
				getAnclajes()[i] = bicicleta;
				mostrarAnclaje(bicicleta, i);
				break;
			}
			else{}			
		}			
	}
	
	
	private void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println("BICI ID --> " + bicicleta.getId() + " NUM ANCLAJE --> " + numeroAnclaje);	
	}
	
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.getTarjetaActivada();
	}
	
	
	
	public void mostrarBicicleta(Bicicleta bicicleta,int anclaje){
		int numeroAnclaje=anclaje+1;
		System.out.println("BICI ID --> "+bicicleta.getId()+" RETIRADA DEL ANCLAJE "+numeroAnclaje);
	}
	
	
	
	public int generarAnclaje(){
		int random = ThreadLocalRandom.current().nextInt(0,getNumeroAnclajes());
		return random;
	}
	
	
	
	public int generarAnclajeLibre(){
		int anclaje=generarAnclaje();
		while(getAnclajes()[anclaje]== null)
			anclaje=generarAnclaje();
		return anclaje;
	}
	
	
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if(leerTarjetaUsuario(tarjetaUsuario)){
			int anclajeLibre = generarAnclajeLibre();
			mostrarBicicleta(getAnclajes()[anclajeLibre], anclajeLibre);
			getAnclajes()[anclajeLibre]=null;
		}
	}
} 