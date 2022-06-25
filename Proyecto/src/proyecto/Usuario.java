package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Usuario implements Serializable{
    
    private String username1, password1, name1, lastName1;
    private static String username, password, name, lastName, noMatricula, materia;
    static Scanner input = new Scanner(System.in);
    
    public Usuario(){

    }

    public Usuario(String username, String password, String name, String lastName){
        this.username1 = username;
        this.password1 = password;
        this.name1 = name;
        this.lastName1 = lastName;
    }
    
    public String getUsername() {
        return username1;
    }

    public void setUsername(String username) {
        this.username1 = username;
    }

    public String getPassword() {
        return password1;
    }

    public void setPassword(String password) {
        this.password1 = password;
    } 

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public String getLastName() {
        return lastName1;
    }

    public void setLastName(String lastName) {
        this.lastName1 = lastName;
    }

    // Método para crear usuarios
    public static void createUser(ArrayList<Estudiante> listaEstudiantes, ArrayList<Docente> listaDocentes, ArrayList<Usuario> listaUsuarios) {
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
            System.out.println();
        }

        // Switch de opciones
        switch (option2.toLowerCase()) {
            case "a" -> {
                System.out.print("Ingrese su matricula: ");
                noMatricula = input.nextLine();
                System.out.print("Ingrese la materia que impartirá: ");
                materia = input.nextLine(); 
                // Añade el usuario creado a ambas listas

                listaDocentes.add(new Docente(username, password, name, lastName, noMatricula, materia));
                listaUsuarios.add(listaDocentes.get(listaDocentes.size() - 1));
                System.out.println("Usuario creado exitosamente");
                System.out.println();
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
                    Estudiante.asignarAlumnos(listaEstudiantes, listaDocentes);
                    System.out.println("Usuario creado exitosamente");
                    System.out.println();
                }
            }

        }
    }

    // Método para iniciar sesión
    public static void logIn(ArrayList<Usuario> listaUsuarios, ArrayList<Docente> listaDocentes, ArrayList<Estudiante> listaEstudiantes) {
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
                                if (username.equalsIgnoreCase(listaEstudiantes.get(j).getUsername()) && password.equals(listaEstudiantes.get(j).getPassword())) {
                                    Estudiante.mostrarCalificaciones(listaDocentes, listaEstudiantes, j);
                                }
                            }
                        } else if (listaUsuarios.get(i) instanceof Docente) {
                            // Llamar al método para profesores
                            for (int j = 0; j < listaDocentes.size(); j++) {
                                if (username.equalsIgnoreCase(listaDocentes.get(j).getUsername()) && password.equals(listaDocentes.get(j).getPassword())) {
                                    Docente.capCalif(listaEstudiantes, j);
                                }
                            }
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

} 