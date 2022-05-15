
public class Revista extends Publicacion {
	int numero;
	Revista(int numero,int isbn,int anio,String titulo ){
		super(isbn,anio,titulo);
		this.numero=numero;
		
	}
}
