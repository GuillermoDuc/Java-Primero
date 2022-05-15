package pruehbalecturaobjectos;
import java.io.*;
import java.util.ArrayList;
public class Fichero {
	ObjectInputStream lector= null;
	ObjectOutputStream escritor= null;
	Fichero(String fichero) {
			try {
				escritor = new ObjectOutputStream(new FileOutputStream(fichero));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				lector = new ObjectInputStream(new FileInputStream(fichero));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void escribirObjeto(Agencia a) {
		try {
			escritor.writeObject(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Agencia leerObjetos() throws EOFException{
	
		
			try {
				Agencia a= (Agencia) lector.readObject();
				return a;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			return null;
		
		
	
	}
	public void closeUp() {
		try {
			lector.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
