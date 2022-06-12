package proyecto;

import java.util.ArrayList;
public class Docente extends Usuario {


    private String noMatricula, materia;
    ArrayList<String> listaAlumnos = new ArrayList<String>();

    public Docente() {
        super();
    }

    public Docente(String username, String password, String name, String lastName, String noMatricula, String materia) {
        super(username, password, name, lastName);
        this.noMatricula = noMatricula;
        this.materia = materia;
    }

    public String getNoMatricula() {
        return noMatricula;
    }

    public void setNoMatricula(String noMatricula) {
        this.noMatricula = noMatricula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}