/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2_seminar;

/**
 *
 * @author Admin
 */
public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit, double balance, int accountNumber) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit >= 0) {
            this.overdraftLimit = overdraftLimit;
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest in the Current account");
    }

}
