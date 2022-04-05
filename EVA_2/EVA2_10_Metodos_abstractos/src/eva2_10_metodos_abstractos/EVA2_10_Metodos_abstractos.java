package eva2_10_metodos_abstractos;

public class EVA2_10_Metodos_abstractos {

    public static void main(String[] args) {
        
    }
    
}

class ImplementsAbstracto extends ClaseAbstracta{

    @Override
    public void metodoAbstracto() {
        
    }
    
}

abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Método implementado");
    }
    
    public abstract void metodoAbstracto();
}