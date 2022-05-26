package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EVA3_19_Buffers {

    public static void main(String[] args) {
        // Se define la ruta 
        Path ruta = Paths.get("src/eva3_19_buffers/Archivos/archivo.txt", args);
        // Se abre el archivo
        InputStream abrirArchivo;
        // Leemos el archivo
        InputStreamReader leerArchivo;
        // Convertimos los bytes a Caracteres
        BufferedReader convertirTexto; 
        
        try{
        abrirArchivo = Files.newInputStream(ruta);
        leerArchivo = new InputStreamReader(abrirArchivo);
        convertirTexto = new BufferedReader(leerArchivo);
        String linea = convertirTexto.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = convertirTexto.readLine();
        }
        
        } catch(IOException ex){
            Logger.getLogger(EVA3_19_Buffers.class.getName());
        }
    }
    
}
