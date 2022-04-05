/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_herencia_intrefaces;

/**
 *
 * @author egdel
 */
public class EVA2_8_Herencia_Intrefaces {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.merodoA();
        prueba.merodoB();
    }
    
}
class Prueba implements B{
    @Override
    public void merodoA() {
        
    }
    @Override
    public void merodoB() {
        
    }
    
}

interface A{
    public void merodoA();
}
interface B extends A{
    public void merodoB();
}