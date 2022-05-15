import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	String file;
	Scanner lector=null;
	PrintStream escritor=null;
	Fichero(String file){
		try {
			escritor= new PrintStream(new FileOutputStream(file,true));
			lector= new Scanner(new BufferedReader(new FileReader(file)));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void escribirCoche(Coche c) {
		escritor.print(c.matricula+"|");
		escritor.print(c.modelo+"|");
		escritor.print(c.anio+"\n");
	}
	public void imprimirCoches() {
		while(lector.hasNext()) {
			System.out.println(lector.next());
		}
	}
	public void closeUp() {
		lector.close();
		escritor.close();
	}
	public ArrayList<Coche> leerCoches(){
		ArrayList<Coche> cochitos= new ArrayList<Coche>();
		while(lector.hasNextLine()) {
			
			String cochetodo= lector.nextLine();
			String[] componentes = cochetodo.split("\\|");
			String matricula=componentes[0];
			String modelo=componentes[1];
			int anio=Integer.parseInt(componentes[2]);
			Coche c= new Coche(matricula, modelo, anio);
			cochitos.add(c);
		
		}
		return cochitos;
		
		
	}
}
