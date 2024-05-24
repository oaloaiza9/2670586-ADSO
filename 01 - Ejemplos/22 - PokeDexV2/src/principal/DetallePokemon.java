package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utils.ConsumoAPI;

public class DetallePokemon extends javax.swing.JPanel {

    JsonObject pokemon;
    String listaImagenes[];
    int posActual;
    
    public DetallePokemon(JsonObject data) {
        ConsumoAPI consumo = new ConsumoAPI();
        String respuesta = consumo.consumoGET( data.get("url").getAsString() );
        this.pokemon = JsonParser.parseString(respuesta).getAsJsonObject();
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        etqAtras.setText("");
        etqSiguiente.setText("");
        
        Image iconoAtras = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        iconoAtras = iconoAtras.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etqAtras.setIcon(new ImageIcon(iconoAtras));
        
        Image iconoSiguiente = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        iconoSiguiente = iconoSiguiente.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etqSiguiente.setIcon(new ImageIcon(iconoSiguiente));
        
        etqNombre.setText( this.pokemon.get("name").getAsString() );
        
        DefaultTableModel modelo = (DefaultTableModel) tablaHabilidades.getModel();
        JsonArray habilidades = this.pokemon.getAsJsonArray("abilities");
        for (int i=0; i<habilidades.size(); i++) {
            JsonObject temp = habilidades.get(i).getAsJsonObject().getAsJsonObject("ability");
            Object[] fila = new Object[]{ i, temp.get("name").getAsString(), temp.get("url").getAsString()};
            modelo.addRow(fila);
        }
        
        this.listaImagenes = new String[3];
        this.listaImagenes[0] = this.pokemon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("official-artwork").get("front_default").getAsString();
        this.listaImagenes[1] = this.pokemon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("official-artwork").get("front_shiny").getAsString();
        this.listaImagenes[2] = this.pokemon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
        this.posActual = 0;
        cargarImagenPokemon();
        
        
        revalidate();
        repaint();
    }
    
    public void cargarImagenPokemon(){
        try {
            String url = this.listaImagenes[posActual];
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            etqImagen.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(DetallePokemon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (posActual==0) {
            etqAtras.setEnabled(false);
        }
        
        if (posActual==2) {
            etqSiguiente.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqNombre = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        etqAtras = new javax.swing.JLabel();
        etqSiguiente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        etqNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("-------");

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqImagen.setText("jLabel1");

        etqAtras.setText("jLabel2");
        etqAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqAtrasMouseClicked(evt);
            }
        });

        etqSiguiente.setText("jLabel2");
        etqSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqSiguienteMouseClicked(evt);
            }
        });

        tablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Habilidad", "Url"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaHabilidades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(etqAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etqAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqAtrasMouseClicked
        if (this.posActual>0) {
            this.posActual--;
            cargarImagenPokemon();
            etqSiguiente.setEnabled(true);
        }
    }//GEN-LAST:event_etqAtrasMouseClicked

    private void etqSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqSiguienteMouseClicked
        if (this.posActual<2) {
            this.posActual++;
            cargarImagenPokemon();
            etqAtras.setEnabled(true);
        }
    }//GEN-LAST:event_etqSiguienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqAtras;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables
}
