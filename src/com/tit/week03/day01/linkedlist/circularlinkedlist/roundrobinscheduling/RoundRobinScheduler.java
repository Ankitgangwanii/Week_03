package com.tit.week03.day01.circularlinkedlist.roundrobinscheduling;
import java.util.Scanner;

public class RoundRobinScheduler {
    public static void main(String[] args) {
        RoundRobinLinkedList scheduler = new RoundRobinLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Adding some sample processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.displayProcesses();

        System.out.print("Enter time quantum for scheduling: ");
        int timeQuantum = scanner.nextInt();

        System.out.println("\nStarting Round Robin Scheduling...");
        scheduler.simulateScheduling(timeQuantum);

        scanner.close();
    }
}
