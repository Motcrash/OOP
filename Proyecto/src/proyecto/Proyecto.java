package proyecto;

import java.util.ArrayList;
import java.util.Scanner;
//Imports para el manejo de archivos binarios.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Proyecto {
    static ArrayList<Usuario> listaUsuarios = getUsuariosDatabase();
    static ArrayList<Estudiante> listaEstudiantes = getEstudiantesDatabase();
    static ArrayList<Docente> listaDocentes = getDocentesDatabase();
    static Scanner input = new Scanner(System.in);
    static String user, password, username, lastName, name, noMatricula, materia;
    static int numEstudiantes = 0;

    public static void main(String[] args) {

        // Se generan los ArrayList en entorno local para el funcionamiento del
        // programa, en caso de existir los archivos, se intentará leer los usuarios
        // existentes
        // En caso de no existir dicho archivo, se generara una nueva ArrayList de cada
        // tipo.
        try {
            menu(listaUsuarios, listaDocentes, listaEstudiantes);
        } catch (Exception e) {
            e.printStackTrace(); // Dado que no conocemos que tipo especifico de excepcion puede ocurrir,
                                 // atrapamos todas.
        } finally {
            input.close();
            Usuario.guardarUsuarios(listaUsuarios, listaDocentes, listaEstudiantes);
        }

    }

    public static void menu(ArrayList<Usuario> listaUsuarios, ArrayList<Docente> listaDocentes,
            ArrayList<Estudiante> listaEstudiantes) throws CalificacionExcepcion {
        String option;
        do {
            System.out
                    .println("Seleccione una opción: \n a) Inicie sesión \t b) Crear usuario \t c)Salir del Programa");
            option = input.nextLine();
            // Verificación de opción
            while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") && !option.equalsIgnoreCase("c")) {
                System.out.println("Elija una opción válida");
                option = input.nextLine();
            }

            // Switch de opciones
            switch (option.toLowerCase()) {
                case "a" -> {
                    // logIn(listaUsuarios,listaDocentes,listaEstudiantes);
                    Usuario.logIn(listaUsuarios, listaDocentes, listaEstudiantes);
                    break;
                }

                case "b" -> {
                    // createUser(listaEstudiantes, listaDocentes, listaUsuarios);
                    Usuario.createUser(listaEstudiantes, listaDocentes, listaUsuarios);
                }
                case "c" -> {
                    break;
                }
            }
        } while (!option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("a"));
    }

    @SuppressWarnings("unchecked")
    protected static ArrayList<Usuario> getUsuariosDatabase() {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        // Bloque try-catch para encontrar los usuarios sin importar su tipo. En caso de
        // no existir, se mandará el ArrayList completamente nuevo.
        try {
            FileInputStream openFile = new FileInputStream("src/proyecto/sysdata/usuarios.obj");
            ObjectInputStream readObject = new ObjectInputStream(openFile);

            lista = (ArrayList<Usuario>) readObject.readObject(); /// Siempre regresa un objeto de la Clase Object, se
                                                                  /// forza el Cast para convertirlo a ArrayList de
                                                                  /// Usuario.
            // System.out.println("Usuarios encontrados");
            readObject.close();
            return lista;

        } catch (FileNotFoundException e) {

            // System.out.println("Los usuarios no fueron encontrados");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @SuppressWarnings("unchecked")
    protected static ArrayList<Docente> getDocentesDatabase() {
        ArrayList<Docente> docentes = new ArrayList<Docente>();
        // Bloque try-catch para encontrar los usuarios de tipo Docente. En caso de no
        // existir, se mandará el ArrayList nuevo.
        try {
            FileInputStream openDocentesFile = new FileInputStream("src/proyecto/sysdata/docentes.obj");
            ObjectInputStream readDocentes = new ObjectInputStream(openDocentesFile);

            docentes = (ArrayList<Docente>) readDocentes.readObject();
            // System.out.println("Docentes encontrados");
            readDocentes.close();
            return docentes;
        } catch (FileNotFoundException e) {

            // System.out.println("Los docentes no fueron encontrados");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return docentes;
    }

    // Metodo para obtener los usuarios de tipo Estudiante (Si es que existen)
    @SuppressWarnings("unchecked")
    protected static ArrayList<Estudiante> getEstudiantesDatabase() {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        // Bloque try-catch para encontrar los usuarios de tipo Estudiante. En caso de
        // no existir, se mandará el ArrayList nuevo.
        try {
            FileInputStream openEstudiantesFile = new FileInputStream("src/proyecto/sysdata/estudiantes.obj");
            ObjectInputStream readEstudiantes = new ObjectInputStream(openEstudiantesFile);

            estudiantes = (ArrayList<Estudiante>) readEstudiantes.readObject();
            // System.out.println("Estudiantes encontrados");
            readEstudiantes.close();
            return estudiantes;
        } catch (FileNotFoundException e) {

            // System.out.println("Los estudiantes no fueron encontrados");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }
}