package eva2_17_figuras;

public class EVA2_17_Figuras {

    public static void main(String[] args) {
        
        Circulo circulin = new Circulo(5.0);
        Rectangulo rectangulin = new Rectangulo(5.0,3.0);
        Triangulo triangulin = new Triangulo(10.0,2.0);

        imprimirArea(triangulin);
        imprimirArea(circulin);
        imprimirArea(rectangulin);
        
        claseObject(triangulin);
 
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("Area = "+f.calcularArea());
        
        if(f instanceof Triangulo){
            System.out.println(f.getClass());
         Triangulo trian = (Triangulo)f; //Convertir la figura devuelta a un triangulo
        }
        
    }
    
    public static void claseObject(Object o){
        System.out.println(o.getClass());
    }


}
