import java.util.Scanner;

public class Ejercicio01{
	public static void main(String[] args) {
		
		// Variable para entrada de datos
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese Primer numero entero: ");
		int numero_1 = entrada.nextInt();

		System.out.print(" => Ingrese Segundo numero entero: ");
		int numero_2 = entrada.nextInt();

		int respuesta = numero_1 + numero_2;
		System.out.println(" => El resultado de la suma es: "+respuesta);


	}
}