package eva2_18_polimorfismo_int;

public class Prueba implements Mensajes{

   @Override
   public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
   }
    
   public void otroMetodo(){
       System.out.println("Metodo adicional");
   }
   
}
