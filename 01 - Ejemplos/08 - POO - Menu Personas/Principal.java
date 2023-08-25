import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

		int opcion = 0;
		while( opcion!=5 ){
			System.out.println("+-------------------------------------+");
			System.out.println("+           MENU DE PERSONAS          +");
			System.out.println("+-------------------------------------+");
			System.out.println("|                        Memoria: 00  |");
			System.out.println("|   1: Registrar Persona.             |");
			System.out.println("|   2: Ver lista de Personas.         |");
			System.out.println("|   3: Editar Persona.                |");
			System.out.println("|   4: Eliminar Persona.              |");
			System.out.println("|   5: Salir.                         |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 5): ");
			opcion = entrada_numero.nextInt();

			if(opcion==1){
				
			}

			if(opcion==2){
				
			}

			if(opcion==3){
				
			}

			if(opcion==4){
				
			}

			if(opcion==5){
				System.out.println();
				System.out.println("+-------------------------+");
				System.out.println("|-------- SALIENDO -------|");
				System.out.println("+-------------------------+");
			}
		}

	}
}