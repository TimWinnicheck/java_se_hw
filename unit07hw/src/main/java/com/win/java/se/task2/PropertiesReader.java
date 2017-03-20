package com.win.java.se.task2;

import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    private String path;

    public PropertiesReader(String path) throws FileNotFoundException {
        File file = new File(path);
        if (!file.exists() || file.isDirectory())
            throw new FileNotFoundException();
        else
            this.path = path;
    }

    public String ReadProperty(String key) throws IOException {
        Properties properties = new Properties();
        InputStream FIS = new FileInputStream(path);
        synchronized (PropertiesReader.class) {
            properties.load(FIS);
        }
        FIS.close();
        return properties.getProperty(key);
    }
}
