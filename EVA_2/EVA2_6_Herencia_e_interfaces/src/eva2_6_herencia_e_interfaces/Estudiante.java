package eva2_6_herencia_e_interfaces;

public class Estudiante extends Persona implements MuestraDatos{
    private String noCtrl;

    public Estudiante() {
        super();
        this.noCtrl = "";
    }

    public Estudiante(String noCtrl) {
        this.noCtrl = noCtrl;
    }

    public Estudiante(String noCtrl, String nombre, int edad) {
        super(nombre, edad);
        this.noCtrl = noCtrl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Número de control: " + noCtrl);
    }

    
    
    
}
