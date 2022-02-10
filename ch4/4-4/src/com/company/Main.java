package com.company;

public class Main {

    public static void main(String[] args) throws PostfixEvaluator.SyntaxErrorException, PostfixExceptions {
	// write your code
        String expression = "4 7 * 20 -";
        String[] tokens = expression.split("\\s+");
        System.out.println(tokens);

        for (String nextToken :
                tokens) {
            System.out.println(nextToken);
        }

        //System.out.println("result: " + PostfixEvaluator.eval(expression));
        //System.out.println("result: " + PostfixEvaluator.eval(""));

        System.out.println(InfixToPostfix.convert("3 + 5"));

    }
}
