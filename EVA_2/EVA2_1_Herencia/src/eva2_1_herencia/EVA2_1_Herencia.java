package eva2_1_herencia;
public class EVA2_1_Herencia {
    
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante("Juan",22,"#00112255");
        //estu1.setNombre("Juana");
        //estu1.setEdad(22);
       // estu1.mostrarNombre();
       // estu1.setNoCtrl("00112233");
        estu1.imprimirDatos();
        
        Maestro mtro1 = new Maestro();
        mtro1.imprimirDatos();
    }
    
}

class Maestro extends Persona{
    private int noRegistro;
    
    public Maestro(){
        super();
        System.out.println("Clase estudiante");
    }
    
    public Maestro(String nombre, int edad, int noRegistro){
        super(nombre, edad);
        this.noRegistro = noRegistro;
    }

    public int getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(int noRegistro) {
        this.noRegistro = noRegistro;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();  
        System.out.println("Número de registro: " + noRegistro);
    }
    
}
class Estudiante extends Persona{
    private String noCtrl;
    
    public Estudiante(){
        super();
        System.out.println("Clase estudiante");
    }
    
    public Estudiante(String nombre, int edad, String noCtrl){
        super(nombre, edad);
        this.noCtrl = noCtrl;
    }

    public String getNoCtrl() {
        return noCtrl;
    }

    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }
    
    /*public void mostrarNombre(){
        System.out.println("Nombre del estudiante: "+nombre);
    }*/
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();  
        System.out.println("No de control: " + noCtrl);
    }
    
}

class Persona{
    protected String nombre;
    protected int edad;

    public Persona() {
        this.nombre = "XXXXXXXX";
        this.edad = 10000;
        System.out.println("Clase persona");
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
    }
}
