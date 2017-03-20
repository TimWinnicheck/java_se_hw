package com.win.java.se.task2;

import java.io.IOException;

public class PropertiesThread extends Thread {

    private final String key;
    private PropertiesReader PR;

    PropertiesThread(PropertiesReader PR, String key) {
        this.PR = PR;
        this.key = key;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName().toString() + PR.ReadProperty(key));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
