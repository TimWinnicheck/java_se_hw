package com.win.java.se.task2;

import java.io.FileInputStream;
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

        int i = 0;
        while (i < Values.values().length) {
            if (properties.containsKey(Values.values()[i].getIdentifier()))
                SB.append(Values.values()[i].getIdentifier() + ": " + properties.getProperty(Values.values()[i].getIdentifier()) + "\n");
            else
                try {
                    throw new IllegalKeyException(Values.values()[i].getIdentifier());
                } catch (IllegalKeyException e) {
                    e.printStackTrace();
                }

            i++;
        }
        return SB.toString();


    }

    private static void checkForExisting(Path file, String path) {
        if (Files.exists(file)) {
            return;
        }
        try {
            throw new IllegalPropertiesFileException(path);
        } catch (IllegalPropertiesFileException e) {
            e.printStackTrace();
        }
    }

}
