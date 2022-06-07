package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Proyecto {
    static Scanner input = new Scanner(System.in);
    static String user, password, username, lastName, name;

    public static void main(String[] args) {

        
        ArrayList <Usuario> listaUsuarios = new ArrayList();
        listaUsuarios.add(new Usuario("Jorge","hola","djewofew","wedfhebw"));
        String option;
        boolean error = false;
        int users = 2;

        System.out.println("\t\tSII");
        System.out.println();
        System.out.println("Seleccione una opción: \n a) Inicie sesión \t b) Crear usuario");
        option = input.next();
        while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b")){
            System.out.println("Elija una opción válida");
            option = input.next();
        }


        switch(option.toLowerCase()){
            case "a"->{
                boolean userExists = false;
                do{
                System.out.print("Ingrese su nombre de usuario: ");
                username = input.next();
                System.out.print("Ingrese su contraseña: ");
                password = input.next();
                
                for (int i=0; i<listaUsuarios.size(); i++) {
                    if(username.equalsIgnoreCase(listaUsuarios.get(i).getUsername()) && password.equals(listaUsuarios.get(i).getPassword())){
                        userExists=true;
                        System.out.println("Sesión iniciada exitosamente"); 
                        System.out.println();
                    }else{
                        System.out.println("Usuario y/o contraseña incorrectos");
                        System.out.println();
                    }    
                
                }
                    
               }while(userExists == false);
            } 
              

            case "b"->{
                    createUser(listaUsuarios);
               
            }
              
               
        }
        
    }

    public static void createUser(ArrayList listaUsuarios) {
        System.out.println();
        System.out.print("Ingrese su nombre de usuario: ");
        username = input.next();
        System.out.print("Ingrese su contraseña: ");
        password = input.nextLine();
        System.out.print("Ingrese sus nombres: ");
        name = input.next();
        System.out.print("Ingrese sus apellidos: ");
        lastName = input.next();

        listaUsuarios.add(new Usuario(username, password, name, lastName));
    }

}




/*for (int i=0; i<listaUsuarios.size(); i++) {
    if(username.equalsIgnoreCase(listaUsuarios.get(i).getUsername())){
        if(password.equals(listaUsuarios.get(i).getPassword())){
            System.out.println("Sesión iniciada exitosamente");
        }else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }
    }else{
        System.out.println("Usuario y/o contraseña incorrectos");
    }*/

    /*for(Usuario usuarios:listaUsuarios){
        if(username.equalsIgnoreCase(usuarios.getName()) && password.equals(usuarios.getPassword())){
            userExists = true;
            System.out.println("Sesión iniciada exitosamente");
            break;
        }else{
            userExists=false;
        }
    } */