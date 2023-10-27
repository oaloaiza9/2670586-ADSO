import javax.swing.*;
import java.awt.*;

public class Principal{
	public static void main(String[] args) {
		
		
		JFrame ventana_01 = new JFrame();
		ventana_01.setTitle("Primer Ventana");
		ventana_01.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		ventana_01.setSize( 300, 300 );
		ventana_01.setResizable( true );
		ventana_01.setLocation( 500, 100 );
		ventana_01.setLocationRelativeTo(null);
		ventana_01.setVisible(true);

		JPanel contenedor = new JPanel();
		contenedor.setBackground( Color.WHITE );
		contenedor.setVisible(true);

		JLabel etiqueta_titulo = new JLabel();
		etiqueta_titulo.setText("TITULO");
		etiqueta_titulo.setForeground( Color.WHITE );
		etiqueta_titulo.setOpaque( true );
		etiqueta_titulo.setBackground( Color.BLACK );
		etiqueta_titulo.setFont( new Font("Snap ITC", Font.BOLD, 50) );

		JLabel etiqueta_cedula = new JLabel();
		etiqueta_cedula.setText("Cedula:");
		etiqueta_cedula.setFont( new Font("Arial", Font.PLAIN, 20) );

		JTextField campo_cedula = new JTextField();
		campo_cedula.setColumns(11);

		JLabel etiqueta_nombres = new JLabel();
		etiqueta_nombres.setText("Nombres:");
		etiqueta_nombres.setFont( new Font("Arial", Font.PLAIN, 20) );
		
		JTextField campo_nombres = new JTextField();
		campo_nombres.setColumns(11);

		JLabel etiqueta_apellidos = new JLabel();
		etiqueta_apellidos.setText("Apellidos:");
		etiqueta_apellidos.setFont( new Font("Arial", Font.PLAIN, 20) );
		
		JTextField campo_apellidos = new JTextField();
		campo_apellidos.setColumns(11);

		JButton btn_enviar = new JButton();
		btn_enviar.setText("ENVIAR");

		contenedor.add( etiqueta_titulo );
		contenedor.add( etiqueta_cedula );
		contenedor.add( campo_cedula );
		contenedor.add( etiqueta_nombres );
		contenedor.add( campo_nombres );
		contenedor.add( etiqueta_apellidos );
		contenedor.add( campo_apellidos );
		contenedor.add( btn_enviar );

		ventana_01.add( contenedor );
		ventana_01.revalidate();

		//ventana_01.repaint();
		//ventana_01.pack();

	}
}