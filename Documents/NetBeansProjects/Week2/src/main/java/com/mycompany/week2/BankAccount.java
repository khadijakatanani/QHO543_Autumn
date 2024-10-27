/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2;

/**
 *
 * @author Admin
 */
public class BankAccount {

    private double balance = 50.00;
    private int bankAccount;

    public double deposit(double cash) {        
        
        if (cash > 0 ){
             balance += cash; // balance = balance + cash;
        } else{
            // return -1;
            System.out.println("Enter valid amount");
        }
        return balance;
    }

    public double withdraw(double cash) {
        
        if (cash <= balance){
           balance -= cash;
        } else{
            System.out.println("Your balance is not sufficient to withdraw that amount");
        }
        
        return balance;
    }

}
