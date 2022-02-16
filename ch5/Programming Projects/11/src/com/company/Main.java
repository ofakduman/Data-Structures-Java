package com.company;

public class Main {
    public static final double predermined = 0.000005;

    /**
     * 11. One method of solving a continuous numerical function for a root implements a technique similar
     * to the binary search. Given a numerical function, defined as f(x), and two values of x that are
     * known to bracket one of the roots, an approximation to this root can be determined through a
     * method of repeated division of this bracket. For a set of values of x to bracket a root, the value of
     * the function for one x must be negative and the other must be positive as illustrated below, which
     * plots f(x) for values of x between x1 and x2.
     *  The algorithm requires that the midpoint between x1 and x2 be evaluated in the function, and if
     * it equals zero the root is found; otherwise, x1 or x2 is set to this midpoint. To determine whether
     * to replace x1 or x2, the sign of the midpoint is compared against the signs of the values f(x1) and
     * f(x2). The midpoint replaces the x (x1 or x2) whose function value has the same sign as the function
     * value at the midpoint.
     *This algorithm can be written recursively. The terminating conditions are true when either the
     * midpoint evaluated in the function is zero or the absolute value of x1 – x2 is less than some small
     * predetermined value (e.g., 0.0005). If the second condition occurs, then the root is said to be
     * approximately equal to the last midpoint.
     */
    public static void main(String[] args) {

        System.out.println(findRoot(-100000,100000));
        System.out.println(f(-2.69411));
    }

    public static double findRoot(double start, double end){
        double s = f(start);
        double e = f(end);
        double mid = (start+end)/2.0;
        double m = f(mid);
        if (e*s<=0){
            if (s < predermined && s > -predermined)
                return start;
            else if (e < predermined && e > -predermined)
                return end;
            else
            {
                if (m < predermined && m > -predermined)
                    return mid;
                else if (m>0)
                    return findRoot(start,mid);
                else
                    return findRoot(mid, end);
            }
        }
        return 0;
    }

    public static double f(double x){
        return Math.pow(x,3) - 3*Math.pow(x,2) -12*x +9;
    }
}
