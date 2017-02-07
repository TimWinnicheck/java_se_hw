package com.win.java.se;

public class task5 {

    private static void show(int[][] ints)
    {
        int i = 0;
        int j = 0;
        while (i < ints.length)
        {
            while (j < ints[i].length)
            {
                System.out.print(ints[i][j] + " ");
                j++;
            }
            System.out.println("");
            j = 0;
            i++;
        }
    }

    public static void implementation() {

        int[][] ints = new int[15][15];

        int i = 0;
        while (i < ints.length)
        {
            ints[i][i] = 1;
            i++;
        }

        i = ints.length - 1;

        while (i >= 0 )
        {
            ints[i][ints.length - 1 -i] = 1;
            i--;
        }

        show(ints);


    }
}
