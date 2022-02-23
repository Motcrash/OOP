
public class acces_modifier {

    
    public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.setId("21550297");
        per1.setNombre("Gerardo Delgado");
        per1.setEdad(18);
        System.out.println("Nombre: " + per1.getNombre() + " #"+per1.getId());
        
        Persona per2 = new Persona();
        per2.setId("21550298");
        per2.setNombre("David Reed");
        per2.setEdad(18);
        System.out.println("Nombre: " + per2.getNombre() + " #"+per2.getId());
    }
    
}
class Persona{
    private String id, nombre;
    private int edad;
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setId(String valor){
        id = valor;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
}