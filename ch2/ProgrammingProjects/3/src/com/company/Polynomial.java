package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
    LinkedList <Term> terms = new LinkedList<>();

    public void readPoly(String poly){
        terms.clear();
        addPoly(poly);
    }

    public void multiply(String poly){
        String[] tokens = poly.split(" ");
        String[] tokens2 = tokens[0].split("x");
        tokens2[1]=tokens2[1].replace("^", "");
        for (String token : tokens)
            if (!token.equals("+"))
                multiply(split(token));
    }

    private void multiply(Term term){
        ListIterator<Term> iter = (ListIterator<Term>) terms.iterator();
        while(iter.hasNext()){
            iter.next().multiply(term);
        }
    }
    /**
     * A method to add Polynomial string to terms
     * @param poly is a string containing polynamial terms
     */
    public void addPoly(String poly){
        String[] tokens = poly.split(" ");
        String[] tokens2 = tokens[0].split("x");
        tokens2[1]=tokens2[1].replace("^", "");
        for (String token : tokens)
            if (!token.equals("+"))
                add(split(token));

    }

    private Term split(String token){
        int coef = 0;
        int expo = 0;
        if (token.contains("^")){//if contains ^ it is a full term mean exist coef and exponent part
            String tokens2[ ]= token.split("x");
            if(tokens2[0].equals(""))
                coef = 1;
            else
                coef = Integer.parseInt(tokens2[0]);

            if (tokens2.length>1) {
                tokens2[1] = tokens2[1].replace("^", "");
                expo = Integer.parseInt(tokens2[1]);
            }
        }
        else if (token.contains("x")){//it has no exponent
            String tokens2[ ]= token.split("x");
            coef = Integer.parseInt(tokens2[0]);
            expo = 1;
        }
        else{//its only number
            coef = Integer.parseInt(token);
        }

        //at the end return a term with given coef and expo
        return new Term(coef,expo);
    }


    /**
     * A method to add a term to list Ascending exponent order
     * @param term a term to will be added
     */
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
                iter.previous();
                iter.add(term);
                return;
            }
        }
        iter.add(term);
    }

    /**
     * A method to shows polynomial as a string
     */
    public void show(){
        Iterator<Term> iter = terms.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }

    /**
     * Inner class to represent term
     */
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
        /**
         * An overrided method to check terms are equal or not
         */
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Term)) return false;
            Term term = (Term) o;
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

        /**
         * A method to multiply 2 term
         * @param other
         * @return result copy of the multiply result term
         */
        private Term multiply(Term other) {
            Term temp = null;
            setCoef(coef * other.getCoef());
            setExponent(exponent+ other.exponent);
            temp = new Term(coef, exponent);
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
        /**
         * A overrided method to show a term
         */
        public String toString() {
            if ( coef!=0 && exponent == 0 ){
                return "" + coef;
            }
            else if (exponent==1)
                return coef + "x" ;

            else if(coef == 1 && exponent != 0 )
                return "x^" + exponent;

            else if (coef!=0 & exponent!=0)
                return coef + "x^" + exponent;

            return "";
        }
    }
}
