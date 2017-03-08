package com.win.java.se.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Reader {

    private String pathname;
    private FileInputStream FIStream;


    public Reader(String pathname) throws FileNotFoundException{
        File file = new File(pathname);
        this.pathname = pathname;
        if (!file.exists() && file.isDirectory()) throw new FileNotFoundException();
    }




}

