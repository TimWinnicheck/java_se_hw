package com.win.java.se.task4;

import java.io.Serializable;

public class Actor implements Serializable {

    String name;
    int age;

    Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Actor(String name) {
        this.name = name;
        this.age = 30;
    }
}
