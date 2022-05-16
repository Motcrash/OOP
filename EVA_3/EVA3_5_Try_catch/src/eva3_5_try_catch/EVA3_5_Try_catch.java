package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_Try_catch {

    public static void main(String[] args) {
        int iEdad = 0;
        Scanner mot = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        try{
            iEdad = mot.nextInt();
        }catch(InputMismatchException x){
            //x.printStackTrace();
            System.out.println("Por favor introduzca solo números enteros");
        }
        System.out.println("Tu edad: "+iEdad);
    }
    
}
