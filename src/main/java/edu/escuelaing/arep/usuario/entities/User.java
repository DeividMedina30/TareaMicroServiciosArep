package edu.escuelaing.arep.usuario.entities;

public class User {
    private String password;
    private String correo;

    public User(String correo, String password){
        this.correo = correo;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}