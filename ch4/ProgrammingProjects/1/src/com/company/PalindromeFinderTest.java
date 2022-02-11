package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Test of the PalindromeFinder
 * @author Koffman & Wolfgang
 */
public class PalindromeFinderTest {
    public PalindromeFinderTest() {
    }
    @Test
    public void singleCharacterIsAlwaysAPalindrome() {
        assertTrue(PalindromeFinder.isPalindrome("x"));
    }
    @Test
    public void aSingleWordPalindrome() {
        assertTrue(PalindromeFinder.isPalindrome("kayak"));
    }
    @Test
    public void aSingleWordNonPalindrome() {
        assertFalse(PalindromeFinder.isPalindrome("foobar"));
    }
    @Test
    public void multipleWordsSameCase() {
        assertTrue(PalindromeFinder.isPalindrome("I saw I was I"));
    }

    @Test
    public void multipleWordsDifferentCase() {
        assertTrue(PalindromeFinder.isPalindrome
                ("Able was I ere I saw Elba"));
    }
    @Test
    public void anEmptyStringIsAPalindrome() {
        assertTrue(PalindromeFinder.isPalindrome(""));
    }
    @Test
    public void anEvenLengthStringPalindrome() {
        assertTrue(PalindromeFinder.isPalindrome("foooof"));
    }

    @Test
    public void onlyLetter() {
        assertTrue(PalindromeFinder.isPalindrome("I...... saw /////I was    .   I",true));
    }
}