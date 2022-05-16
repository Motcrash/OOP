package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_13_Mejorar_captura_edad {

    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        boolean datoErroneo = false;
        do{
            try{
                System.out.print("Introduce tu edad: ");
                int iEdad = mot.nextInt();
                if(iEdad < 0){
                    throw new Exception(iEdad+" no es una edad válida");
                }
                System.out.println("Tu edad: "+iEdad);
                datoErroneo = false;
            }catch(InputMismatchException x){
                //x.printStackTrace();
                datoErroneo = true;
                System.out.println(mot.next() + " No es un dato númerico, por favor introduzca un número entero");
            }catch (Exception ex) {
                System.out.println("Edad no valida");
                datoErroneo = true;
            }
        }while(datoErroneo);
    }
    
}
