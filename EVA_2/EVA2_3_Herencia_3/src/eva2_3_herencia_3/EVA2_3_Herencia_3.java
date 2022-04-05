package eva2_3_herencia_3;

public class EVA2_3_Herencia_3 {

    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.mover();
        Vertebrado vertebrado = new Vertebrado();
        vertebrado.tenerEsqueleto();
        Mamifero mamifero = new Mamifero();
        mamifero.tenerPelo();
        Primates primate = new Primates();
        primate.tienePulgares();*/
        Humanos humano = new Humanos();
        humano.pensar();
        
    }
    
}
class Humanos extends Primates{
    public Humanos(){
        System.out.println("Humano");
    }
    
    public void pensar(){
        System.out.println("Puede pensar");
    }
    
}
class Primates extends Mamifero{
    public Primates(){
        System.out.println("Primates");
    }
    public void tienePulgares(){
        System.out.println("Tiene pulgares");
    }
}
class Mamifero extends Vertebrado{
    public Mamifero(){
        System.out.println("Mamifero");
    }
    public void tenerPelo(){
        System.out.println("Tiene pelo");
    }
}

class Vertebrado extends Animal{
    
    public Vertebrado(){
        System.out.println("Vertebrado");
    }
    public void tenerEsqueleto(){
        System.out.println("Vertebrado: tiene esqueleto");
    }
}

class Animal{
    public Animal(){
        System.out.println("Animal");
    }
    public void mover(){
        System.out.println("Animal: movimiento");
    }
}