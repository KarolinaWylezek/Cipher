/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.test;


import org.junit.Test;
import static org.junit.Assert.*;
import wylezek.karolina.java.project1.exception.CharacterNotFoundException;
import wylezek.karolina.java.project1.model.Decryption;

/**
 *
 * @author ASUS
 */
public class DecTest {
    
 
    
    @Test
    public void decryptionTest() throws CharacterNotFoundException{
        String text = "Fqf rf ptyf";
        int key = 5;
        Decryption dec = new Decryption();
        String decryptedText = dec.decrypt(text, key).toString();
        String expectedOutput = "Ala ma kota";
        assertEquals(decryptedText, expectedOutput);
    }
    
    @Test
    public void decryptionTestBorder1() throws CharacterNotFoundException{
        String text = "Ala ma kota";
        int key = 0;
        Decryption dec = new Decryption();
        String decryptedText = dec.decrypt(text, key).toString();
        String expectedOutput = "Ala ma kota";
        assertEquals(decryptedText, expectedOutput);
    }
    
    @Test
    public void decryptionTestBorder2() throws CharacterNotFoundException{
        String text = "Kot ma Ale";
        int key = 26;
        Decryption dec = new Decryption();
        String decryptedText = dec.decrypt(text, key).toString();
        String expectedOutput = "Kot ma Ale";
        assertEquals(decryptedText, expectedOutput);
    }
    
    @Test
    public void decryptionTestBorder3() throws CharacterNotFoundException{
        String text = "Aaaa";
        int key = 4;
        Decryption dec = new Decryption();
        String decryptedText = dec.decrypt(text, key).toString();
        String expectedOutput = "Wwww";
        assertEquals(decryptedText, expectedOutput);
    }
    
    @Test
    public void decryptionTestBorder4() throws CharacterNotFoundException{
        String text = "Zzzzz";
        int key = 4;
        Decryption dec = new Decryption();
        String decryptedText = dec.decrypt(text, key).toString();
        String expectedOutput = "Vvvvv";
        assertEquals(decryptedText, expectedOutput);
    }
    
   @Test
    public void encryptionTestAbnormal() throws CharacterNotFoundException{
        String text = "Fqf rf $";
        int key = 4;
        Decryption dec = new Decryption();
        try{
        String decryptedText = dec.decrypt(text, key).toString();
        }catch(CharacterNotFoundException e){
            assertTrue(true);
        }
    }
    
    @Test
    public void findKeywordTest(){
        String decryptedText = "Ala ma kota";
        String keyword = "ma";
        boolean expectedResult = true;
        Decryption dec = new Decryption();
        boolean result = dec.findKeyword(decryptedText, keyword);
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void findKeywordTest2(){
        String decryptedText = "Ala ma kota";
        String keyword = "dom";
        boolean expectedResult = false;
        Decryption dec = new Decryption();
        boolean result = dec.findKeyword(decryptedText, keyword);
        assertEquals(expectedResult, result);
    }
}
