/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author egdel
 */
public class EVA2_13_Arreglos_3_obj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona[] arregloPer = new Persona[32];
        int[] arregloEdad = new int[32];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {
            arregloPer[i] = new Persona();
            System.out.println("Ingrese su nombre");
            arregloPer[i].setNombre(input.nextLine());
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: "+arregloPer[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}