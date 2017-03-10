package com.win.java.se.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilmCollectionTest {
    @Test
    public void saveCollection() throws Exception {

        Actor ac1 = new Actor("Johny Depp", 50);
        Actor ac2 = new Actor("Ac2");
        Film fm1 = new Film("fm1", ac1);
        Film fm2 = new Film("fm2", ac1);
        Film fm3 = new Film("fm3", ac2);
        FilmCollection FC = new FilmCollection("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task4saved.txt", "C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task4saved.txt");
        FC.addFilm(fm1);
        FC.addFilm(fm2);
        FC.addFilm(fm3);
        FC.SaveCollection();
    }

    @Test
    public void addFilmTest() throws Exception {

        Actor ac1 = new Actor("Johny Depp", 50);
        Actor ac2 = new Actor("Ac2");
        Film fm1 = new Film("fm1", ac1);
        Film fm2 = new Film("fm2", ac1);
        Film fm3 = new Film("fm3", ac2);
        FilmCollection FC = new FilmCollection();
        FC.addFilm(fm1);
        FC.addFilm(fm2);
        FC.addFilm(fm3);
        FC.listFilms();

    }

    @Test
    public void listFilms() throws Exception {

    }

}