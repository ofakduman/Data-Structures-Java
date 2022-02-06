package com.company;

public class Main {

    public static void main(String[] args) {

        Polynomial poly = new Polynomial();

        String polinom = "2x^3";

        //readPoly(polinom);
        poly.readPoly(polinom);
        poly.show();
        System.out.println();
        polinom = "2x^4 + 31 + -25 + 2x^2";
        poly.readPoly(polinom);

        poly.show();

    }

    public static void readPoly(String poly){
        System.out.println(poly);
        String[] tokens = poly.split(" ");
        String[] tokens2 = tokens[0].split("x");
        tokens2[1]=tokens2[1].replace("^", "");
        for (String token : tokens)
            if (!token.equals("+"))
                split(token);

    }

    public static void split(String token){
        int coef = 0;
        int expo = 0;
        if (token.contains("^")){//if contains ^ it is a full term mean exist coef and exponent part
            String tokens2[ ]= token.split("x");
            coef = Integer.parseInt(tokens2[0]);
            if (tokens2.length>1) {
                tokens2[1] = tokens2[1].replace("^", "");
                expo = Integer.parseInt(tokens2[1]);
            }
        }
        else if (token.contains("x")){//it has no exponent
            String tokens2[ ]= token.split("x");
            coef = Integer.parseInt(tokens2[0]);
        }
        else{//its only number
            coef = Integer.parseInt(token);
        }
    }
}
