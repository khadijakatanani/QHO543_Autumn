/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.User;
import Entities.UserRepository;

/**
 *
 * @author Admin
 */
public class LoginManager {

    User user;

    public boolean validateLoginCredentials(String username, String password) {
        user = UserRepository.getUser(username);
        // Username exists and password matches
        // Store user 
        if (user != null && user.getPassword().equals(password)) {
            SessionManager.login(user);
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
        return true;
    }

    public User getCurrentUser() {
        return user;
    }
}
