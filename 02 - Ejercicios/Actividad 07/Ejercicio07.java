import java.util.Scanner;

public class Ejercicio07{
	public static void main(String[] args) {
		
		// Creacion variable de entrada
		Scanner entrada = new Scanner(System.in);
		
		// Solicitar al usuario un numero
		System.out.print("=> Ingrese un numero: ");
		int numero = entrada.nextInt();
		
		// Crear el arreglo del tamaño indicado
		int arreglo [] = new int [numero];
		
		// Llenar el arreglo
		int contPrimos = 0;
		int primo = 2;
		while( contPrimos < numero ){
			// verificar si el numero es primo
			int divisores = 0;
			for (int i=1; i<=primo; i++) {
				if (primo%i == 0) {
					divisores++;
				}
			}
			
			// Si es primo.
			if (divisores==2) {
				// Se almacena el numero en el arreglo
				arreglo[contPrimos] = primo;
				// Aumentamos contPrimos
				contPrimos += 1;
			}
			
			// aumentar primo
			primo++;
		}

		// Imprimir el arreglo
		System.out.println(" Lista de Primos Generada:");
		for (int i=0; i<numero; i++) {
			System.out.print("["+arreglo[i]+"]");
		}
		
	}
}