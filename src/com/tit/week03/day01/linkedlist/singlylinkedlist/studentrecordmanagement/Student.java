package com.tit.week03.day01.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Student {
    int roll_Number;
    int age;
    String name;
    String grade;
    Student next;

    public Student(String name, int roll_Number, int age, String grade){
        this.roll_Number = roll_Number;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
