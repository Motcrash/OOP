/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerac
 */
public class EVA1_10_Copia_Objetos {

    public static void main(String[] args) {
        Prueba obj1 = new Prueba();
        System.out.println("Dirección: "+obj1);
        obj1.x=100;
        System.out.println("Valor de x =  "+obj1.x);
        Prueba respaldo = new Prueba();
        respaldo.x = obj1.x;
        System.out.println("Valor de x en el respaldo: " + respaldo.x);
        respaldo.x = 0;
        System.out.println("Valor de x en el obj1: " + obj1.x);
        System.out.println("Valor de x en el respaldo: " + respaldo.x);
        System.out.println("obj1: " +  obj1);
        System.out.println("respaldo: " + respaldo);
    }
    
}
class Prueba{
    public int x;
    
}