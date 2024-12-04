/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnection {
    // Database connection details
    private static final String DB_URL = "jdbc:sqlite:AE2ProjectDB.db";
    //private static final String DB_USER = "your_username";
    //private static final String DB_PASSWORD = "your_password";

    // Establish database connection
    public static Connection getConnection() throws SQLException {
        //return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        return DriverManager.getConnection(DB_URL);
    }
}
