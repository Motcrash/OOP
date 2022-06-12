package proyecto;

import java.util.ArrayList;
import java.util.Calendar;

public class Estudiante extends Usuario {

    private String numeroControl;
    private double calificacion;

    private static int numEstudiantes;
    private int numEstudiante;

    public Estudiante() {
        super();
        numEstudiantes++;
        numEstudiante=numEstudiantes;
        setNumeroControl();
    }

    public Estudiante(String username, String password, String name, String lastName) {
        super(username, password, name, lastName);
        numEstudiantes++;
        numEstudiante=numEstudiantes;
        setNumeroControl();
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl() {

        String añoIngreso = Integer.toString(Calendar.getInstance().get(Calendar.YEAR));

        // año #55 #de instancia
        numeroControl = (añoIngreso.substring(2) + "55" + getNumEstudianteFormatado());

    }

    public String getNumEstudianteFormatado() {
        String numEstudianteFormatado = "";
        if (numEstudiante < 10) {
            numEstudianteFormatado = "000" + numEstudiante;
        } else if (numEstudiante < 100) {
            numEstudianteFormatado = "00" + numEstudiante;
        } else if (numEstudiante < 1000) {
            numEstudianteFormatado = "0" + numEstudiante;
        } else
            numEstudianteFormatado = Integer.toString(numEstudiante);

        return numEstudianteFormatado;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) throws CalificacionExcepcion {

        if (calificacion >= 0.0 && calificacion <= 10.0) {
            this.calificacion = calificacion;
        } else
            throw new CalificacionExcepcion("La calificacion no esta en un rango valido, ingrese una calificación válida.");

    }

    public static void mostrarCalificaciones(ArrayList<Docente> listaDocentes, String name, String lastName) {
        System.out.println("Alumno: " + name + " " + lastName);
        String fullName = name + " " + lastName;

        
    }

}
