package listaAlumnos;

import listaAlumnos.Alumno;
import java.util.Scanner;

public class MainAlumnos {



	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int si = 1;
		int no = 0;
		for(int i=0; i<5; i++){
			
			System.out.println("Introduce nombre y apellido: ");
			Alumno nuevoAlumno = new Alumno(reader.nextLine(),reader.nextLine());
			System.out.println("quieres añadir mas?  si->1  /  no->0");
			int respuesta = Integer.parseInt(reader.nextLine());
			
			if (respuesta == si){}
			
			else if(respuesta == no){
				break;}
			else{
				System.out.println("fallo, introduce 0 o 1");
				
			}
			
		
				
		
		Alumno.listaAlumnos.add(nuevoAlumno);
		}
		System.out.println("Lista del alumnado");  
		for (Alumno alumno : Alumno.listaAlumnos){
			
			System.out.println("alumno--> " + alumno.getNombre() + "  " + alumno.getApellido());
		  }
		
		System.out.println("Lista del alumnado al reves");  
		for (Alumno alumno : Alumno.listaAlumnosReves){
			
			System.out.println("alumno--> " + alumno.getNombre() + "  " + alumno.getApellido());
		  }
		
		
		

	}
}
