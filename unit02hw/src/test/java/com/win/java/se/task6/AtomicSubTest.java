package test.java.com.win.java.se.task6;

import main.java.com.win.java.se.task6.AtomicSub;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtomicSubTest {

    @Test

    public void SwimTest () {

        AtomicSub AS = new AtomicSub();

        AS.StartSwimming();
        assertTrue(AS.isSwimming());

    }

}