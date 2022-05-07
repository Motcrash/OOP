package eva1_14_static;

public class EVA1_14_Static {

    public static void main(String[] args) {
        /*FormulasMatematicas misFor = new FormulasMatematicas();
        double area = misFor.calcularAreaCirculo(100);
        System.out.println("Area del circulo: " + area);*/
        double area= FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del circulo: "+ area);
        double areaT = FormulasMatematicas.calularAreaTriangulo(100,50);
        System.out.println("Area del circulo: "+ areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.imprimirMensaje();
    }
    
}

class FormulasMatematicas{
    
    static int valor = 100;
    public static double calcularAreaCirculo(double radio){
        double area;
        area = 3.1416*radio*radio;
        return area;
    }
    
    public static double calularAreaTriangulo(double base, double altura){
        double area;
        area = base*altura/2.0;
        return area;
    }
    
    public void imprimirMensaje(){
        System.out.println("Hola mundo");
    }
}