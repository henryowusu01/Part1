/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author henry
 */
public class Main {//open main class
      public static void main(String[] args) {
      
          Scanner input = new Scanner(System.in);
          login user = new login(); //we are creating a new object to implement in the code
          
          System.out.println("Enter username");
          String name = input.nextLine();
          user.loginUser( name );
      }
       public static void main(String[] args) {
           
        password IN = new password();// we are creating a new object to implement in the code
        Scanner pass = new Scanner(System.in);

        System.out.print("Enter your password");
        String password = pass.nextLine();

        boolean Complex;
          Complex = password.pass;

        if (Complex) {
            System.out.println("Password sucessfully captured!");
        } else {
            System.out.println("password is not correctly formatted,please ensure your password contains at lest 8 charcaters,a capital letter,a number, a special character");
        }
}
}
        

   

      
          
         
   
    
