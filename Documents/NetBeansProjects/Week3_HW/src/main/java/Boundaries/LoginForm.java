/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boundaries;

import Controllers.LoginManager;
import Entities.User;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LoginForm {

    private LoginManager loginmanager = new LoginManager();

    public boolean validateUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        return loginmanager.validateLoginCredentials(username, password);
    }

    public User getCurrentUser() {
        return loginmanager.getCurrentUser();
    }

}
