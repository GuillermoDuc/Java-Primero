package pruehbalecturaobjectos;

import java.io.Serializable;
import java.util.ArrayList;

public class Agencia implements Serializable{
ArrayList<Persona> a = new ArrayList<Persona>();
	public void annadirPersona(Persona p) {
		a.add(p);
	}
	public void eliminarPersona(int indice) {
		a.remove(indice);
	}
	
}
