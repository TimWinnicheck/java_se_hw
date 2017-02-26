package main.java.com.win.java.se.task2;

public class Pencils {

    public int cost;
    public int amount;
    private int basecost = 30;

    Pencils(){
        this.cost = basecost;
        this.amount = 1;
    }

    Pencils(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.cost = basecost;
        this.amount = n;
    }
}
