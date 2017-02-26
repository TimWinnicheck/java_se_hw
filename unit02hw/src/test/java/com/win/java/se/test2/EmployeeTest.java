package test.java.com.win.java.se.test2;

import main.java.com.win.java.se.task2.Employee;
import main.java.com.win.java.se.task2.Pens;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void CreatingEmployeeTest() {
        Employee emp1 = new Employee();
    }

    @Test
    public void CountingAmountTest() {
        Employee employee1 = new Employee(10,5,15);
        assertTrue(employee1.total() == 40*10+15*5+30*15);
    }

    @Test
    public void ChangingAmountTest() {
        Employee employee1 = new Employee();
        employee1.change(9,4,14);
        assertTrue(employee1.total() == 40*10+15*5+30*15);
    }

}