/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShoppingBasket;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author deyanok
 */
public class ShoppingCartManager {
    
    private static ShoppingCartManager instance;
    private Map<String, Integer> cart;
    
    private ShoppingCartManager() {
        cart = new HashMap<>();
    }
    
    // ensures thread safety, 
    // it prevents multiple threads from simultaneously executing the getInstance() method
    public static synchronized ShoppingCartManager getInstance() {
        if (instance == null) {
            instance = new ShoppingCartManager();
        }
        return instance;
    }
    
    
    public void addItem(String productId, int quantity) {
        cart.put(productId, cart.getOrDefault(productId, 0) + quantity);
    }

    // Remove item from the cart
    public void removeItem(String productId) {
        cart.remove(productId);
    }

    // Get cart details
    public Map<String, Integer> getCart() {
        return cart;
    }
    
}
