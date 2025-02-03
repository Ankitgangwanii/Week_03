package com.tit.week03.day02.stack;

public class QueueUsingStackMain {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.display();

        System.out.println(queue.peek());
        queue.remove();
        queue.display();
    }
}
