package com.win.java.se.task1;

import java.util.Calendar;
import java.util.Formatter;

public class CrazyLogger {

    private StringBuilder[] Contents;
    private int size;

    CrazyLogger(){
        this.size = 0;
        this.Contents = new StringBuilder[this.size];
    }

    private String getDate(){
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%td %tm %tY : %tH-%tM",calendar);
        return formatter.toString();
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

    public int find(String StringToFind){
        return 0;
    }
}
