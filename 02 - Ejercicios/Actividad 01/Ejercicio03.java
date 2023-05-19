import java.util.Scanner;

public class Ejercicio03{
	public static void main(String[] args) {
		
		// Variable para entrada de datos
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese numero 01: ");
		int numero_1 = entrada.nextInt();
		
		System.out.print(" => Ingrese numero 02: ");
		int numero_2 = entrada.nextInt();
		
		int auxiliar = numero_1;
		numero_1 = numero_2;
		numero_2 = auxiliar;

		System.out.println(" El contendido del numero 1 es: "+numero_1);
		System.out.println(" El contendido del numero 2 es: "+numero_2);

	}
}