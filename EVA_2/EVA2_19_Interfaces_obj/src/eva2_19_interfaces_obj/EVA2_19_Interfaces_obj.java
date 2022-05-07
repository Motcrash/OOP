package eva2_19_interfaces_obj;

public class EVA2_19_Interfaces_obj {
    
    public static void main(String[] args) {
        //Mensajes mensaje = new Mensaje();
        
        Persona persona = new Persona();
        persona.setNombre("Jorge");
        
        Mensajes mensaje = persona;
        
        mensaje.mostrarMensaje();
        
    }
    
}

interface Mensajes{
    public void mostrarMensaje();
}

class Persona implements Mensajes{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void mostrarMensaje(){
        System.out.println("Nombre: "+nombre);
    }
      
}