package tema7;

final public class Alumno extends Instituto {
	String nombreCurso;
	int cantidadAsignaturas;
	int notaAsignaturas;
	Alumno(){
		pedirDatos();
		System.out.println("dame nombre del curso");
		nombreCurso= teclado.next();
		System.out.println("dame cantidad de asignaturas");
		cantidadAsignaturas= teclado.nextInt();
		int [] cadaAsignatura= new int [cantidadAsignaturas];
		System.out.println("dame las notas de las asignaturas");
		for (int i=0;i<cantidadAsignaturas;i++) {
			System.out.println("asignatura "+(i+1));
			cadaAsignatura[i]=teclado.nextInt();
		}
	}
	int DevolverMasAlto() {int masAlto=0;
	return masAlto;}
	void VisualListaValores() {}
}
