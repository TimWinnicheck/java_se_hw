package main.java.com.win.java.se.task2;

public class Rulers {

    public int cost;
    public int amount;
    private int basecost = 15;

    Rulers()
    {
        this.cost = basecost;
        this.amount = 1;
    }

    Rulers(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.cost = basecost;
        this.amount = n;
    }
}
