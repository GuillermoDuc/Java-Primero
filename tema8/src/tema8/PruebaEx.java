package tema8;

import java.util.Scanner;
import java.io.*;
public class PruebaEx {
	Scanner teclado = new Scanner(System.in); 
	public int Dividir ()throws IOException {
		
		 int divisor= teclado.nextInt();
		 int dividendo= teclado.nextInt();
		 if (divisor==10) {
			 throw new IOException("no me gusta el 10");
			 
		 } else System.out.println("no has dividido 10");
		 return divisor/dividendo;
		 
		 }
		 
	

	
	
	public static void main(String[] args) throws IOException {
	
		PruebaEx a= new PruebaEx();
		try {
		System.out.println(a.Dividir());
	}catch(IOException ee) {
		System.out.println("hola "+ee.getMessage());}
	}

}	


