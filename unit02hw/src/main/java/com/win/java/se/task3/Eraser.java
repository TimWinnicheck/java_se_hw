package main.java.com.win.java.se.task3;

public class Eraser extends ErasingImplement {

    public Eraser() {
        this.toughness = 1.0;
        this.name = "Eraser";
        this.cost = 15;
    }

    Eraser (double toughness, int cost, int length)
    {
        if (toughness <= 0.0 || cost <= 0 || length <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.toughness = toughness;
        this.name = "Eraser";
        this.cost = cost;
    }
}