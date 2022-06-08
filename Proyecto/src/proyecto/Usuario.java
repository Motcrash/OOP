package proyecto;

import java.io.Serializable;


public class Usuario implements Serializable{
    
    private String username, password, name, lastName;
    
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

} 