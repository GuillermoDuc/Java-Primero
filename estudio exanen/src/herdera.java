import java.util.*;
import java.io.*;
public class herdera extends Tema7ej6 {
	Scanner teclado= new Scanner(System.in);
	public void visualDatos(){System.out.println("a");}
	private int a[]= new int[3];
	public void vector() throws IOException {
		for (int i=0;i<3;i++) {
			a[i]=teclado.nextInt();
			if (a[i]==0) {throw new IOException("no puede ser 0");}
			}
		}
	public herdera sumarVectores(herdera otro) {
		herdera resul= new herdera();
		for (int i=0;i<3;i++) {
			resul.a[i]=otro.a[i]+this.a[i];
		}
		for(int i=0;i<3;i++) {
			System.out.println("elemento "+(i+1)+" "+resul.a[i]);
			
		}
		return resul;
	}
	
			
			
			
			
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		herdera e= new herdera();
		try {
			e.vector();
		} catch (IOException e1) {
			
			System.out.println(e1.getMessage());
		}
		herdera sumando= new herdera();
		try{sumando.vector();}
		catch(IOException e2) {
			System.out.println(e2.getMessage());}
		e.sumarVectores(sumando);
	}
}
