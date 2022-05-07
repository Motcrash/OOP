
public class autoClass {
    
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setMarca("Ford");
        auto1.setModelo("Mustang");
        auto1.setTipo("Sedan");
        auto1.setColor("Rojo");
        auto1.setAño(2022);
        auto1.setPrecio(1167000.00);
        auto1.imprimirDatos();
        
    }
}

class Auto{
    private String marca, modelo, color, tipo;
    private int año;
    private double precio;
    
    public void setMarca(String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setColor(String valor){
        color = valor;
    }
    public String getColor(){
        return color;
    }
    public void setTipo(String valor){
        tipo = valor;
    }
    public String getTipo(){
        return tipo;
    }
    public void setAño(int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void imprimirDatos(){
        System.out.println("Datos del vehículo");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}