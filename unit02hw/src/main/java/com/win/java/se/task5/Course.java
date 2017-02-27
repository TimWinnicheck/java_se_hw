package main.java.com.win.java.se.task5;

import java.util.Arrays;
import java.util.Random;

public class Course  {

    Random random = new Random();

    public static Student[] makerandom(Student[] pool) {

        final Random random = new Random();

        int i = 0;
        int size = 0;
        Student[] temp = new Student[pool.length];
        while (i < pool.length) {

            if (random.nextInt(100) < 50)
            {
                temp[size] = pool[i];
                size++;
            }
            i++;

        }

        Student[] out = new Student[size];
        System.arraycopy(temp,0,out,0,size);

        return out;

    }

    public Student[] Students;

    public name name;

    private int attendees = 0;

    private int lessons = 0;

    public int type = 0;

    public Course(Student[] students,name name)
    {
        this.Students = new Student[10];
        Number[] ints = new Number[10];
        int i = 0;
        while (i < students.length ) {
            this.Students[i] = new Student(ints,students[i].name);
            this.attendees++;
            i++;
        }
        this.name = name;
        this.lessons = 0;
        this.type = 0;
    }

    public Course(Student[] students,name name, int type)
    {
        this.Students = new Student[10];
        Number[] ints = new Number[10];
        int i = 0;
        while (i < students.length ) {
            this.Students[i] = new Student(ints,students[i].name);
            this.attendees++;
            i++;
        }
        this.name = name;
        this.lessons = 0;
        this.type = type;
    }

    public void list(){

        System.out.println("Course: " + name);
        System.out.println("Lessons: " + lessons);
        System.out.println("Students: ");

        int i = 0;
        while (i < attendees) {
            System.out.println("Name: " + Students[i].name + "    Marks: " + Arrays.toString(Students[i].marks));
            i++;
        }
    }

    public void addmarks(int type) {

        int i = 0;

        if (type <= 0) {

            while (i < attendees) {
                this.Students[i].marks[lessons] = (random.nextInt(5) + 1);
                i++;
            }
            lessons++;

        }
        else {

            while (i < attendees) {
                this.Students[i].marks[lessons] = random.nextDouble()*5.0 + 0.1;
                i++;
            }
            lessons++;

        }


    }


}
