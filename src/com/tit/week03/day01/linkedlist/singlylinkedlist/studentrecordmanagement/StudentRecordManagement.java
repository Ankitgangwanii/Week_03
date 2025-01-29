package com.tit.week03.day01.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    private Student head;

    public void addAtFirstPosition(String name, int roll_Number, int age, String grade ){
        Student newStudent = new Student(name, roll_Number, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtLastPosition(String name, int roll_Number, int age, String grade){
        Student newStudent =new Student(name, roll_Number, age, grade);
        Student temp = head;
        if(head==null){
            head = newStudent;
        }
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void addAtPosition(int position, String name, int roll_Number, int age, String grade){
        Student newStudent = new Student(name, roll_Number, age, grade);
        Student temp = head;
        if(position == 1){
            newStudent.next = head;
            head = newStudent;
            return;
        }

        for(int i=0;i < position - 1;i++){
                temp = temp.next;
        }
        if(temp==null){
            System.out.println("The Position is not valid");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;

    }

    public void deleteByRoll_Number(int roll_Number){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        if(head.roll_Number == roll_Number){
            head = head.next;
            System.out.println("Record deleted successfully.");
            return;
        }
        Student temp = head;
        while(temp.next.roll_Number!=roll_Number && temp.next!=null){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Record Not found");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Record deleted succesfully.");
    }

    public void searchByRoll_Number(int roll_Number){
        Student temp = head;
        while(temp!= null){
            if(temp.roll_Number == roll_Number){
                System.out.println("The RollNumber Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("The RollNumber not found");
    }

    public void displayAllRecord()
    {
        Student temp = head;
        if(head == null){
            System.out.println("The Linked List is empty");
        }
        while(temp!=null){
            System.out.println("RollNumber :"+ temp.roll_Number +"\nName :"+ temp.name +"\nAge :"+ temp.age +"\nGrades :"+ temp.grade);
            System.out.println();
            temp = temp.next;
        }
    }

    public void updateGrade(int roll_Number, String grade){
        Student temp = head;
        while(temp!=null){
            if(temp.roll_Number == roll_Number){
                temp.grade = grade;
                System.out.println("Grades updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("The RollNumber Not Found");

    }
}
