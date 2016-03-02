package appalma;

public class TarjetaUsuario {
	String id;
	boolean activada = false;
	
	
	public TarjetaUsuario(String id, boolean activada){
		this.id = id;
		this.activada = activada;
	}

	
	public boolean getTarjetaActivada(){
		return activada;
	}

}
