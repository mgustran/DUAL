package conversores;

public class DistanceConverter {
	
	public static double convertFeettoMeters(double feet){
		return feet * 0.3048;
	}
	
	public static double convertMeterstoFeet(double meters){
		return meters * 3.2808;
	}
	
	public static double convertFeettoInches(double feet){
		return feet * 12;
	}
	
	public static double convertInchestoFeet(double inches){
		return inches / 12;
	}
	
	public static double convertCmtoFeet(double cm){
		return convertMeterstoFeet(cm / 100);
	}
		
	public static double convertFeettoCm(double feet){
		return convertFeettoMeters(feet) * 100;
	}
		
	public static double convertCmtoInches(double cm){
		return convertFeettoInches(convertCmtoFeet(cm));
	}
		
	public static double convertInchestoCm(double inches){
		return convertFeettoCm(convertInchestoFeet(inches));
	}
		

}
