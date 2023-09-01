import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

		Persona listaPersonas [] = new Persona [99];
		int indicePersonas = 0;

		listaPersonas[0] = new Persona( 108800, "Oscar", "Loaiza", 85, 185, 300.5 );
		listaPersonas[1] = new Persona( 108801, "Daniel", "Garcia", 32, 175, 110.8 );
		listaPersonas[2] = new Persona( 108802, "Juan", "Perez", 20, 180, 50);
		listaPersonas[3] = new Persona( 108803, "Daniela", "Soto", 25, 160, 55);
		listaPersonas[4] = new Persona( 108804, "Andres", "Guzman", 18, 165, 50);
		indicePersonas = 5;

		int opcion = 0;
		while( opcion!=11 ){
			System.out.println("\n\n");
			System.out.println("+-------------------------------------+");
			System.out.println("+           MENU DE PERSONAS          +");
			System.out.println("+-------------------------------------+");
			System.out.println("|                        Memoria: "+(99-indicePersonas)+"  |");
			System.out.println("|   1: Registrar Persona.             |");
			System.out.println("|   2: Ver lista de Personas.         |");
			System.out.println("|   3: Editar Persona.                |");
			System.out.println("|   4: Eliminar Persona.              |");
			System.out.println("|   5: Persona con mayor edad.        |");
			System.out.println("|   6: Persona con menor edad.        |");
			System.out.println("|   7: Persona mas alta.              |");
			System.out.println("|   8: Persona mas baja.              |");
			System.out.println("|   9: Promedio de edades.            |");
			System.out.println("|   10: Promedio de altura.           |");
			System.out.println("|   11: Salir.                        |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 5): ");
			opcion = entrada_numero.nextInt();

			if(opcion==1){
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+          REGISTRAR PERSONA          +");
				System.out.println("+-------------------------------------+");
				
				System.out.print("=> Ingrese la cedula: ");
				int cedula = entrada_numero.nextInt();

				System.out.print("=> Ingrese nombres: ");
				String nombres = entrada_texto.nextLine();

				System.out.print("=> Ingrese apellidos: ");
				String apellidos = entrada_texto.nextLine();

				System.out.print("=> Ingrese la edad: ");
				int edad = entrada_numero.nextInt();

				System.out.print("=> Ingrese la altura: ");
				int altura = entrada_numero.nextInt();

				System.out.print("=> Ingrese la peso: ");
				double peso = entrada_numero.nextDouble();

				Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
				listaPersonas[ indicePersonas ] = temporal;
				indicePersonas += 1;
			}

			if(opcion==2){

				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+           LISTA DE PERSONA          +");
				System.out.println("+-------------------------------------+");
				for (int i=0; i<listaPersonas.length; i++) {
					if ( listaPersonas[i] != null ) {
						System.out.println( (i+1) + " => "+listaPersonas[i].getInfoInLine() );
					}
				}
			}

			if(opcion==3){
				// Solicitar cedula
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+            EDITAR PERSONA           +");
				System.out.println("+-------------------------------------+");
				System.out.print("=> Ingrese cedula: ");
				int cedula = entrada_numero.nextInt();

				// Buscar si existe una persona con esa cedula
				int indiceEncontrado = -1;
				for (int i=0; i<listaPersonas.length; i++) {
					if (listaPersonas[i]!=null && listaPersonas[i].getCedula()==cedula) {
						indiceEncontrado = i;
					}
				}

				// Si. Solicitar los nuevos datos
				// No. Mostrar mensaje de error
				if (indiceEncontrado != -1) {
					System.out.print("=> Ingrese nombres: ");
					String nombres = entrada_texto.nextLine();

					System.out.print("=> Ingrese apellidos: ");
					String apellidos = entrada_texto.nextLine();

					System.out.print("=> Ingrese la edad: ");
					int edad = entrada_numero.nextInt();

					System.out.print("=> Ingrese la altura: ");
					int altura = entrada_numero.nextInt();

					System.out.print("=> Ingrese la peso: ");
					double peso = entrada_numero.nextDouble();

					Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
					listaPersonas[ indiceEncontrado ] = temporal;
				}else{
					System.out.println("+-------------------------------------+");
					System.out.println("+ La cedula "+cedula+" no corresponde ");
					System.out.println("+ a un usuario del sistema.           ");
					System.out.println("+-------------------------------------+");
				}
			}

			if(opcion==4){
				// Solicitar cedula
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+            ELIMINAR PERSONA           +");
				System.out.println("+-------------------------------------+");
				System.out.print("=> Ingrese cedula: ");
				int cedula = entrada_numero.nextInt();

				// Buscar si existe una persona con esa cedula
				int indiceEncontrado = -1;
				for (int i=0; i<listaPersonas.length; i++) {
					if (listaPersonas[i]!=null && listaPersonas[i].getCedula()==cedula) {
						indiceEncontrado = i;
					}
				}

				// Validar si existe la persona con esa cedula
				if ( indiceEncontrado != -1 ) {
					
					for ( int i=indiceEncontrado; i<listaPersonas.length-1; i++) {
						listaPersonas[i] = listaPersonas[ i+1 ];
					}
					listaPersonas[ listaPersonas.length-1 ] = null;
					indicePersonas -= 1;

					System.out.println("+-------------------------------------+");
					System.out.println("+      PERSONA ELIMINA CON EXITO      +");
					System.out.println("+-------------------------------------+");
				}else{
					System.out.println("+-------------------------------------+");
					System.out.println("+ La cedula "+cedula+" no corresponde ");
					System.out.println("+ a un usuario del sistema.           ");
					System.out.println("+-------------------------------------+");
				}
			}

						
			if(opcion==11){
				System.out.println("\n");
				System.out.println("+-------------------------+");
				System.out.println("|-------- SALIENDO -------|");
				System.out.println("+-------------------------+");
			}
		}

	}
}