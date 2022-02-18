package eva1_2_clasepersona;

// @author Edgar Gerardo Delgado Cerrillo - #21550297
 
public class Eva1_2_clasePersona/*Declaración*/ { /* Implementación*/

    public static void main(String[] args) {
        //Crear un objeto (instanciar)
        Persona estudiante = new  Persona(); /*Con el new se le asigna un espacio en memoria*/
        estudiante.id = "21550297";
        estudiante.nombre = "Edgar Gerardo Delgado Cerrillo";
        estudiante.edad = 18;
        estudiante.imprimirDatos();
        estudiante.calcularAñoNacimiento();
        
        Persona estudiante2 = new Persona();
        estudiante2.id = "21550295";
        estudiante2.nombre = "Juancho Pérez";
        estudiante2.edad = 19;
        estudiante2.imprimirDatos();
        estudiante2.calcularAñoNacimiento();
        
        Persona estudiante3 = new Persona();
        estudiante3.id = "21550293";
        estudiante3.nombre = "Jorge Gay";
        estudiante3.edad = 18;
        estudiante3.imprimirDatos();
        estudiante3.calcularAñoNacimiento();
        
        
    }
}

//Una clase es un tipo de dato abstracto
class Persona{
        //Atributos
        String nombre, id;
        int edad;
        //Comportamiento o funciones
        //método imprimir datos
        void imprimirDatos(){
            System.out.println("El nombre es: " + nombre);
            System.out.println("Su id es: " + id);
            System.out.println("su edad es: " + edad);
        }
        
        void calcularAñoNacimiento(){
            int año = 2022 - edad;
            System.out.println("Año de nacimiento: "+año);
            System.out.println("");
        }
}