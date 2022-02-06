package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Polynomial {
    LinkedList <Term> terms = new LinkedList<>();


    public void readPoly(String poly){
        String[] tokens = poly.split(" ");
        String[] tokens2 = tokens[0].split("x");
        tokens2[1]=tokens2[1].replace("^", "");
        for (String token : tokens)
            if (!token.equals("+"))
                split(token);

    }

    private void split(String token){
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
        add(new Term(coef,expo));
    }


    public void add(Term term){
        int compared = -5;
        ListIterator<Term> iter = (ListIterator<Term>) terms.iterator();
        while(iter.hasNext()){
            compared = term.compareTo((Term) iter.next());
            if (compared == 0) {
                iter.previous().add(term);
                return;
            }
            if (compared>0) {
                System.out.println("term: " +term);
                iter.previous();
                iter.add(term);
                return;
            }
        }
        iter.add(term);
    }

    public void show(){
        Iterator<Term> iter = terms.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }

    private class Term implements Comparable<Term> {
        private int coef;
        private int exponent;


        private Term() {
            coef = 0;
            exponent = 0;
        }

        private Term(int coef, int exponent) {
            this.coef = coef;
            this.exponent = exponent;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof com.company.Term)) return false;
            com.company.Term term = (com.company.Term) o;
            return getCoef() == term.getCoef() && getExponent() == term.getExponent();
        }


        private int getCoef() {
            return coef;
        }

        private void setCoef(int coef) {
            this.coef = coef;
        }

        private int getExponent() {
            return exponent;
        }

        private void setExponent(int exponent) {
            this.exponent = exponent;
        }

        /**
         * A method to add 2 term if they exponents are equal I mean they are addable
         *
         * @param other term wanna add
         * @return new terms copy if they are addable otherway return null
         */
        private Term add(Term other) {
            Term temp = null;
            if (exponent == other.getExponent()) {
                setCoef(coef + other.getCoef());
                temp = new Term(coef, exponent);
            }
            return temp;
        }

        @Override
        /**
         * A method to compares terms
         * @return 1 if Term exponent is higher than other
         *          0 if terms exponent is equal
         *          else -1
         */
        public int compareTo(Term o) {
            if (exponent > o.getExponent())
                return 1;
            else if (exponent == o.getExponent())
                return 0;
            return -1;
        }

        @Override
        public String toString() {
            if (exponent == 0 && coef!=0){
                return "" + coef;
            }
            else if (coef!=0 & exponent!=0)
                return coef + "x^" + exponent;
            return "";
        }


    }

}
