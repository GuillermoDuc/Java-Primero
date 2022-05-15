
public class Coche {
String matricula;
String modelo;
Integer anio;
public Coche(String matricula, String modelo, Integer anio) {
	this.matricula = matricula;
	this.modelo = modelo;
	this.anio = anio;
}
public String toString() {
	String coche= "matricula: "+ this.matricula+ "\n"+"modelo: "+this.modelo+"\n"+"anio: "+this.anio;
	return coche;
}



}
