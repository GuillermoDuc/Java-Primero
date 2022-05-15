package tema5;

public class Velocimetro {
	private float medida;
	
	Velocimetro(float medida){
		this.medida=medida;
	}
	

	public float getMedida() {
		return medida;
	}


	public void setMedida(float medida) {
		this.medida = medida;
	}
	public float incrementoMedida(float incremento) {
		medida+=incremento;
		return medida;
	}
	public float decrementoMedida(float decremento) {
		medida-=decremento;
		return medida;
	}
	public void imprimirMedida() {
		System.out.println(medida);
	}

	public static void main(String[] args) {
		
		Velocimetro s= new Velocimetro(1);
		s.incrementoMedida((float) 5.78);
		s.imprimirMedida();
	}

}
