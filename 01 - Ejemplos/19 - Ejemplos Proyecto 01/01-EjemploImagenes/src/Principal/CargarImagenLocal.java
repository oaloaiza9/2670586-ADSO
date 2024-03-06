package Principal;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CargarImagenLocal extends javax.swing.JFrame {
    
    ImageIcon imagenTemporal;
    
    public CargarImagenLocal() {
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent(){
        setTitle("Cargando Imagen Local");
        setLocationRelativeTo(null);
        setVisible(true);
        imagenTemporal = null;
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
        btnUploadImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CARGAR IMAGEN");

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
                .addContainerGap(142, Short.MAX_VALUE))
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

        btnUploadImage.setBackground(new java.awt.Color(204, 204, 204));
        btnUploadImage.setText("Guardar");
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPreviewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUploadImage)))
                .addContainerGap())
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addComponent(etqPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUploadImage)
                .addContainerGap(12, Short.MAX_VALUE))
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
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);
        
        int seleccion = fileChooser.showOpenDialog(panelPreview);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);

            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
        try {
            BufferedImage image = createBufferedImage(imagenTemporal);
            if (image != null) {
                String outputFilePath = "src/imagenes/imagen_cargada.png";
                ImageIO.write(image, "png", new File(outputFilePath));
                
                System.out.println("La imagen se ha cargado correctamente y se ha guardado en " + outputFilePath);
            } else {
                System.out.println("No se pudo cargar la imagen.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUploadImageActionPerformed

    private BufferedImage createBufferedImage(ImageIcon temporal){
        Image imagen = temporal.getImage();
        
        BufferedImage bufferedImage = new BufferedImage(
            imagen.getWidth(null),
            imagen.getHeight(null),
            BufferedImage.TYPE_INT_ARGB
        );

        Graphics2D bGr = bufferedImage.createGraphics();
        bGr.drawImage(imagen, 0, 0, null);
        bGr.dispose();
        
        return bufferedImage;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JLabel etqPreview;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelPreview;
    // End of variables declaration//GEN-END:variables
}
