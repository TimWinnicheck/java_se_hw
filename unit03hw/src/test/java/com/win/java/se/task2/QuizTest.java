package com.win.java.se.task2;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class QuizTest {
    @Test
    public void questiontest() throws Exception {

        Locale en = new Locale("en", "US");
        Quiz Q = new Quiz(en);
        assertTrue(Q.question(1) == "What is your name?");

    }

}