/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1;

import java.util.Scanner;

/**
 *
 * @author Karolina Wylezek
 */
public class Cipher {
    public static void main(String[] args){
        Encryption e = new Encryption();
        Decryption d = new Decryption();
        System.out.println("If you want to encode type 1 and press enter, if you want to decode type 2 ");
        int chosen;
        Scanner scan = new Scanner(System.in);
        chosen = scan.nextInt();
        String text;
        int shift;
        
        while(true){
        if(chosen == 1){
        
            System.out.println("Choose the shift: ");
            shift = scan.nextInt();
            System.out.println("Type the text that you want to encode: ");
            Scanner scanedText = new Scanner(System.in);
            text = scanedText.nextLine();
            String enc = (e.encrypt(text, shift)).toString();
            System.out.println("Coded text : " + enc);
            break;
        
        }
        
        else if (chosen == 2){
            System.out.println("Choose the shift: ");
            shift = scan.nextInt();
            System.out.println("Type the text that you want to decode: ");
            Scanner scanedText = new Scanner(System.in);
            text = scanedText.nextLine();
            String dec = (d.decrypt(text, shift)).toString();
            System.out.println("Decoded text: " + dec);
            break;
        }
        
        else{
            System.out.println("Invalid data. Please choose 1 or 2");
            chosen = scan.nextInt();
        }
    }
    }
}
