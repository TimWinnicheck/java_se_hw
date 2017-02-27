package test.java.com.win.java.se.task3;

import main.java.com.win.java.se.task3.*;
import org.junit.Test;

public class BaseSetTest {
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