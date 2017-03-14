package com.win.java.se.task2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PropertiesManager {

    public static String read(String path) {

        Path file = Paths.get(path);

        checkForExisting(file, path);


    }

    private static void checkForExisting(Path file, String path) {
        if (!Files.exists(file)) {
            try {
                throw new IllegalPropertiesFileException(path);
            } catch (IllegalPropertiesFileException e) {
                e.printStackTrace();
            }
        }
    }

}
