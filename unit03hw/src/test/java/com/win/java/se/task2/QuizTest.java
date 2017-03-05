package com.win.java.se.task2;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class QuizTest {

    @Test
    public void PrintQuestionsTest() throws Exception {
        Locale en = new Locale("en", "US");
        Locale ru = new Locale("ru", "RU");

        Quiz RUQuiz = new Quiz(ru);
        Quiz ENQuiz = new Quiz(en);

        RUQuiz.startQuiz();
        ENQuiz.startQuiz();
    }
    @Test
    public void answertest() throws Exception {

        Locale en = new Locale("en", "US");
        Quiz Q = new Quiz(en);
        assertTrue(Q.answer(1).compareTo("Tim") == 0);

    }

}