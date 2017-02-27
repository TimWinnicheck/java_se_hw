package test.java.com.win.java.se.task5;

import main.java.com.win.java.se.task5.Course;
import main.java.com.win.java.se.task5.Student;
import main.java.com.win.java.se.task5.name;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    @Test
    public void CourseTestBase() {

        Number[] ints = new Number[10];
        Student[] pool = new Student[10];
        pool[0] = new Student(ints,"stu1");
        pool[1] = new Student(ints,"stu2");
        pool[2] = new Student(ints,"stu3");
        pool[3] = new Student(ints,"stu4");
        pool[4] = new Student(ints,"stu5");
        pool[5] = new Student(ints,"stu6");
        pool[6] = new Student(ints,"stu7");
        pool[7] = new Student(ints,"stu8");
        pool[8] = new Student(ints,"stu9");
        pool[9] = new Student(ints,"stu10");


        Course crs1 = new Course(Course.makerandom(pool), name.MATH);

        crs1.list();

        crs1.addmarks(crs1.type);

        crs1.list();

        Course crs2 = new Course(Course.makerandom(pool), name.PROGRAMMING, 1);

        crs2.list();
        crs2.addmarks(crs2.type);
        crs2.list();

        crs1.list();


    }

}