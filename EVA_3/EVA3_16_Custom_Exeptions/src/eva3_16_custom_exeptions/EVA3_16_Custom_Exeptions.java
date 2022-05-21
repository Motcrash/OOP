package eva3_16_custom_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_16_Custom_Exeptions {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Juan");
        try{
            perso.setEdad(capturarEdad());
        } catch(Exception ex){
            ex.printStackTrace();
        }

        try{
            Persona perso2 = new Persona("Juan", capturarEdad());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        

    }

    public static int capturarEdad() throws Exception{
        Scanner input = new Scanner(System.in);
            System.out.print("Ingrese su edad: ");
            int edad = 0;
        try{
            edad = input.nextInt();
        }catch(InputMismatchException ex){
            throw new Exception("El valor introducido no es válido");
        }
        return edad;
    }
}
    

