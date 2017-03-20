package com.win.java.se.task1;

import java.io.IOException;

public class OperationThread extends Thread {

    private OperationReader OR;

    OperationThread(OperationReader OR) {
        this.OR = OR;
    }

    public Operation[] Read() throws IOException {
        return this.OR.Read();
    }
}
