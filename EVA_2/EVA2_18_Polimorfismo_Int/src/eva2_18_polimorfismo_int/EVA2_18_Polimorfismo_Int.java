package eva2_18_polimorfismo_int;

public class EVA2_18_Polimorfismo_Int {

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
      //prueba.mostrarMensaje("Hola mundo");
      //prueba.otroMetodo();
        mostrar(prueba);
    }
    
    public static void mostrar(Mensajes m){
        m.mostrarMensaje("Hola mundo");
    }
    
}
