package proyecto;

import java.util.ArrayList;
import java.util.Calendar;

public class Estudiante extends Usuario {

    private String numeroControl;
    private double[] calificacion = new double[7];

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

    public double getCalificacion(int n) {
        return calificacion[n];
    } 

    public void setCalificacion(Double calificacion , int n) throws CalificacionExcepcion {

        if (calificacion >= 0.0 && calificacion <= 10.0) {
            this.calificacion[n] = calificacion;
        } else
            throw new CalificacionExcepcion("La calificacion no esta en un rango valido, ingrese una calificación válida.");
    }

    public static void mostrarCalificaciones(ArrayList<Docente> listaDocentes,ArrayList<Estudiante> listaEstudiantes, int n) {
        System.out.println("Bienvenido "+ listaEstudiantes.get(n).getName()+" "
            +listaEstudiantes.get(n).getLastName()+" - "+listaEstudiantes.get(n).getNumeroControl());
        System.out.printf("%s %30s %30s %30s %30s","Nombre/s","Apellido/s","Matricula","Materia","Calificacion");
        System.out.println();
        for(int i=0; i<listaDocentes.size();i++){
            String calificacion = Double.toString(listaEstudiantes.get(n).getCalificacion(i));
            if(listaEstudiantes.get(n).getCalificacion(i)==0) calificacion="Sin capturar";
            System.out.printf("%s %16s %35s %35s %25s", listaDocentes.get(i).getName(), listaDocentes.get(i).getLastName(),
            listaDocentes.get(i).getNoMatricula(),listaDocentes.get(i).getMateria(),calificacion);
            System.out.println();
        }

        
    }

    public static void asignarAlumnos(ArrayList<Estudiante> listaEstudiantes, ArrayList<Docente> listaDocentes) {
        String estudiante;
        estudiante = listaEstudiantes.get(listaEstudiantes.size() - 1).getName()
                + listaEstudiantes.get(listaEstudiantes.size() - 1).getLastName();
        for (int i = 0; i < listaDocentes.size(); i++) {
            listaDocentes.get(i).listaAlumnos.add(estudiante);
           
        }
    }

}
