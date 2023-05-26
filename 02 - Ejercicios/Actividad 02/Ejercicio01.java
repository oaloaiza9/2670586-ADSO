import java.util.Scanner;

public class Ejercicio01{
	public static void main(String[] args) {
		
		// Variable de entrada por teclado
		Scanner entrada = new Scanner(System.in);
		int edad = 0;

		System.out.println("Bienvenido al Sistema.");

		System.out.print("Ingrese su edad: ");
		edad = entrada.nextInt();

		if (edad>0 && edad<18) {
			System.out.println("Eres menor de edad y recibes un auxilio de $800.000");
		}else if (edad>=18 && edad<100) {
			System.out.println("Eres mayor de edad y pagas un impuesto de $200.000");
		}else{
			System.out.println("Edad invalida. No cumple con los rangos minimos o maximos.");
		}
		
	}
}