package com.win.java.se.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesManager {

    public static String read(String path) throws IOException, IllegalPropertiesFileException {

        Path file = Paths.get(path);

        checkForExisting(file, path);

        HashMap data = new HashMap();
        Properties properties = new Properties();
        InputStream IS = new FileInputStream(path);

        properties.load(IS);

        int i = 0;
        while (i < Values.values().length) {
            if (properties.containsKey(Values.values()[i].getIdentifier()))
                data.put(Values.values()[i].getIdentifier(), properties.getProperty(Values.values()[i].getIdentifier()));
            else
                try {
                    throw new IllegalKeyException(Values.values()[i].getIdentifier());
                } catch (IllegalKeyException e) {
                    e.printStackTrace();
                }

            i++;
        }
        return data.toString();


    }

    private static void checkForExisting(Path file, String path) throws IllegalPropertiesFileException {
        if (Files.exists(file)) {
            return;
        }
            throw new IllegalPropertiesFileException(path);
    }

}
