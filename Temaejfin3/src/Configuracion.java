import java.io.Serializable;

public class Configuracion implements Serializable{
	int cuotaInfaintil;
	int cuotaJuvenil;
	int cuotaAdulto;
	int numPistaPadel;
	int numPistaTenis;
	int numPistaSquash;
	int precio;
	int sobrecoste;
	public int getCuotaInfaintil() {
		return cuotaInfaintil;
	}
	public void setCuotaInfaintil(int cuotaInfaintil) {
		this.cuotaInfaintil = cuotaInfaintil;
	}
	public int getCuotaJuvenil() {
		return cuotaJuvenil;
	}
	public void setCuotaJuvenil(int cuotaJuvenil) {
		this.cuotaJuvenil = cuotaJuvenil;
	}
	public int getCuotaAdulto() {
		return cuotaAdulto;
	}
	public void setCuotaAdulto(int cuotaAdulto) {
		this.cuotaAdulto = cuotaAdulto;
	}
	public int getNumPistaPadel() {
		return numPistaPadel;
	}
	public void setNumPistaPadel(int numPistaPadel) {
		this.numPistaPadel = numPistaPadel;
	}
	public int getNumPistaTenis() {
		return numPistaTenis;
	}
	public void setNumPistaTenis(int numPistaTenis) {
		this.numPistaTenis = numPistaTenis;
	}
	public int getNumPistaSquash() {
		return numPistaSquash;
	}
	public void setNumPistaSquash(int numPistaSquash) {
		this.numPistaSquash = numPistaSquash;
	}
	public int getPrecio() {
		return precio;
	}
	public int sobrecoste() {
		return sobrecoste;
	}
	public void setSobrecoste(int sobrecoste) {
		this.sobrecoste = sobrecoste;
	}
	@Override
	public String toString() {
		return "sobrecoste= "+sobrecoste+"\n"+"cuotaInfaintil= " + cuotaInfaintil + "\n"+ "cuotaJuvenil= " + cuotaJuvenil +"\n"+  "cuotaAdulto= "
				+ cuotaAdulto + "\n"+ "numPistaPadel= " + numPistaPadel + "\n"+ "numPistaTenis= " + numPistaTenis
				+ "\n"+ "numPistaSquash= " + numPistaSquash + "\n"+ "precio= " + precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Configuracion() {
		this.cuotaInfaintil = 10;
		this.cuotaJuvenil = 12;
		this.cuotaAdulto = 15;
		this.numPistaPadel = 2;
		this.numPistaTenis = 3;
		this.numPistaSquash = 1;
		this.precio = 10;
	}
	public Configuracion(int sobrecoste,int cuotaInfaintil, int cuotaJuvenil, int cuotaAdulto, int numPistaPadel, int numPistaTenis,
			int numPistaSquash, int precio) {
		this.sobrecoste=sobrecoste;
		this.cuotaInfaintil = cuotaInfaintil;
		this.cuotaJuvenil = cuotaJuvenil;
		this.cuotaAdulto = cuotaAdulto;
		this.numPistaPadel = numPistaPadel;
		this.numPistaTenis = numPistaTenis;
		this.numPistaSquash = numPistaSquash;
		this.precio = precio;
	}
}
