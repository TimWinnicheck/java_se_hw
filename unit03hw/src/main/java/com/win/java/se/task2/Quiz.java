package com.win.java.se.task2;

import java.util.Locale;

public class Quiz {

    Locale locale;

    Quiz (Locale locale) {
        this.locale = locale;
    }

    public String question (int number) {
        ResourceProperty Bundle = new ResourceProperty(this.locale);
        return Bundle.getValue(String.valueOf(number));

    }

}
