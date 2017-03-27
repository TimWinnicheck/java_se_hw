package com.win.java.se.task2;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class PropertiesManagerTest {
    @Test
    public void readingTest() throws Exception {

        try {
            System.out.println(PropertiesManager.read("resources/source1.properties"));
        } catch (IllegalPropertiesFileException e) {
            e.printStackTrace();
        }

    }

    @Test(expected = IllegalPropertiesFileException.class)
    public void noFileExceptionTest() throws IOException {

        try {
            System.out.println(PropertiesManager.read("no.properties"));
        } catch (IllegalPropertiesFileException e) {
            e.printStackTrace();
        }

    }

    @Test(expected = IllegalKeyException.class)
    public void illegalKeyExceptionTest() throws IOException {

        try {
            System.out.println(PropertiesManager.read("resources/source2.properties"));
        } catch (IllegalPropertiesFileException e) {
            e.printStackTrace();
        }

    }

}