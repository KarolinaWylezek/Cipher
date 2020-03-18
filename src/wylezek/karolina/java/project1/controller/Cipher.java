/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.controller;

import wylezek.karolina.java.project1.view.CipherView;
import wylezek.karolina.java.project1.model.*;

import java.util.Scanner;

/**
 * Class Cipher joins all classes in the project to work together
 * 
 * @author Karolina Wylezek
 * @version 1.0
 */
public class Cipher {
    
    /**
     * main function is responsible for taking data from standard input and use of other classes and their methods
     * to decode/encode text and print the result
     * 
     * @param args program parameters
     */
    
    public static void main(String[] args){
        
        /**
         * this field is an inctance of CipherView class and provides us the possibility to use the methods from this class
         */
        CipherView view = new CipherView();
        
        view.choose();
        
        /**
         * this field is an instance of Scanner class and gives us possibility to read the input from user
         */
        
        Scanner scan = new Scanner(System.in);
        
        /**
         * the chosen field stores the number of chosen operation (1 - encryption, 2 - decryption)
         * the shift field stores the number representing the shift of encoding/decoding operation
         */
        int chosen, shift;
        
        /**
         * this field stores the text that will be encoded/decoded
         */
        String text;
        
        /**
         * this field is an instance of Encryption class
         * and provides us the possibility to use the methods from this class
         */
    
        Encryption e = new Encryption();
        
        /**
         * this field is an instance of Decryption class
         * and provides us the possibility to use the methods from this class
         */
        Decryption d = new Decryption();
        
        chosen = scan.nextInt();
        
        
        while(true){
        
            if(chosen == 1){
                view.chooseShift();
                shift = scan.nextInt();
                view.operation(chosen);
                Scanner scannedText = new Scanner(System.in);
                text = scannedText.nextLine();
                String enc = (e.encrypt(text, shift)).toString();
                view.result(enc, chosen);
                break;
            }
        
            else if (chosen == 2){
                view.chooseShift();
                shift = scan.nextInt();
                view.operation(chosen);
                Scanner scannedText = new Scanner(System.in);
                text = scannedText.nextLine();
                String dec = (d.decrypt(text, shift)).toString();
                view.result(dec, chosen);
                break;
            }
        
            else{
                view.operation(chosen);
                chosen = scan.nextInt();
            }
        
        }
    }
}