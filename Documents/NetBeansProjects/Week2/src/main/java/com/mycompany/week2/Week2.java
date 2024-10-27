/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Week2 {

    public static void main(String[] args) {
        
        Circle circle = new Circle(20);
        circle.setArea(35);
        
        System.out.println(circle.getArea());
        
        //circle.setRadius(50);
        System.out.println(circle.getRadius());
        
        Rectangle rectangle = new Rectangle(20, 50);
        
        System.out.println(rectangle.getHeight());

 
        
        
        
        BankAccount bankAccount = new BankAccount();
        double finalBalance = bankAccount.deposit(40);
        System.out.println(finalBalance);
        
        finalBalance = bankAccount.withdraw(60);
        System.out.println(finalBalance);  
               
        Person person = new Person();
        person.name = "Khadija";
        person.age = 25;
        
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
