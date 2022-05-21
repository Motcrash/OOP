package eva3_16_custom_exeptions;

public class Persona {
    private String nombre;
    private int edad;

    Persona(){
        nombre = "Gerardo Delgado";
        edad=18;
    }

    Persona(String nombre, int edad) throws ExcepcionDeRango{
        this.nombre = nombre;
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) throws ExcepcionDeRango {
        if(edad<=130 && edad>=0){
            this.edad = edad;
        }else{
            throw new ExcepcionDeRango();
        }
            
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

