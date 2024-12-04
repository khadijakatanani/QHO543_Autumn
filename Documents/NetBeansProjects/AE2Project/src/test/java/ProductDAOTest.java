/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Controller.ProductController;
import DAO.ProductDAO;
import Model.Product;

/**
 *
 * @author Admin
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDAOTest {

    private ProductController productController;    

    @Test
    void testAddProduct() {
        productController = new ProductController();
        // Arrange
        Product product = new Product("Test Product 3", "Description 3", 99.99, 10);
        
        // Act
        String result = productController.addProduct(product);

        // Assert
        assertEquals("Product added successfully!", result);
        System.out.println(result);
        
    }

   
}
