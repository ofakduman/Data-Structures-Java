package com.company;

import java.util.Objects;

public class Term implements Comparable<Term>{
    private int coef;
    private int exponent;


    public Term(){
        coef = 0;
        exponent = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Term)) return false;
        Term term = (Term) o;
        return getCoef() == term.getCoef() && getExponent() == term.getExponent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoef(), getExponent());
    }

    public Term(int coef, int exponent) {
        this.coef = coef;
        this.exponent = exponent;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    /**
     * A method to add 2 term if they exponents are equal I mean they are addable
     * @param other term wanna add
     * @return new terms copy if they are addable otherway return null
     */
    public Term add(Term other){
        Term temp = null;
        if (exponent == other.getExponent()){
            setCoef(coef+ other.getCoef());
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
        if (exponent>o.getExponent())
            return 1;
        else if (exponent == o.getExponent())
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return coef +
                "x^" + exponent;
    }
}
