package pruehbalecturaobjectos;

import java.io.EOFException;
import java.io.IOException;
import java.util.ListIterator;

public class Programa {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Fichero f= new Fichero("ejemplo.txt");
		Persona a= new Persona("Ana","Booleana",19);
		Persona b= new Persona("Ana","No Booleana",2344);
		Persona c= new Persona("Anacccc","No Booleana",2344);
		Persona d= new Persona("Anadddd","No Booleana",2344);
		Agencia agencia= new Agencia();
		agencia.annadirPersona(d);
		agencia.annadirPersona(c);
		agencia.annadirPersona(b);
		agencia.annadirPersona(a);
		f.escribirObjeto(agencia);
		Agencia agenciab=f.leerObjetos();
		ListIterator<Persona> iterador=agenciab.a.listIterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().toString());
			
		}
		f.closeUp();
	}

}
