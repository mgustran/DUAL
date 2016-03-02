package fechaHora;

public class Hora {
	int hora		= 0;
	int minutos		= 0;
	int segundos	= 0;

	public Hora(){}

	public Hora(int horas, int minutos, int segundos){
		this.hora		= horas;
		this.minutos	= minutos;
		this.segundos	= segundos;
	}

	public int getHora() {
		return hora;
	}
	
	public void setHora(int horas) {
		if (horas >= 0 && horas <=24){
			this.hora = horas;
		}
		else this.hora = 0;
	}

	public int getMinutos() {
		return minutos;
	}
	
	public void setMinutos(int minutos) {
		if (minutos > 0 && minutos < 60){
			this.minutos = minutos;
		}
		else this.minutos = 0;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public void setSegundos(int segundos) {
		if (segundos > 0 && segundos < 60){
			this.segundos = segundos;
		}
		else this.segundos = 0;
	}


	public void setHora(int horas, int minutos, int segundos){
		this.setHora(horas);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}

	String imprimirHora(){
		return String.format("%s:%s:%s", this.getHora(),this.getMinutos(),this.getSegundos());

	}


}