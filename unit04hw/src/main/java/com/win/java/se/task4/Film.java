package com.win.java.se.task4;

import java.io.Serializable;

public class Film implements Serializable {

    String name;
    Actor actor;

    Film(String name, Actor actor) {
        this.name = name;
        this.actor = actor;
    }
}
