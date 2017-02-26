package main.java.com.win.java.se.task4;

import java.util.Arrays;

public class BaseSet implements ComparisonInterface{

    Implement[] Contents;
    private int amount;

    public BaseSet()
    {
        amount = 0;
        Contents = new Implement[1];
    }

    public void add(Implement item){
        Implement[] next = new Implement[this.Contents.length+1];
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

    public void sortbyprice(){

        Implement[] temp = new Implement[this.Contents.length];
        System.arraycopy(Contents,0,temp,0,this.Contents.length);

        int i = 0;
        int j = 0;
        Implement tmp;


        while (i < amount){
            j = 0;
            while (j < amount-1){
                if (temp[j].cost < temp[j+1].cost)
                {
                    tmp = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = tmp;
                }
                j++;
            }
            i++;
        }

        this.Contents = temp;

    }

    public void sortbyname(){

    }
}
