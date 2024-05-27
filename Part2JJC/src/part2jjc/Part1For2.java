/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2jjc;

import java.util.Scanner;


/**
 *
 * @author lab_services_student
 */
public class Part1For2 {
 public static Scanner brain = new Scanner(System.in);
 public static String usernameLogin;
 public static String passwordLogin;
 public static String nameLogin;
 public static String surnameLogin;
 public static boolean usableUsername;
 public static boolean usablePassword;
 public static Login lgn = new Login();
 public static String message;
 public static boolean finalResult = false;
    
    public static void main(String[] args) {
       mainMenu();
    }
    public static void mainMenu()
    {
        System.out.println("PART 1 - BEGIN");
        //sleep
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
}
        int choice;
       do {
            System.out.println("Main Menu");
            System.out.println("#################################");
            System.out.println("Enter 1 for Instructions");
            System.out.println("Enter 2 for Login");
            System.out.println("Enter 3 for Registration");
            choice = brain.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Instructions coming..."); break;
                case 2: loginUser(); break;
                case 3: registerUser(); break;
                case 0: System.exit(0); break;
                default: System.out.println("Invalid value \n" + "Please choose one of the avalible options in the");
                    
            }
       }while(choice != 0 || finalResult == true);
    }
    public static void registerUser()
    {
        boolean passwordComplexity = false;
        String userName;
        String password;
        String firstName;
        String surName;
        do{
            usableUsername = lgn.checkUsername();
            if (!usableUsername){
             message = lgn.registerUser(0);
                System.out.println(message);
            }
        }while(!usableUsername);
       
        
        do{
          passwordComplexity = lgn.checkPassword();
           if (!passwordComplexity){
             message = lgn.registerUser(1);
               System.out.println(message);
            }
        }while(!passwordComplexity);
        System.out.println("Now enter your real name");
        firstName = brain.nextLine();
        System.out.println("Now enter your surname");
        surName = brain.nextLine();
        nameLogin = firstName;
        surnameLogin = surName; 
        message = lgn.registerUser(2);
        System.out.println(message);
    }
    public static void loginUser()
    {
        System.out.println("Enter a registered username");
        brain.nextLine();
        String usernameCheck = brain.nextLine();
        System.out.println("Enter the corrosponding password");
        String passwordCheck = brain.nextLine();
        finalResult = lgn.loginUser(usernameCheck, passwordCheck);
        message = lgn.returnLoginStatus(finalResult, nameLogin, surnameLogin);
        System.out.println(message);
    }
    
}
/*
references:
name --
Develepor info:
Julian Correa
ST10438910
st10438910@vcconnect.edu.za
*/