package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_22_Serializable_Arreglos {
    
    public static void main(String[] args) {
        ArrayList <Persona> listaPersonas = new ArrayList();
        listaPersonas.add(new Persona("Juan", "Perez"));
        listaPersonas.add(new Persona("Martin", "Perez"));
        listaPersonas.add(new Persona("Ana", "Perez"));
        listaPersonas.add(new Persona("Maria", "Perez"));
        listaPersonas.add(new Persona("Diego", "Perez"));
        listaPersonas.add(new Persona("Jorge", "Perez"));
        escribirObjt(listaPersonas);
        leerObjt();
    }
    
    public static void escribirObjt(Object obj){
        try {
            FileOutputStream abrirArchivo = new FileOutputStream("src/eva3_22_serializable_arreglos/Archivos/archivo.txt");
            ObjectOutputStream guardarObjetos = new ObjectOutputStream(abrirArchivo);
            guardarObjetos.writeObject(obj);
            guardarObjetos.flush();
            guardarObjetos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void leerObjt(){
         try {
            FileInputStream abrirArchivo = new FileInputStream("src/eva3_22_serializable_arreglos/Archivos/archivo.txt");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArchivo);
            ArrayList<Persona> listaPersonas = (ArrayList<Persona>)leerObjeto.readObject(); //Regresa objeto de la clase Object
            for (int i = 0; i < listaPersonas.size(); i++) {
                Persona persona = listaPersonas.get(i);
                System.out.println("Nombre: "+persona.getNombre()+" "+persona.getApellido());
            }
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
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
