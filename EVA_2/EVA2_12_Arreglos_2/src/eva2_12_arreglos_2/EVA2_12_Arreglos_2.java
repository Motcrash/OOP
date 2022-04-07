/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author egdel
 */
public class EVA2_12_Arreglos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloEdad = new int[32];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {
            System.out.println("Ingrese su edad");
            arregloEdad[i] = input.nextInt();
        }
        for (int i = 0; i < 32; i++) {
            System.out.println(arregloEdad[i]);
        }
    }
    
}
