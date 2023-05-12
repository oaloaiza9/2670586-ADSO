import java.util.Scanner;

public class Ejercicio01{
	public static void main(String[] args) {
		// crear variable de entrada
		Scanner entrada = new Scanner(System.in);

		int numero_1;
		int numero_2;
		int resultado;

		System.out.println("Ingrese numero 1: ");
		numero_1 = entrada.nextInt();

		System.out.println("Ingrese numero 2: ");
		numero_2 = entrada.nextInt();

		resultado = numero_1 + numero_2;
		System.out.println("El resultado es: "+resultado);

	}
}