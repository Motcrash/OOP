package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_21_Serializable {

    public static void main(String[] args) {
        Persona perso = new Persona("Gerardo","Delgado");
        escribirObjt(perso);
        leerObjt();
    }
    
    public static void escribirObjt(Object obj){
        try {
            FileOutputStream abrirArchivo = new FileOutputStream("src/eva3_21_serializable/Archivos/archivo.txt");
            ObjectOutputStream guardarObjetos = new ObjectOutputStream(abrirArchivo);
            guardarObjetos.writeObject(obj);
            guardarObjetos.flush();
            guardarObjetos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void leerObjt(){
         try {
            FileInputStream abrirArchivo = new FileInputStream("src/eva3_21_serializable/Archivos/archivo.txt");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArchivo);
            Persona persona = (Persona)leerObjeto.readObject(); //Regresa objeto de la clase Object
            System.out.println("Nombre: "+persona.getNombre()+" "+persona.getApellido());
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Persona implements Serializable{
    private String nombre, apellido;

    public Persona(){

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}