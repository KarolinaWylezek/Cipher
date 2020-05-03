/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.controller;

import static java.lang.System.exit;
import wylezek.karolina.java.project1.view.CipherView;
import wylezek.karolina.java.project1.model.*;
import wylezek.karolina.java.project1.exception.CharacterNotFoundException;



/**
 * Class Main joins all classes in the project to work together
 * 
 * @author Karolina Wylezek
 * @version 1.0
 */
public class Main {
    
    /**
     * main function is responsible for taking data from standard input and use of other classes and their methods
     * to decode/encode text and print the result
     * 
     * @param args program parameters
     */
    
    public static void main(String[] args){
        
        
        CipherView view = new CipherView();
        int chosen, shift;
        String text;
        String keyword;
        Encryption e = new Encryption();
        Decryption d = new Decryption();
        chosen = 0;
        //where
        try{
        chosen = Integer.parseInt(args[0]);
        } catch(NumberFormatException ex){
            System.err.println("Wrong input given");
            exit(0);
        }
        while(true){
        
            if(chosen == 1){
                //where
                try{
                shift = Integer.parseInt(args[1]);
                }catch(NumberFormatException ex){
                    System.err.println("Wrong shift given");
                    break;
                }
                catch (ArrayIndexOutOfBoundsException ex1){
                    System.err.println("Too few arguments in []args");
                    break;
                }
                view.operation(chosen);
                text = view.sentence();
                String enc;
                //where
                try{
                    enc = (e.encrypt(text, shift)).toString();
                }catch(CharacterNotFoundException ex){
                    System.err.print(ex);
                    break;
                }
                view.result(enc, chosen);
                break;
            }
        
            else if (chosen == 2){
                //where
                try{
                shift = Integer.parseInt(args[1]);
                }catch(NumberFormatException ex){
                    System.err.println("Wrong shift given");
                    break;
                }
                catch (ArrayIndexOutOfBoundsException ex1){
                    System.err.println("Too few arguments in []args");
                    break;
                }
                view.operation(chosen);
                text = view.sentence();
                view.keyword();
                keyword = view.sentence();
                String dec;
                try{
                dec = (d.decrypt(text, shift)).toString();
                }catch(CharacterNotFoundException ex){
                    System.err.print(ex);
                    break;
                }
                view.result(dec, chosen);
                boolean isFound = d.findKeyword(dec, keyword);
                view.isKeyword(isFound, keyword);
                break;
            }
        }
    }
}
