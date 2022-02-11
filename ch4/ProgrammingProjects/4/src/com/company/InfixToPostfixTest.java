package com.company;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Test for InfoxToPostfix
 * @author Koffman & Wolfgang
 */
public class InfixToPostfixTest {

    public InfixToPostfixTest() {
    }

    @Test
    public void simpleExpressionWithSamePrecedence() throws Exception, InfixToPostfix.SyntaxErrorException {
        String infix = "a + b";
        String expResult = "a b + ";
        String result = InfixToPostfix.convert(infix);
        assertEquals(expResult, result);
    }
    @Test
    public void simpleExpressionWithNumbersSamePrecedence() throws Exception, InfixToPostfix.SyntaxErrorException {
        String infix = "2.5 * 6";
        String expResult = "2.5 6 *";
        String result = InfixToPostfix.convert(infix);
        assertEquals(expResult, result);
    }
    @Test
    public void expressionWithMixedPrecedence() throws Exception, InfixToPostfix.SyntaxErrorException {
        String infix = "x1 ‐ y / 2 + foo";
        String expResult = "x1 y 2 / ‐ foo +";
        String result = InfixToPostfix.convert(infix);
        assertEquals(expResult, result);
    }

    /*@Test(expectedExceptions = InfixToPostfix.SyntaxErrorException.class)
    public void expressionWithInvalidOperator() throws Exception {
        String infix = "x1 & 2";
        String expResult = "x1 2";
        String result = InfixToPostfix.convert(infix);
        assertEquals(expResult, result);
    }*/
}