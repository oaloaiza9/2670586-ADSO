
public class Principal{
	public static void main(String[] args) {
		
		Persona persona_01 = new Persona( 108800, "Oscar", "Loaiza", 85, 185, 300.5 );
		Persona persona_02 = new Persona( 108801, "Daniel", "Garcia", 32, 175, 110.8 );
		
		persona_01.imprimirEstado();
		persona_02.imprimirEstado();

		persona_01.actividadFisica(80);
		persona_02.actividadFisica(30);

		persona_01.imprimirEstado();
		persona_02.imprimirEstado();

	}
}