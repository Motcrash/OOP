package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_7_Uso_excepciones {

    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        boolean datoErroneo = false;
        do{
            try{
                System.out.print("Introduce tu edad: ");
                int iEdad = mot.nextInt();
                
                System.out.println("Tu edad: "+iEdad);
                datoErroneo = false;
            }catch(InputMismatchException x){
                //x.printStackTrace();
                datoErroneo = true;
                System.out.println(mot.next() + " No es un dato númerico, por favor introduzca un número entero");
            }
        }while(datoErroneo);
    }
    
}
