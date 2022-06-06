package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList <Usuario> listaUsuarios = new ArrayList();
        
        String user, password, option;
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
            case "a": 
                /*System.out.print("Ingrese su nombre de usuario: ");
                Usuario = input.next();
                System.out.print("Ingrese su contraseña: ");
                password = input.next();*/
                break;

            case "b": 
                createUser(listaUsuarios);
                System.out.println(listaUsuarios.get(0).getUsername());
                System.out.println(listaUsuarios.get(1).getUsername());
                break;
               
        }
        
    }

    
    public static void createUser(ArrayList listaUsuarios){

        listaUsuarios.add(new Usuario("Juan", "$asdqs321", "Juan", "Perez"));
        listaUsuarios.add(new Usuario("Juadadada", "$asdqs321", "Juan", "Perez"));

        /*System.out.println();
        System.out.print("Ingrese su nombre de usuario: ");
        Usuario.setUsername = input.next();
        System.out.print("Ingrese su contraseña: ");
        Usuario.setPassword = input.next();
        System.out.print("Ingrese sus nombres: ");
        name = input.next();
        System.out.print("Ingrese sus apellidos: ");
        lastName = input.next();*/
    }
}
