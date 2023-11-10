public class Principal{
	public static void main(String[] args) {

		Usuario listaUsuarios [] = new Usuario[100];
		Producto listaProductos [] = new Producto[100];

		listaUsuarios[0] = new Usuario("108800", "Oscar Loaiza", "Calle 20", "CLIENTE");
		listaUsuarios[1] = new Usuario("108801", "Daniel Garcia", "Calle 19", "CLIENTE");
		listaUsuarios[2] = new Usuario("108802", "Juan Lopez", "Calle 18", "CLIENTE");
		listaUsuarios[3] = new Usuario("108803", "Catalina Mendez", "Calle 17", "CLIENTE");
		listaUsuarios[4] = new Usuario("108804", "Andres Lopez", "Calle 16", "CLIENTE");
		listaUsuarios[5] = new Usuario("109900", "Juan Castillo", "Calle 20", "VENDEDOR");
		listaUsuarios[6] = new Usuario("109901", "Ana Segura", "Calle 19", "VENDEDOR");
		listaUsuarios[7] = new Usuario("109902", "Julian Perez", "Calle 18", "VENDEDOR");
		listaUsuarios[8] = new Usuario("109903", "Carolina Tobon", "Calle 17", "VENDEDOR");
		listaUsuarios[9] = new Usuario("109904", "Carlos Perez", "Calle 16", "VENDEDOR");

		listaProductos[0] = new Producto("1010", "Leche", 3800);
		listaProductos[1] = new Producto("1011", "Carne 1Kg", 25600);
		listaProductos[2] = new Producto("1012", "Carne 1Lb", 12800);
		listaProductos[3] = new Producto("1013", "Jabon Barra", 2500);
		listaProductos[4] = new Producto("1014", "Detergente 1Kg", 15000);

		Facturador ventana = new Facturador(listaUsuarios, listaProductos);	
	}
}