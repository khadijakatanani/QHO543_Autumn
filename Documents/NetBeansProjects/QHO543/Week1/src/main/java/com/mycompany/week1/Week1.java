/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1;
import java.util.Scanner;


/**
 *
 * @author Khadijaaa
 */
public class Week1 {

    public static void main(String[] args) {          
        
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Please type a value between 1 and 25 inclusive:");
        int number = scanner.nextInt(); 
        
        while (number<0 || number>25 ){
            System.out.print("Please type a value between 1 and 25 inclusive:");
            number = scanner.nextInt();            
        }
       
        if (number % 2 == 0){
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
        
        
        if (number > 0){
            System.out.println("The number is positive");           
        } else if (number < 0){
            System.out.println("The number is negative");
            
        } else {
            System.out.println("The number is zero");
        } 
    }
}
