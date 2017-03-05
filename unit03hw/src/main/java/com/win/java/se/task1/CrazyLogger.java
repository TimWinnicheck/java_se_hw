package com.win.java.se.task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.SimpleTimeZone;

public class CrazyLogger {

    private StringBuilder[] Contents;
    private int size;

    CrazyLogger(){
        this.size = 0;
        this.Contents = new StringBuilder[this.size];
    }

    private String getDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY : HH-mm");
        Calendar calendar = Calendar.getInstance();
        return format.format(calendar.getTime()).toString();
    }


    public void add(String StringToAdd) {
        if (Contents.length == size)
        {
            size = size + 1;
        }
        StringBuilder[] NewSB = new StringBuilder[size];
        System.arraycopy(Contents,0,NewSB,0,Contents.length);
        NewSB[Contents.length] =  new StringBuilder(getDate());
        NewSB[Contents.length] = NewSB[Contents.length].append(" - ").append(StringToAdd).append(";.");
        this.Contents = NewSB;
    }

    public void out() {
        int i = 0;
        while (i < size)
        {
            System.out.println(this.Contents[i]);
            i++;
        }

    }

    public int find(String StringToFind,boolean PrintToOut){
        int i = 0;
        int linefound = 0;

        while (i < size)
        {
            if (Contents[i].indexOf(StringToFind) != -1)
            {
                linefound = i + 1;
                if (PrintToOut == true)
                {
                    System.out.println("Match found: Line number" + linefound + " : " + Contents[i]);
                }
            }
            i++;
        }
        return linefound;
    }
}
