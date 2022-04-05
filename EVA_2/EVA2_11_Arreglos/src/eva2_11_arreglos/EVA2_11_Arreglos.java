package eva2_11_arreglos;

public class EVA2_11_Arreglos {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        arreglo[0] = 100;
        System.out.println("El valor de arreglo[0]= "+arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 900;
        arreglo[8] = 900;
        arreglo[9] = 1000;
        String[] arreCade = new String[10];
        arreCade[0] = "Hola";
        arreCade[1] = "Mundo";
        double[] arreDouble = new double[1000000];
        arreDouble[999999] = 0.2;
        Persona[] clasesPOO = new Persona[32];
    }
    
}

class Persona {
    private String nombre;
    
    public Persona(){
        
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    
}