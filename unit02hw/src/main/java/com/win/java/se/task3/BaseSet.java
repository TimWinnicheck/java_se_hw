package main.java.com.win.java.se.task3;

import java.lang.reflect.Array;

public class BaseSet {

    Object[] Contents;
    private int amount;

    BaseSet()
    {
        amount = 0;
        Contents = new Object[1];
    }

    public void add(Object item){
        Object[] next = new Object[this.Contents.length+1];
        System.arraycopy(Contents,0,next,0,this.Contents.length);
        next[this.amount] = item;
        this.amount++;
        this.Contents = next;
    }

    public void list(){
        int i = 0;
        while (i < amount) {
            System.out.println("#"+i+" " + Contents[i].name + " Cost: "+ Contents[i].cost);
            i++;
        }
    }
}
