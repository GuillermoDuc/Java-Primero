import java.util.*;

public class Agencia {
	ArrayList<Viajante> viajantes = new ArrayList<Viajante>();

	
	public void annadirViajante(Viajante v) {
		viajantes.add(v);
	}
	public void eliminarViajante(int posicion) {
		viajantes.remove(posicion);
	}
	public void mostrarListado() {
		ListIterator<Viajante> iterador= viajantes.listIterator();
		while(iterador.hasNext()) {
			int importe=0;
			Viajante v= iterador.next();
			System.out.println(v.antiguo);
			System.out.println(v.distanciaRecorrida);
			System.out.println(v.nombre);
			System.out.println(v.DNI);
			ListIterator<Venta> iteradorventas= v.ventasRealizadas.listIterator();
			while(iteradorventas.hasNext()) {
				
				Venta venta= iteradorventas.next();
				if (venta.cobrada==true)
					importe+=venta.importe;
				
			}
			System.out.println(importe);
			
		}
	}
}
