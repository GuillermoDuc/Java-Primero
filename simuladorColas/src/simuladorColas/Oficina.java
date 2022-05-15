package simuladorColas;

public class Oficina {
	
		Ventanilla ventanillauno= new Ventanilla();
		Ventanilla ventanillados= new Ventanilla();
		Ventanilla ventanillatres= new Ventanilla();
		Ventanilla ventanillacuatro= new Ventanilla();
		Ventanilla ventanillacinco= new Ventanilla();
	
	public void mostrarDatos() {
		if(ventanillauno.colaVentanilla.indice>0)
		System.out.println("Ventanilla uno: cliente actual minutos restantes: "+ ventanillauno.colaVentanilla.clientes[0].minutos+
							" clientes en cola " + ventanillauno.colaVentanilla.indice);
		if(ventanillados.colaVentanilla.indice>0)
		System.out.println("Ventanilla dos: cliente actual minutos restantes: "+ ventanillados.colaVentanilla.clientes[0].minutos+
				" clientes en cola " + ventanillados.colaVentanilla.indice);
		if(ventanillatres.colaVentanilla.indice>0)
		System.out.println("Ventanilla tres: cliente actual minutos restantes: "+ ventanillatres.colaVentanilla.clientes[0].minutos+
				" clientes en cola " + ventanillatres.colaVentanilla.indice);
		if(ventanillacuatro.colaVentanilla.indice>0)
		System.out.println("Ventanilla cuatro: cliente actual minutos restantes: "+ ventanillacuatro.colaVentanilla.clientes[0].minutos+
				" clientes en cola " + ventanillacuatro.colaVentanilla.indice);
		if(ventanillacinco.colaVentanilla.indice>0)
		System.out.println("Ventanilla cinco: cliente actual minutos restantes: "+ ventanillacinco.colaVentanilla.clientes[0].minutos+
				" clientes en cola " + ventanillacinco.colaVentanilla.indice);
		
	}
	
	}
		


