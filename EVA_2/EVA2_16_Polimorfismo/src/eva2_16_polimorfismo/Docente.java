
package eva2_16_polimorfismo;

public class Docente extends Persona{
    private String numeroRegistro;

    public Docente() {
    }

    public Docente(String numeroRegistro, String nombre, int edad) {
        super(nombre, edad);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    
}
