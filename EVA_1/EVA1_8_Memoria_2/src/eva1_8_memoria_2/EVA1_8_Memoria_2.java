/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_memoria_2;

/**
 *
 * @author gerac
 */
public class EVA1_8_Memoria_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia el Main");
        A();
        System.out.println("Termina Main");
    }
    public static void A(){
        System.out.println("Inicia A()");
        B();
        System.out.println("Termina A()");
    }
    public static void B(){
        System.out.println("Inicia B()");
        System.out.println("Termina B()");
    }
    
}
