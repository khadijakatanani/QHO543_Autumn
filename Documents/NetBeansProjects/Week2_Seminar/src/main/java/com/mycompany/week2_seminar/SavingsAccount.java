/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_seminar;

/**
 *
 * @author Admin
 */
public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate, double balance, int accountNumber) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }
    
    @Override
    public void calculateInterest(){
        double interest = getBalance()*interestRate/100;
        balance += interest;
        System.out.println("Savings Account interest added: $" + interest);
    }
    public double getInterestRate(){
        return interestRate;
    }
    
    public void setInterestRate(double interestRate){
        if (interestRate>=0) {this.interestRate = interestRate;}
    }


    
    
}
