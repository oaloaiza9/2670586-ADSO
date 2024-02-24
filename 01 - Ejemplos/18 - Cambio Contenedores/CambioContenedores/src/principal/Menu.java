package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import utils.BaseDatos;

public class Menu extends javax.swing.JFrame {
    
    BaseDatos basedatos;
    
    public Menu() {
        basedatos = new BaseDatos();
        initComponents();
        
        btnListarActionPerformed(null);
        initAlternComponents();
    }

    public void initAlternComponents(){
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png"));
        icono_registro = icono_registro.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etqImagen.setIcon(new ImageIcon(icono_registro));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_usuario.png")));
        
        
        btnListar.setBackground(Color.WHITE);
        Image icono_listar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/buscar_usuario.png"));
        icono_listar = icono_listar.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        btnListar.setIcon(new ImageIcon(icono_listar));
        btnListar.setForeground(new Color(0, 0, 200));
        
        btnCrear.setBackground(Color.WHITE);
        Image icono_crear = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/crear_usuario.png"));
        icono_crear = icono_crear.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnCrear.setIcon(new ImageIcon(icono_crear));
        btnCrear.setForeground(new Color(0, 200, 0));
        
        btnEditar.setBackground(Color.WHITE);
        Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/editar_usuario.png"));
        icono_editar = icono_editar.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        btnEditar.setIcon(new ImageIcon(icono_editar));
        btnEditar.setForeground(new Color(250, 195, 30));
        
        btnEliminar.setBackground(Color.WHITE);
        Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/eliminar_usuario.png"));
        icono_eliminar = icono_eliminar.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnEliminar.setIcon(new ImageIcon(icono_eliminar));
        btnEliminar.setForeground(new Color(200, 0, 0));
        
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqImagen = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        contentPrincipal = new javax.swing.JPanel();
        etqTemporal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(153, 204, 255));

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListar.setText("  LISTAR");
        btnListar.setFocusable(false);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrear.setText("   CREAR");
        btnCrear.setFocusable(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setText("  EDITAR");
        btnEditar.setFocusable(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("   ELIMINAR");
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        contentPrincipal.setBackground(new java.awt.Color(153, 204, 255));

        etqTemporal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqTemporal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTemporal.setText("PANEL PRINCIPAL");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTemporal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTemporal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // Crear el contenedor nuevo
        PanelListar nuevo = new PanelListar(basedatos);
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // Crear el contenedor nuevo
        PanelCrear nuevo = new PanelCrear(basedatos);
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Crear el contenedor nuevo
        PanelEditar nuevo = new PanelEditar(basedatos);
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Crear el contenedor nuevo
        PanelEliminar nuevo = new PanelEliminar(basedatos);
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqTemporal;
    // End of variables declaration//GEN-END:variables
}
