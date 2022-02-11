package com.company;

import java.util.StringJoiner;

public class Main {

    /**
     * 4. Develop an Expression Manager that can do the following operations:
     * Balanced Symbols Check
     * - Read a mathematical expression from the user.
     * - Check and report whether the expression is balanced.
     * - {, }, (, ), [, ] are the only symbols considered for the check. All other characters can be ignored.
     * Infix to Postfix Conversion
     * - Read an infix expression from the user.
     * - Perform the Balanced Parentheses Check on the expression read.
     * - If the expression fails the Balanced Parentheses Check, report a message to the user that the
     * expression is invalid.
     * - If the expression passes the Balanced Parentheses Check, convert the infix expression into a postfix expression
     * and display it to the user.
     * - Operators to be considered are +, –, *, /, %.
     * Postfix to Infix Conversion
     * - Read a postfix expression from the user.
     * - Convert the postfix expression into an infix expression and display it to the user.
     * - Display an appropriate message if the postfix expression is not valid.
     * - Operators to be considered are +, –, *, /, %.
     * Evaluating a Postfix Expression
     * - Read the postfix expression from the user.
     * - Evaluate the postfix expression and display the result.
     */

    public static void main(String[] args){
	// write your code here

        String str = "2 % 5";
        System.out.println(ExpressionManager.balancedSymbolCheck(str));


        String postfixVer =ExpressionManager.infixToPostfixConversion(str);
        System.out.println(postfixVer);

        String postFix = "4 5 7 2 + - *";

        ExpressionManager.postfixToInfixConverter(postFix);

        StringJoiner strjoinr = new StringJoiner(" ("," ( ", " ) ");
        strjoinr.add("kamil");
        strjoinr.add("aES");
        strjoinr.add("SSSl");
        strjoinr.add("kamsasil");

        String norm = "a + b";

        

        System.out.println(strjoinr);
    }
}
