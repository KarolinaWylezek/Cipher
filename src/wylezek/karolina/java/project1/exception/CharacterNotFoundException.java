/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.exception;

/**
 * My exception class created to verify whether the character can be encoded/decoded or not.
 * The class extends Exception class
 * 
 * @author Karolina Wylezek
 * @version 1.0
 * 
 */


public class CharacterNotFoundException extends Exception {
    /**
     * constructor that calls constructor of parent Exception class
     * 
     * @param message - String error message
     */
    public CharacterNotFoundException (String message){
        super(message);
    }
}
