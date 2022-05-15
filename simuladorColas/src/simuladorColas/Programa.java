package simuladorColas;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		Oficina oficina= new Oficina();
		for(int i=0;i<300;i++) {
			int minutos=0;
			if (i%5==0) {
				Random r= new Random();
				int aleatorio=r.nextInt(100);
				if(aleatorio<20) {
					minutos=5;	
				}
				else if (aleatorio>20&&aleatorio<60) {
					minutos=10;
				}
				else if (aleatorio>60) {
					minutos=20;
				}
				
				
				if(oficina.ventanillauno.compararVentanilla(oficina.ventanillados)&&oficina.ventanillauno.compararVentanilla(oficina.ventanillatres)
						&&oficina.ventanillauno.compararVentanilla(oficina.ventanillacuatro)&&oficina.ventanillauno.compararVentanilla(oficina.ventanillacinco))
				{
					oficina.ventanillauno.colaVentanilla.insertarClientes(minutos);
				}
				else if(oficina.ventanillados.compararVentanilla(oficina.ventanillauno)&&oficina.ventanillados.compararVentanilla(oficina.ventanillatres)
						&&oficina.ventanillados.compararVentanilla(oficina.ventanillacuatro)&&oficina.ventanillados.compararVentanilla(oficina.ventanillacinco))
					{
						oficina.ventanillados.colaVentanilla.insertarClientes(minutos);
					}
				else if(oficina.ventanillatres.compararVentanilla(oficina.ventanillauno)&&oficina.ventanillatres.compararVentanilla(oficina.ventanillados)
						&&oficina.ventanillatres.compararVentanilla(oficina.ventanillacuatro)&&oficina.ventanillatres.compararVentanilla(oficina.ventanillacinco))
					{
						oficina.ventanillatres.colaVentanilla.insertarClientes(minutos);
					}
				else if(oficina.ventanillacuatro.compararVentanilla(oficina.ventanillauno)&&oficina.ventanillacuatro.compararVentanilla(oficina.ventanillados)
						&&oficina.ventanillacuatro.compararVentanilla(oficina.ventanillatres)&&oficina.ventanillacuatro.compararVentanilla(oficina.ventanillacinco))
					{
						oficina.ventanillacuatro.colaVentanilla.insertarClientes(minutos);
					}
				else if(oficina.ventanillacinco.compararVentanilla(oficina.ventanillauno)&&oficina.ventanillacinco.compararVentanilla(oficina.ventanillados)
						&&oficina.ventanillacinco.compararVentanilla(oficina.ventanillatres)&&oficina.ventanillacinco.compararVentanilla(oficina.ventanillacuatro))
				{
					oficina.ventanillacinco.colaVentanilla.insertarClientes(minutos);
					
				}
				
				else {
					Random r2= new Random();
					int aleatorio2=r2.nextInt(5);
					if(aleatorio2==0) {oficina.ventanillauno.colaVentanilla.insertarClientes(minutos);}
					if(aleatorio2==1) {oficina.ventanillados.colaVentanilla.insertarClientes(minutos);}
					if(aleatorio2==2) {oficina.ventanillatres.colaVentanilla.insertarClientes(minutos);}
					if(aleatorio2==3) {oficina.ventanillacuatro.colaVentanilla.insertarClientes(minutos);}
					if(aleatorio2==4) {oficina.ventanillacinco.colaVentanilla.insertarClientes(minutos);}
					
				}
				if(i%15==0) {
					oficina.mostrarDatos();
				}
				System.out.println("Minuto de simulacion: "+i);
				if(oficina.ventanillauno.colaVentanilla.indice>0)
				oficina.ventanillauno.colaVentanilla.actualizarCola();
				if(oficina.ventanillados.colaVentanilla.indice>0)
				oficina.ventanillados.colaVentanilla.actualizarCola();
				if(oficina.ventanillatres.colaVentanilla.indice>0)
				oficina.ventanillatres.colaVentanilla.actualizarCola();
				if(oficina.ventanillacuatro.colaVentanilla.indice>0)
				oficina.ventanillacuatro.colaVentanilla.actualizarCola();
				if(oficina.ventanillacinco.colaVentanilla.indice>0)
				oficina.ventanillacinco.colaVentanilla.actualizarCola();
				
			}
			}
			
		
		
		}
	}


