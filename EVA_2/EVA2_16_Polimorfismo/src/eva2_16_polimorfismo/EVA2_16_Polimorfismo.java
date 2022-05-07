package eva2_16_polimorfismo;

public class EVA2_16_Polimorfismo {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("001122", "Maria", 25);
        Docente docente = new Docente("036","Pedro",50);
        
        
        Persona persoEstu = estudiante;
        Estudiante estuPerso = persona;
    }
    
}
