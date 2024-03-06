package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class BaseDatos {
    
    Connection conexion;
    Statement manipularDB;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_imagen_java";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }
    
    public Persona buscarPersona(String cedula){
        Persona encontrado = null;
        
        try {
            String consulta = "SELECT * FROM personas WHERE cedula = '"+cedula+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String documento = registros.getString("cedula");
                String nombres = registros.getString("nombres");
                String apellidos = registros.getString("apellidos");
                String telefono = registros.getString("telefono");
                String correo = registros.getString("email");
                Image foto = null;
                
                // Codigo para Cargar la Foto BLOB en un Objeto IMAGE
                InputStream inputStream = registros.getBinaryStream("foto");
                if (inputStream!=null) {
                    byte[] bytes = new byte[inputStream.available()];
                    inputStream.read(bytes);
                    foto = new ImageIcon(bytes, documento).getImage();
                }
                
                // Creando la Personona para Retornarla
                encontrado = new Persona(documento, nombres, apellidos, telefono, correo, foto);
            }
        }catch (IOException ex) {
            System.out.println("Se presento un error al extraer la foto: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        
        return encontrado;
    }
    
    public boolean uploadPhoto(String cedula, ImageIcon imageIcon) {
        boolean respuesta = false;

        try {
            // Get the underlying image from the ImageIcon
            Image image = imageIcon.getImage();

            // Create a BufferedImage with the same dimensions and type as the original image
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

            // Use graphics context to draw the original image onto the BufferedImage
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, 0, 0, null);
            g2.dispose();

            // Convert the BufferedImage to byte[] 
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();

            // Rest of your code remains the same
            Blob imageBlob = conexion.createBlob();
            imageBlob.setBytes(1, imageBytes);

            String consulta = "UPDATE personas SET foto = ? WHERE cedula = ?";
            PreparedStatement prepared = conexion.prepareStatement(consulta);
            prepared.setBlob(1, imageBlob);
            prepared.setString(2, cedula);
            respuesta = prepared.execute();

        } catch (IOException ex) {
            System.out.println("Error en IO en Foto: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE Foto: " + ex.getMessage());
        }

        return respuesta;
    }
    
}
