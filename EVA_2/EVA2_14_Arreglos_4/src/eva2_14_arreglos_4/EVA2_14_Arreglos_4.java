/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author egdel
 */
public class EVA2_14_Arreglos_4 {

    public static final int TAMA = 100;
    
    public static void main(String[] args) {
        int[] arregloEdad = new int[TAMA];//bytes ocupa un entero --> 4 bytes
        System.out.println("Tamaño del arreglo: "+arregloEdad.length);
        Scanner input = new Scanner(System.in);
        //32 capturas --> for
        //CAPTURA DE DATOS
        for (int i = 0; i < arregloEdad.length; i++) {//i --> index --> índice
        System.out.println("Cuál es tu edad? ");
        arregloEdad[i] = input.nextInt();
        }
        //MOSTRAR LOS DATOS
        for (int i = 0; i < arregloEdad.length; i++) {
        System.out.print("[" + arregloEdad[i] + "]");
        }
    }
    
}
