Programming Project
     * 2. We can represent a polynomial as a list of terms, where the terms are in decreasing order by exponent. You should define a class Term that contains data fields coef and exponent. For example, –5x4
     * has a coef value of –5 and an exponent value of 4. To add two polynomials, you traverse both lists
     * and examine the two terms at the current iterator position. If the exponent of one is smaller than the
     * exponent of the other, then insert the larger one into the result and advance that list’s iterator. If the
     * exponents are equal, then create a new term with that exponent and the sum of the two coefficients,
     * and advance both iterators. For example:
     * 3x^4 + 2x^2 + 3x + 7 added to 2x^3 + -5x + 5 = 3x^4 + 2x^3 + 2x^2 + -2x + 12
     * Write a polynomial class with an inner class Term. The polynomial class should have a data field
     * terms that is of type LinkedList <Term>. Provide an addpoly method and a readpoly method.
     * Method readypoly reads a string represending a polynomial such as “2 4 3 2 x x ” and returns a
     * polynomial list with two terms. You also need a toString method for class Term and Polynomial
     * that would display this stored polynomial 2x^3 + −4x^2.