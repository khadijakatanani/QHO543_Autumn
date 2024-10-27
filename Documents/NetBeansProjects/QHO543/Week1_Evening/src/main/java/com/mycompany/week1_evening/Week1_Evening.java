/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.week1_evening;

import java.util.Scanner;

/**
 *
 * @author weekend Khadija
 */
public class Week1_Evening {

    String loginName, password;
    String age;
    boolean isSaved;

    public static void main(String[] args) {
        
        Week1_Evening week1 = new Week1_Evening();        
        week1.scannerExercise();      

    }

    private void scannerExercise() {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        loginName = scanner.next();

        System.out.println("Type your password: ");
        password = scanner.next();

        System.out.println("Type your age: ");
        age = scanner.next();

        float castAge = Float.parseFloat(age);

        System.out.println("Student name " + loginName + " with age " + castAge + "!");

        if (loginName.equals("Khadija") && password.equals("Solent")) {
            System.out.println("Sign in successful!");
        } else {
            System.out.println("Sign in failed!");
        }

        int i = 1;

        while (i < 11) {
            System.out.println("Square of number " + i + " is " + i * i);
            i++;
            
        }
    
    
    
    }
}
