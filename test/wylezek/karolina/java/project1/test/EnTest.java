/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wylezek.karolina.java.project1.test;


import org.junit.Test;
import static org.junit.Assert.*;
import wylezek.karolina.java.project1.exception.CharacterNotFoundException;
import wylezek.karolina.java.project1.model.Encryption;


public class EnTest {
    
    @Test
    public void encryptionTest() throws CharacterNotFoundException{
        String text = "Ala ma kota";
        int key = 5;
        Encryption enc = new Encryption();
        String encryptedText = enc.encrypt(text, key).toString();
        String expectedOutput = "Fqf rf ptyf";
        assertEquals(encryptedText, expectedOutput);
    }
    
    @Test
    public void encryptionTestBorder1() throws CharacterNotFoundException{
        String text = "Ala ma kota";
        int key = 0;
        Encryption enc = new Encryption();
        String encryptedText = enc.encrypt(text, key).toString();
        String expectedOutput = "Ala ma kota";
        assertEquals(encryptedText, expectedOutput);
    }
    
     @Test
    public void encryptionTestBorder2() throws CharacterNotFoundException{
        String text = "Ala ma kota";
        int key = 26;
        Encryption enc = new Encryption();
        String encryptedText = enc.encrypt(text, key).toString();
        String expectedOutput = "Ala ma kota";
        assertEquals(encryptedText, expectedOutput);
    }
    
     @Test
    public void encryptionTestBorder3() throws CharacterNotFoundException{
        String text = "Aaaaa";
        int key = 4;
        Encryption enc = new Encryption();
        String encryptedText = enc.encrypt(text, key).toString();
        String expectedOutput = "Eeeee";
        assertEquals(encryptedText, expectedOutput);
    }
    
     @Test
    public void encryptionTestBorder4() throws CharacterNotFoundException{
        String text = "Zzzz";
        int key = 4;
        Encryption enc = new Encryption();
        String encryptedText = enc.encrypt(text, key).toString();
        String expectedOutput = "Dddd";
        assertEquals(encryptedText, expectedOutput);
    }
    
     @Test
    public void encryptionTestAbnormal() throws CharacterNotFoundException{
        String text = "Ala ma 5$";
        int key = 4;
        Encryption enc = new Encryption();
        try{
        String encryptedText = enc.encrypt(text, key).toString();
        }catch(CharacterNotFoundException e){
            assertTrue(true);
        }
    }
    
    
}
