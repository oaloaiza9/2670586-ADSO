import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Facturador extends JFrame{

	// Atributos
	private JPanel contenedorItems;
    private JLabel listaJLabels [];
    private int indiceItems;
    private int totalFactura;
	private JLabel etq_datos_cliente;
	private JLabel etq_cedula_cliente;
	private JLabel etq_nombres_cliente;
	private JLabel etq_direccion_cliente;
	private JLabel etq_datos_vendedor;
	private JLabel etq_vendedor_cliente;
	private JLabel etq_nombres_vendedor;
	private JLabel etq_datos_productos;
	private JLabel etq_id_producto;
	private JLabel etq_nombre_producto;
	private JLabel etq_cant_producto;
	private JLabel etq_btn_producto;
	private JLabel etq_resultado;
	private JLabel etq_total;
	private JTextField input_cedula_cliente;
	private JTextField input_nombres_cliente;
	private JTextField input_direccion_cliente;
	private JTextField input_cedula_vendedor;
	private JTextField input_nombres_vendedor;
	private JTextField input_id_producto;
	private JTextField input_nombre_producto;
	private JTextField input_cant_producto;
	private JButton btn_buscar_cliente;
	private JButton btn_buscar_vendedor;
	private JButton btn_add_producto;

	// Metodos
	public Facturador(){
		this.listaJLabels = new JLabel [50];
        this.indiceItems = 0;
        this.totalFactura = 0;

		initComponent();
	}

	public void initComponent(){

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

		setTitle("FACTURA");
		setSize( 546, 691);
		//setSize( ((int) (tamanio.width*0.4)) , ((int) (tamanio.height*0.9)) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		
		setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ) );

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
		GridBagConstraints restriccion = new GridBagConstraints();

		etq_datos_cliente = new JLabel("DATOS CLIENTE:");
		etq_datos_cliente.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_cliente.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_cliente, restriccion );

		etq_cedula_cliente = new JLabel("CEDULA:");
		restriccion.gridy = 1;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cedula_cliente, restriccion );

		input_cedula_cliente = new JTextField();
		input_cedula_cliente.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 1;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 2;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula_cliente, restriccion );

		btn_buscar_cliente = new JButton("BUSCAR");
		btn_buscar_cliente.setFocusable(false);
		restriccion.gridy = 1;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar_cliente, restriccion );

		etq_nombres_cliente = new JLabel("NOMBRES:");
		restriccion.gridy = 2;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(10, 0, 10, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombres_cliente, restriccion );

		input_nombres_cliente = new JTextField();
		input_nombres_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 2;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 2;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombres_cliente, restriccion );

		etq_direccion_cliente = new JLabel("DIRECCION:");
		restriccion.gridy = 3;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 10, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_direccion_cliente, restriccion );

		input_direccion_cliente = new JTextField();
		input_direccion_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 3;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 2;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(0, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_direccion_cliente, restriccion );

		
		/*
			- Seccion vendedor
		*/
		etq_datos_vendedor = new JLabel("DATOS VENDEDOR:");
		etq_datos_vendedor.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 4;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.insets = new Insets(10, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_vendedor, restriccion );

		etq_vendedor_cliente = new JLabel("CEDULA:");
		restriccion.gridy = 5;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_vendedor_cliente, restriccion );

		input_cedula_vendedor = new JTextField();
		input_cedula_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 5;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 2;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula_vendedor, restriccion );

		btn_buscar_vendedor = new JButton("BUSCAR");
		btn_buscar_vendedor.setFocusable(false);
		restriccion.gridy = 5;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar_vendedor, restriccion );

		etq_nombres_vendedor = new JLabel("NOMBRES:");
		restriccion.gridy = 6;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(10, 0, 10, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombres_vendedor, restriccion );

		input_nombres_vendedor = new JTextField();
		input_nombres_vendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 6;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 2;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombres_vendedor, restriccion );

		
		/*
			- Seccion Productos
		*/
		etq_datos_productos = new JLabel("LISTA PRODUCTOS FACTURADOS:");
		etq_datos_productos.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_productos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 7;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.insets = new Insets(10, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_productos, restriccion );

		etq_id_producto = new JLabel("ID");
		etq_id_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_id_producto, restriccion );

		etq_nombre_producto = new JLabel("NOMBRE");
		etq_nombre_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombre_producto, restriccion );

		etq_cant_producto = new JLabel("CANT.");
		etq_cant_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cant_producto, restriccion );

		etq_btn_producto = new JLabel();
		restriccion.gridy = 8;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_btn_producto, restriccion );


		input_id_producto = new JTextField();
		input_id_producto.setHorizontalAlignment(JLabel.CENTER);
		restriccion.gridy = 9;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_id_producto, restriccion );

		input_nombre_producto = new JTextField();
		input_nombre_producto.setHorizontalAlignment(JLabel.CENTER);
		restriccion.gridy = 9;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombre_producto, restriccion );

		input_cant_producto = new JTextField();
		input_cant_producto.setHorizontalAlignment(JLabel.CENTER);
		restriccion.gridy = 9;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cant_producto, restriccion );

		btn_add_producto = new JButton("ADD");
		btn_add_producto.setFocusable(false);
		restriccion.gridy = 9;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_add_producto, restriccion );

		contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restriccion.gridy = 10;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scrollPane, restriccion );
        
        GridBagConstraints constItems = new GridBagConstraints();
        
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.RIGHT );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        etq_total = new JLabel("Total: $ 0");
        etq_total.setHorizontalAlignment( JLabel.RIGHT );
        etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_total.setOpaque(true);
        etq_total.setBackground( Color.white );
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 11;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 0, 10);
        contPrincipal.add( etq_total, restriccion );

		add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();
	}

}