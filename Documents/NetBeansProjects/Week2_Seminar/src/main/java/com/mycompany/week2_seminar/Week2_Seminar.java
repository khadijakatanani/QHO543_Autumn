/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week2_seminar;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Week2_Seminar {

    static Currency currency;
    public static void main(String[] args) {
        
        currency = Currency.getInstance(Locale.UK);
        Week2_Seminar activities = new Week2_Seminar();
        activities.accountActivities();
    }

    private void accountActivities() {
        
        //CurrentAccount currentAccount = new CurrentAccount(100, 500,123456);
        //SavingsAccount savingsAccount = new SavingsAccount(100, 500, 123456);
        BankAccount currentAccount = new CurrentAccount(100, 500,123456);
        BankAccount savingsAccount = new SavingsAccount(100, 500, 123456);
                 
        
        // below is when the BankAccount was not abstract
        //BankAccount account = new BankAccount(100, 124587);
        
        //double balance = account.getBalance();
        // System.out.println(balance);
        
        //account.deposit(100);
        //balance = account.getBalance();
        //System.out.println("After depositting: " + currency.getSymbol() + balance);
        
        //account.withdraw(300);
        //System.out.println("After withdrawing: £" + balance);
        
        
         }
}
