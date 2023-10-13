import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		Scanner entrada_numero = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

		// Arreglo de Objetos Perro
		Perro [] listado = new Perro [20];

		//listado[0] = new Perro("Pecas", "Daniela", 108, "Boxer", 30, 100, 20);
		//listado[1] = new Perro("Manchas", "Juan", 120, "Pequines", 15, 30, 80);

		// Impresion del Arreglo de Objetos
		for(int i=0; i<listado.length; i++){
			if ( listado[i] != null ) {
				listado[i].imprimir();
			}
		}


		// Perro mas Pesado
		Perro mas_pesado = listado[0];
		
		for(int i=0; i<listado.length; i++){
			if ( listado[i] != null ) {
				if ( listado[i].getPeso() >= mas_pesado.getPeso() ) {
					mas_pesado = listado[i];
				}
			}
		}

		if (mas_pesado!=null) {
			System.out.println( "Nombre mas pesado: " + mas_pesado.getNombre() );
			System.out.println( "Propietario de mas pesado: " + mas_pesado.getPropietario() );
			System.out.println( "Peso de mas pesado: " + mas_pesado.getPeso() );
		}else{
			System.out.println( "La lista no contine Perros" );
		}

	}
}