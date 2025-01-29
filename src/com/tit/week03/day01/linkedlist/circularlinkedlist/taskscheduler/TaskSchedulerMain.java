package com.tit.week03.day01.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerMain {
        public static void main(String[] args) {
            TaskScheduler ts = new TaskScheduler();

            ts.addAtBeginning(1, "Task 1", 5, "2025-02-01");
            ts.addAtEnd(2, "Task 2", 3, "2025-02-02");
            ts.addAtPosition(2, 3, "Task 3", 4, "2025-02-03");

            System.out.println("All tasks:");
            ts.displayAllTasks();

            System.out.println("\nViewing and moving to the next task:");
            ts.viewAndMoveNext();
            ts.viewAndMoveNext();

            System.out.println("\nSearching for tasks with priority 4:");
            ts.searchByPriority(4);

            System.out.println("\nRemoving Task 2:");
            ts.removeByTaskId(2);

            System.out.println("\nAll tasks after removal:");
            ts.displayAllTasks();
        }
}
