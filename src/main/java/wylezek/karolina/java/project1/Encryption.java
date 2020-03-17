/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1;

/**
 *
 * @author Karolina Wylezek
 */
public class Encryption {
    
    StringBuilder encrypted = new StringBuilder();
    int position, tmp;
    char newChar ;
    
    
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
