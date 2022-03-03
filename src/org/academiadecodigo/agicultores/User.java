package org.academiadecodigo.agicultores;

public class User {

    private String user;
    private String pw;

    public User(String user,String pw) {
        this.user=user;
        this.pw=pw;
    }

    public String getPw() {
        return pw;
    }

    public String getUser() {
        return user;
    }
}
