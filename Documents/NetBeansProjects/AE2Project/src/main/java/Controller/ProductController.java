/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ProductDAO;
import Model.Product;
import java.util.List;

/**
 *
 * @author deyanok
 */
public class ProductController {

    private final ProductDAO productDAO;

    // Constructor initializes the DAO implementation
    public ProductController() {
        this.productDAO = new ProductDAO();
    }

    // Add a new product
    public String addProduct(Product product) {
        if (product == null || product.getName() == null || product.getPrice() <= 0) {
            return "Invalid product data!";
        }

        try {
            productDAO.addProduct(product);
            return "Product added successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error adding product: " + e.getMessage();
        }
    }

    // Update an existing product
    public String updateProduct(Product product) {
        if (product == null || product.getProductId() <= 0 || product.getName() == null || product.getPrice() <= 0) {
            return "Invalid product data!";
        }

        try {
            productDAO.updateProduct(product);
            return "Product updated successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error updating product: " + e.getMessage();
        }
    }

    // Select a product by its ID
    public Product getProductById(int productId) {
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID!");
        }

        try {
            return productDAO.getProductById(productId); 
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }

    // Select all products
    public List<Product> getAllProducts() {
        try {
            return productDAO.getAllProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Delete a product
    public String deleteProduct(int productId) {
        if (productId <= 0) {
            return "Invalid product ID!";
        }
        try {
            productDAO.deleteProduct(productId);
            return "Product deleted successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error deleting product: " + e.getMessage();
        }
    }

}
