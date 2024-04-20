package principal;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Principal {
    public static void main(String[] args) {
        
        
        // Configuracion de cuenta GMAIL
        String emailFrom = "orbital9649@gmail.com";
        String passwordFrom = "vsqe npfk brgc kjsw";
        String emailTo = "XXXXXXXXXXXXXXXX";        
        String subject = "Envío desde JAVA";
        String content = "<h1>Hola Mundo.</h1><p>Enviado desde Aplicación JAVA.</p>";

        Properties mProperties = new Properties();
        Session mSession = null;
        MimeMessage mCorreo = null;
        
        // Configurar datos de Cuenta
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        // Crear el correo
        mSession = Session.getDefaultInstance(mProperties);
        try {   
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // Enviar el correo
        try {
            Transport transport = mSession.getTransport("smtp");
            transport.connect(emailFrom, passwordFrom);
            transport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            transport.close();
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
}
