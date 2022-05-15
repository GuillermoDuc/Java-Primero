package tema7;

import java.util.Arrays;

final public class Profesor extends Instituto {
	String nombreDepartamento;
	int cantidadPluses;
	int dineroPluses;
	int []cadaPlus;
	Profesor(){
		pedirDatos();
		System.out.println("dame nombre del departamento");
		nombreDepartamento= teclado.next();
		System.out.println("dame cantidad de pluses");
		cantidadPluses= teclado.nextInt();
		int [] cadaPlus= new int [cantidadPluses];
		
		System.out.println("dame las cantidades de los pluses");
		for (int i=0;i<cantidadPluses;i++) {
			System.out.println("plus "+(i+1));
			cadaPlus[i]=teclado.nextInt();
		}
		this.cadaPlus=cadaPlus;
		System.out.println(cadaPlus.length);
	}
	int DevolverMasAlto() {
		int masAlto=0;
		Arrays.sort(cadaPlus);
		masAlto=cadaPlus[cadaPlus.length-1];
		return masAlto;
	}
	void VisualListaValores() {
		System.out.println("nombre: "+nombre);
		System.out.println("edad "+edad);
		System.out.println("cantidad de pluses "+cantidadPluses);
		System.out.println("plus mas alto: "+DevolverMasAlto());
	}

}
