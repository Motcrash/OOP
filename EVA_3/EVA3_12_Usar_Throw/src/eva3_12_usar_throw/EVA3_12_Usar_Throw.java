package eva3_12_usar_throw;

import java.util.Scanner;

public class EVA3_12_Usar_Throw {

    public static void main(String[] args) {
        int iEdad = 0;
        Scanner input = new Scanner(System.in);
            try {
                System.out.print("Introduce tu edad (valor entero positivo) ");
                iEdad = input.nextInt();
                if(iEdad < 0){
                    throw new Exception("El "+iEdad+" no es una edad válida");
                }
                System.out.println("La edad caoturada es: "+iEdad);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    
}
