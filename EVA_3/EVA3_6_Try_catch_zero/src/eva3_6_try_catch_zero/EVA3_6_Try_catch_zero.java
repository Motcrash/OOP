package eva3_6_try_catch_zero;

import java.util.Scanner;

public class EVA3_6_Try_catch_zero {

    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        System.out.println("Introduzca el numerador");
        double numerador = mot.nextDouble();
        System.out.println("Introduzca el denominador");
        double denominador = mot.nextDouble();
        try{
            System.out.println("La división es: " + numerador/denominador);
        }catch(ArithmeticException x){
            System.out.println("Se produjo una división entre cero /n Fin del programa");
        }
        
    }
    
}
