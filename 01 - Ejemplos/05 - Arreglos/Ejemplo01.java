import java.util.Scanner;

public class Ejemplo01{
	public static void main(String[] args) {

		// Variable de entrada por teclado
		Scanner entrada = new Scanner(System.in);
		
		// Crear Arreglo
		int edades [] = new int [10];
		String clientes [] = { "Oscar", "Daniel", "Alejandro", "Ana", "Maria" };
		
		// Llenado automatico.
		/*for (int i=0; i<10; i++) {
			System.out.print(" - Ingrese dato en pos ["+i+"]: ");
			edades[i] = entrada.nextInt();
		}*/

		// Impresion datos automatico
		System.out.println("|--------------------------------------|");
		for (int i=0; i<clientes.length; i++) {
			System.out.println(" => Pos "+i+" es: "+clientes[i]);
		}
		System.out.println("|--------------------------------------|");

		
		



	}
}