import java.io.Serializable;
import java.util.ArrayList;

public class Viajante implements Serializable {
	String DNI;
	String nombre;
	int antiguo;
	int distanciaRecorrida;
	ArrayList<Venta> ventasRealizadas;
	
	public Viajante(String dNI, String nombre, int antiguo, int distanciaRecorrida, ArrayList<Venta> ventasRealizadas) {
		this.DNI = dNI;
		this.nombre = nombre;
		this.antiguo = antiguo;
		this.distanciaRecorrida = distanciaRecorrida;
		this.ventasRealizadas = ventasRealizadas;
	}
	public String toString() {
		
		String a="dni:"+ this.DNI+" ...";
		for(Venta venta:this.ventasRealizadas) {
			a+="venta importe"+ venta;
		}
		return a;
		}

}
