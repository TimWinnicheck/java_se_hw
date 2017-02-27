package main.java.com.win.java.se.task5;

public class Course  {

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
}
