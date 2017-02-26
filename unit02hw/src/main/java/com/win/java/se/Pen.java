package main.java.com.win.java.se;

public class Pen {

    private String Color;
    private int Length;
    private String Manufacturer;

    public Pen() {
    }

    public Pen(String Color, int Length, String Manufacturer)
    {
        this.Color = Color;
        this.Length = Length;
        this.Manufacturer = Manufacturer;
    }

    public Pen(String Color, int Length)
    {
        this.Color = Color;
        this.Length = Length;
        this.Manufacturer = "Unknown";
    }
}
