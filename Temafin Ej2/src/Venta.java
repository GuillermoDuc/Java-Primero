import java.io.Serializable;

public class Venta implements Serializable{
	String fecha;
	int importe;
	Viajante cliente;
	boolean cobrada;
	public Venta(String fecha, int importe, Viajante cliente, boolean cobrada) {
		this.fecha = fecha;
		this.importe = importe;
		this.cliente = cliente;
		this.cobrada = cobrada;
	}
}
