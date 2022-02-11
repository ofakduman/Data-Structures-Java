package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
/** Class that can evaluate a postfix expression. */
public class PostfixEvaluator {
    // Nested Class
    /** Class to report a syntax error. */
    public static class SyntaxErrorException extends Exception {
        /** Construct a SyntaxErrorException with the specified message.
         @param message The message
         */
        SyntaxErrorException(String message) {
            super(message);
        }
    }
    // Constant
    /** A list of operators. */
    private static final String OPERATORS = "+-*/";
    // Methods
    /** Evaluates the current operation.
     This function pops the two operands off the operand
     stack and applies the operator.
     @param op A character representing the operator
     @param operandStack the current stack of operands
     @return The result of applying the operator
     @throws NoSuchElementException if pop is attempted on an empty stack
     */
    private static int evalOp(char op, Deque<Integer> operandStack) {
        // Pop the two operands off the stack.
        int rhs = operandStack.pop();
        int lhs = operandStack.pop();
        int result = 0;
        // Evaluate the operator.
        switch (op) {
            case '+' : result = lhs + rhs;
                break;
            case '-' : result = lhs - rhs;
                break;
            case '/' : result = lhs / rhs;
                break;
            case '*' : result = lhs * rhs;
                break;
        }
        return result;
    }
    /** Determines whether a character is an operator.
     @param ch The character to be tested
     @return true if the character is an operator
     */
    private static boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }
    /** Evaluates a postfix expression.
     @param expression The expression to be evaluated
     @return The value of the expression
     @throws SyntaxErrorException if a syntax error is detected
     */
    public static int eval(String expression) throws SyntaxErrorException, PostfixExceptions {
        // Create an empty stack.
        Deque<Integer> operandStack = new ArrayDeque<>();
        if (expression.length()==0)
            throw new PostfixExceptions("Error: Empty expression!");

        // Process each token.
        String[] tokens = expression.split("\\s+");
        try {
            for (String nextToken : tokens) {
                char firstChar = nextToken.charAt(0);
                // Does it start with a digit?
                if (Character.isDigit(firstChar)) {
                    // Get the integer value.
                    int value = Integer.parseInt(nextToken);
                    // Push value onto operand stack.
                    operandStack.push(value);
                } // Is it an operator?
                else if (isOperator(firstChar)) {
                    // Evaluate the operator.
                    int result = evalOp(firstChar, operandStack);
                    // Push result onto the operand stack.
                    operandStack.push(result);
                }
                else {
                    // Invalid character.
                    throw new SyntaxErrorException
                            ("Invalid character encountered: " + firstChar);
                }
            } // End for.
            // No more tokens ‐ pop result from operand stack.
            int answer = operandStack.pop();
            // Operand stack should be empty.
            if (operandStack.isEmpty()) {
                return answer;
            } else {
                // Indicate syntax error.
                throw new SyntaxErrorException
                        ("Syntax Error: Stack should be empty");
            }
        } catch (NoSuchElementException ex) {
            // Pop was attempted on an empty stack.
            throw new SyntaxErrorException("Syntax Error: Stack is empty");
        }
    }
}