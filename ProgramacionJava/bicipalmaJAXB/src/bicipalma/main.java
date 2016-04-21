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
			final Unmarshaller u = jc.createUnmarshaller();
	        @SuppressWarnings("unchecked")
			final JAXBElement<EstacionType> menuElement = (JAXBElement<EstacionType>)u.unmarshal(main.class.getResourceAsStream("estacion.xml"));
			System.out.println("ID -->  " + menuElement.getValue().getId());
			System.out.println("Direcci�n --> " + menuElement.getValue().getDireccion());
			System.out.println("Numero de Anclajes -->  " + menuElement.getValue().getNumeroAnclajes());
			System.out.println("Anclajes -->  " + menuElement.getValue().getAnclajes());
			
			
			 ArrayList<AnclajesType> anclajes = (ArrayList<AnclajesType>) EstacionType.getAnclajes();
			  for (int i=0; i<anclajes.size(); i++){
			   System.out.println("Order Detail --->");
			   AnclajesType orderDetail = orderDetailList.get(i);
			   System.out.println("Line Id: " + orderDetail.getLineId());
			   System.out.println("Item Number: " + orderDetail.getItemNumber());
			   System.out.println("Quantity: " + orderDetail.getQuantity());
			   System.out.println("Price: " + orderDetail.getPrice());

			  }
	      
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	
	}}
