/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.view;

import java.util.Scanner;
import java.util.InputMismatchException;
import wylezek.karolina.java.project1.exception.CharacterNotFoundException;

/**
 * This class is used to print the queries and results in the console
 * 
 * @author Karolina Wylężek
 * @version 1.0
 */
public class CipherView {
    
    /**
     * The instance of class Scanner created to read the input from user
     */
    Scanner scannedText = new Scanner(System.in);
    
   /**
    * this method is resposible for reading the text to encode/decode or the keyword from user; 
    * it also handle the InputMismatchException
    * @return text that was read from user
    */
    public String sentence(){
        boolean badinput = false;
        String text = null;
        do {try{
            text = scannedText.nextLine();  
            }catch (InputMismatchException e) {
                System.out.println("Wrong input");
                badinput = true;
            }finally{
                badinput = false;
            }
        }while(badinput == true);
        
        return text;
    }
    
    /**
     * asks the user about the text to encode or decode or 
     * inform that the data given by user is invalid and request the valid data
     * 
     * @param chosen of type int; the chosen by user operation (1 - encoding/ 2 - decoding)
     */
    
    public void operation (int chosen){
        if(chosen == 1)
            System.out.println("Type the text that you want to encode: ");
            
        else if(chosen == 2)
            System.out.println("Type the text that you want to decode: ");
        
        else
            System.out.println("Invalid data. Please choose 1 or 2");
    }
    
    /**
     * this method prints the keyword request
     */
    public void keyword() {
        System.out.println("Type the keyword whose presence in decrypted text you want to check: ");
    }
    
    /**
     * prints the result of searching the keyword
     * 
     * @param isPresent is true when the keyword was found and false when it wasn't
     * @param keyword the keyword that the program was looking for 
     */
    public void isKeyword(boolean isPresent, String keyword){
        if(isPresent)
            System.out.println("The keyword " +keyword + " is present in decrypted sentence.");
        else
            System.out.println("The keyword " +keyword + " is not present in decrypted sentence.");
    }
    
    /**
     * prints the result of coding/decoding operation
     * 
     * @param readyText of type String; the encoded/decoded text to be printed
     * @param chosen of type int; the chosen by user operation (1 - encoding/ 2 - decoding)
     */
    
    public void result(String readyText, int chosen){
        if(chosen == 1)
        System.out.println("Coded text : " + readyText);
        
        else if(chosen ==2)
            System.out.println("Decoded text : " + readyText);
    }
    
    /**
     * this method prints message about wrong shift given (NumberFormatException)
     */
    
    public void errorShift(){
        System.err.println("Wrong shift given");
    }
    
    /**
     * this method prints message about wrong input (NumberFormatException)
     */
    
    public void errorInput(){
         System.err.println("Wrong input given");
    }
    
    /**
     * this method prints message about too few arguments in []args (ArrayIndexOutOfBoundsException)
     */
    
    public void errorArgs(){
         System.err.println("Too few arguments in []args");
    }
    
    /**
     * this method prints message about wrong symbol in text to encode/decode (CharacterNotFoundException)
     * @param ex of CharacterNotFoundException type, lets us print the message and the symbol that caused the problem
     */
    
    public void errorCharacter(CharacterNotFoundException ex){
        System.err.print(ex);
    }
   
}
