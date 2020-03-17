/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1;


import java.util.Scanner;
/**
 *
 * @author Karolina Wylężek
 */
public class CipherView {
    
    int shift;
    String text;
    Scanner scan = new Scanner(System.in);
    Encryption e = new Encryption();
    Decryption d = new Decryption();
    
    int choose(){
        System.out.println("If you want to encode type 1 and press enter, if you want to decode type 2 ");
        int chosen;
        chosen = scan.nextInt();
        
        
        return chosen;
    }
    
    void chosenEnc(){
            System.out.println("Choose the shift: ");
            shift = scan.nextInt();
            System.out.println("Type the text that you want to encode: ");
            Scanner scanedText = new Scanner(System.in);
            text = scanedText.nextLine();
            String enc = (e.encrypt(text, shift)).toString();
            System.out.println("Coded text : " + enc);
    }
    
    void chosenDec(){
        System.out.println("Choose the shift: ");
            shift = scan.nextInt();
            System.out.println("Type the text that you want to decode: ");
            Scanner scanedText = new Scanner(System.in);
            text = scanedText.nextLine();
            String dec = (d.decrypt(text, shift)).toString();
            System.out.println("Decoded text: " + dec);
    }
    
    int repeat(){
        System.out.println("Invalid data. Please choose 1 or 2");
        int chosen = scan.nextInt();
        return chosen;
    }
}
