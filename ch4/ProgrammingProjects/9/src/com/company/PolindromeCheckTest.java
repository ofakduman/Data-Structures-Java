package com.company;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Test for PolindromeCheck Class
 * @author Omer F. Akduman
 */

public class PolindromeCheckTest {
    public PolindromeCheckTest(){}
    PolindromeCheck p = new PolindromeCheck();

    @Test
    public void simplePolindromeCheck() {
        assertTrue(p.isPolindrome("KayaK"));
    }

    @Test
    public void simpleNotPolindromeCheck() {
        assertFalse(p.isPolindrome("Ka21yaK44"));
    }
    @Test
    public void emptyLineCheck() {
        assertTrue(p.isPolindrome(""));
    }

    @Test
    public void polindromeWithWhitespace() {
        assertTrue(p.isPolindrome("kayak kayak"));
    }

}
