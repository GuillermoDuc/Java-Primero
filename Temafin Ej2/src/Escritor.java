import java.io.*;
import java.util.*;
public class Escritor {
	ObjectOutputStream ps=null;
	Escritor () throws IOException{
		try 
		{
			ps = new ObjectOutputStream(new FileOutputStream("viajantes.txt"));
		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally {
			ps.close();
		}
	}
	public void escribirViajante(Viajante v) throws IOException {
		try {
			ps.writeObject(v);
			System.out.println("Viajante "+v.nombre+" escrito");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeUp () {
		try {
			ps.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
