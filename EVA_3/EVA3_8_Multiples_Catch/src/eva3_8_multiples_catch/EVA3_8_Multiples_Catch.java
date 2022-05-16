package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_8_Multiples_Catch {

    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        try{
            System.out.print("Introduzca el numerador: ");
            int numerador = mot.nextInt();
            System.out.print("Introduzca el denominador: ");
            int denominador = mot.nextInt();
            System.out.print("La división es: " + numerador/denominador);
        }catch(ArithmeticException x){
            System.out.println("Se produjo una división entre cero /n Fin del programa");
        }catch(InputMismatchException x){
            System.out.println("El valor capturado no es un número entero");
        }
    }
    
}
