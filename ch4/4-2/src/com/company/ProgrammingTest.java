package com.company;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test of the PalindromeFinder
 * @author Omer F. Akduman
 */
public class ProgrammingTest {
    public ProgrammingTest() {
    }
    @Test
    public void Programming1Test() {
        assertEquals("dog lazy the over jumps fox brown quick The",
                Programming.getReverseString("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void singleCharacterIsAlwaysAPalindrome() {
        assertTrue(Programming.polindromeApproach1("x"));
    }
    @Test
    public void aSingleWordPalindrome() {
        assertTrue(Programming.polindromeApproach1("kayak"));
    }
    @Test
    public void aSingleWordNonPalindrome() {
        assertFalse(Programming.polindromeApproach1("foobar"));
    }
    @Test
    public void multipleWordsSameCase() {
        assertTrue(Programming.polindromeApproach1("I saw I was I"));
    }

    @Test
    public void multipleWordsDifferentCase() {
        assertTrue(Programming.polindromeApproach1
                ("Able was I ere I saw Elba"));
    }
    @Test
    public void anEmptyStringIsAPalindrome() {
        assertTrue(Programming.polindromeApproach1(""));
    }
    @Test
    public void anEvenLengthStringPalindrome() {
        assertTrue(Programming.polindromeApproach1("foooof"));
    }


    @Test
    public void singleCharacterIsAlwaysAPalindrome2() {
        assertTrue(Programming.polindromeApproach2("x"));
    }
    @Test
    public void aSingleWordPalindrome2() {
        assertTrue(Programming.polindromeApproach2("kayak"));
    }
    @Test
    public void aSingleWordNonPalindrome2() {
        assertFalse(Programming.polindromeApproach2("foobar"));
    }
    @Test
    public void multipleWordsSameCase2() {
        assertTrue(Programming.polindromeApproach2("I saw I was I"));
    }

    @Test
    public void multipleWordsDifferentCase2() {
        assertTrue(Programming.polindromeApproach2
                ("Able was I ere I saw Elba"));
    }
    @Test
    public void anEmptyStringIsAPalindrome2() {
        assertTrue(Programming.polindromeApproach2(""));
    }
    @Test
    public void anEvenLengthStringPalindrome2() {
        assertTrue(Programming.polindromeApproach2("foooof"));
    }


}