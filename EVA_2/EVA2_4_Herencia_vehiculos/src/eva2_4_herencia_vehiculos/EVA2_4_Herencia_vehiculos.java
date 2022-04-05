package eva2_4_herencia_vehiculos;

public class EVA2_4_Herencia_vehiculos {
    
    public static void main(String[] args) {
        /*Vehiculos vehi1 = new Vehiculos();
        vehi1.imprimirDatos();*/
        Motocicletas moto1 = new Motocicletas();
        moto1.imprimirDatos();
    }
}

class Vehiculos{
    
    private int noLlantas, capacidadMotor, cilindros, capacidadPasajeros, año;
    private String tipoCombustible, marca, modelo;
    
    public Vehiculos() {
        this.noLlantas = 0;
        this.capacidadMotor = 0;
        this.cilindros = 0;
        this.capacidadPasajeros = 0;
        this.año = 0;
        this.tipoCombustible = "";
        this.marca = "";
        this.modelo = "";
    }

    public Vehiculos(int noLlantas, int capacidadMotor, int cilindros, int capacidadPasajeros, int año, String tipoCombustible, String marca, String modelo) {
        this.noLlantas = noLlantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindros = cilindros;
        this.capacidadPasajeros = capacidadPasajeros;
        this.año = año;
        this.tipoCombustible = tipoCombustible;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void imprimirDatos(){
        System.out.println("Clase vehículos");
        System.out.println("Número de llantas: "+noLlantas);
        System.out.println("Capacidad del motor: "+capacidadMotor+"Lts");
        System.out.println("Cilindros: "+cilindros);
        System.out.println("Capacidad de pasajeros: "+capacidadPasajeros);
        System.out.println("Año: "+año);
        System.out.println("Tipo de combustible: "+tipoCombustible);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
    
}

class Motocicletas extends Vehiculos{
    private String transmision, tipoMotocicletas, tipoSuspension;

    public Motocicletas() {
        this.transmision = "";
        this.tipoMotocicletas = "";
        this.tipoSuspension = "";
    }
    
    public Motocicletas(String transmision, String tipoMotocicletas, String tipoSuspension) {
        this.transmision = transmision;
        this.tipoMotocicletas = tipoMotocicletas;
        this.tipoSuspension = tipoSuspension;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();  
        System.out.println("Tipo de transmision: "+transmision);
        System.out.println("Tipo de motocicleta: "+tipoMotocicletas);
        System.out.println("Tipo de suspensión: "+tipoSuspension);
    } 
}
class Automoviles extends Vehiculos{
    private String tipoVehiculo, equipamiento, transmision;

    public Automoviles() {
        this.tipoVehiculo = "";
        this.equipamiento = "";
        this.transmision = "";
    }
    
    public Automoviles(String tipoVehiculo, String equipamiento, String transmision) {
        this.tipoVehiculo = tipoVehiculo;
        this.equipamiento = equipamiento;
        this.transmision = transmision;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();  
        System.out.println("Tipo de vehículo: "+tipoVehiculo);
        System.out.println("Equipamiento: "+equipamiento);
        System.out.println("Tipo de transmision: "+transmision);
    } 
    
}

class Camionetas extends Vehiculos{
    private int capacidadCarga;
    private String tipoCamino, equipamiento;
    
    public Camionetas(){
        this.capacidadCarga = 0;
        this.tipoCamino = "";
        this.equipamiento = "";
    }
    
    public Camionetas(int capacidadCarga, String tipoCamino, String equipamiento) {
        this.capacidadCarga = capacidadCarga;
        this.tipoCamino = tipoCamino;
        this.equipamiento = equipamiento;
    }
    
    @Override 
    public void imprimirDatos(){
        super.imprimirDatos();  
        System.out.println("Capacidad de carga: "+capacidadCarga);
        System.out.println("Tipo de uso: "+tipoCamino);
        System.out.println("Equipamiento: "+equipamiento);
    } 
}

class Camiones extends Vehiculos{
    private int capacidadCarga, noEjes, peso;
    
    public Camiones() {
        this.capacidadCarga = 0;
        this.noEjes = 0;
        this.peso = 0;
    }

    public Camiones(int capacidadCarga, int noEjes, int peso) {
        this.capacidadCarga = capacidadCarga;
        this.noEjes = noEjes;
        this.peso = peso;
    }
    
    @Override 
    public void imprimirDatos(){
        super.imprimirDatos();  
        System.out.println("Capacidad de carga: "+ capacidadCarga);
        System.out.println("Número de ejes: "+ noEjes);
        System.out.println("Peso: "+peso+" Toneladas");
    } 
    
}