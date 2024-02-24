package principal;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;

public class PanelListar extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    BaseDatos basedatos;
    
    public PanelListar(BaseDatos basedatos) {
        this.basedatos = basedatos;
        
        initComponents();
        initAlternComponent();
        imprimirPersonas();
    }
    
    public void initAlternComponent(){
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(300);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(200);
    }

    public void imprimirPersonas(){
        Persona lista [] = basedatos.extraerPersonas();
        modelo.setRowCount(0);
        for (int i=0; i<lista.length && lista[i]!=null; i++) {
            String documento = lista[i].getDocumento();
            String nombres = lista[i].getNombres()+" "+lista[i].getApellidos();
            String telefono = lista[i].getTelefono();
            String correo = lista[i].getCorreo();
            
            Object datos[] = new Object[]{ (i+1), documento, nombres, telefono, correo};
            modelo.addRow(datos);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTA DE PERSONAS");

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cedula", "Nombres", "Telefono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
