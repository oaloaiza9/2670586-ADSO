package Principal;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

public class CargarImagenUrl extends javax.swing.JFrame {

    public CargarImagenUrl() {
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent(){
        setTitle("Cargando Imagen de URL");
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        etqPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CARGAR IMAGEN URL");

        btnLoadImage.setBackground(new java.awt.Color(0, 51, 255));
        btnLoadImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLoadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadImage.setText("Buscar Imagen");
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
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        try {
            String urlStr = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png";
            URL url = new URL(urlStr);
            Image imagen = Toolkit.getDefaultToolkit().createImage(url);

            if (imagen != null) {
                imagenLabel.setIcon(new ImageIcon(imagen));
            } else {
                System.out.println("No se pudo cargar la imagen desde la URL proporcionada.");
            }
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JLabel etqPreview;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelPreview;
    // End of variables declaration//GEN-END:variables
}
