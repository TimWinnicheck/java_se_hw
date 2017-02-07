package com.win.java.se;

import org.junit.Test;

import static org.junit.Assert.*;


public class task4Test {
    @Test
    public void calculatetest() throws Exception {

        double[] data = {1,2,3,3,2,12,7,40,30,29,26,25,25,25};
        double n = (double)data.length/2;
        System.out.println(task4.calculate(data, n));

    }

}