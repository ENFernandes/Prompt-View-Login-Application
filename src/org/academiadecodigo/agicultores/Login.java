package org.academiadecodigo.agicultores;

import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;

import java.util.ArrayList;
import java.util.List;

public class Login {
    private List<User> users = new ArrayList<>();

    public Login() {
        users.add(new User("Elder","pw"));
    }

    public void add(String user, String pw){
        users.add(new User(user,pw));
    }

    public void verify(String name, String pwd){
        for (User c:users) {
            if(c.getUser().equals(name)&& c.getPw().equals(pwd)) {
                System.out.println("God");
                return;
            }
            System.out.println("Erro");
        }

    }
}
