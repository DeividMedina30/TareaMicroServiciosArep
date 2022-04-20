package edu.escuelaing.arep.usuario.entities;

public class Comment {
    public String user;
    public String body;
    public Comment(String user, String body){
        this.user = user;
        this.body = body;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUser() {
        return user;
    }

    public String getBody() {
        return body;
    }
}
