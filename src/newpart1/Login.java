/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpart1;

/**
 *
 * @author User
 */
public class Login {
    
                                         //checkPassword Method
       public static boolean checkPasswordComplexity(String Password){
       if(Password.length() < 8 ){
       return false;
       }
       boolean hasCapitalLetter = false;
       boolean specialCharacter = false;
       boolean hasNumber = false;
       
       for(int i = 0; i < Password.length(); i++){
       char chPassword = Password.charAt(i);
       
         if(Character.isUpperCase(chPassword)){
             hasCapitalLetter = true;
         }
       if(Character.isDigit(chPassword)){
        hasNumber = true;
       }
       if(!Character.isLetterOrDigit(chPassword))
           specialCharacter = true;
       }
       
       return hasCapitalLetter &&  specialCharacter &&  hasNumber;
       }
       
       
                                  //checkUserName Method
       public static boolean checkUserName(String userName){
        return userName.contains("_") && userName.length() <= 5;
       }
       
       
                             //CheckPhoneNumber
       public static boolean checkCellPhoneNumber (String phoneNumber) {
       
       return phoneNumber.matches("^\\+27\\d{9}$");
        }
      
       public boolean loginUser(String registeredUserName, String registeredPassword, String loginUserName, String loginPassword) {
           
       return registeredUserName.equals(loginUserName) && registeredPassword.equals(loginPassword);
       
       }
       
       
       
       
       /**
 * Returns the correct login message.
 *
 * @param loginSuccessful true if login details are correct
 * @param name user's first name
 * @param userSurName user's surname
 * @return login status message
 */
       
                                        //Return Login Status
       public String returnLoginStatus
               ( boolean loginSuccessful, String name, String userSurName){
               
               
       if (loginSuccessful) {
       return "Welcome" + name + " " + userSurName + " " + " Welcome back";
        }else{
       return "Username or password incorrect, please try again";
       
       }
       }
               
               
               
               //RegisterUser
               public String registerUser(boolean usernameCorrect,
                           boolean passwordCorrect,
                           boolean phoneNumberCorrect) {

    if (!usernameCorrect) {

        return "Username is not correctly formatted.";

    } else if (!passwordCorrect) {

        return "Password does not meet the complexity requirements.";

    } else if (!phoneNumberCorrect) {

        return "Cell phone number is incorrectly formatted.";

    } else {

        return "User logged in successfully.";
    }
}
       }
