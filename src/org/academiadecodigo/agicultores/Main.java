package org.academiadecodigo.agicultores;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner user = new StringInputScanner();
        user.setMessage("Login:");
        PasswordInputScanner pw = new PasswordInputScanner();
        pw.setMessage("Password:");

        String vUser = prompt.getUserInput(user);
        String vPw = prompt.getUserInput(pw);

        login.verify(vUser,vPw);
    }

}
