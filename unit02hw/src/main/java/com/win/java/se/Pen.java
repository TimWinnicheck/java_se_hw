package main.java.com.win.java.se;


public class Pen {

    private String Color;
    private int Length;
    private String Manufacturer;

    public Pen(String Color, int Length, String Manufacturer)
    {

        if (Color == "" || Length <= 0 || Manufacturer == "")
        {
            throw new IllegalArgumentException();
        }
        this.Color = Color;
        this.Length = Length;
        this.Manufacturer = Manufacturer;
    }

    public Pen(String Color, int Length)
    {
        if (Color == "" || Length <= 0 )
        {
            throw new IllegalArgumentException();
        }

        this.Color = Color;
        this.Length = Length;
        this.Manufacturer = "Unknown";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Pen pen = (Pen) other;

        if (Length != pen.Length) return false;
        if (!Color.equals(pen.Color)) return false;
        return Manufacturer.equals(pen.Manufacturer);
    }

    @Override
    public int hashCode() {
        int result = Color.hashCode();
        result = 31 * result + Length;
        result = 31 * result + Manufacturer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "Color=" + Color +
                ", Length=" + Length +
                ", Manufacturer=" + Manufacturer +
                '}';
    }
}
