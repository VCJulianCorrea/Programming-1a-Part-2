/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2jjc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static part2jjc.Part1For2.brain;

public class Login {
    public String message;
    public String usernameClass;
    public String passwordClass;
    public static Scanner search = new Scanner(System.in); 
    public boolean checkUsername(){
        boolean checkMaker;
        System.out.println("Please enter a username with the following: \n" + "*min of 5 characters \n" + "*no '_'");
        usernameClass = search.nextLine();
        checkMaker = usernameClass.contains("_") && usernameClass.length() <= 5;
        if (!checkMaker)
        {
            usernameClass = "";
        }

      return checkMaker;
    } 
    public boolean checkPassword()
    {
     boolean checkPasswordComplexity;   
     System.out.println("Create a password that has the following: \n"
                    + "*one number \n"
                    + "*one uppercase \n"
                    + "*one special character[@#!$] \n"
                    + "*min of eight characters");
            brain.nextLine();
            passwordClass = brain.nextLine();
            Pattern specialPattern = Pattern.compile("[^A-z0-9]");
            Pattern digitPattern = Pattern.compile("[0-9]");
            Pattern capsPattern = Pattern.compile("[A-Z]");
            Matcher specialMatcher = specialPattern.matcher(passwordClass);
            Matcher digitMatcher = digitPattern.matcher(passwordClass);
            Matcher capsMatcher = capsPattern.matcher(passwordClass);
            checkPasswordComplexity = passwordClass.length() >=8
                    && specialMatcher.find()
                    && digitMatcher.find()
                    && capsMatcher.find();
            if(!checkPasswordComplexity)
            {
               passwordClass = "";
            }
        return checkPasswordComplexity;
    }
    public String registerUser(int help)
    {

        switch(help){
            case 0:message = "XXInvalid usernameXX \n" + "Please look at the requirements and try again :("; break;
            case 1:message = "XXPassword is not compatible with this systemXX \n"
                        + "Please change things to"; break;
            case 2:message = "Your account is complete! Please enjoy you new account :)"; break;
        }
        return message;
    }
    public boolean loginUser(String loginUser, String loginPassword)
    {
      boolean loginResult;
      if (loginUser.equals(usernameClass) && loginPassword.equals(passwordClass))
      {
       loginResult = true;
      } else{
       loginResult = false;   
      }
      return loginResult;
    }
    public String returnLoginStatus(boolean result, String nameLogin, String surnameLogin)
    {
        String theEnd;
        if (result = true)
        {
         theEnd = "Congragulations, " + nameLogin + " " + surnameLogin + " ! You have successfully logged in! \n" + "PART 1 - COMPLETE";            
        }else {
         theEnd = "Your username or password is incorrect... Please contact management and try again";   
        }
        return theEnd;
    }
    
}
