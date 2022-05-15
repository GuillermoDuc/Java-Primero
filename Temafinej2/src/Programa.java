import java.io.IOException;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Agencia agencia= new Agencia();
		ArrayList<Venta> ventas= new ArrayList<Venta>();
		
		Venta v1= new Venta(null, 10, null, false);
		Venta v2= new Venta(null, 15, null, false);
		ventas.add(v2);
		ventas.add(v1);
		Viajante v= new Viajante("hola", "aaaaa", 12, 0,ventas );
		v.toString();
		Viajante b= new Viajante("holaaaaa", "bbbbbb", 223, 1,ventas );
		agencia.annadirViajante(v);
		agencia.annadirViajante(b);
		/*agencia.annadirViajante(v);
		agencia.annadirViajante(b);
		agencia.mostrarListado();
		f.escribirFinal(agencia);
	*/
		Fichero f=null;
		try {
			f = new Fichero("aver.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		f.escribirFinal(agencia);
		ArrayList<Viajante> a;
		try {
			a = f.leerPrincipio();

			for (Viajante e: a)
			{
				System.out.println(e.toString());
			}
		} catch (ClassNotFoundException | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			f.closeUp();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
