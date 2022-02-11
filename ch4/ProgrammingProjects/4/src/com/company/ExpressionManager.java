package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class ExpressionManager {

    /**
     * A symbols that will gonna check to equality
     */
    private static final Character [] checkSymbols = {'{', '}', '(', ')', '[', ']'};


    /**
     * A method that provide below requirements
     * Balanced Symbols Check
     *      - Read a mathematical expression from the user.
     *      - Check and report whether the expression is balanced.
     *      - {, }, (, ), [, ] are the only symbols considered for the check. All other characters can be ignored.
     *
     * @param expression is a mathematical expression
     * @return true if the symbols are equals
     */
    public static boolean balancedSymbolCheck(String expression){
        int [] balancedSymbolCounter = {0,0,0};
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i)==checkSymbols[0])
                balancedSymbolCounter[0]++;
            else if (expression.charAt(i)==checkSymbols[1])
                balancedSymbolCounter[0]--;
            else if (expression.charAt(i)==checkSymbols[2])
                balancedSymbolCounter[1]++;
            else if (expression.charAt(i)==checkSymbols[3])
                balancedSymbolCounter[1]--;
            else if (expression.charAt(i)==checkSymbols[4])
                balancedSymbolCounter[2]++;
            else if (expression.charAt(i)==checkSymbols[5])
                balancedSymbolCounter[2]--;
        }
        return balancedSymbolCounter[0] == 0 && balancedSymbolCounter[1] == 0 && balancedSymbolCounter[2] == 0;
    }

    /**
     *  * Infix to Postfix Conversion
     *      * - Read an infix expression from the user.
     *      * - Perform the Balanced Parentheses Check on the expression read.
     *      * - If the expression fails the Balanced Parentheses Check, report a message to the user that the
     *      * expression is invalid.
     *      * - If the expression passes the Balanced Parentheses Check, convert the infix expression into a postfix expression
     *      and display it to the user.
     *      * - Operators to be considered are +, –, *, /, %.
     */
    public static String infixToPostfixConversion(String expression){
        if (!balancedSymbolCheck(expression))
            throw new IllegalArgumentException("Error dude Expression is not balanced");

        return InfixToPostfix.convert(expression);
    }

    private static class InfixToPostfix {
        // Insert nested class SyntaxErrorException. See Listing 4.6.
        // Data Fields
        /**
         * The operator stack
         */
        private final Deque<Character> operatorStack = new ArrayDeque<>();
        /**
         * The operators
         */
        private static final String OPERATORS = "+-*/%";
        /**
         * The precedence of the operators matches order in OPERATORS.
         */
        private static final int[] PRECEDENCE = {1, 1, 2, 2,2};
        /**
         * The postfix string
         */
        private final StringJoiner postfix = new StringJoiner(" ");

        /**
         * Convert a string from infix to postfix. Public convert is called
         * by a client − Calls private method convertToPostfix to do the conversion.
         *
         * @param infix The infix expression
         * @return the equivalent postfix expression.
         */
        private static String convert(String infix) {
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
         */
        private void convertToPostfix(String infix){
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
                        throw new IllegalArgumentException("Unexpected Character Encountered: " + firstChar);
                    }
                } // end loop.
                // Pop any remaining operators and
                // append them to postfix.
                while (!operatorStack.isEmpty()) {
                    char op = operatorStack.pop();
                    postfix.add(new Character(op).toString());
                }
                // assert: Stack is empty, return.
            } catch (NoSuchElementException e) {
                throw new IllegalArgumentException("Syntax Error: The stack is empty");

            }
        }

        /** Method to process operators.
         @param op The operator
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
    }


    /**
     * Postfix to infix converter
     */

    public static String  postfixToInfixConverter(String expression){
        System.out.println(expression);

        String[] tokens = expression.split("\\s+");
        for (String nextToken : tokens){

        }
        return "";
    }

}
