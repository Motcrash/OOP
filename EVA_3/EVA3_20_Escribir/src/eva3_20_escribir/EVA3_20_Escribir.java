package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_20_Escribir {

    public static void main(String[] args) {
        Path ruta = Paths.get("src/eva3_20_escribir/Archivos/archivo.txt");
        OutputStream abrirArchivo;
        OutputStreamWriter escribirArchivo;
        BufferedWriter escribirTexto;
        
        try {
            abrirArchivo = Files.newOutputStream(ruta);
            escribirArchivo = new OutputStreamWriter(abrirArchivo);
            escribirTexto = new BufferedWriter(escribirArchivo);
            escribirTexto.write("Hola mundo");
            escribirTexto.newLine();
            escribirTexto.write("XXXXXXXXXXXXXXX");
            escribirTexto.newLine();
            escribirTexto.write("Hola mundo");
            escribirTexto.flush(); //Hace permanentes los cambios
            escribirTexto.close(); //Se cierra el stream
        } catch (IOException ex) {
            Logger.getLogger(EVA3_20_Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
