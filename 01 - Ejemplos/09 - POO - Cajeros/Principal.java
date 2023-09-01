
public class Principal{
	public static void main(String[] args) {
		
		CajeroElectronico cajero01 = new CajeroElectronico(300000000, 10000000, 100, 50, 20, 70, "Bancolombia", "adso123", "12345");
		cajero01.imprimirDetalle();

		CajeroElectronico cajero02 = new CajeroElectronico(150000000, "Davivienda", "adso54321", "54321");
		cajero02.imprimirDetalle();

		cajero02.abastecerCajero(1000, 1000, 500, 500);
		cajero02.abastecerCajero(20000, 20000, 5000, 5000);
		
		cajero02.imprimirDetalle();
	}
}