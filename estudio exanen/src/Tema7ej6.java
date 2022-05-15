/*Dada la clase Empleado siguiente:
final class Empleado{
String nombre;
int edad;
final voidpedirDatos(){}
voidvisualDatos(){}
}
1. Crea la clase Jefe que herede de la clase Empleado. ¿Qué ocurre?
2. Quita el modificador “final” a la clase Empleado. Haz que la clase Jefe herede de la
clase Empleado y añade a la clase Jefe un método con esta cabecera: voidpedirDato().
¿Qué ocurre?*/
abstract class Tema7ej6 {
	public String nombre;
	int edad;
	final void pedirDatos(){}
	public abstract void visualDatos();
}
