package main.java.com.win.java.se.task3;

public class Pen extends WritingImplement {

    public String color;
    public String name = "Pen";

    Pen () {
        this.color = "Blue";
        this.name = name;
        this.cost = 30;
        this.length = 10;
    }

    Pen (String color, int cost, int length)
    {
        if (color == "" || cost <= 0 || length <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.color = color;
        this.name = name;
        this.cost = cost;
        this.length = length;
    }
}
