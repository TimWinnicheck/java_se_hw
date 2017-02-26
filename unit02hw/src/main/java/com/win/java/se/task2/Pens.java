package main.java.com.win.java.se.task2;

public class Pens {

    public int amount;
    public int cost;
    private int basecost = 40;

    Pens()
    {
        this.amount = 1;
        this.cost = basecost;
    }

    Pens(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.cost = basecost;
        this.amount = n;
    }

    public int total() {

        return this.amount*this.cost;
    }
}
