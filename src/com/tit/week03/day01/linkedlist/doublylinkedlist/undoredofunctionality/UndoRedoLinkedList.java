package com.tit.week03.day01.doublylinkedlist.undoredofunctionality;
public class UndoRedoLinkedList {
    private TextStateNode head;
    private TextStateNode current;
    private int historySize = 10; // Limit the history to last 10 states
    private int currentSize = 0;

    // Add a new text state at the end
    public void addTextState(String text) {
        TextStateNode newState = new TextStateNode(text);

        if (head == null) {
            head = newState;
            current = head;
            currentSize = 1;
        } else {
            // Remove forward history if present
            current.next = null;

            // Attach the new state at the end
            current.next = newState;
            newState.prev = current;
            current = newState;
            currentSize++;

            // Maintain history size limit
            if (currentSize > historySize) {
                head = head.next;
                head.prev = null;
                currentSize--;
            }
        }

        System.out.println("State saved: " + text);
    }

    // Undo functionality (revert to the previous state)
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("No more undo operations available.");
        } else {
            current = current.prev;
            displayCurrentState();
        }
    }

    // Redo functionality (revert back to the next state after undo)
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("No more redo operations available.");
        } else {
            current = current.next;
            displayCurrentState();
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("No text state available.");
        } else {
            System.out.println("Current Text State: " + current.textState);
            System.out.println();
        }
    }
}
