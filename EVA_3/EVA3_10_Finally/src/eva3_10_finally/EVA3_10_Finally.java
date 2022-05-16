package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_10_Finally {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Ingrese un número entero");
            int valor = input.nextInt();
            System.out.println("El número ingresado es: "+valor);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{
            System.out.println("Esta line siempre se va a ejecutar");
        }
        System.out.println("Fin del programa");
    }
    
}
