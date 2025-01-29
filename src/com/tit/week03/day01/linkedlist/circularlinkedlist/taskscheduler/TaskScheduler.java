package com.tit.week03.day01.linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {
    private Task head;


    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }


    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newTask;
            newTask.next = head;
        }
    }

    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head && position > 1) {
            System.out.println("Invalid position!");
            return;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }
        Task temp = head;
        Task previous = null;
        do {
            if (temp.taskId == taskId) {
                if (previous != null) {
                    previous.next = temp.next;
                } else {
                    Task tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = temp.next;
                    tail.next = head;
                }
                System.out.println("Task removed successfully.");
                return;
            }
            previous = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found.");
    }

    public void viewAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("temp Task: " + head.taskName + ", Priority: " + head.priority + ", Due Date: " + head.dueDate);
        head = head.next;
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found: Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with the given priority.");
        }
    }
}
