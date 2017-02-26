package test.java.com.win.java.se.test4;

import main.java.com.win.java.se.task4.*;
import org.junit.Test;

public class BaseSetTest {
    @Test
    public void sortbynameandpricetest() throws Exception {

        Eraser eraser = new Eraser();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Ruler ruler = new Ruler();

        BaseSet set = new BaseSet();

        set.add(pencil);
        set.add(pen);
        set.add(eraser);
        set.add(ruler);

        set.list();

        set.sortbynameandprice();

        System.out.println("-----------------------------------");

        set.list();

    }

    @Test
    public void sortbypricetest() throws Exception {

        Eraser eraser = new Eraser();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Ruler ruler = new Ruler();

        BaseSet set = new BaseSet();

        set.add(pencil);
        set.add(pen);
        set.add(eraser);
        set.add(ruler);

        set.list();

        set.sortbyprice();

        set.list();

    }

    @Test
    public void sortbyname() throws Exception {

        Eraser eraser = new Eraser();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Ruler ruler = new Ruler();

        BaseSet set = new BaseSet();

        set.add(pencil);
        set.add(pen);
        set.add(eraser);
        set.add(ruler);

        set.list();

        set.sortbyname();

        System.out.println("-------------------------------------------");

        set.list();

    }

    @Test
    public void addtest() throws Exception {

        Eraser eraser = new Eraser();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Ruler ruler = new Ruler();

        BaseSet set = new BaseSet();

        set.add(eraser);
        set.add(pen);
        set.add(pencil);
        set.add(ruler);

        set.list();

    }

}