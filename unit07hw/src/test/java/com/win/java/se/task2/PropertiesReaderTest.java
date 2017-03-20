package com.win.java.se.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropertiesReaderTest {
    @Test
    public void readPropertyTest() throws Exception {

        PropertiesReader PR1 = new PropertiesReader("resources/task2.properties");
        PropertiesReader PR2 = new PropertiesReader("resources/task2.properties");
        PropertiesReader PR3 = new PropertiesReader("resources/task2.properties");

        PropertiesThread PT1 = new PropertiesThread(PR1, "a");
        PropertiesThread PT2 = new PropertiesThread(PR2, "a");
        PropertiesThread PT3 = new PropertiesThread(PR3, "a");

        PT1.start();
        PT2.start();
        PT3.start();
    }

}