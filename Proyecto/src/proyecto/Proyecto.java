package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

//Imports para el manejo de archivos binarios.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Proyecto {
    static Scanner input = new Scanner(System.in);
    static String user, password, username, lastName, name, noMatricula;

    public static void main(String[] args) {

        //Inicialización de las variables
        ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
        ArrayList <Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        ArrayList <Docente> listaDocentes = new ArrayList<Docente>();
        listaEstudiantes.add(new Estudiante("A", "sadqwhd", "dqwesad", "dsadwq"));
        listaEstudiantes.add(new Estudiante("B", "sadqwhd", "dqwesad", "dsadwq"));
        listaDocentes.add(new Docente("C", "sadqwhd", "dqwesad", "dsadwq","696969"));
        listaDocentes.add(new Docente("D", "sadqwhd", "dqwesad", "dsadwq", "asdwq"));
        //Añadimos a la lista de usuarios los usuarios ya establecidos
        listaUsuarios.addAll(listaEstudiantes);
        listaUsuarios.addAll(listaDocentes);
        String option;

        //Inicio del programa en consola
        System.out.println("\t\tSII");
        System.out.println();
        System.out.println("Seleccione una opción: \n a) Inicie sesión \t b) Crear usuario");
        option = input.nextLine();
        //Verificación de opción
        while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b")){
            System.out.println("Elija una opción válida");
            option = input.nextLine();
        }

        //Switch de opciones
        switch(option.toLowerCase()){
            case "a"->{
                logIn(listaUsuarios);
            } 

            case "b"->{
                createUser(listaEstudiantes, listaDocentes, listaUsuarios);
               
            }      
               
        } 
        //
        input.close();
        saveObjects(listaUsuarios, listaDocentes, listaEstudiantes);
    }

    // Método para crear usuarios
    public static void createUser(ArrayList<Estudiante> listaEstudiantes, ArrayList<Docente> listaDocentes, ArrayList<Usuario> listaUsuarios) {
        
        String option = "";
        System.out.print("Ingrese su nombre de usuario: ");
        username = input.nextLine();
        System.out.print("Ingrese su contraseña: ");
        password = input.nextLine();
        System.out.print("Ingrese sus nombres: ");
        name = input.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        lastName = input.nextLine();

        

        //Asignación de valores del usuario
        System.out.println("Indique el tipo de usuario: \na) Docente \tb) Estudiante");
        option = input.nextLine();
        //Verificación de opción
        while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b")){
            System.out.println("Elija una opción válida");
            option = input.nextLine();
        }
        
        //Switch de opciones
        switch(option.toLowerCase()){
            case "a"->{
                System.out.print("Ingrese sus matricula: ");
                noMatricula = input.next();
                //Añade el usuario creado a ambas listas
                listaDocentes.add(new Docente(username, password, name, lastName, noMatricula));
                listaUsuarios.add(listaDocentes.get(listaDocentes.size()-1));
            } 

            case "b"->{
                //Añade el usuario creado a ambas listas
                listaEstudiantes.add(new Estudiante(username, password, name, lastName));
                listaUsuarios.add(listaEstudiantes.get(listaEstudiantes.size()-1));
                
            }      
               
        } 
        
    }

    //Método para iniciar sesión
    public static void logIn(ArrayList<Usuario> listaUsuarios){
        boolean userExists = false;
        
        do{
            //Ingresamos los datos de la sesión
            System.out.print("Ingrese su nombre de usuario: ");
            username = input.next();
            System.out.print("Ingrese su contraseña: ");
            password = input.next();
            System.out.println();
            
            // Verificamos si los datos ingresados concuerdan con algún usuario de la lista de usarios
            for (int i=0; i<listaUsuarios.size(); i++) {
                // Si encuentra un usuario accede a su sesión
                if(username.equalsIgnoreCase(listaUsuarios.get(i).getUsername()) && password.equals(listaUsuarios.get(i).getPassword())){
                    userExists=true;
                    System.out.println("Sesión iniciada exitosamente"); 
                    System.out.println();
                    //Verifica qué tipo de usuario entró
                    if(listaUsuarios.get(i) instanceof Estudiante){
                        //Llamar al método para la calificación
                        
                        System.out.println("Es un estudiante");

                    }else if(listaUsuarios.get(i) instanceof Docente){
                        //Llamar al método para profesores
                       
                        System.out.println("Es un Docente");
                    }
                    break;
                // Si no encuentra a un usuario lo marca como incorrecto y vuelve a pedir los datos
                }else{
                    if(i==listaUsuarios.size()-1){
                        System.out.println("Usuario y/o contraseña incorrectos");
                        System.out.println();
                    }
                }    
            
            }
                
        }while(userExists == false);
    }


    //Guardar objetos de usuarios
    public static void saveObjects(Object obj, Object obj2, Object obj3){
        try {
            //Streams para definir la ruta de guardado y manipulacion del objeto.
            FileOutputStream openFile = new FileOutputStream("src/proyecto/sysdata/usuarios.obj");
            ObjectOutputStream saveObject = new ObjectOutputStream(openFile);
            saveObject.writeObject(obj);
            saveObject.writeObject(obj2);
            saveObject.writeObject(obj3);
            saveObject.flush();
            saveObject.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // public static void openObjects(){
    //     try{
    //         FileInputStream openFile = new FileInputStream("src/sysdata/usuarios.obj");
    //         ObjectInputStream readObject = new ObjectInputStream(openFile);
            
    //         ArrayList<Usuario> lista = (ArrayList<Usuario>)readObject.readObject(); ///Siempre regresa un objeto de la Clase Object
    //         readObject.close();
            
    //     }catch(FileNotFoundException e){

    //     }catch (IOException ex) {
    //         ex.printStackTrace();
    //     } catch (ClassNotFoundException ex) {
    //         ex.printStackTrace();
    //     }
    // }


}
