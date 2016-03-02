package DniNie;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainDniNie {

	public static void main(String[] args) {
		
		
		String regexDni = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
		Pattern patDni = Pattern.compile(regexDni);
		
		//  TEST DNI PASS
		
		String[] testDniPass = {
				"78484464T","72376173A","01817200Q","95882054E","63587725Q",
				"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		System.out.println("\n  CASOS TEST DNI PASS \n");
		
		for(String dni : testDniPass){
			Matcher matDni = patDni.matcher(dni);
			if (matDni.find()){
				System.out.println("Dni : " + dni + " PASS");
			}else{
				System.out.println("Dni : " + dni + " NOT PASS");
			}
		}
		
		//  TEST DNI NOT PASS
		
		int numeroCasos = 10;
		String casoTest;
		Random rand = new Random();
		String[] testDniIncorrecto = new String[10];
		
		for(int i = 0; i < numeroCasos; i++){
			int numDni = rand.nextInt(99999999 - 10000000) + 10000000;
			String LletraDNI = "IÑOU";
	        char lletra = LletraDNI.charAt(rand.nextInt(4));
			casoTest = Integer.toString(numDni) + lletra;
			testDniIncorrecto[i]=casoTest;
		}
		
		System.out.println("\n  CASOS TEST DNI NOT PASS \n");
		
		for(int i= 0; i<testDniIncorrecto.length-1;i++){
			Matcher mDni = patDni.matcher(testDniIncorrecto[i]);
			if (mDni.find()){
				System.out.println("Dni : " + testDniIncorrecto[i] + " PASS");
			}else{
				System.out.println("Dni : " + testDniIncorrecto[i] + " NOT PASS");
			}
		}
		
		
		String regexNie = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";
		Pattern pNie = Pattern.compile(regexNie);
		
		// TEST NIE PASS
				
		String[] testNieCorrecto = new String[10];
		System.out.println("\n  CASOS TEST NIE PASS \n");
		for(int i = 0; i < numeroCasos; i++){
			int numNie = rand.nextInt(9999999 - 1000000) + 1000000;
			String LetraN1 = "XYZ";
			String LetraN2 = "TRWAGMYFPDXBNJZSQVHLCKE";
	        char letraNie1 = LetraN1.charAt(rand.nextInt(3));
			char letraNie2 = LetraN2.charAt(rand.nextInt(23));
			casoTest = letraNie1 + Integer.toString(numNie) + letraNie2;
			testNieCorrecto[i]=casoTest;
		}
		for(int i= 0; i<testNieCorrecto.length-1;i++){
			Matcher mNie = pNie.matcher(testNieCorrecto[i]);
			if (mNie.find()){
				System.out.println("Nie : " + testNieCorrecto[i] + " PASS");
			}else{
				System.out.println("Nie : " + testNieCorrecto[i] + " NOT PASS");
			}
		}
		
		// TEST NIE NOT PASS
		
		String[] testNieIncorrecto = new String[10];
		System.out.println("\n  CASOS TEST NIE NOT PASS  \n");
		for(int i = 0; i < numeroCasos; i++){
			int numNie = rand.nextInt(9999999 - 1000000) + 1000000;
			String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	        char letraNie1 = Letras.charAt(rand.nextInt(3));
			char letraNie2 = Letras.charAt(rand.nextInt(23));
			casoTest = letraNie1 + Integer.toString(numNie) + letraNie2;
			testNieIncorrecto[i]=casoTest;
		}
		for(int i= 0; i<testNieIncorrecto.length-1;i++){
			Matcher mNie = pNie.matcher(testNieIncorrecto[i]);
			if (mNie.find()){
				System.out.println("Nie : " + testNieIncorrecto[i] + " PASS");
			}else{
				System.out.println("Nie : " + testNieIncorrecto[i] + " NOT PASS");
			}
		}
	}

}