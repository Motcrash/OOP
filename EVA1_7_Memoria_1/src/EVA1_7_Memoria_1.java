public class EVA1_7_Memoria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 5;
        String cade = "Hola";
        Prueba obj = new Prueba();
        
        System.out.println("Valor = "+valor);
        System.out.println("Cadena = "+cade);
        System.out.println("Objeto = "+obj);
    }
    
}

class Prueba{
    public void saludar(){
        System.out.println("Hola mundo");
    }
}
