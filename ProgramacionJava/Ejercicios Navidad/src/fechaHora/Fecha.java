package fechaHora;


public class Fecha {

	private int dia = 01;
	private int mes	= 01;
	private int a�o	= 1900;
	int[] diasMes = {31,29,31,30,31,30,31,31,30,31,30,31};
	String[] letraDelMes = {"E", "F","M","A","M","J","J","A","S","O","N","D"};

	
	public Fecha(){}
	
	public Fecha(int dia, int mes, int a�o){
		this.dia	= dia;
		this.mes	= mes;
		this.a�o	= a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
	public void setFecha(int dia, int mes, int a�o){
		this.setDia(dia);
		this.setMes(mes);
		this.setA�o(a�o);
	}
	public String getFecha(){
		String fecha = (Integer.toString(this.getDia()) + "-" + Integer.toString(this.getMes()) + "-" + Integer.toString(this.getA�o()));
		return fecha;	
		}
	
	public String getFechaLetra(){
		String dia = Integer.toString(this.getDia());
		String a�o = Integer.toString(this.getA�o());
		String fecha = (dia + "-" + this.getLetraMes() + "-" + a�o);
		return fecha;	
		}
	
	public void imprimirFecha(){
		System.out.println(this.getFechaLetra());
	}
	
	public void incrementarFecha(int dias){
		int cantidadDias = this.getDia() + dias;
		int editMes = -1;
		int editA�o = 0;
		while(cantidadDias>0){
			if (cantidadDias < this.getDiasMes()[this.getMes() + editMes]){
				this.setFecha(cantidadDias, this.getMes()+editMes+1, this.getA�o()+editA�o);
				break;
			}
			while(cantidadDias>0){
				if (cantidadDias < this.getDiasMes()[this.getMes() + editMes]){
					this.setFecha(cantidadDias, this.getMes()+editMes+1, this.getA�o()+editA�o);
					break;
				}
				cantidadDias = cantidadDias - this.getDiasMes()[this.getMes()+editMes]; 
				if (this.getA�o()+ editA�o %4 == 2 && this.getMes()+editMes == 1){
					cantidadDias -= 1;
				}
				editMes += 1;
				if (this.getMes()+editMes == 12){
					editA�o += 1;
					this.setMes(1);
					editMes = -1;
				}
				if (cantidadDias == 0){
					this.setFecha(this.getDiasMes()[this.getMes()+editMes-1],this.getMes()+editMes,this.getA�o()+editA�o);
				}
				
			}
			
		}
	}
}
	
	
	