import java.io.Serializable;
import java.util.*;

public class Viajante implements Serializable {
	String dni;
	String nombre;
	Integer antig�edad;
	Integer distanciaRecorrida;
	
	public Viajante(String dni, String nombre, Integer antig�edad, int distanciaRecorrida
			) {
		this.dni = dni;
		this.nombre = nombre;
		this.antig�edad = antig�edad;
		this.distanciaRecorrida = distanciaRecorrida;
		
	}
	
}
