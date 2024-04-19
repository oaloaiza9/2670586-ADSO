
package principal;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ejemplo02 {
    public static void main(String[] args) {
        
        Document documento = new Document() {};
        try {
            String directorioActual = System.getProperty("user.dir");
            String rutaArchivoPDF = directorioActual + "\\PDF-EJEMPLO-02.pdf";
            
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivoPDF));
            documento.open();
            
            documento.add(new Paragraph("¡Hola, mundo! Este es un ejemplo de documento PDF generado con iText."));
            documento.add(new Phrase("Renglon con Letra tipo 'TIMES_ROMAN' tamaño 20. ", FontFactory.getFont(FontFactory.TIMES_ROMAN, 20)));
            
            documento.close();
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println("Error al crear el PDF");
            System.out.println(e);
        }
        
    }    
}
