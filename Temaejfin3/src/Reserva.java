import java.io.Serializable;
import java.util.ArrayList;

public class Reserva implements Serializable{
	int numeroPista;
	int hora;
	ArrayList<Socio> panitas = new ArrayList<Socio>();
	boolean invitado;
	public Reserva(int numeroPista, int hora, ArrayList<Socio> panitas, boolean invitado) {
		this.numeroPista = numeroPista;
		this.hora = hora;
		this.panitas = panitas;
		this.invitado = invitado;
	}
}
