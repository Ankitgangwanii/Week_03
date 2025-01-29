package com.tit.week03.day01.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentMain {
    public static void main(String[] args) {
        StudentRecordManagement obj = new StudentRecordManagement();
        obj.addAtFirstPosition("Ankit", 18, 21, "A");
        obj.addAtLastPosition("Aditya", 7, 21, "B");
        obj.addAtPosition(2,"Aadarsh", 1, 21, "C");
        obj.displayAllRecord();

        obj.deleteByRoll_Number(7);
        obj.searchByRoll_Number(1);
        obj.updateGrade(1,"D");
        obj.searchByRoll_Number(2);
        obj.updateGrade(4,"A");
        obj.deleteByRoll_Number(5);
    }
}
