package eva1_18_sobrecarga;

public class EVA1_18_Sobrecarga {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Prueba obj = new Prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Area de un rectangulo de 15 x 20: "+calcularAreas(15, 20));
        System.out.println("Area de un circulo cuyo radio es 100: "+calcularAreas(100));
        System.out.println("Area de un circulo cuyo radio es 100: "+calcularAreas(100.0));
        System.out.println("Area de un triángulo es: "+calcularAreas(5.0,10.0, 2));
    }
    
    public static double calcularAreas(double base, double altura){
        return base * altura;
    }
    public static double calcularAreas(double radio){
        System.out.println("Double");
        return Math.PI* Math.pow(radio, 2);
    }
    public static double calcularAreas(int radio){
        System.out.println("Int");
        return Math.PI* Math.pow(radio, 2);
    }
    public static double calcularAreas(double base, double altura, int esTraingulo){
        return (base*altura)/2;
    }
}

class Prueba{
    
}
