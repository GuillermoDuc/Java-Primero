import java.io.Serializable;
import java.util.*;

public class Viajante implements Serializable {
	String dni;
	String nombre;
	Integer antigüedad;
	Integer distanciaRecorrida;
	
	public Viajante(String dni, String nombre, Integer antigüedad, int distanciaRecorrida
			) {
		this.dni = dni;
		this.nombre = nombre;
		this.antigüedad = antigüedad;
		this.distanciaRecorrida = distanciaRecorrida;
		
	}
	
}
