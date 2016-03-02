package listaAlumnos;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;





public class Alumno {
	private String nombre = null;
	private String apellido = null;

	public Alumno(){};
	static List<Alumno> listaAlumnos = Collections.synchronizedList(new LinkedList<Alumno>());
	public Alumno(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	 static List<Alumno> listaAlumnosReves = Collections.synchronizedList(new LinkedList<Alumno>());

	public List<Alumno> alReves(List<Alumno> listaAlumnosReves)	{
		for (Alumno alumno : listaAlumnos){
		listaAlumnosReves.add( ((LinkedList<Alumno>) listaAlumnos).getLast());
		
		}
		return listaAlumnosReves;
			
	}
}	
	

	
