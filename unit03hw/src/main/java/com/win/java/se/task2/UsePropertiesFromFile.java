package com.win.java.se.task2;

import java.util.Locale;

public class UsePropertiesFromFile {

    public static void main(String[] args) {
        ResourceProperty myBundle = new ResourceProperty(new Locale("en","US"));
        System.out.println(myBundle.getValue("prop.key1"));
    }
}
