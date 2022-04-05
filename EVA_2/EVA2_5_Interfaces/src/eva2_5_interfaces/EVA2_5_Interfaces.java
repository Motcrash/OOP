package eva2_5_interfaces;

public class EVA2_5_Interfaces {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Gerardo");
        perso.setEdad(18);
        perso.imprimirDatos();
        
        Vehiculo vehiculo = new Vehiculo("Ford","Mustang");
        vehiculo.imprimirDatos(); 
        vehiculo.mostrarMensaje();    }
    
}

class Persona implements MuestraDatos{
    private int edad;
    private String nombre;
    
    public Persona(){
        
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}

class Vehiculo implements MuestraDatos, Mensaje{
    private String marca, modelo;

    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo");
    }
    
}

interface MuestraDatos{
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();
}
