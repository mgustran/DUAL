package Dni;

import DniNie.TablaAsignacion;

public class Nie {
	private String nie  = null;
	private Boolean numeroSano = false;
	private Boolean primeraLetraSana 	= false;
	private Boolean segundaLetraSana 	= false;
	// Composición (agregación) "Has - a" / "Tiene - un"
	private TablaAsignacion tabla = new TablaAsignacion();

	/* Constructores */
	
	public Nie(String nie) {
		this.nie = nie;
	}
	
	/* Encapsulacion */
	
	public void setNie(String cadena){
		this.nie = cadena;
	}

	public String getNie(){
		return this.nie;
	}

	private void setNumeroSano(Boolean valor){
		this.numeroSano = valor;
	}
	
	public Boolean getNumeroSano(){
		return this.numeroSano;
	}
	
	private void setPrimeraLetraSana(Boolean valor){
		this.primeraLetraSana = valor;
	}

	public Boolean getPrimeraLetraSana(){
		return this.primeraLetraSana;
	}
	
	private void setSegundaLetraSana(Boolean valor){
		this.segundaLetraSana = valor;
	}
	
	public Boolean getSegundaLetraSana(){
		return this.segundaLetraSana;
	}
	
	/*
	 * Lógica 
	 */

	/* Interfaz Pública */
	
	public Boolean checkCIF(){
		return checkNie() && checkPrimeraLetra() && checkSegundaLetra();
	}
	
	public Boolean checkNie(){
		setNumeroSano( checkLongitud() && stringEsNumero( getParteNumericaNie() ) );
		return getNumeroSano();
	}
	
	public Boolean checkPrimeraLetra(){
		if (getNumeroSano() ) {
			setPrimeraLetraSana ( Character.isUpperCase(getParteAlfabeticaNie()) && checkPrimeraLetraValida() );
			return getPrimeraLetraSana();
		}
		else {
			return false;
		}
	}
	
	public Boolean checkSegundaLetra(){
		if (getNumeroSano() ) {
			setSegundaLetraSana ( Character.isUpperCase(getParteAlfabeticaNie()) && checkSegundaLetraValida() );
			return getSegundaLetraSana();
		}
		else {
			return false;
		}
	}
	
	public Character obtenerPrimeraLetra(){
		String primeraLetraNie = getNie().substring(0,1);
		char primeraLetra = primeraLetraNie.charAt(0);
		return primeraLetra;
	}
	
	public Character obtenerSegundaLetra(){
		if ( getNumeroSano() ){
			return this.tabla.calcularLetra( getParteNumericaNie() );
		}
		else // EXCEPCION: aun no sabemos implementarlas - este código no es admisible
			return getParteAlfabeticaNie();
	}

	
	public Boolean checkLongitud() {
		return getNie().length() == 9;
	}
	
	public Boolean stringEsNumero(String cadena){
		for( int i=0; i < cadena.length(); i++ ){
			if ( ! Character.isDigit(cadena.charAt(i)) ){
				return false;
			}
			else;
		}
		return true;
	}		
		
	public String getParteNumericaNie() {
		/* Con "Integer.toString(this.tabla.getValorPrimeraLetraNie(obtenerPrimeraLetra()))" 
		   obtenemos el valor numerico de la primera letra del NIE */
		return (String) Integer.toString(this.tabla.getValorPrimeraLetraNie(obtenerPrimeraLetra())) + nie.substring(0, nie.length() - 1);
	}
	
	public Character getParteAlfabeticaNie() {
		return nie.charAt(nie.length() - 1);
	}
	
	public Boolean checkPrimeraLetraValida(){
		if (obtenerPrimeraLetra() == 'X' || obtenerPrimeraLetra() == 'Y' || obtenerPrimeraLetra() == 'Z'){
			return true;
		}else{
			return false;
		}
	}
	
	public Boolean checkSegundaLetraValida() {
		if ( getNumeroSano() ) {
			return getParteAlfabeticaNie() == obtenerSegundaLetra();
		}
		else
			return false;
	}
}
