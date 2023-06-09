import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		// Variable de Entrada por teclado.
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese numero de Tabla: ");
		int numero = entrada.nextInt();

		System.out.print(" => Ingrese cantidad Multiplos: ");
		int multiplos = entrada.nextInt();

		// While
		// int contador = 1;
		// while( contador <= multiplos ){
		// 		int resultado = numero * contador;
		// 		System.out.println(numero+" x "+contador+" = "+resultado);
		// 		contador = contador + 1;
		// }

		// For
		// for( int i=0; i<=multiplos; i++ ){
		//	 int resultado = numero * i;
		//	 System.out.println(numero+" x "+i+" = "+resultado);
		// }


		// Do While
		// int contador = 1;
		do{
			int resultado = numero * contador;
			System.out.println(numero+" x "+contador+" = "+resultado);
			contador = contador + 1;
		}while(contador<=multiplos);

	}
}