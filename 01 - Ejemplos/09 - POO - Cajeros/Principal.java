
public class Principal{
	public static void main(String[] args) {
		
		CajeroElectronico cajero02 = new CajeroElectronico(150000000, "Davivienda", "adso54321", "54321");
		cajero02.abastecerCajero(1000, 1000, 500, 500);
		cajero02.abastecerCajero(20000, 20000, 5000, 5000);
		cajero02.imprimirDetalle();

		TarjetaDebito tarjeta01 = new TarjetaDebito("OSCAR LOAIZA", "0001 0001 0001 0001", "Davivienda", 0, 450000, "2299");
		
		cajero02.consignarDineroaTarjeta( tarjeta01, "2299", 0, 0, 0, 10);

		cajero02.imprimirDetalle();

	}
}