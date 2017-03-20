package com.win.java.se.task2;

import java.io.IOException;

public class PropertiesThread extends Thread {

    private PropertiesReader PR;

    PropertiesThread(PropertiesReader PR) {
        this.PR = PR;
    }

    public String readProperty(String key) throws IOException {
        return PR.ReadProperty(key);
    }

}
