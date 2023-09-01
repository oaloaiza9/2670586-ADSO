import java.util.Date;

public class CajeroElectronico{
	int capacidadTotal;
	int dineroDisponible;
	int cant_10;
	int cant_20;
	int cant_50;
	int cant_100;
	String nombreBanco;
	String listaTransacciones [];
	String usuarioAdmin;
	String claveAdmin;

	public CajeroElectronico(int capacidadTotal, int dineroDisponible, int cant_10, int cant_20, int cant_50, int cant_100, String nombreBanco, String usuarioAdmin, String claveAdmin){
		this.capacidadTotal = capacidadTotal;
		this.dineroDisponible = dineroDisponible;
		this.cant_10 = cant_10;
		this.cant_20 = cant_20;
		this.cant_50 = cant_50;
		this.cant_100 = cant_100;
		this.nombreBanco = nombreBanco;
		this.usuarioAdmin = usuarioAdmin;
		this.claveAdmin = claveAdmin;
		listaTransacciones = new String [100];
	}

	public CajeroElectronico(int capacidadTotal, String nombreBanco, String usuarioAdmin, String claveAdmin){
		this.capacidadTotal = capacidadTotal;
		this.nombreBanco = nombreBanco;
		this.usuarioAdmin = usuarioAdmin;
		this.claveAdmin = claveAdmin;

		this.dineroDisponible = 0;
		this.cant_10 = 0;
		this.cant_20 = 0;
		this.cant_50 = 0;
		this.cant_100 = 0;

		listaTransacciones = new String [100];
	}

	public void imprimirDetalle(){
		System.out.println("--------------------------------------");
		System.out.println("  capacidadTotal: "+capacidadTotal);
		System.out.println("  dineroDisponible: "+dineroDisponible);
		System.out.println("  cant_10: "+cant_10);
		System.out.println("  cant_20: "+cant_20);
		System.out.println("  cant_50: "+cant_50);
		System.out.println("  cant_100: "+cant_100);
		System.out.println("  nombreBanco: "+nombreBanco);
		System.out.println("  usuarioAdmin: "+usuarioAdmin);
		System.out.println("  claveAdmin: "+claveAdmin);
		System.out.println("  Historial Transacciones: ");
		for (int i=0; i<listaTransacciones.length;i++) {
			if (listaTransacciones[i]!=null) {
				System.out.println("       => "+listaTransacciones[i]);
			}
		}
		System.out.println("--------------------------------------");
	}

	public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
		int total = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);
		
		if (total <= capacidadTotal ) {
			dineroDisponible = total;
			this.cant_10 = cant_10;
			this.cant_20 = cant_20;
			this.cant_50 = cant_50;
			this.cant_100 = cant_100;

			registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
			return true;
		}else{
			registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "ERROR");
			return false;
		}
	}

	public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
		Date fecha = new Date();
		String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

		// Buscar un indice donde este vacio
		int indice = -1;
		for (int i=0; i<listaTransacciones.length; i++) {
			if (listaTransacciones[i]==null) {
				indice = i;
				break;
			}
		}
		
		if (indice != -1) {
			listaTransacciones[ indice ] = texto;
		}else{
			for (int i=0; i<listaTransacciones.length-1; i++) {
				listaTransacciones[i] = listaTransacciones[i+1];
			}
			listaTransacciones[ listaTransacciones.length-1 ] = texto;
		}
	}

}