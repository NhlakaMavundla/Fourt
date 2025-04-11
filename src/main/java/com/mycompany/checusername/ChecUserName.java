/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checusername;

/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;
public class ChecUserName {

        public static boolean checkUserName(String username) {
        // Username must contain an underscore and be no more than 5 characters long
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        
        
          Scanner scanner = new Scanner(System.in);

      // Capture user's first and last name
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        // User registration
       // String username;
        while (true) {
            System.out.println("Enter username:");
           String username = scanner.nextLine();
            if (checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            }
        }

        
    }
}//End of class
