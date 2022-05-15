package simuladorColas;

public class Cola {
	Cliente[] clientes= new Cliente[100];
	int indice=0;
	void insertarClientes (int minutos) {
		Cliente cliente= new Cliente(minutos);
		clientes[indice]= cliente;
		indice++;
	}
	void actualizarCola () {
			clientes[0].minutos--;
			if (clientes[0].minutos==0) {
				for(int i=1;i<indice;i++) {
					clientes[i-1]=clientes[i];
				}
				indice--;
			}
			
		}
	}


