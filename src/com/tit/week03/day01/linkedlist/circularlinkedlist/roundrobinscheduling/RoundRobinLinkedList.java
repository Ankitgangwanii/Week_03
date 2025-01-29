package com.tit.week03.day01.circularlinkedlist.roundrobinscheduling;
public class RoundRobinLinkedList {
    private ProcessNode head;
    private ProcessNode tail;

    // Add a process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        ProcessNode temp = head;
        ProcessNode prev = null;

        do {
            if (temp.processId == processId) {
                if (temp == head && head == tail) { // Only one node
                    head = tail = null;
                } else if (temp == head) { // Remove head
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) { // Remove tail
                    prev.next = head;
                    tail = prev;
                } else { // Remove middle
                    prev.next = temp.next;
                }

                System.out.println("Process " + processId + " removed.");
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Process " + processId + " not found.");
    }

    // Display all processes in the circular list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode temp = head;
        System.out.println("Processes in the Round Robin Queue:");
        do {
            System.out.println("Process ID: " + temp.processId +
                    "\nBurst Time: " + temp.burstTime +
                    "\nPriority: " + temp.priority);
            temp = temp.next;
            System.out.println();
        } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void simulateScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalTime = 0;
        int totalProcesses = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        ProcessNode temp = head;

        while (true) {
            boolean allCompleted = true;

            do {
                if (temp.burstTime > 0) {
                    allCompleted = false;
                    int executionTime = Math.min(timeQuantum, temp.burstTime);
                    System.out.println("Executing Process " + temp.processId + " for " + executionTime + " units.");
                    temp.burstTime -= executionTime;
                    totalTime += executionTime;

                    if (temp.burstTime == 0) {
                        int turnaroundTime = totalTime;
                        int waitingTime = turnaroundTime - executionTime;
                        System.out.println("Process " + temp.processId + " completed.");
                        System.out.println("Turnaround Time: " + turnaroundTime + ", Waiting Time: " + waitingTime);
                        System.out.println();
                        totalWaitingTime += waitingTime;
                        totalTurnaroundTime += turnaroundTime;
                        totalProcesses++;
                    }
                }

                temp = temp.next;
            } while (temp != head);

            if (allCompleted) break;
        }

        // Display average waiting time and turn-around time
        double avgWaitingTime = (double) totalWaitingTime / totalProcesses;
        double avgTurnaroundTime = (double) totalTurnaroundTime / totalProcesses;
        System.out.println("Simulation Complete!");
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
}
