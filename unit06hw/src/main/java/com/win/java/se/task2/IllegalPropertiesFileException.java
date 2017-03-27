package com.win.java.se.task2;

public class IllegalPropertiesFileException extends Throwable {
    public IllegalPropertiesFileException(String path) {
        System.out.println("No properties file at " + path);
    }
}
