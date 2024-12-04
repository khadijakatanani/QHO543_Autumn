/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Controller.ProductTypes.ProductType;
import Interface.ProductDAOInterface;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author deyanok
 */
public class ProductDAO implements ProductDAOInterface {

    @Override
    public void addProduct(Product product) {
        String sql = "INSERT INTO products (name, description, price, stock_quantity) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getStockQuantity());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product getProductById(int id) {
        String sql = "SELECT * FROM products WHERE product_id = ?";
        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Product(
                        resultSet.getInt("product_id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("stock_quantity")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getInt("product_id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("stock_quantity")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void updateProduct(Product product) {
        String sql = "UPDATE products SET name = ?, description = ?, price = ?, stock_quantity = ? WHERE product_id = ?";
        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getStockQuantity());
            statement.setInt(5, product.getProductId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int id) {
        String sql = "DELETE FROM products WHERE product_id = ?";
        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    // In-memory user store (username -> User object)
//    private static HashMap<String, Product> products = new HashMap();
//
//    public static HashMap<String, Product> initializeProducts() {
//
//        // Add productss to the HashMap
//        products.put("iphone14.jpg", new Product("iphone14", "iPhone 14", "Latest Apple smartphone", "iphone14.jpg", ProductType.SMARTPHONES, 20.00));
//        products.put("macbookair.jpg", new Product("macbookair", "MacBook Air M2", "Lightweight and powerful laptop", "macbookair.jpg", ProductType.LAPTOPS, 15.50));
//        products.put("ipadpro.jpg", new Product("ipadpro", "iPad Pro", "High-performance tablet with Apple Pencil support", "ipadpro.jpg", ProductType.TABLETS, 33.00));
//        products.put("applewatch.jpg", new Product("applewatch", "Apple Watch Series 8", "Advanced wearable with health monitoring", "applewatch.jpg", ProductType.WEARABLES, 12.90));
//        products.put("ps5.jpg", new Product("ps5", "PlayStation 5", "Next-generation gaming console", "ps5.jpg", ProductType.GAMING_CONSOLES, 32.12));
//        products.put("boseqc45.jpg", new Product("boseqc45", "Bose QC45", "Noise-cancelling audio headphones", "boseqc45.jpg", ProductType.AUDIO_DEVICES, 5.40));
//        products.put("nesthub.jpg", new Product("nesthub", "Google Nest Hub", "Smart display for home automation", "nesthub.jpg", ProductType.SMART_HOME_DEVICES, 23.00));
//        products.put("eosr5.jpg", new Product("eosr5", "Canon EOS R5", "Professional-grade camera for photography", "eosr5.jpg", ProductType.CAMERAS, 3.10));
//        products.put("ankerhub.jpg", new Product("ankerhub", "Anker USB-C Hub", "Versatile USB-C accessory", "ankerhub.jpg", ProductType.ACCESSORIES, 30.00));
//        products.put("dji_mavic3.jpg", new Product("dji_mavic3", "DJI Mavic 3", "Advanced drone for aerial photography", "dji_mavic3.jpg", ProductType.DRONES, 10.50));
//
//        return products;
//    }
}
