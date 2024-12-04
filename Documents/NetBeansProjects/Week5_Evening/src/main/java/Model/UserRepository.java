/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import java.util.HashMap;

/**
 *
 * @author Admin
 */

public class UserRepository {

    private static HashMap<String, User> users = new HashMap<>();

    public static void initializeAllUsers()
    {
        users.put("john_doe", new User("john_doe", "john@example.com", "password123"));
        users.put("jane_smith", new User("jane_smith", "jane@example.com", "mypassword"));
        users.put("alex_lee", new User("alex_lee", "alex@example.com", "alexPass2023"));
        users.put("emma_jones", new User("emma_jones", "emma@example.com", "emmaSecure!"));
        users.put("chris_evans", new User("chris_evans", "chris@example.com", "chris_007"));
    }

    public static void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public static User getUser(String username) {
        return users.get(username);
    }

    public static boolean userExists(String username) {
        return users.containsKey(username);
    }
}
