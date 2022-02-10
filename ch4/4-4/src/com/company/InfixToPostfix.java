package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

/** Translates an infix expression to a postfix expression. */
public class InfixToPostfix {
    // Insert nested class SyntaxErrorException. See Listing 4.6.
    // Data Fields
    /** The operator stack */
    private final Deque<Character> operatorStack = new ArrayDeque<>();
    /** The operators */
    private static final String OPERATORS = "+-*/";
    /** The precedence of the operators matches order in OPERATORS. */
    private static final int[] PRECEDENCE = {1, 1, 2, 2};
    /** The postfix string */
    private final StringJoiner postfix = new StringJoiner(" ");
    /** Convert a string from infix to postfix. Public convert is called
     * by a client − Calls private method convertToPostfix to do the conversion.
     * @param infix The infix expression
     * @throws PostfixEvaluator.SyntaxErrorException
     * @return the equivalent postfix expression.
     */
    public static String convert(String infix)
            throws PostfixEvaluator.SyntaxErrorException {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        infixToPostfix.convertToPostfix(infix);
        return infixToPostfix.getPostfix();
    }
    /** Return the final postfix string. */
    private String getPostfix() {
        return postfix.toString();
    }
    /** Convert a string from infix to postfix. Public convert is called
     * by a client − Calls private method convertToPostfix to do the conversion.
     * Uses a stack to convert an infix expression to postfix
     * @pre operator stack is empty
     * @post postFix contains postfix expression and stack is empty
     * @param infix the string to convert to postfix
     * @throws PostfixEvaluator.SyntaxErrorException if argument is invalid
     */
    private void convertToPostfix(String infix) throws PostfixEvaluator.SyntaxErrorException {
        String[] tokens = infix.split("\\s+");
        try {
            // Process each token in the infix string.
            for (String nextToken : tokens) {
                char firstChar = nextToken.charAt(0);
                // Is it an operand?
                if (Character.isJavaIdentifierStart(firstChar)
                        || Character.isDigit(firstChar)) {
                    postfix.add(nextToken);
                } // Is it an operator?
                else if(isOperator(firstChar)) {
                    processOperator(firstChar);
                }
                else {
                    throw new PostfixEvaluator.SyntaxErrorException
                            ("Unexpected Character Encountered: " + firstChar);
                }
            } // end loop.
            // Pop any remaining operators and
            // append them to postfix.
            while (!operatorStack.isEmpty()) {
                char op = operatorStack.pop();
                postfix.add(new Character(op).toString());
            }
            // assert: Stack is empty, return.
        } catch (NoSuchElementException ex) {
            throw new PostfixEvaluator.SyntaxErrorException
                    ("Syntax Error: The stack is empty");
        }
    }
    /** Method to process operators.
     @param op The operator
     @throws NoSuchElementException
     */
    private void processOperator(char op) {
        if (operatorStack.isEmpty()) {
            operatorStack.push(op);
        } else {
            // Peek the operator stack and
            // let topOp be top operator.
            char topOp = operatorStack.peek();
            if (precedence(op) > precedence(topOp)) {
                operatorStack.push(op);
            }
            else {
                // Pop all stacked operators with equal
                // or higher precedence than op.
                while (!operatorStack.isEmpty() && precedence(op) <=
                        precedence(topOp)) {
                    operatorStack.pop();
                    postfix.add(new Character(topOp).toString());
                    if (!operatorStack.isEmpty()) {
                        // Reset topOp.
                        topOp = operatorStack.peek();
                    }
                }
                // assert: Operator stack is empty or
                // current operator precedence >
                // top of stack operator precedence.
                operatorStack.push(op);
            }
        }
    }
    /** Determine whether a character is an operator.
     @param ch The character to be tested
     @return true if ch is an operator
     */
    private static boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }
    /** Determine the precedence of an operator.
     @param op The operator
     @return the precedence
     */
    private static int precedence(char op) {
        return PRECEDENCE[OPERATORS.indexOf(op)] ;
    }

    public class SyntaxErrorException {
    }
}