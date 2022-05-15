package tema6;
import java.util.*;
/*
 * Escribe una clase Matriz y dótala de métodos para instanciarla, obtener el número de filas o de
columnas, el valor de una celda, asignar valor a una celda, imprimirla, sumar matrices, restar y
multiplicar.
 */

public class Matriz {
	private int columnas;
	private int filas;
	private int[][]matriz;
	Matriz(){
		Scanner teclado= new Scanner (System.in);
		System.out.println("cuantas filas");
		int filas=teclado.nextInt();
		this.filas=filas;
		System.out.println("cuantas columnas");
		int columnas=teclado.nextInt();
		this.columnas=filas;
		this.matriz= new int [filas][columnas];
	}
	public void introducirDatos() {
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<this.columnas;i++) {
			for (int j=0;j<this.filas;j++) {
				System.out.print("Introduzca el valor que desea introducir en la fila "+ i +" en la columna "+ j);
				matriz [i][j]=teclado.nextInt();
			}
			
		}
	}
	public void imprimirMatriz() {
		for(int i=0;i<this.columnas;i++) {
			for (int j=0;j<this.filas;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
	}
		}
	public void sumarMatrices(Matriz sumada) {
		for (int i=0;i<this.columnas;i++) {
			for (int j=0;j<this.filas;j++) {
				this.matriz[i][j]+= sumada.matriz[i][j];
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz prueba= new Matriz();
		prueba.introducirDatos();
		prueba.imprimirMatriz();

}
}
