package proyecto;

public class Docente extends Usuario{

    private String noMatricula;
    

    public Docente(){
        
    }

    public Docente(String noMatricula){
        this.noMatricula = noMatricula;
    }

    public String getNoMatricula() {
        return noMatricula;
    }

    public void setNoMatricula(String noMatricula) {
        this.noMatricula = noMatricula;
    }
   
    public void capCalif(){
        
    }
    
}