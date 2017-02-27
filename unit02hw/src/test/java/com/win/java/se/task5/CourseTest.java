package test.java.com.win.java.se.task5;

import main.java.com.win.java.se.task5.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    @Test
    public void CourseTestBase() {

        Student[] pool = new Student[10];
        pool[0] = new Student("stu1");
        pool[1] = new Student("stu2");
        pool[2] = new Student("stu3");
        pool[3] = new Student("stu4");
        pool[4] = new Student("stu5");
        pool[5] = new Student("stu6");
        pool[6] = new Student("stu7");
        pool[7] = new Student("stu8");
        pool[8] = new Student("stu9");
        pool[9] = new Student("stu10");


    }

}