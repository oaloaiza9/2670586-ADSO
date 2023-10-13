
public class Perro {

	// Atributos
	String nombre;
	String propietario;
	int edad;
	String raza;
	double peso;
	int energia;

	// Metodos
	public Perro( String dato1, String dato2, int dato3, String dato4, double dato5, int dato6){
		nombre = dato1;
		propietario = dato2;
		edad = dato3;
		raza = dato4;
		peso = dato5;
		energia = dato6;
	}

	public void imprimirDetalle(){
		System.out.println("+-----------------------------------+");
		System.out.println("| nombre: " + nombre);
		System.out.println("| propietario: " + propietario);
		System.out.println("| edad: " + edad +" meses ("+((double) edad/12)+" anios)");
		System.out.println("| raza: " + raza);
		System.out.println("| peso: " + peso +" Kg");
		System.out.println("| energia: " + energia + " %");
		System.out.println("+-----------------------------------+");
	}

	public String getNombre(){
		return nombre;
	}

	public String getPropietario(){
		return propietario;
	}

	public int getEdad(){
		return edad;
	}

	public String getRaza(){
		return raza;
	}

	public double getPeso(){
		return peso;
	}

	public int getEnergia(){
		return energia;
	}

	public void setNombre(String dato){
		nombre = dato;
	}

	public void setPropietario(String dato){
		propietario = dato;
	}

	public void setEdad(int dato){
		edad = dato;
	}

	public void setRaza(String dato){
		raza = dato;
	}

	public void setPeso(double dato){
		peso = dato;
	}

	public void setEnergia(int dato){
		energia	= dato;
	}

	public void comer(int gramos){
		// Peso
		peso = peso + ((double) gramos/1000);
		// Energia
		energia = energia + (gramos/100);
	}

}