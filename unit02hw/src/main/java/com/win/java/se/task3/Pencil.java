package main.java.com.win.java.se.task3;

public class Pencil extends WritingImplement {

    public Double precision;
    public String name = "Pencil";

    Pencil () {
        this.precision = 1.0;
        this.name = name;
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
        this.name = name;
        this.cost = cost;
        this.length = length;
    }
}