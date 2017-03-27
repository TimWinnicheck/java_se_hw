package com.win.java.se.task2;

public class IllegalKeyException extends Throwable {
    public IllegalKeyException(String identifier) {
        System.out.println("Key " + identifier + " does not exist");
    }
}
