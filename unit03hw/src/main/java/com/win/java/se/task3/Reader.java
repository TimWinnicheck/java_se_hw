package com.win.java.se.task3;

import java.io.*;

public class Reader {

    private String pathname;
    private FileInputStream FIStream;


    public Reader(String pathname) throws FileNotFoundException{
        File file = new File(pathname);
        this.pathname = pathname;
        if (!file.exists() && file.isDirectory()) throw new FileNotFoundException();
    }

    public String toReadable() throws IOException{

        this.FIStream = new FileInputStream(pathname);
        InputStreamReader ISReader = new InputStreamReader(this.FIStream,"Cp1251");
        StringBuilder SBOut = new StringBuilder();
        int current = ISReader.read();

        while (current != -1){
            SBOut.append((char)current);
            current = ISReader.read();
        }

        FIStream.close();
        return SBOut.toString();

    }

    public String[] splitter(String text) {
        return text.toString().split("\n");
    }

    public void stringsOut(String[] strings){
        int i = 0;
        while (i < strings.length){
            System.out.println(strings[i]);
            i++;
        }
    }

}

