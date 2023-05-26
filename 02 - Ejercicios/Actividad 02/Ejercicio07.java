import java.util.Scanner;

public class Ejercicio07{
	public static void main(String[] args) {
		
		// Variable para lectura por teclado
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese un numero (maximo 10 digitos): ");
		int numero = entrada.nextInt();

		if(numero>=0 && numero<=2000000000){

			int cientos = numero%1000;
			int miles = (numero/1000)%1000;
			int millones = (numero/1000000)%1000;
			int miles_millones = numero/1000000000; 

			System.out.print(" $ ");

			// Algoritmo para imprimir los miles_millones
			if(miles_millones!=0){
				System.out.print( miles_millones+"." );
			}else{
				System.out.print("");
			}

			// Algoritmo para imprimir los millones
			if(millones==0){
				if (miles_millones!=0) {
					System.out.print("000.");
				}else{
					System.out.print("");
				}
			}else{
				if (millones>=1 && millones<=9) {
					if(miles_millones!=0){
						System.out.print("00"+millones+".");
					}else{
						System.out.print(millones+".");
					}
				}
				if (millones>=10 && millones<=99){
					if (miles_millones!=0) {
						System.out.print("0"+millones+".");
					}else{
						System.out.print(millones+".");
					}
				}
				if (millones>=100 && millones<=999) {
					System.out.print(millones+".");
				}
			}

			// Algoritmo para imprimir los miles
			if (miles==0) {
				if( miles_millones!=0 || millones!=0 ){
					System.out.print("000.");
				}else{
					System.out.print("");
				}
			}else{
				if( miles>=1 && miles<=9 ){
					if( miles_millones!=0 || millones!=0 ){
						System.out.print("00"+miles+".");
					}else{
						System.out.print(miles+".");
					}
				}
				if( miles>=10 && miles<=99) {
					if( miles_millones!=0 || millones!=0 ){
						System.out.print("0"+miles+".");
					}else{
						System.out.print(miles+".");
					}
				}
				if( miles>=100 && miles<=999) {
					System.out.print(miles+".");
				}
			}

			// Algoritmo para imprimir los cientos
			if( cientos==0 ) {
				if(miles_millones!=0 || millones!=0 || miles!=0 ){
					System.out.println("000");
				}else{
					System.out.println("0");
				}
			}else{
				if( cientos>=1 && cientos<=9 ){
					if( miles_millones!=0 || millones!=0 || miles!=0 ){
						System.out.print("00"+cientos);
					}else{
						System.out.print(cientos);
					}
				}
				if( cientos>=10 && cientos<=99) {
					if( miles_millones!=0 || millones!=0 || miles!=0 ){
						System.out.print("0"+cientos);
					}else{
						System.out.print(cientos);
					}
				}
				if( cientos>=100 && cientos<=999) {
					System.out.print(cientos);
				}
			}
		}else{
			System.out.println("Numero Invalido.");
		}

	}
}