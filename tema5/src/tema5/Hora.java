package tema5;
/*Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deberá tener un constructor
para inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se
deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de
impresión y lectura será hh:mm:ss, todo en modo 24 horas.*/

public class Hora {
	private int hora, minutos, segundos;
	Hora(){}
	
	Hora(int hora, int minutos, int segundos){
		this();
		while(hora>24||segundos>=60||minutos>=60) {
			if (segundos>=60) {
			minutos++;
			segundos=segundos-60;
						  }
		if(minutos>=60) {
			hora++;
			minutos=minutos-60;
			
		}
		if (hora>24) {
			hora=hora-24;
		}
		}
		
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
		
	}
	public void sumarHora(int horaSumar, int minutosSumar, int segundosSumar) {
		this.hora=hora+horaSumar;
		this.minutos=minutos+minutosSumar;
		this.segundos=segundos+segundosSumar;
		while(hora>24||segundos>=60||minutos>=60) {
			if (segundos>=60) {
			minutos++;
			segundos=segundos-60;
						  }
		if(minutos>=60) {
			hora++;
			minutos=minutos-60;
			
		}
		if (hora>24) {
			hora=hora-24;
		}
		}
	}
	public void restarHora (int horaRestar, int minutosRestar, int segundosRestar) {
		this.hora=hora-horaRestar;
		this.minutos=minutos-minutosRestar;
		this.segundos=segundos-segundosRestar;
		while(segundos<0||minutos<0||hora<0) {
		if (segundos<0) {
			segundos=segundos+60;
			minutos--;
		}
		if(minutos<0) {
			minutos=minutos+60;
			hora--;
		}
		if(hora<0) {
			hora+=24;
		}
	}
	}
	public void leerHora() {
		System.out.println(hora+":"+minutos+":"+segundos);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora s=new Hora(50,600,23);
		s.restarHora(12,65, 65);
		s.leerHora();
		
	}

}
