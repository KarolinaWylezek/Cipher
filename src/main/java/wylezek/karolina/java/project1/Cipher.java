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
public class Cipher {
    public static void main(String[] args){
        
        CipherView view = new CipherView();
        
        
        int chosen = view.choose();
        while(true){
        
            if(chosen == 1){
                view.chosenEnc();
                break;
            }
        
            else if (chosen == 2){
                view.chosenDec();
                break;
            }
        
            else
                chosen = view.repeat();
        
        }
    }
}
