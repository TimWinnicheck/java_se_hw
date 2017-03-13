package com.win.java.se.task1;

import java.nio.file.Path;

public class IllegalFilenameException extends Throwable {
    public IllegalFilenameException(Path path) {
        System.out.println("File " + path + " does not exist.");
    }
}
