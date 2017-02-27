package main.java.com.win.java.se.task5;

import java.util.Random;

public class Course  {

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

    public enum name {
        MATH,
        PHYS_ED,
        GEOMETRY,
        PROGRAMMING
    }

    public name name;

    Course(Student[] students,name name)
    {
        this.Students = students;
        this.name = name;
    }

    public void list(){

        System.out.println("Course: " + name);
        System.out.println("Students: ");

        int i = 0;
        while (i < this.Students.length) {
            System.out.println("Name: " + Students[i].name + "    Marks: " + Students[i].marks);
            i++;
        }
    }


}
