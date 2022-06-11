package proyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario implements Serializable{
    
    private String username, password, name, lastName, noMatricula;
    static Scanner input = new Scanner(System.in);
    
    public Usuario(){

    }

    public Usuario(String username, String password, String name, String lastName){
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    
    //Método para iniciar sesión
    public static void logIn(ArrayList<Usuario> listaUsuarios, ArrayList<Docente> listaDocentes, ArrayList<Estudiante> listaEstudiantes){
        boolean userExists = false;
        String username, password, name, lastName, noMatricula;

        if(listaUsuarios.size()>0){
            do{
                //Ingresamos los datos de la sesión
                System.out.print("Ingrese su nombre de usuario: ");
                username = input.next()
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
        } else{
            System.out.println("No se encuentran usuarios, por favor cree alguno");
            System.out.println();
            createUser(listaEstudiantes, listaDocentes, listaUsuarios);
        } 
        
        
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
                System.out.print("Ingrese su matricula: ");
                noMatricula = input.next();
                //Añade el usuario creado a ambas listas
                listaDocentes.add(new Docente(username, password, name, lastName, noMatricula));
                listaUsuarios.add(listaDocentes.get(listaDocentes.size()-1));
            } 

            case "b"->{
                //Añade el usuario creado a ambas listas
                listaEstudiantes.add(new Estudiante(username, password, name, lastName));
                listaUsuarios.add(listaEstudiantes.get(listaEstudiantes.size()-1));
                for(int i=0; i<listaEstudiantes.size(); i++){
                    System.out.println(listaEstudiantes.get(i).getUsername());
                }
            }      
               
        } 
        
    }
 
} 