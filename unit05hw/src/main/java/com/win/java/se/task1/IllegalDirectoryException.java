package com.win.java.se.task1;

public class IllegalDirectoryException extends Throwable {
    public IllegalDirectoryException(String s) {
        System.out.println("Directory " + s + " does not exist.");
    }
}
