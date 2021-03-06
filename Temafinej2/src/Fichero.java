import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class Fichero {
	ObjectInputStream lector= null;
	ObjectOutputStream escritor= null;
	Fichero(String fichero) throws IOException{
			escritor = new ObjectOutputStream(new FileOutputStream(fichero));
			lector = new ObjectInputStream(new FileInputStream(fichero));
	}
			
	public void escribirFinal(Agencia a){
		ArrayList<Viajante> array= a.viajantes;
		try {
			escritor.writeObject(array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	public ArrayList<Viajante> leerPrincipio() throws ClassNotFoundException, IOException {
		return (ArrayList<Viajante>) lector.readObject();
	}
	public void escribirViajante(Viajante v)  {
		try {
			escritor.writeObject(v);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeUp() throws IOException {
		escritor.close();
		lector.close();
	}
	
}
