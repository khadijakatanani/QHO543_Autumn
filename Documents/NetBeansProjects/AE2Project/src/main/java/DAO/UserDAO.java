/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.util.HashMap;

/**
 *
 * Author     : khadija katanani
 */
public class UserDAO {

    // In-memory user store (username -> User object)
    private static HashMap<String, User> users = new HashMap();

    public static HashMap<String, User> initializeUsers() {

        users.put("john_doe", new User("john_doe", "password123", "john.doe@example.com", 100.50, "admin"));
        users.put("jane_smith", new User("jane_smith", "securepass", "jane.smith@example.com", 200.75, "user"));
        users.put("bob_jones", new User("bob_jones", "qwerty123", "bob.jones@example.com", 50.0, "admin"));
        users.put("alice_brown", new User("alice_brown", "alicepass", "alice.brown@example.com", 300.25, "user"));
        users.put("michael_green", new User("michael_green", "michaelpass", "michael.green@example.com", 120.00, "user"));
        users.put("emily_white", new User("emily_white", "emilypass", "emily.white@example.com", 450.10, "user"));
        users.put("david_black", new User("david_black", "david", "david.black@example.com", 75.35, "user"));

        return users;
    }
}
