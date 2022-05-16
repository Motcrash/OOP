package eva3_8_multiples_excepciones;

import java.util.Scanner;

public class EVA3_8_Multiples_excepciones {

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
