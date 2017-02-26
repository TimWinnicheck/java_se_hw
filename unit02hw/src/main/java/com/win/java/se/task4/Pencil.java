package main.java.com.win.java.se.task4;

public class Pencil extends WritingImplement {

    public Double precision;

    public Pencil() {
        this.precision = 1.0;
        this.name = "Pencil";
        this.cost = 45;
        this.length = 10;
    }

    Pencil (Double precision, int cost, int length)
    {
        if (precision <= 0.0 || cost <= 0 || length <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.precision = precision;
        this.name = "Pencil";
        this.cost = cost;
        this.length = length;
    }
}