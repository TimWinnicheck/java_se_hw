package com.win.java.se;


public class task2 {

    static final double epsilon = 0.000001;

    public static double formulae(int i) {

        return (double) 1/((i+1)*(i+1));
    }

    public static int evaluation() {

        int i = 1;

        double a = formulae(i);
        System.out.println(a);

        while (a > epsilon)
        {
            i++;
            a = formulae(i);
            System.out.println("i = "+i+" a(i) = " + a);

        }

        System.out.println("First number to satisfy the equation: " + i);
        return i;

    }


}
