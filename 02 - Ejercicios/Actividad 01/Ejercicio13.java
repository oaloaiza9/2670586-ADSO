import java.util.Scanner;

public class Ejercicio13{
	public static void main(String[] args) {
		
		// Variable para entrada de datos
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese total en segundos: ");
		int segundos = entrada.nextInt();
		
		int sobrante = 0;

		int valorHoras = segundos/3600; 
		sobrante = segundos-(valorHoras*3600);
		
		int valorMinutos = sobrante/60;
		sobrante = sobrante-(valorMinutos*60);

		int valorSegundos = sobrante;
		System.out.println("Formato =>   "+valorHoras+":"+valorMinutos+":"+valorSegundos);

	}
}