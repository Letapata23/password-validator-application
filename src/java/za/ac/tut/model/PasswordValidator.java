/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import za.ac.tut.Exceptions.InvalidPasswordException;

/**
 *
 * @author Letap
 */
public class PasswordValidator {
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }
    
    public String validatePassowrd() throws InvalidPasswordException{

        String message = "";
        
        // Check password length
        if(checkPasswordLength()){
            // Check letters
            if(checkLetters()){
                // Check special characters
                if(checkSpecialChars()){
                    message = "The password " + this.password + " is valid";
                }
            }
        }
        return message;
    }
    
    private boolean checkPasswordLength() throws InvalidPasswordException{
        boolean isValid = false;
                     
        if(this.password.length() >= 10){
            isValid = true;
        }
        else{
            throw new InvalidPasswordException("The password must at least be 10 characters long!");
        }
        return isValid;
    }
    
    private boolean checkLetters() throws InvalidPasswordException{
        boolean lettersValid = false;
        int numUpperCase = 0;
        int numLowerCase = 0;
        
        // Count the number of uppercase and lowercase letters
        for(char c: this.password.toCharArray()){
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    numUpperCase += 1;
                }
                else if(Character.isLowerCase(c)){
                    numLowerCase += 1;
                }
            }   
        }
        
        if(numUpperCase >= 2 && numLowerCase >=2){
            lettersValid = true;
        }else{
            throw new InvalidPasswordException("The password must contained at least two uppercase letters and two lowercase letters!");
        }
        
        return lettersValid;
    }
    
    private boolean checkSpecialChars() throws InvalidPasswordException{
        boolean specialCharsValid = false;
        
        char[] specialChars = {'!', '$', '%', '^', '&', '*', '(', ')', '_', '<', '>', '?'};
    
        if(checkUnwantedChars()){
            throw new InvalidPasswordException("The # and @ characters are not allowed in the password");
        }
        
        for(int i=0;i<this.password.length();i++){
            char passwordChar = this.password.charAt(i);
            
            // Check the password character in the array of special characters
            for(int j=0;j<specialChars.length;j++){
                if(passwordChar == specialChars[j]){
                    specialCharsValid = true;
                }
            }

        }
        
        if(specialCharsValid == false){
            throw new InvalidPasswordException("There must be at least one special character in the password");
        }
        
        return specialCharsValid ;
    }
   
    private boolean checkUnwantedChars(){
        boolean foundUnwanted = false;
        
        for(char c:this.password.toCharArray()){
            if(c == '#'){
                foundUnwanted = true;
            }else if( c == '@'){
                foundUnwanted = true;
            }
        }
        return foundUnwanted;
    }
    

     
}
