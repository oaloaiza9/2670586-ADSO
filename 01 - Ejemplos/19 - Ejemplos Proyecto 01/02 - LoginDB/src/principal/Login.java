package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Persona;

public class Login extends javax.swing.JFrame {
    
    BaseDatos basedatos;
    
    public Login() {
        basedatos = new BaseDatos();
        
        initComponents();
        initAleterComponent();
    }
    
    public void initAleterComponent(){
        setTitle("Iniciar Sesion");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png"));
        icono_registro = icono_registro.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etqImagen.setIcon(new ImageIcon(icono_registro));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        contentFormulario = new javax.swing.JPanel();
        etqEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        etqPassword = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("INGRESAR");

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        contentFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqEmail.setText("E-mail:");

        campoEmail.setMargin(new java.awt.Insets(2, 8, 2, 8));

        etqPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etqPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqPassword.setText("Password:");

        campoPassword.setMargin(new java.awt.Insets(2, 8, 2, 8));

        btnIniciar.setBackground(new java.awt.Color(0, 102, 102));
        btnIniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.setFocusable(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentFormularioLayout = new javax.swing.GroupLayout(contentFormulario);
        contentFormulario.setLayout(contentFormularioLayout);
        contentFormularioLayout.setHorizontalGroup(
            contentFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoEmail)
                    .addComponent(etqPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPassword)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentFormularioLayout.setVerticalGroup(
            contentFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        String email = campoEmail.getText();
        String password = campoPassword.getText();
        
        if (email.equals("") || password.equals("")) {
            System.out.println("Error en Datos - No pueden ser vacios.");
        }else{
            Persona encontrada = basedatos.validarIngreso(email, password);
            
            if (encontrada!=null) {
                System.out.println( "Ingresa al inicio. => " + encontrada.getNombres() );
            }else{
                System.out.println( "Persona no encontrada." );
            }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoPassword;
    private javax.swing.JPanel contentFormulario;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqPassword;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
