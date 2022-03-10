package eva1_16_comunicacion;

public class EVA1_16_Comunicacion {

    public static void main(String[] args) {
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValorA(100);
        objB.setValorB(objA.getValorA());
        System.out.println("Valor A "+objA.getValorA());
        System.out.println("Valor B "+objB.getValorB());
    }
    
}

class ClaseA{
    private int valorA;

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }
    
    
}

class ClaseB{
    private int valorB;

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
    
    
}