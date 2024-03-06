package principal;

import java.awt.Color;
import java.awt.Image;
import utils.BaseDatos;
import utils.Persona;

public class PanelEliminar extends javax.swing.JPanel {
    
    BaseDatos basedatos;
    
    public PanelEliminar(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent(){
        campoNombres.setDisabledTextColor(Color.BLACK);
        campoApellidos.setDisabledTextColor(Color.BLACK);
        campoTelefono.setDisabledTextColor(Color.BLACK);
        campoCorreo.setDisabledTextColor(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorFormulario = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        etqTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        contenedorFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqDocumento.setText("Documento:");

        campoDocumento.setMargin(new java.awt.Insets(2, 10, 2, 10));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 204));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqNombres.setText("Nombres:");

        campoNombres.setText("---------- ---------- ---------- ---------- ---------- ----------");
        campoNombres.setToolTipText("");
        campoNombres.setBorder(null);
        campoNombres.setEnabled(false);
        campoNombres.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqApellidos.setText("Apellidos:");

        campoApellidos.setText("---------- ---------- ---------- ---------- ---------- ----------");
        campoApellidos.setBorder(null);
        campoApellidos.setEnabled(false);
        campoApellidos.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqTelefono.setText("Telefono:");

        campoTelefono.setText("---------- ---------- ---------- ---------- ---------- ----------");
        campoTelefono.setBorder(null);
        campoTelefono.setEnabled(false);
        campoTelefono.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqCorreo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqCorreo.setText("Correo Elec.:");

        campoCorreo.setText("---------- ---------- ---------- ---------- ---------- ----------");
        campoCorreo.setBorder(null);
        campoCorreo.setEnabled(false);
        campoCorreo.setMargin(new java.awt.Insets(2, 10, 2, 10));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("PANEL ELIMINAR");

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(etqDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(etqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(campoApellidos)
                                                .addComponent(campoTelefono)
                                                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String documento = campoDocumento.getText();

        if( documento.equals("")){
            Alerta ventana = new Alerta("Se debe indicar un numero de Documento.");
        }else{
            Persona temporal = basedatos.buscarPersona(documento);
            if (temporal!=null) {
                campoNombres.setText(temporal.getNombres());
                campoApellidos.setText(temporal.getApellidos());
                campoTelefono.setText(temporal.getTelefono());
                campoCorreo.setText(temporal.getCorreo());

                btnEliminar.setEnabled(true);
            }else{
                Alerta ventana = new Alerta("La persona no existe.");
                campoNombres.setText("-----------------------------------");
                campoApellidos.setText("-----------------------------------");
                campoTelefono.setText("-----------------------------------");
                campoCorreo.setText("-----------------------------------");
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String documento = campoDocumento.getText();

        boolean proceso = basedatos.eliminarPersona(documento);
        if (proceso) {
            System.out.println("Persona Eliminada.");
        }else{
            Alerta ventana = new Alerta("Error al eliminar a la persona.");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
