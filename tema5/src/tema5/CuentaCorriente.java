package tema5;
/*Sea la clase CuentaCorriente, cuyos atributos son, al menos: titular (string), saldo
(float) y codigo (único para cada cuenta, string de 8 dígitos numéricos, filtrado).
Diseñar la clase para poder realizar las siguientes operaciones:
 IngresarDinero, actualizando el saldo.
 RetiraDinero, actualizando el saldo siempre que sea posible; para ello habrá otro
método llamado PuedoSacar que devolverá true si hay saldo suficiente y false si
no lo hay. En caso de no haber saldo se avisará con un mensaje indicando el
hecho y un "pulse return".*/

public class CuentaCorriente {
	private String titular;
	private float saldo;
	private String codigo="00000000";

	CuentaCorriente(String titular, float saldo, String codigo){
		
		this.titular=titular;
		this.saldo= saldo;
		this.codigo=codigo;
	}
	 int IngresarDinero(int dinero) {
		saldo+=dinero;
		this.saldo=saldo;
		return dinero;
	}
	 boolean PuedoSacar() {
		 boolean sacar;
		 if (saldo>0) {sacar=true;}
		 else {sacar=false;}
		 return sacar;
	 }
	 float RetirarDinero(int retirada) {
		 if (PuedoSacar()==true) {
			 saldo-=retirada;
			 }
			 else {System.out.println("no hay suficiente, pulse return");}
		return saldo; 
	 }
	 @Override
	 public String toString() {
			return "CuentaCorriente [titular=" + titular + ", saldo=" + saldo + ", codigo=" + codigo + "]";}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente mia= new CuentaCorriente("Guillermo",100, "0000001");
		mia.RetirarDinero(50);
		System.out.println(mia.toString());
		
		
		
	}
	

}
