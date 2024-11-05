/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Entities.User;

/**
 *
 * @author Admin
 */
public class SessionManager {

    private static User currentUser = null;

    // Set the logged-in user in the session
    public static void login(User user) {
        currentUser = user;
    }

    // Logout and clear the session
    public static void logout() {
        currentUser = null;
    }

    // Get the current user in the session
    public static User getCurrentUser() {
        return currentUser;
    }

    // Check if there is a logged-in user
    public static boolean isLoggedIn() {
        return currentUser != null;
    }
}
