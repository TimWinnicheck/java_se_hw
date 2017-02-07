package com.win.java.se;

import static java.lang.Math.max;

public class task4 {

    private static double iteration (double[] data, double n, int cur)
    {
        return data[cur]+data[(int)(2*n) - 1 -cur];
    }

    public static double calculate (double[] data, double n)
    {
        if (data.length < n*2)
        {
            System.out.println("Illegal input parameters");
            return 0.0;
        }

        if (data.length < 4)
        {
            System.out.println("Array is too small");
            return 0.0;
        }

        int cur = 0;
        double maxprev = max(iteration(data,n,cur),iteration(data,n,cur+1));
        cur = cur + 2;

        while (cur <= (n - 0.5))
        {
            maxprev = max(iteration(data,n,cur),maxprev);
            cur++;
        }

        return maxprev;
    }
}
