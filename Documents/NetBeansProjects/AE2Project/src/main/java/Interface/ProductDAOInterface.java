/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.Product;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductDAOInterface {
    
    // Add a new product
    void addProduct(Product product) throws SQLException;

    // Retrieve a product by ID
    Product getProductById(int id) throws SQLException;

    // Retrieve all products
    List<Product> getAllProducts() throws SQLException;

    // Update an existing product
    void updateProduct(Product product) throws SQLException;

    // Delete a product by ID
    void deleteProduct(int id) throws SQLException;
}
