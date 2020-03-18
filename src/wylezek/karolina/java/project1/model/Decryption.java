/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.model;

/**
 *This class is responsible for decryption of the encrypted text
 * 
 * @author Karolina Wylezek
 * @version 1.0
 */
public class Decryption {
    
    /**
     * the instance of StringBuilder class that lets us use the methods of this class
     */
    StringBuilder decrypted = new StringBuilder();
    
    /**
     * stores the new character after decryption
     */
    char newChar;
    
    /**
     * tmp is the field that stores the ascii number of character that we want to move
     * position is the field that stores the ascii number of the character after shifting it by specified key
     */
    int tmp, position;
    
    /**
     * this method takes the given encrypted text and decrypt it using given key
     * 
     * @param text is of string type; the coded text that the function will decode
     * @param key is of int type; the shift that the program will use to decode the text
     * @return the method returns the decrypted text 
     */
    
    public StringBuilder decrypt(String text, int key){
        
       
        for(int i = 0; i < text.length(); i++){
            
            if(text.charAt(i) == ' '){
                decrypted.append(' ');
            }
            
            else{
                
                if(Character.isUpperCase(text.charAt(i))){
                    tmp = (int)(text.charAt(i));
                    tmp += 26;
                    position = (((tmp - 65) - key)%26);
                    newChar = (char)(position + 65);
                    decrypted.append(newChar);
                }
                
                else{
                    tmp = (int)(text.charAt(i));
                    tmp += 26;
                    position = (((tmp - 97) - key)%26);
                    newChar = (char)(position + 97);
                    decrypted.append(newChar);
                }
            }
        }
        return decrypted;
    }
}

