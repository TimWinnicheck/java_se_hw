package com.win.java.se.task3;

import java.io.*;

public class EncodingSwitcher {

    String pathIN;
    String pathOUT;

    EncodingSwitcher(String pathIN, String pathOUT) {
        this.pathIN = pathIN;
        this.pathOUT = pathOUT;
    }

    public void switchEncoding() throws IOException {

        char[] buffer = new char[30];
        Reader FileIN = new BufferedReader(new InputStreamReader(new FileInputStream(pathIN), "UTF-8"));
        FileIN.read(buffer);
        Writer FileOUT = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathOUT), "UTF-16"));
        FileOUT.write(buffer);
        FileIN.close();
        FileOUT.close();


    }


}
