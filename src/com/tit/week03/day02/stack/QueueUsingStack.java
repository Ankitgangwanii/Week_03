package com.tit.week03.day02.stack;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> enQueue = new Stack<>();
    Stack<Integer> deQueue = new Stack<>();

    public void add(int element) {
        enQueue.push(element);
        System.out.println("The Element " + element + " added successfully");
    }

    public void stackToQueue() {
        if (deQueue.isEmpty()) {
            while (!enQueue.isEmpty()) {
                deQueue.push(enQueue.pop());
            }
        }
    }

    public int remove() {
        stackToQueue();
        if (deQueue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return deQueue.pop();
    }

    public int peek() {
        stackToQueue();
        if (deQueue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return deQueue.peek();
    }

    public boolean isEmpty() {
        return enQueue.isEmpty() && deQueue.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = deQueue.size() - 1; i >= 0; i--) {
            System.out.print(deQueue.get(i) + " ");
        }

        for (int i = 0; i < enQueue.size(); i++) {
            System.out.print(enQueue.get(i) + " ");
        }

        System.out.println();
    }
}
