package com.win.java.se.task2;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class PropertiesManagerTest {
    @Test
    public void readingTest() throws Exception {

        System.out.println(PropertiesManager.read("resources/source1.properties"));

    }

    @Test(expected = IllegalPropertiesFileException.class)
    public void noFileExceptionTest() throws IOException {

        System.out.println(PropertiesManager.read("no.properties"));

    }

    @Test(expected = IllegalKeyException.class)
    public void illegalKeyExceptionTest() throws IOException {

        System.out.println(PropertiesManager.read("resources/source2.properties"));

    }

}