package com.win.java.se.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrazyLoggerTest {

    @Test

    public void AddingNewLineTest() {

        CrazyLogger CL = new CrazyLogger();
        CL.add("Test String");
        CL.add("Test String 2");
        CL.add("Test String 3");
        CL.out();
    }

    @Test
    public void FindingAStringTest() {

        CrazyLogger CL = new CrazyLogger();
        CL.add("Test String");
        assertTrue(CL.find("Test",true) == 1 );
    }

    @Test
    public void FindingMultipleStringsTest() {

        CrazyLogger CL = new CrazyLogger();
        CL.add("Test String");
        CL.add("Test String 2");
        CL.add("Testdsew");
        CL.add("teststring");
        assertTrue(CL.find("Test", true) == 3);
    }

}