import java.util.Scanner;


public class Ejercicio02{
	public static void main(String[] args) {
		
		// Variable para entrada de datos
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Valor en Grados Celsius: ");
		double grado_celcius = entrada.nextDouble();

		double grados_fahrenheit = (grado_celcius*9/5) + 32;
		System.out.println(" => Los Grados Fahrenheit son: "+grados_fahrenheit);

	}
}