/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.week3_hw;

import Boundaries.RegistrationForm;
import Entities.UserRepository;
import Entities.User;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Week3_HW {

    public static void main(String[] args) {
        UserRepository.initializeAllUsers();
        Scanner scanner = new Scanner(System.in);

        // initial menu
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Reset Password");
            System.out.println("4. Update Profile");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: // register
                    RegistrationForm registrationForm = new RegistrationForm();
                    if (registrationForm.registerUser()) {
                        System.out.println("Registration successful. You need to login.");
                    }
                    break;
                case 2: // login
                    break;
                case 3: // reset password
                    break;
                case 4: // update profile
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
