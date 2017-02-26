package main.java.com.win.java.se.task2;

public class Employee {

    private Pens Pens;
    private Rulers Rulers;
    private Pencils Pencils;

    public Employee(){
        this.Pens = new Pens();
        this.Rulers = new Rulers();
        this.Pencils = new Pencils();
    }

    public Employee(int pens, int rulers, int pencils)
    {
        this.Pencils = new Pencils(pencils);
        this.Rulers = new Rulers(rulers);
        this.Pens = new Pens(pens);
    }

    /**
     * Changes the amount of tools an employee has. All parameters must be relative.
     *
     * @param pens Relative amount of pens (e.g. -1, 1)
     * @param rulers Relative amount of rulers (e.g. -1, 1)
     * @param pencils Relative amount of pencils (e.g. -1, 1)
     */
    public void change(int pens, int rulers, int pencils)
    {
        this.Pencils.amount = this.Pencils.amount + pencils;
        this.Pens.amount = this.Pens.amount + pens;
        this.Rulers.amount = this.Rulers.amount + rulers;
    }

    public int total()
    {
        return this.Pencils.total()+this.Pens.total()+this.Rulers.total();
    }

}
