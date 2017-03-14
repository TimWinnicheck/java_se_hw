package com.win.java.se.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesManager {

    public static String read(String path) throws IOException {

        Path file = Paths.get(path);

        checkForExisting(file, path);

        StringBuilder SB = new StringBuilder();
        Properties properties = new Properties();
        InputStream IS = new FileInputStream(path);

        properties.load(IS);
        for (int i = 0; i < Values.values().length; i++) {
            if (properties.containsKey(Values.values()[i].getIdentifier()))
                SB.append(Values.values()[i].getIdentifier() + ": " + properties.getProperty(Values.values()[i].getIdentifier()) + "\n");
            else
                try {
                    throw new IllegalKeyException(Values.values()[i].getIdentifier());
                } catch (IllegalKeyException e) {
                    e.printStackTrace();
                }

        }
        return SB.toString();


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
