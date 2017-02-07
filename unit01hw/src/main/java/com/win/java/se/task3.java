package com.win.java.se;

import static java.lang.Math.tan;
import static java.lang.Math.tanh;

public class task3 {

    public static double function (double x)
    {
        return tan(2*x) - 3;
    }

    public static void print (double cur)
    {
        System.out.println("| Argument: " + cur + "| Value: " + function(cur) + "|");
    }

    public static void iteration (double a, double b, double h)
    {
        if (h <= 0)
        {
            System.out.println("Illegal input parameters");
            return;
        }
        if (b < a)
        {
            System.out.println("Illegal bonds");
            return;
        }

        System.out.println("------------------------------------");

        double cur = a;

        while (cur <= b)
        {
            print(cur);
            cur += h;
            if (cur > b)
            {
                print(b);
            }
        }

    }
}
