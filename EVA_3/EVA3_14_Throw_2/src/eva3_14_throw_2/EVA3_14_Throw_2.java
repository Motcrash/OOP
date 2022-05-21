package eva3_14_throw_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_14_Throw_2 {

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
