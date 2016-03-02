package fechaHora;


public class Fecha {

	private int dia = 01;
	private int mes	= 01;
	private int año	= 1900;
	int[] diasMes = {31,29,31,30,31,30,31,31,30,31,30,31};
	String[] letraDelMes = {"E", "F","M","A","M","J","J","A","S","O","N","D"};

	
	public Fecha(){}
	
	public Fecha(int dia, int mes, int año){
		this.dia	= dia;
		this.mes	= mes;
		this.año	= año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia <= 31){
			this.dia = dia;
		}
	}
	public int[] getDiasMes() {
		return diasMes;
	}
	
	public void setDiasMes(int[] diasMes) {
		this.diasMes = diasMes;
	}

	
	public String[] getLetraDelMes() {
		return letraDelMes;
	}

	public void setLetraDelMes(String[] letraDelMes) {
		this.letraDelMes = letraDelMes;
	}


	public String getLetraMes(){
		String letraMes= this.getLetraDelMes()[this.getMes()-1];
		return letraMes;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
	public void setFecha(int dia, int mes, int año){
		this.setDia(dia);
		this.setMes(mes);
		this.setAño(año);
	}
	public String getFecha(){
		String fecha = (Integer.toString(this.getDia()) + "-" + Integer.toString(this.getMes()) + "-" + Integer.toString(this.getAño()));
		return fecha;	
		}
	
	public String getFechaLetra(){
		String dia = Integer.toString(this.getDia());
		String año = Integer.toString(this.getAño());
		String fecha = (dia + "-" + this.getLetraMes() + "-" + año);
		return fecha;	
		}
	
	public void imprimirFecha(){
		System.out.println(this.getFechaLetra());
	}
	
	public void incrementarFecha(int dias){
		int cantidadDias = this.getDia() + dias;
		int editMes = -1;
		int editAño = 0;
		while(cantidadDias>0){
			if (cantidadDias < this.getDiasMes()[this.getMes() + editMes]){
				this.setFecha(cantidadDias, this.getMes()+editMes+1, this.getAño()+editAño);
				break;
			}
			while(cantidadDias>0){
				if (cantidadDias < this.getDiasMes()[this.getMes() + editMes]){
					this.setFecha(cantidadDias, this.getMes()+editMes+1, this.getAño()+editAño);
					break;
				}
				cantidadDias = cantidadDias - this.getDiasMes()[this.getMes()+editMes]; 
				if (this.getAño()+ editAño %4 == 2 && this.getMes()+editMes == 1){
					cantidadDias -= 1;
				}
				editMes += 1;
				if (this.getMes()+editMes == 12){
					editAño += 1;
					this.setMes(1);
					editMes = -1;
				}
				if (cantidadDias == 0){
					this.setFecha(this.getDiasMes()[this.getMes()+editMes-1],this.getMes()+editMes,this.getAño()+editAño);
				}
				
			}
			
		}
	}
}
	
	
	