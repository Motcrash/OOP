package proyecto;

public class Docente extends Usuario {

    private String noMatricula;
    

    public Docente(){
        super();
    }

    public Docente(String username, String password, String name, String lastName, String noMatricula){
        super(username, password, name, lastName);
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