package tema7;
import java.util.*;
/*Se sabe que en un instituto trabajan profesores y estudiantes. De todos ellos, nos
interesa: nombre y edad. De los profesores, además, nos interesa: nombre del
departamento al que pertenece, cantidad de pluses que tiene su nómina y lo que
cobra en cada uno de esos pluses.
De los estudiantes nos interesa, además de su nombre y edad: nombre del cursos
donde está matriculado, en cuántas asignaturas está matriculado y la nota obtenida en
cada una de ellas.
Queremos crear una clase que gestione los datos comunes que nos interesa de los
profesores y estudiantes, pero que no permita crear un objeto con este tipo de clase,
ya que nunca nos va a interesar de una persona del instituto esos datos tan exclusivos.
Dicha clase tendrá los métodos necesarios para pedir y visualizar los datos que
contiene: dichas funciones no se podrán sobrescribir por las clases que la hereden.
Además, esta clase estará diseñada de tal forma que cualquier clase que la herede
tenga la obligación de implementar estos dos métodos:
 DevolverMasAlto: de una serie de valores que tenga el objeto, devolver el más
alto.
 VisualListaValores: de una será de valores que tenga el objeto, visualizarlos
todos.
Las clases Profesor y Estudiante no se podrán heredar.
Se deben pedir los datos de un profesor y de un estudiante a través de los
constructores. Sabemos que la edad del profesor y estudiante es la misma, por ello,
este dato se pedirá solamente una vez y es el único dato que puede no pedirse desde
el constructor.
Una vez insertados los datos, el programa debe visualizar los datos de cada uno de
ellos, cuál es la nota más alta obtenida por el alumno y cuál es el plus más alto que
cobra el profesor.*/

public abstract class Instituto {
	Scanner teclado= new Scanner (System.in);
	String nombre;
	int edad;
	final void pedirDatos() {
		System.out.println("dame nombre");
		nombre= teclado.next();
		this.nombre= nombre;
		System.out.println("dame edad");
		edad= teclado.nextInt();
		this.edad=edad;
	}
	final void visualizarDatos() {
		System.out.println("nombre: "+ nombre);
		System.out.println("edad "+ edad);
	}
	abstract int DevolverMasAlto();
	abstract void VisualListaValores();
}
