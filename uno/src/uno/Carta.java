package uno;

public class Carta {
	// 0 1 2 3 4 5 6 7 8 9 10      11 12          13   14
	// 0 1 2 3 4 5 6 7 8 9 reverse +2 skip cambioColor +4 
	int numero;
	//0=+4 1=amarillo 2=verde 3=azul 4=rojo
	int color;
	
	public Carta(int numero, int color){
		this.numero=numero;
		this.color=color;
	}
	@Override
	public String toString() {
		String colorstring="";
		
		switch (this.color) {
		case 1: {colorstring="amarillo";
				break;}
		case 2: {colorstring="verde";
				break;}
		case 3: {colorstring="azul";
				break;}
		case 4:	{colorstring="rojo";
				break;}
		}
		switch (this.numero) {
		case 14:{return "+4";}
		case 12:{return "salto de turno"+" "+colorstring;}
		case 13:{return "cambio color";}
		case 11:{return "+2"+" "+colorstring; }
		case 10:{return "cambio direccion"+" "+colorstring;}
		default:{return this.numero+" "+colorstring;}
	}
	}
}

