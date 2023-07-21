import java.util.Scanner;

public class Ejemplo02{
	public static void main(String[] args) {

		// Variable de entrada por teclado
		Scanner entrada = new Scanner(System.in);

		// Pedir dato al usuario
		System.out.print(" => Ingrese numero N: ");
		int n = entrada.nextInt();

		// Crear el arreglo
		int arreglo [] = new int [n];

		// Ciclo para llenar el arreglo
		for (int i=0; i<arreglo.length; i++){
			arreglo[i] = (i+1)*2;
		}

		// Ciclo para imprimir el arreglo
		for (int i=0; i<arreglo.length; i++) {
			System.out.print(" ["+arreglo[i]+"]");
		}

	}
}