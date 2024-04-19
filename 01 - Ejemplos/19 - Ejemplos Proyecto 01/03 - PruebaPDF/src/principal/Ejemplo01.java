package principal;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo01 {

  public static void main(String[] args) {
      
    Document documento = new Document();
    try {
      String directorioActual = System.getProperty("user.dir");             // Obtener ruta del proyecto
      String rutaArchivoPDF = directorioActual + "\\PDF-EJEMPLO-01.pdf";    // Crear ruta completa con nombre de archivo

      PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivoPDF));
      documento.open();

      PdfPTable tabla = new PdfPTable(3);        // Definir cantidad de columnas
      tabla.setWidths(new int[] { 25, 50, 25 }); // Asignar el ancho de cada columna en la tabla

      // Crear el contenido de una celda con estilos personalizados
      Font fontHeader = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, BaseColor.BLUE);
      PdfPCell cellHeader = new PdfPCell(new Phrase("Encabezado Azul", fontHeader));
      cellHeader.setHorizontalAlignment( PdfPCell.ALIGN_CENTER );
      cellHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
      
      // Asignar contendido a una celda, se agrega en orden como una matriz.
      tabla.addCell(cellHeader);
      tabla.addCell(cellHeader);
      tabla.addCell(cellHeader);

      // Agregar datos al cuerpo de la tabla, los datos son celdas.
      for (int i = 1; i <= 10; i++) {
        tabla.addCell("Valor 1 - Fila ");   // dato en Forma simple
        tabla.addCell(new Phrase("Valor 2 - Fila " + i, FontFactory.getFont(FontFactory.HELVETICA, 10))); // dato con estilo
        tabla.addCell(new Phrase("Valor 3 - Fila " + i, FontFactory.getFont(FontFactory.HELVETICA, 10))); // dato con estilo
      }

      documento.add(tabla);
      documento.close();

    } catch (DocumentException | IOException e) {
      System.out.println("Error al crear el PDF");
      System.out.println(e);
    }
    
    
  }
}