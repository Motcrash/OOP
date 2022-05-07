
package eva2_17_figuras;

public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
    
    