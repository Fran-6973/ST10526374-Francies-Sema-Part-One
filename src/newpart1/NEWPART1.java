/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NEWPART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner UserInput = new Scanner(System.in);
         Login login= new Login();
         
        
       String name; 
       String userName;
       String userSurName;
       String phoneNumber;
       String password;
       
       String loginUserName;
       String loginPassword;
       
       //prompt user to enter their Name
        System.out.println("Please enter your name");
        name = UserInput.nextLine();
        //prompt user to enter their surname
         System.out.println("Please enter your surname");
        userSurName = UserInput.nextLine();
       
        
        //prompt user to enter their username using a while loop
        while(true){  
         //prompt user to enter their username
         System.out.println("Please enter your username");
         userName = UserInput.nextLine();
        
           if(Login.checkUserName(userName)){
                  System.out.println("Username successfully captured");
                  break; 
           } else {
                  System.out.println("Username is incorrect, please ensure that your username contains an underscore and is no longer than 5 characters");
                  
              }
             }
        
        while(true){
            System.out.println("Please enter your cell phone number using the South African international formatting starting with +27 ");
            phoneNumber = UserInput.nextLine();
              
            if(Login.checkCellPhoneNumber(phoneNumber)){
                System.out.println("cell phone number successfully entered");
                break;
            } else {
                
                System.out.println("Your cell phone number format is incorrect");
            System.out.println("Your cell phone number must start with the South African international formatting +27 ");
            
            }
           }
        
        
        while(true){
            System.out.println("Please enter your password");
            password = UserInput.nextLine();
            
             if(Login.checkPasswordComplexity(password)){
                 System.out.println("Password entered successfully");
                 break;
             } else {
                 System.out.println("Your password is incorrect");
                 System.out.println("Your password must have atleast 8 characters, a capital letter, a number and a special character");
             }
            }
        
        System.out.println("You have registered successfully");
        System.out.println("Welcome " + name + " " + userSurName);
        
        
      
        
        
        
        
        //LogIn
        System.out.println("");
        System.out.println("LogIN");
        
        System.out.println("Please enter your username");
        loginUserName = UserInput.nextLine();
        System.out.println("Please enter your password");
        loginPassword = UserInput.nextLine();
        
        
          boolean loginSuccessful = login.loginUser(userName, password, loginUserName, loginPassword);
        
        boolean usernameCorrect = Login.checkUserName(userName);
        boolean passwordCorrect = Login.checkPasswordComplexity(password);
        boolean cellphonenumberCorrect = Login.checkCellPhoneNumber(phoneNumber);
        
        System.out.println( login.registerUser(usernameCorrect, passwordCorrect, cellphonenumberCorrect)
        
        
        );
        
       System.out.println(
        login.returnLoginStatus(
                loginSuccessful,
                name,
                userSurName));
        
       
         UserInput.close();
        }
    
    
    }
    

