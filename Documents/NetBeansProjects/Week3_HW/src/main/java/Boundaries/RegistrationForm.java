/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boundaries;
import Controllers.RegistrationManager;
import Controllers.SessionManager;
import Entities.User;
import Entities.UserRepository;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class RegistrationForm {
    private RegistrationManager registrationmanager = new RegistrationManager();

    public boolean registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();       
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        return registrationmanager.register(username, email, password);
    }
    
    public boolean isLoggedIn() {
        return registrationmanager.isLoggedIn();
    }
}
