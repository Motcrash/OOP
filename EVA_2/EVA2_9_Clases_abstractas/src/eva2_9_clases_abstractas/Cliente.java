/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author egdel
 */
public class Cliente extends Persona{
    private String rfc;

    public Cliente() {
        
    }

    public Cliente(String rfc, String nombre, int edad) {
        super(nombre, edad);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("RFC: "+rfc);
    }
    
}
