package uno;

public class Baraja {
	Carta[]baraja= new Carta[112];
	private int indice=0;
	Baraja() {
		for(int i=0;i<5;i++) {
			if(i!=0) {
			for(int j=0;j<13;j++) {
				Carta carta= new Carta(j,i);
				insertarCarta(carta);
				insertarCarta(carta);	
				System.out.println(i+" "+j);
			}
			}
			if(i==0) {
				Carta mascuatro= new Carta(14,0);
				insertarCarta(mascuatro);
				insertarCarta(mascuatro);
				insertarCarta(mascuatro);
				insertarCarta(mascuatro);
				Carta cambioColor= new Carta(13,0);
				insertarCarta(cambioColor);
				insertarCarta(cambioColor);
				insertarCarta(cambioColor);
				insertarCarta(cambioColor);
			}
		}
	}
	public void insertarCarta(Carta carta) {
		baraja[indice]=carta;
		indice++;
	}
	public void verBaraja(Baraja baraja) {
		for(int i=0;i<baraja.indice;i++) {
			System.out.println(baraja.baraja[i]);
		}
	}
}
