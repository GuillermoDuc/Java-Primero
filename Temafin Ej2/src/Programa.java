import java.io.DataInputStream;
import java.io.*;

public class Programa {

	public static void main(String[] args) throws IOException {
		Escritor e= null;
		try {
			 e= new Escritor();
		} catch (IOException ee) {
			ee.printStackTrace();
		}
		
		
		Viajante v= new Viajante ("Naaaaaablo", "nulel", 1, 1);
		Venta v1= new Venta("13/09/22", 111, v, false);
		e.ps.flush();
		e.escribirViajante(v);
	
	}
			
			
			
			}
			


