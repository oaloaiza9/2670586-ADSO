import javax.swing.JFrame;

public class Principal{
	public static void main(String[] args) {
		
		Persona arreglo [] = new Persona [100];

		arreglo[0] = new Persona( 108800, "Oscar", "Loaiza", 85, 185, 300.5 );
		arreglo[1] = new Persona( 108801, "Daniel", "Garcia", 32, 175, 110.8 );
		arreglo[2] = new Persona( 108802, "Juan", "Perez", 20, 180, 50);
		arreglo[3] = new Persona( 108803, "Daniela", "Soto", 25, 160, 55);
		arreglo[4] = new Persona( 108804, "Andres", "Guzman", 18, 165, 50);

		for (int i=0; i<arreglo.length; i++) {
			if ( arreglo[i] != null ) {
				System.out.println( "Persona "+i+": "+ arreglo[i].getNombres() );
			}
		}

	}
}