import java.io.Serializable;
import java.util.*;

public class Viajante implements Serializable {
	String dni;
	String nombre;
	Integer antigŁedad;
	Integer distanciaRecorrida;
	
	public Viajante(String dni, String nombre, Integer antigŁedad, int distanciaRecorrida
			) {
		this.dni = dni;
		this.nombre = nombre;
		this.antigŁedad = antigŁedad;
		this.distanciaRecorrida = distanciaRecorrida;
		
	}
	
}
