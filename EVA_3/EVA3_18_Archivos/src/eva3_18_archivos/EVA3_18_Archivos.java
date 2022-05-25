package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_18_Archivos {

    public static void main(String[] args) {
        
        try{
        FileInputStream archiv = new FileInputStream("src/eva3_18_archivos/Archivos/archivo.txt");    
        int caracter = archiv.read();
        
        while(caracter != -1){
            System.out.print((char)caracter);
            caracter = archiv.read();
        }
        
            System.out.println("");
        
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(EVA3_18_Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
