import java.util.Scanner;

public class Ejercicio01{
	public static void main(String[] args) {
		
		// Variable de Entrada por teclado.
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese cantidad de notas: ");
		int cantidad = entrada.nextInt();

		double sumaNotas = 0;
		int contador = 1;

		while(contador <= cantidad){
			System.out.print(" => Ingrese Nota "+contador+": ");
			double nota = entrada.nextDouble();

			sumaNotas = sumaNotas + nota;

			contador = contador + 1;
		}

		double promedio = sumaNotas / cantidad;
		System.out.println(" => El Promedio del Estudiante es: "+promedio);

	}
}