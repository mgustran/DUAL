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
			final JAXBElement<EstacionType> menuElement = (JAXBElement<EstacionType>)u.unmarshal(main.class.getResourceAsStream("estacion.xml"));
			System.out.println("ID -->  " + menuElement.getValue().getId());
			System.out.println("DirecciÛn --> " + menuElement.getValue().getDireccion());
			System.out.println("Numero de Anclajes -->  " + menuElement.getValue().getNumeroAnclajes());
			
			System.out.println("Bicis y anclajes:");
			consultarAnclajes(menuElement);
		
	      
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}}
	
		
		public static void consultarAnclajes(JAXBElement<EstacionType> menuElement){
			// recorre el array anclajes y muestra el id de la bici anclada o si est√° libre
			
			// la clase Bicicleta no es creada por JAXB porque he declarado el tipo del elemento bicicleta
			// como simpleContent restriction de un string en el Schema.
			// La clase Anclajes es un List<String> bicicleta
		
			int posicion = 0;
			int numeroAnclaje = 0;
			
			for(String bicicleta:(menuElement.getValue().getAnclajes()).getBicicleta() ){
				numeroAnclaje = posicion + 1;
				//System.out.println(bicicleta);
				if( bicicleta.matches("[0-9]{3}") ){
					System.out.println("Anclaje " + numeroAnclaje + " : " + bicicleta);
				}
				else
					System.out.println("Anclaje " + numeroAnclaje + " : " + " libre");
				
				posicion++;	
			}
		}
	}
