package tema8;
import java.util.*;
/*Escribe un programa en Java que pida los datos de dos alumnos: nombre, edad y altura.
Visualiza los datos de dichos alumnos e indica cu�l es el mayor de los dos. Si ambos tienen
la misma edad hay que mostrar un mensaje que lo indique.
Si se produce el error IOException, se visualizar� el mensaje correspondiente y se cerrar�
el programa.
En la entrada de datos, tanto de la altura como de la edad, se comprobar� que el usuario
no haya insertado letras. Si es as�, se volver� a pedir el dato correspondiente hasta que la
entrada sea correcta.*/
public class Ejercicio1 {

	public static void main(String[] args) { 
			Scanner teclado= new Scanner(System.in);
			System.out.println("introduce nombre de ambos");
			String nombre1= teclado.next();
			String nombre2= teclado.next();
			System.out.println("introduce edad");
			boolean dato=false;
			while(dato==false) {
			try {
			
			int edad1=teclado.nextInt();
			int edad2=teclado.nextInt();
			dato=true;
			}
			catch (InputMismatchException a) {System.out.println("dato incorrecto");int edad1=0;
			int edad2=0;}
			}
	


}
}