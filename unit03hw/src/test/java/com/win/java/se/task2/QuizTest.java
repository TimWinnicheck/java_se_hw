package com.win.java.se.task2;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class QuizTest {
    @Test
    public void answertest() throws Exception {

        Locale en = new Locale("en", "US");
        Quiz Q = new Quiz(en);
        assertTrue(Q.answer(1).compareTo("Tim") == 0);

    }

}