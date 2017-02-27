package main.java.com.win.java.se.task5;

public class Student <T extends Number> {

    T[] marks;

    public String name;

    Student(T[] marks,String name){
        this.marks = marks;
        this.name = name;
    }

}
