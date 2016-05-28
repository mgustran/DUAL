package bicipalma;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
public class main {
	public static void main(String[] args) {	
		try {
			final JAXBContext jc = JAXBContext.newInstance(EstacionType.class.getPackage().getName());
			Unmarshaller u = jc.createUnmarshaller();
	        @SuppressWarnings("unchecked")
			final JAXBElement<bicipalma.EstacionType> menuElement = (JAXBElement<bicipalma.EstacionType>)u.unmarshal(main.class.getResourceAsStream("estacion.xml"));
			System.out.println("ID -->  " + menuElement.getValue().getId());
			System.out.println("Direcci�n --> " + menuElement.getValue().getDireccion());
			System.out.println("Numero de Anclajes -->  " + menuElement.getValue().getNumeroAnclajes());
			
			System.out.println("Anclajes:");
			System.out.println("\n");
			desplegarAnclajes(menuElement);
		
	      
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}}
	
		
		public static void desplegarAnclajes(JAXBElement<EstacionType> menuElement){
			int i = 0;
			int numAnclaje = 0;
			
			for(String bicicleta:(menuElement.getValue().getAnclajes()).getBicicleta() ){
				numAnclaje = i + 1;
				if( bicicleta.matches("null") ){
					System.out.println("Anclaje " + numAnclaje + " : " + " libre");
					
				}
				else
					System.out.println("Anclaje " + numAnclaje + " : " + bicicleta);
				
				i++;	
			}
		}
	}
