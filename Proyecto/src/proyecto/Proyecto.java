package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;
//Imports para el manejo de archivos binarios.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;

public class Proyecto {
    static Scanner input = new Scanner(System.in);
    static String user, password, username, lastName, name, noMatricula, materia;
    static int numEstudiantes = 0;

    public static void main(String[] args) {

        // Se generan los ArrayList en entorno local para el funcionamiento del
        // programa, en caso de existir los archivos, se intentará leer los usuarios
        // existentes
        // En caso de no existir dicho archivo, se generara una nueva ArrayList de cada
        // tipo.
        ArrayList<Usuario> listaUsuarios = getUsuariosDatabase();
        ArrayList<Estudiante> listaEstudiantes = getEstudiantesDatabase();
        ArrayList<Docente> listaDocentes = getDocentesDatabase();
        try {
            menu(listaUsuarios, listaDocentes, listaEstudiantes);
        } catch (Exception e) {
            e.printStackTrace(); // Dado que no conocemos que tipo especifico de excepcion puede ocurrir,
                                 // atrapamos todas.
        } finally {
            input.close();
            guardarUsuarios(listaUsuarios, listaDocentes, listaEstudiantes);
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
                    logIn(listaUsuarios, listaDocentes, listaEstudiantes);
                    break;
                }

                case "b" -> {
                    // createUser(listaEstudiantes, listaDocentes, listaUsuarios);
                    createUser(listaEstudiantes, listaDocentes, listaUsuarios);
                }
                case "c" -> {
                    break;
                }
            }
        } while (!option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("a"));
    }

    // Método para crear usuarios
    public static void createUser(ArrayList<Estudiante> listaEstudiantes, ArrayList<Docente> listaDocentes,
            ArrayList<Usuario> listaUsuarios) {
        String option2 = "";
        System.out.print("Ingrese su nombre de usuario: ");
        username = input.nextLine();
        System.out.print("Ingrese su contraseña: ");
        password = input.nextLine();
        System.out.print("Ingrese sus nombres: ");
        name = input.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        lastName = input.nextLine();

        // Asignación de valores del usuario
        System.out.println("Indique el tipo de usuario: \na) Docente \tb) Estudiante");
        option2 = input.nextLine();
        // Verificación de opción
        while (!option2.equalsIgnoreCase("a") && !option2.equalsIgnoreCase("b")) {
            System.out.println("Elija una opción válida");
            option2 = input.nextLine();
        }

        // Switch de opciones
        switch (option2.toLowerCase()) {
            case "a" -> {
                System.out.print("Ingrese sus matricula: ");
                noMatricula = input.next();
                System.out.print("Ingrese la materia que impartirá: ");
                materia = input.next();
                // Añade el usuario creado a ambas listas

                listaDocentes.add(new Docente(username, password, name, lastName, noMatricula, materia));
                listaUsuarios.add(listaDocentes.get(listaDocentes.size() - 1));
                System.out.println("Usuario creado exitosamente");
            }

            case "b" -> {
                // Añade el usuario creado a ambas listas
                if (listaDocentes.size() == 0) {
                    System.out.println();
                    System.out.println("No hay docentes inscritos, por favor asigne al menos un docente");
                    System.out.println();
                } else {
                    listaEstudiantes.add(new Estudiante(username, password, name, lastName));
                    listaUsuarios.add(listaEstudiantes.get(listaEstudiantes.size() - 1));
                    asignarAlumnos(listaEstudiantes, listaDocentes);
                    System.out.println("Usuario creado exitosamente");
                }
            }

        }
    }

    // Método para iniciar sesión
    public static void logIn(ArrayList<Usuario> listaUsuarios, ArrayList<Docente> listaDocentes,
            ArrayList<Estudiante> listaEstudiantes) {
        boolean userExists = false;

        if (listaUsuarios.size() > 0) {
            do {
                // Ingresamos los datos de la sesión
                System.out.print("Ingrese su nombre de usuario: ");
                username = input.next();
                System.out.print("Ingrese su contraseña: ");
                password = input.next();
                System.out.println();

                // Verificamos si los datos ingresados concuerdan con algún usuario de la lista
                // de usarios
                for (int i = 0; i < listaUsuarios.size(); i++) {
                    // Si encuentra un usuario accede a su sesión

                    if (username.equalsIgnoreCase(listaUsuarios.get(i).getUsername())
                            && password.equals(listaUsuarios.get(i).getPassword())) {
                        userExists = true;
                        System.out.println("Sesión iniciada exitosamente");
                        System.out.println();
                        // Verifica qué tipo de usuario entró
                        if (listaUsuarios.get(i) instanceof Estudiante) {
                            for (int j = 0; j < listaEstudiantes.size(); j++) {
                                if (username.equalsIgnoreCase(listaEstudiantes.get(j).getUsername())
                                        && password.equals(listaEstudiantes.get(j).getPassword())) {
                                    Estudiante.mostrarCalificaciones(listaDocentes, listaEstudiantes.get(j).getName(),
                                            listaEstudiantes.get(j).getLastName());
                                }
                            }
                        } else if (listaUsuarios.get(i) instanceof Docente) {
                            // Llamar al método para profesores
                            capCalif(listaEstudiantes);

                        }
                        break;
                        // Si no encuentra a un usuario lo marca como incorrecto y vuelve a pedir los
                        // datos
                    } else {
                        if (i == listaUsuarios.size() - 1) {
                            System.out.println("Usuario y/o contraseña incorrectos");
                            System.out.println();
                        }
                    }

                }

            } while (userExists == false);
        } else {
            System.out.println("No se encuentran usuarios, por favor cree alguno");
            System.out.println();
            createUser(listaEstudiantes, listaDocentes, listaUsuarios);
        }

    }

    // Guardar las listas de los de usuarios
    public static void guardarUsuarios(Object obj, Object obj2, Object obj3) {
        try {

            // Crear el directorio en caso de que no exista (Caso poco probable ya que es
            // entorno local)
            String route = "src/proyecto/sysdata";
            File directory = new File(route);
            if (!directory.exists()) {
                directory.mkdir();
            }

            // Streams para definir la ruta de guardado y manipulacion del objeto.
            FileOutputStream openFile = new FileOutputStream(route + "/usuarios.obj");
            ObjectOutputStream saveObject = new ObjectOutputStream(openFile);
            FileOutputStream openFile2 = new FileOutputStream(route + "/docentes.obj");
            ObjectOutputStream saveObject2 = new ObjectOutputStream(openFile2);
            FileOutputStream openFile3 = new FileOutputStream(route + "/estudiantes.obj");
            ObjectOutputStream saveObject3 = new ObjectOutputStream(openFile3);
            saveObject.writeObject(obj);
            saveObject2.writeObject(obj2);
            saveObject3.writeObject(obj3);
            saveObject.flush();
            saveObject.close();
            saveObject2.flush();
            saveObject2.close();
            saveObject3.flush();
            saveObject3.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public static void asignarAlumnos(ArrayList<Estudiante> listaEstudiantes, ArrayList<Docente> listaDocentes) {
        String estudiante;
        estudiante = listaEstudiantes.get(listaEstudiantes.size() - 1).getName()
                + listaEstudiantes.get(listaEstudiantes.size() - 1).getLastName();
        for (int i = 0; i < listaDocentes.size(); i++) {
            listaDocentes.get(i).listaAlumnos.add(estudiante);
            System.out.println(listaDocentes.get(i).listaAlumnos.size());
        }
    }

    public static void capCalif(ArrayList<Estudiante> listaAlumnos) {
        String option3;
        do {
            int numAlumno = 0;
            Scanner input = new Scanner(System.in);
            String cali;
            System.out.println("Seleccione el usuario que desea calificar");
            for (int i = 0; i < listaAlumnos.size(); i++) {
                if (listaAlumnos.get(i).getCalificacion() == 0) {
                    cali = "Sin asignar";
                } else
                    cali = Double.toString(listaAlumnos.get(i).getCalificacion());
                System.out.println((i + 1) + ") Nombre alumno: " + listaAlumnos.get(i).getName() + " " +
                        listaAlumnos.get(i).getLastName() +
                        "\tNumero de Control: " + listaAlumnos.get(i).getNumeroControl() +
                        "\tCalificación: " + cali);
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
                    listaAlumnos.get(numAlumno - 1).setCalificacion(calificacion);
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println(input.next() + " " + "No es numerico, ingrese la calificacion nuevamente");
                } catch (CalificacionExcepcion e) {
                    System.out.println(input.next() + " " + e.getMessage());
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

    }
}