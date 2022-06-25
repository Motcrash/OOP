package proyecto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
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

    public static void capCalif(ArrayList<Estudiante> listaAlumnos, int n) {
        String option3;
        System.out.println();
        Scanner input = new Scanner(System.in);
        do {
            int numAlumno = 0;
            System.out.printf("%s %20s %20s %20s %20s","#", "Nombres", "Apellidos","# de control", "Calificacion");
            System.out.println();
            String cali;

            for (int i = 0; i < listaAlumnos.size(); i++) {
                if (listaAlumnos.get(i).getCalificacion(n) == 0) {
                    cali = "Sin asignar";
                } else {cali = Double.toString(listaAlumnos.get(i).getCalificacion(n));} 
                System.out.printf("%d %20s %20s %20s %20s", (i+1),listaAlumnos.get(i).getName(),listaAlumnos.get(i).getLastName(), listaAlumnos.get(i).getNumeroControl(), cali);
                System.out.println();
            }
            boolean flag = true;
            do {

                try {
                    System.out.println();
                    System.out.print("Ingrese el número del alumno: ");
                    numAlumno = input.nextInt();
                    while (numAlumno < 1 || numAlumno > listaAlumnos.size()) {
                        System.out.print("Ingrese un número de alumno válido: ");
                        numAlumno = input.nextInt();
                    }
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println(input.next() + " No es un dato numerico, Ingrese unicamente datos numericos");
                }
            } while (flag);
            flag = true;
            do {
                try {
                    System.out.print("Ingrese la calificación del alumno: ");
                    double calificacion = input.nextDouble();
                    listaAlumnos.get(numAlumno - 1).setCalificacion(calificacion, n);
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println(input.next() + " " + "No es numerico, ingrese la calificacion nuevamente");
                } catch (CalificacionExcepcion e) {
                    System.out.println(" " + e.getMessage());
                }
            } while (flag);

            System.out.println();


            
            System.out.println("Seleccione una opción para continuar: \na) Salir \tb) Calificar a otro alumno");
            option3 = input.next();
            while (!option3.equalsIgnoreCase("a") && !option3.equalsIgnoreCase("b")) {
                System.out.println("Seleccione una opción válida");
                option3 = input.next();
            }

        } while (!option3.equalsIgnoreCase("a"));
        input.close();

    }

}