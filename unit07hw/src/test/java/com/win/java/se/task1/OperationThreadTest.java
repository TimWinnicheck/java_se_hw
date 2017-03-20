package com.win.java.se.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationThreadTest {
    @Test
    public void readTest() throws Exception {

        OperationReader OR1 = new OperationReader("resources/operations.txt");
        OperationReader OR2 = new OperationReader("resources/operations.txt");

        OperationThread OT1 = new OperationThread(OR1);
        OperationThread OT2 = new OperationThread(OR2);

        Operation[] result1 = OT1.Read();
        Operation[] result2 = OT2.Read();

        int i = 0;
        while (i < result1.length) {
            System.out.println(result1[i].toString());
            i++;
        }
        i = 0;
        while (i < result2.length) {
            System.out.println(result2[i].toString());
            i++;
        }
    }

}