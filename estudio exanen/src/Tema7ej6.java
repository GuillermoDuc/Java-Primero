/*Dada la clase Empleado siguiente:
final class Empleado{
String nombre;
int edad;
final voidpedirDatos(){}
voidvisualDatos(){}
}
1. Crea la clase Jefe que herede de la clase Empleado. �Qu� ocurre?
2. Quita el modificador �final� a la clase Empleado. Haz que la clase Jefe herede de la
clase Empleado y a�ade a la clase Jefe un m�todo con esta cabecera: voidpedirDato().
�Qu� ocurre?*/
abstract class Tema7ej6 {
	public String nombre;
	int edad;
	final void pedirDatos(){}
	public abstract void visualDatos();
}
