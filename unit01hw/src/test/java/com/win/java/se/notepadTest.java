package com.win.java.se;

import org.junit.Test;

import static org.junit.Assert.*;


public class notepadTest {
    @Test
    public void add() throws Exception {

        notepad test = new notepad();

        test.add("test1");
        test.add("test2");
        test.list();

    }

    @Test
    public void remove() throws Exception {

        notepad test = new notepad();

        test.add("test1");
        test.add("test2");
        test.remove(1);
        test.remove(2);
        test.remove(2);
        test.add("New string");
        test.list();

    }

    @Test
    public void list() throws Exception {

        notepad test = new notepad();

        test.add("test1");
        test.add("test2");
        test.add("test3");
        test.add("test4");
        test.add("test5");

        test.list();

        test.remove(3);

        test.list();

        test.remove(5);

        test.list();

        test.remove(4);

        test.list();

        test.remove(1);

        test.list();

        test.remove(1);
        test.remove(1);

        test.list();

    }

    @Test
    public void edit() throws Exception {

        notepad test = new notepad();

        test.add("test1");
        test.add("test2");
        test.add("test3");
        test.add("test4");
        test.add("test5");

        test.list();

        test.edit(1,"edited1");
        test.edit(0,"notpossible");
        test.edit(5,"edited5");

        test.list();

        test.remove(1);

        test.list();
    }

}