package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_9_Clase_Exception {

    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        try{
            System.out.print("Introduzca el numerador: ");
            int numerador = mot.nextInt();
            System.out.print("Introduzca el denominador: ");
            int denominador = mot.nextInt();
            System.out.println("La división es: " + numerador/denominador);
        }catch(Exception x){
            System.out.println("El valor capturado no es un número entero");
        }
    }
    
}
