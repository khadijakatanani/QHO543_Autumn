/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.UserRepository;
import Entities.User;

/**
 *
 * @author Admin
 */
public class RegistrationController {

    public boolean register(String username, String email, String password) {
        if (UserRepository.userExists(username)) {
            System.out.println("Username already exists. Please choose a different one.");
            return false;
        }
        User newUser = new User(username, email, password);
        UserRepository.addUser(newUser);
        return true;
    }
}
