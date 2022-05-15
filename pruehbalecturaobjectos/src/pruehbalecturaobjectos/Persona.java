package pruehbalecturaobjectos;

import java.io.Serializable;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nombre;
	String apellido;
	int edad;
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public Persona() {
		this.nombre= "pablo";
		this.apellido= "perez";
		this.edad=19;
	}
	public String toString() {
		String a= this.nombre+" "+ this.apellido +" "+this.edad;
		return a;
	}
}
