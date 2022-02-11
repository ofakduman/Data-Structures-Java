package com.company;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Test for LinkedStack
 * @author Omer F. Akduman
 */
public class LinkedStackTest {


    @Test
    public void pushMethodTest() throws Exception {
        LinkedStack<String> testStack = new LinkedStack<>();
        String test = "test";
        assertEquals(testStack.push(test), test);
    }

    @Test
    public void peekMethodTest() throws Exception {
        LinkedStack<String> testStack = new LinkedStack<>();
        String test = "test";
        testStack.push(test);
        assertTrue(testStack.peek().equals(test));
    }

    @Test
    public void popMethodTest() throws Exception {
        LinkedStack<String> testStack = new LinkedStack<>();
        String test = "test";
        testStack.push(test);
        assertEquals(testStack.pop(), test);
    }

    @Test
    public void isEmptyMethodTest() throws Exception {
        LinkedStack<String> testStack = new LinkedStack<>();
        assertTrue(testStack.isEmpty());
    }

}
