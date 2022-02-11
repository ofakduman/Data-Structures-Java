package com.company;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Test for ListStack
 * @author Omer F. Akduman
 */

public class ListStackTest {

    @Test
    public void pushMethodTest() throws Exception {
        ListStack<String> testStack = new ListStack<>();
        String test = "test";
        assertEquals(testStack.push(test), test);
    }

    @Test
    public void peekMethodTest() throws Exception {
        ListStack<String> testStack = new ListStack<>();
        String test = "test";
        testStack.push(test);
        assertTrue(testStack.peek().equals(test));
    }

    @Test
    public void popMethodTest() throws Exception {
        ListStack<String> testStack = new ListStack<>();
        String test = "test";
        testStack.push(test);
        assertEquals(testStack.pop(), test);
    }

    @Test
    public void isEmptyMethodTest() throws Exception {
        ListStack<String> testStack = new ListStack<>();
        assertTrue(testStack.isEmpty());
    }
}
