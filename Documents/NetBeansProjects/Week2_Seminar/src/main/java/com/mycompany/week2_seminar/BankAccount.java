/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_seminar;

/**
 *
 * @author Admin
 */
abstract class BankAccount {
    
    protected double balance;
    private int accountNumber;

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    public void deposit(double amount){
        if (amount >= 0){
            balance += amount;
        } else{
            System.out.println("Amount to deposit cannot be negative value!");
        }
    }
 
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;            
        }else{
            System.out.println("Insufficient balance...");
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
     public abstract void calculateInterest();
    
    
    
}
