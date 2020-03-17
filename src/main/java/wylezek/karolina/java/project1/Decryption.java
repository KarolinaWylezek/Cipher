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
public class Decryption {
    StringBuilder decrypted = new StringBuilder();
    char newChar;
    int tmp, position;
    
    StringBuilder decrypt(String text, int key){
        
       
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
