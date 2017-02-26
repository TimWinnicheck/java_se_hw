package main.java.com.win.java.se.task2;

public class Employee {

    private Pens Pens;
    private Rulers Rulers;
    private Pencils Pencils;

    Employee(){
        this.Pens = new Pens();
        this.Rulers = new Rulers();
        this.Pencils = new Pencils();
    }

    Employee(int pens, int rulers, int pencils)
    {
        this.Pencils = new Pencils(pencils);
        this.Rulers = new Rulers(rulers);
        this.Pens = new Pens(pens);
    }

}
