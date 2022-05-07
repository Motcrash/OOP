package eva1_15_formulas_temp;

import java.util.Scanner;

public class EVA1_15_Formulas_Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String elec;
        double temp;
        System.out.println("Indique la temperatura que desea convertir");
        temp = read.nextDouble();
        System.out.println("Indique la unidad de medida que va a convertir");
        System.out.println("a) Celsius \t b) Farenheit \t c) Kelvin");
        elec = read.next();
        while(elec.equalsIgnoreCase("a")==false && elec.equalsIgnoreCase("b")==false && elec.equalsIgnoreCase("c")==false){
            System.out.println("Opción inválida, intente de nuevo");
            elec = read.next();
        }
        switch(elec){
            case "a":
                FormulasTemp.celsiusConvert(temp);
                break;
            case "b":
                FormulasTemp.FarenheitConvert(temp);
                break;
            case "c":
                FormulasTemp.kelvinConvert(temp);
                break;
        }
    }
    
}

class FormulasTemp{
    static double celsius,farenheit,kelvin;
    static void celsiusConvert(double value){
        celsius = value;
        farenheit = (celsius*1.8)+32;
        kelvin = celsius+273.15;
        System.out.println("Celsius = "+ celsius);
        System.out.println("Farenheit = "+ farenheit);
        System.out.println("Kelvin = "+ kelvin);
    }
    static void FarenheitConvert(double value){
        farenheit = value;
        celsius = (farenheit-32)*5/9;
        kelvin = (5*(farenheit-32))/9+273.15;
        System.out.println("Farenheit = "+ farenheit);
        System.out.println("Celsius = "+ celsius);
        System.out.println("Kelvin = "+ kelvin);
    }
    static void kelvinConvert(double value){
        kelvin = value;
        celsius = kelvin-273.15;
        farenheit = (kelvin-273.15)*9/5+32;
        System.out.println("Kelvin = "+ kelvin);
        System.out.println("Celsius = "+ celsius);
        System.out.println("Farenheit = "+ farenheit);
    }
}
