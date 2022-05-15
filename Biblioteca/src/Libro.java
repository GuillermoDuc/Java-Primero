
public class Libro extends Publicacion implements Prestable{
	boolean prestado;
	Libro(String titulo, int aniopublicacion, int isbn){
		super(isbn, aniopublicacion, titulo);
		prestado=false;
	}
	@Override
	public void presta() {
		boolean prestado=true;
		
	}

	@Override
	public void devuelve() {
		boolean prestado=false;
		
	}

	@Override
	public boolean estaPrestado() {
		boolean estaPrestado=(prestado==true)?true:false;
		return estaPrestado;
		
	}
}
