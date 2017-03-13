package com.win.java.se.task1;

public class DirectoryCoordinator {

    private static String currentDirectory = System.getProperty("user.dir");

    public static String currentDir() {

        return currentDirectory;

    }
}
