/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.Exceptions;

/**
 *
 * @author Letap
 */
public class InvalidPasswordException extends RuntimeException{
    
    public InvalidPasswordException(String message){
        super(message);
    }
}
