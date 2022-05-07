package eva2_20_clases_anonimas;

public class EVA2_20_Clases_anonimas {

    public static void main(String[] args) {
             //Mensajes mensaje = new Mensaje();
     
        Mensajes mensaje = new Mensajes(){
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola Mundo!");
            }

        };
        mensaje.mostrarMensaje();
    }
    
}

interface Mensajes{
    public void mostrarMensaje();
}
