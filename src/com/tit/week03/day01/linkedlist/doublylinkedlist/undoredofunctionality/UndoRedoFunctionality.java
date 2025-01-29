package com.tit.week03.day01.doublylinkedlist.undoredofunctionality;
import java.util.Scanner;

public class UndoRedoFunctionality {
    public static void main(String[] args) {
        UndoRedoLinkedList textEditor = new UndoRedoLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nText Editor Menu:");
                System.out.println("1. Type Text");
                System.out.println("2. Undo");
                System.out.println("3. Redo");
                System.out.println("4. Show Current Text State");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");

                // Check if input is an integer
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline after integer input

                switch (choice) {
                    case 1:
                        System.out.print("Enter new text: ");
                        String text = scanner.nextLine();
                        textEditor.addTextState(text);
                        break;
                    case 2:
                        textEditor.undo();
                        break;
                    case 3:
                        textEditor.redo();
                        break;
                    case 4:
                        textEditor.displayCurrentState();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 5.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
