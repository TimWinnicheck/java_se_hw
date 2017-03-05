package com.win.java.se.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrazyLoggerTest {

    @Test

    public static void AddingNewLineTest() {

        CrazyLogger CL = new CrazyLogger();
        CL.add("Test String");
        CL.add("Test String 2");
        CL.add("Test String 3");
        CL.out;
    }

    @Test
    public static void FindingAStringTest() {

        CrazyLogger CL = new CrazyLogger();
        CL.add("Test String");
        assertTrue(CL.find("Test") == 1 );
    }

}