import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Socio implements Serializable{
	String nombre;
	String apellidos;
	String fechaAlta;
	int numeroSocio;
	String tipo; //infantil juvenil o adulto
	public Socio(String nombre, String apellidos, String fechaAlta, int numeroSocio, String tipo) throws IOException {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
		this.numeroSocio = numeroSocio;
		if(tipo.equals("juvenil")|tipo.equals("adulto")|tipo.equals("infatil"))
			this.tipo = tipo;
		else throw new IOException ("tipo no valido");
	}
	public Reserva generarReserva(int numeroPista, int hora, ArrayList<Socio> panitas, boolean invitado) {
		Reserva r= new Reserva(numeroPista, hora, panitas, invitado);
		return r;
	}
	public void cobrarReserva(Reserva r, int sobrecoste, int precio ) {
		int precioTotal;
		if(r.invitado==false)
			precioTotal=precio;
		else precioTotal=precio+sobrecoste;
		System.out.println("precio reserva= "+precioTotal+"?");
	}
}
