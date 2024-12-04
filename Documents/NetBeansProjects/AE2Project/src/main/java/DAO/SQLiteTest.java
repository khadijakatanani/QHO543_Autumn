/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteTest {

    public static void main(String[] args) {        
        
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:MyDB.db")) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
