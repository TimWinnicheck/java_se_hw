package com.win.java.se.task4;

import java.io.*;

public class FilmCollection implements Serializable {

    Film[] Base;
    int amount;
    String pathIN;
    String pathOUT;

    FilmCollection() {
        this.Base = new Film[1];
        amount = 0;
    }

    FilmCollection(String pathIN, String pathOUT) {
        this.Base = new Film[1];
        amount = 0;
        this.pathIN = pathIN;
        this.pathOUT = pathOUT;
    }

    public void addFilm(Film filmToAdd) {
        if (amount == Base.length) {
            Film[] New = new Film[Base.length + 1];
            System.arraycopy(Base, 0, New, 0, Base.length);
            Base = New;
        }
        Base[amount] = filmToAdd;
        amount = amount + 1;
    }

    public void listFilms() {
        int i = 0;
        while (i < amount) {
            System.out.println(Base[i].name + " Lead: " + Base[i].actor.name);
            i++;
        }
    }

    public void SaveCollection() throws IOException {
        FileOutputStream FOStream = new FileOutputStream(pathOUT);
        ObjectOutputStream OOStream = new ObjectOutputStream(FOStream);
        OOStream.writeObject(this);
        OOStream.close();
    }

}
