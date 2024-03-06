package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;
import utils.Persona;

public class ExtraerImagenBD extends javax.swing.JFrame {

    BaseDatos basedatos;
    
    public ExtraerImagenBD() {
        basedatos = new BaseDatos();
        
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent(){
        setTitle("Extraer Imagen BD");
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        btnLoadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        etqPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("EXTRAER IMAGEN BASE DATOS");

        etqCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCedula.setText("CEDULA:");

        btnLoadImage.setBackground(new java.awt.Color(0, 51, 255));
        btnLoadImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLoadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadImage.setText("Buscar Foto");
        btnLoadImage.setFocusable(false);
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(etqCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCedula)
                    .addComponent(etqCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        panelPreview.setBackground(new java.awt.Color(255, 255, 255));

        etqPreview.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqPreview.setText("Vista Previa");

        imagenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(imagenLabel);

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addComponent(etqPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        String cedula = campoCedula.getText();
        Persona persona = basedatos.buscarPersona(cedula);
        
        if (persona!=null && persona.getFoto()!=null) {
            Image foto = persona.getFoto();
            foto = foto.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            
            imagenLabel.setIcon(new ImageIcon(foto));
        }else{
            imagenLabel.setIcon(null);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqPreview;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelPreview;
    // End of variables declaration//GEN-END:variables
}
