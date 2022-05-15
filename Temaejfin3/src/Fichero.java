import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	ObjectInputStream socioleer = null;
	ObjectInputStream reservaleer = null;
	ObjectOutputStream reservaescribir = null;
	ObjectOutputStream socioescribir = null;
	PrintStream configuracionescribir = null;
	Scanner configuracionleer = null;
		Fichero(String socios, String reservas, String configuracion){
			try {
				
				socioescribir= new ObjectOutputStream(new FileOutputStream(socios));
				socioleer= new ObjectInputStream(new FileInputStream(socios));
				reservaescribir= new ObjectOutputStream(new FileOutputStream(reservas));
				reservaleer= new ObjectInputStream(new FileInputStream(reservas));
				configuracionescribir= new PrintStream(new FileOutputStream(configuracion));
				configuracionleer= new Scanner(new FileInputStream(configuracion));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		public void escribirReservas(Club c) {
			try {
				reservaescribir.writeObject(c.reservas);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void escribirSocios(Club c) {
			try {
				reservaescribir.writeObject(c.socios);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public ArrayList<Socio> leerSocio(){
			try {
				ArrayList<Socio>socios=(ArrayList<Socio>) socioleer.readObject();
				return socios;
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		public ArrayList<Reserva> leerReservas(){
			try {
				ArrayList<Reserva> reservas= (ArrayList<Reserva>) reservaleer.readObject();
				return reservas;
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		public void escribirConfiguracion(Configuracion c) {
			configuracionescribir.print(c.toString());
		}
		public void leerConfiguracion() {
			while(configuracionleer.hasNext()) {
				System.out.print(configuracionleer.next()+" ");
				System.out.println(configuracionleer.next());
				
			}
		}
		public void closeUp() {
			try {
				socioleer.close();
				socioescribir.close();
				reservaleer.close();
				reservaescribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
