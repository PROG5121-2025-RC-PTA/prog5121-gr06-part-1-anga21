/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.application_login;

/**
 *
 * @author ANGAHO VENUS
 */
import java.util.Scanner;

public class APPLICATION_LOGIN {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your South African Number Phone");
            String phoneNumber =scanner.nextLine();
                    System.out.println();
        System.out.print("Enter a five letter name with an underscore"); 
            String inputName=scanner.nextLine();
                    System.out.println();
        System.out.print("Enter your preffered password");
            String password = scanner.nextLine();
          
        
        if(isValidPassword(password)){
         System.out.println("Password succesfuly captured");
        }else{ 
            System.out.println("Password is not correctly formatted;"
                    + "please ensure that the password contains at least"
                    + " eight characters,a capital letter, a number and special character ");
        }
        if (isValidPhoneNumber(phoneNumber)){
         System.out.println("Phone number is valid");
        }else{
        System.out.println("Phone number is not valid");
       
       } 
        
         if(isValidName(inputName)){
            System.out.println("valid Surname");
        }else{
            System.out.println("SURNAME IS NOT VALID");
        }

        
    }
    public static boolean isValidPassword(String password){
       
   
        if(password.length()<8)return false;
         
        boolean hasUppercase=false;
        boolean hasNumber=false;
        boolean hasSpecialChar=false;
        
        for(var c:password.toCharArray()){
         
        if(Character.isUpperCase(c))hasUppercase=true;
         else if (Character.isDigit(c))hasNumber = true;
         else if (!Character.isLetterOrDigit(c))hasSpecialChar=true;
         
         }
        return hasUppercase && hasNumber && hasSpecialChar ;
  
    
}
    
     public static boolean isValidPhoneNumber(String phoneNumber){
                return phoneNumber.matches("0\\d{9}");

} 
 public static boolean isValidName(String name){
    if(name.length()==5 && name.contains("_")){
        return true;
    }else{
        return false;
    }
}}

