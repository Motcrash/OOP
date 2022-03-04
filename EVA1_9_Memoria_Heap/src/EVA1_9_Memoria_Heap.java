/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerac
 */
public class EVA1_9_Memoria_Heap {

   
    public static void main(String[] args) {
        int i =5;
        Prueba obj1 = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(obj1.valor);
        System.out.println(obj1);
        System.out.println(obj2.valor);
        System.out.println(obj2);
        obj2 = null; //Eliminar el objeto
        System.out.println(obj2.valor);
    }
   
}
class Prueba{
    int valor = 100;
}
