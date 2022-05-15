package tema8;
import java.util.*;

/*Dise�a un programa que pida el dividendo y el divisor y muestre el cociente de la divisi�n
entera. Este proceso se repetir� hasta que se inserte como divisor un cero o se introduzca
un dato que no sea v�lido como n�mero. La divisi�n por cero se controla con el error
ArithmeticException.
Para hacerlo se usar�n, al menos, estos tres m�todos:
� Uno que pida una cadena.
� Otro que pida un n�mero entero.
� Otro que calcule y visualice el cociente de dicha divisi�n.
Si se produce un error en uno de estos m�todos hay que dejar que se propague.*/

import java.util.Scanner;
import java.io.*;
public class Dividir {
	Scanner teclado= new Scanner(System.in);
		int pedirDivisor()  {
			try {
			System.out.println("dime divisor");
			int divisor=teclado.nextInt();
			return divisor;}
			catch(InputMismatchException e){}
			return teclado.nextInt();
			}
	

	String pedirDividendo() throws IOException {
		
		boolean esnumero=true;
		String cadena="";
		System.out.println("dime dividendo");
		teclado.next();
		cadena=teclado.nextLine();
		for (int i=0;i<cadena.length();i++) {
			while (esnumero) {
			if (cadena.charAt(i)<='0'&&cadena.charAt(i)>='9') {
				esnumero=true;
			}
			else esnumero=false;
			}
		}
		if (esnumero==false) {
			throw new IOException("solo se puede introducir numeros");
			}
		else 
			return cadena;
		}
	
	double dividir(int divisor,String dividendo) {
		double resultado=0;
		try {
			int dividendo2=Integer.parseInt(dividendo);
			resultado=dividendo2/divisor;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {System.out.println("deben ser numeros");}
		return resultado;
	}

	public static void main(String[] args) throws IOException {
		Dividir prueba= new Dividir();
		System.out.println(prueba.dividir(prueba.pedirDivisor(), prueba.pedirDividendo()));

	}

}
