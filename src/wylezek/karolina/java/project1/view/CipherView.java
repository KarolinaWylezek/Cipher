/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.view;

/**
 * This class is used to print the queries and results in the console
 * 
 * @author Karolina Wylężek
 * @version 1.0
 */
public class CipherView {
    
    /**
     *  prints the text that asks the user about operation that they want to conduct (decoding/encoding)
     */
    
    public void choose(){
        System.out.println("If you want to encode type 1 and press enter, if you want to decode type 2 ");
        
    }
    
    /**
     * prints the text that asks the user about the shift
     */
    
    public void chooseShift(){
        System.out.println("Choose the shift: ");
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
     * print the result of coding/decoding operation
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
    
   
}
