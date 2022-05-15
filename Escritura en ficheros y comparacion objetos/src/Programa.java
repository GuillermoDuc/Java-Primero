import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1= new Coche("c213fas" ,"cochardo", 1231);
		Coche c2= new Coche("D254wds" ,"cochino", 5431);
		Coche c3= new Coche("UIhd2" ,"cochete", 9834);
		Coche c4= new Coche("c213fas" ,"cochindo", 0001);
		Fichero f= new Fichero("coches.txt");
		f.escribirCoche(c4);
		f.escribirCoche(c3);
		f.escribirCoche(c2);
		f.escribirCoche(c1);
		
		ArrayList<Coche> cs=f.leerCoches();
		for(Coche c: cs)
			System.out.println(c);
		f.closeUp();
	}
		

}
