package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class BaseDatos {
    
    Connection conexion;
    Statement manipularDB;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_clientes_ci4";
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
    
    public Persona validarIngreso(String email, String password){
        try {
            Persona encontrado = null;
            
            String consulta = "SELECT personas.* FROM usuarios INNER JOIN personas ON usuarios.cedula = personas.cedula WHERE usuarios.email = '"+email+"' AND usuarios.password ='"+getMD5(password)+"' AND estado = 'ACTIVO' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String documento = registros.getString("cedula");
                String nombres = registros.getString("nombres");
                String apellidos = registros.getString("apellidos");
                String telefono = registros.getString("telefono");
                String direccion = registros.getString("direccion");
                String correo = registros.getString("email");
                String foto = registros.getString("foto");
                
                encontrado = new Persona(documento, nombres, apellidos, telefono, direccion, correo, foto);
                return encontrado;
            }else{
                return encontrado;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public String getMD5(String input) {
        try {
          // Obtener una instancia del algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

          // Convertir el String a bytes
          byte[] messageDigest = md.digest(input.getBytes());

          // Convertir los bytes a un String hexadecimal
            BigInteger number = new BigInteger(1, messageDigest);
          String hashtext = number.toString(16);

          // Añadir ceros a la izquierda si es necesario
          while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
          }

          // Devolver el hash MD5
          return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
}
