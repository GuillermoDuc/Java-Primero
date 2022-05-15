package simuladorColas;

public class Ventanilla {
	
		Cola colaVentanilla= new Cola();
		public boolean compararVentanilla(Ventanilla ventanilla) {
			if(this.colaVentanilla.indice<ventanilla.colaVentanilla.indice) {
				return true;
			}
			return false;
		}
}

