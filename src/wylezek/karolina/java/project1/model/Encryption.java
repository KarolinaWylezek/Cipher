/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.model;

/**
 * This class is responsible for encryption of the text
 * 
 * @author Karolina Wylezek
 * @version 1.0
 */
public class Encryption {
    
    /**
     * the instance of StringBuilder class that lets us use the methods of this class
     */
    
    StringBuilder encrypted = new StringBuilder();
    
    /**
     * tmp is the field that stores the ascii number of character that we want to move
     * position is the field that stores the ascii number of the character after shifting it by specified key
     * 
     */
    int position, tmp;
    
    /**
     * stores the new character after encryption
     */
    char newChar ;
    
    /**
     * this method takes the given text and encrypt it using given key
     * 
     * @param text is of string type; the text that the function will encode
     * @param key is of int type; the shift that the program will use to encode the text
     * @return the method returns the encrypted text 
     */
    
    
    public StringBuilder encrypt(String text, int key){
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                encrypted.append(' ');
            }
            
            else{
                
                if(Character.isUpperCase(text.charAt(i))){
                    tmp = (int)(text.charAt(i));
                    position = (((tmp - 65) + key)%26);
                    newChar = (char)(position + 65);
                    encrypted.append(newChar);
                }
                
                else{
                    tmp = (int)(text.charAt(i));
                    position = (((tmp - 97) + key)%26);
                    newChar = (char)(position + 97);
                    encrypted.append(newChar);
                }
            }
        }
        
        
        return encrypted;
    }
}

