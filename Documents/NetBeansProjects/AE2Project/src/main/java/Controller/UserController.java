/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import DAO.UserDAO;
import java.util.HashMap;

/**
 *
 * Author     : khadija katanani
 */
public class UserController {    
     
     private static HashMap<String, User> users = UserDAO.initializeUsers();            

    // Add a new user
    public static boolean addUser(String username, String password, String email, double walletBalance, String role) {
        if (users.containsKey(username)) {
            return false; // User already exists
        }
        User newUser = new User(username, password, email, walletBalance, role);
        users.put(username, newUser);
        return true;
    }

    // Check if a username already exists
    public static boolean userExists(String username) {
        return users.containsKey(username);
    }

    // Get user by username
    public static User getUser(String username) {
        return users.get(username);
    }

    // For debugging or admin purposes (optional)
    public static HashMap<String, User> getAllUsers() {
        return users;
    }

}
