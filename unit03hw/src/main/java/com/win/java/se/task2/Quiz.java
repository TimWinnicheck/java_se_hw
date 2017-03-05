package com.win.java.se.task2;

import java.util.Locale;

public class Quiz {

    Locale locale;
    ResourceProperty Bundle;
    int questions = 3;

    Quiz (Locale locale) {
        this.locale = locale;
        this.Bundle = new ResourceProperty(locale);
    }

    public String answer(int number) {
        return Bundle.getValue(String.valueOf(number));

    }



    public void startQuiz() {
        int i = 1;
        while (i <= 3)
        {
            System.out.println(i+". : "+Bundle.getValue("q" + String.valueOf(i)));
            i++;
        }
    }

}
