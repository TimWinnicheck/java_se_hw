package com.win.java.se.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilmCollectionTest {
    @Test
    public void saveCollectionTest() throws Exception {

        Actor ac1 = new Actor("Ac1", 50);
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

        Actor ac1 = new Actor("Ac1", 50);
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
    public void loadCollectionTest() throws Exception {

        FilmCollection FC = FilmCollection.LoadCollection("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task4saved.txt");
        FC.listFilms();

    }

    @Test
    public void loadCollectionModifyItThenSaveAndReload() throws Exception {

        FilmCollection FC = FilmCollection.LoadCollection("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task4saved.txt");
        FC.listFilms();
        Actor ac3 = new Actor("Ac3");
        Film fm4 = new Film("fm4", ac3);
        FC.addFilm(fm4);
        FC.SaveCollection();
        FilmCollection FC2 = FilmCollection.LoadCollection("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task4saved.txt");
        FC2.listFilms();
    }

}