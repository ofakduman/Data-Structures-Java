package com.company;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Test for PolindromeCheck Class
 * @author Omer F. Akduman
 */

public class DoubleStackTest {
    DoubleStackTest(){}
    String name1 = "Ahmet";
    String name2 = "Kaya";

    @Test
    public void pushTestandPeek() {
        DoubleStack<String> ds = new DoubleStack<>();
        ds.push(1,name1);
        ds.push(2,name2);

        assertEquals(ds.peek(1), name1);
        assertEquals(ds.peek(2), name2);
    }

    @Test
    public void pushandPopTest() {
        DoubleStack<String> ds = new DoubleStack<>();
        ds.push(1,name1);
        ds.push(2,name2);

        assertEquals(ds.pop(1), name1);
        assertEquals(ds.pop(2), name2);
    }

    @Test
    public void isEmptyTest(){
        DoubleStack<String> ds = new DoubleStack<>();
        assertTrue(ds.isEmpty(1));
        assertTrue(ds.isEmpty(2));
    }
}
