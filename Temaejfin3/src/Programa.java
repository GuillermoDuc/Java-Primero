import javax.imageio.plugins.tiff.FaxTIFFTagSet;

/*
 * Debemos crear un programa para la gesti?n de un club deportivo tratando, por un lado, los socios y, por el
otro, la reserva de pistas.
La gesti?n de socios incluye las altas, bajas, modificaci?n de datos y pago de recibos. De los mismos, tenemos
registrados nombre, apellidos, fecha de alta, n?mero de socio y tipo (infantil, juvenil o adulto). Cada uno de
ellos paga una cuota diferente que est? almacenada en el fichero de configuraci?n del programa.
El club cuenta con pistas de tenis, p?del y squash. Como en el caso de las cuotas, el fichero de configuraci?n
del programa indica la cantidad que hay de cada tipo y su precio de uso. Cualquier socio puede reservar una
pista indicando cu?l va a usar, la hora (un n?mero como 10, 11, 15...) y qu? otros socios van a utilizarla;
tambi?n puede jugar con un invitado, que tiene un sobrecargo (especificado en el fichero de configuraci?n).
El cobro, en cualquier caso, se realiza siempre al socio que hace la reserva.
El programa mantiene la informaci?n en dos ficheros, uno de socios y otro de reservas, teniendo una opci?n
para leerlos y otra para actualizarlos en cualquier momento: no los lee al principio ni los guarda o pide
confirmaci?n para hacerlo al abandonar el programa.
El programa, adem?s, debe permitir modificar las cuotas, precio y n?mero de pistas, almacenando (de
inmediato) la informaci?n en el fichero de configuraci?n, que debe ser de texto, si alg?n dato es actualizado.
?ste s? debe ser le?do al inicio, finalizando el programa si el fichero no existe o contiene errores (un formato
no apropiado).
 */
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuracion c= new Configuracion();
		Fichero f= new Fichero("socios.txt", "reservas.txt", "configuracion.txt");
		f.escribirConfiguracion(c);
		System.out.println(c.toString());
		Integer sobrecoste=0;
		Integer cuotaInfantil=0;
		Integer cuotaJuvenil=0;
		Integer cuotaAdulto=0;
		Integer numPistaPadel=0;
		Integer numPistaTenis=0;
		Integer numPistaSquash=0;
		
		f.leerConfiguracion();
		System.out.println("sobrecoste:::" + sobrecoste);
		f.closeUp();
	}

}
