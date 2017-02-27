package main.java.com.win.java.se.task5;

public class Student <T extends Number> {

    T[] marks;

    public String name;

    public Student(T[] marks, String name){
        this.marks = marks;
        this.name = name;
    }

    public Student(String name){

        this.name = name;

    }

}
