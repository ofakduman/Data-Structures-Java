package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Test of the PalindromeFinder
 * @author Omer F. Akduman
 */
public class PostfixEvaluatorTest {
    public PostfixEvaluatorTest() {
    }
    @Test
    public void evaluationSentenceTests() throws PostfixEvaluator.SyntaxErrorException, PostfixExceptions {
        assertEquals(28,
                PostfixEvaluator.eval("4 7 *"));
        assertEquals(36,
                PostfixEvaluator.eval("4 7 2 + *"));
        assertEquals(8,
                PostfixEvaluator.eval("4 7 * 20 -"));
        assertEquals(17,
                PostfixEvaluator.eval("3 4 7 * 2 / +"));
    }

    @Test(expected = PostfixExceptions.class)
    public void evaluationWithEmpty() throws PostfixEvaluator.SyntaxErrorException, PostfixExceptions {
        //PostfixEvaluator.eval("");
        assertEquals("Error: Empty expression!",PostfixEvaluator.eval(""));
    }
}
