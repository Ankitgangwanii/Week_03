package com.tit.week03.day01.doublylinkedlist.librarymanagementsystem;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryLinkedList library = new LibraryLinkedList();

        library.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", 101, true);
        library.addAtBeginning("To Kill a Mockingbird", "Harper Lee", "Classic", 102, false);
        library.addAtPosition(2, "1984", "George Orwell", "Dystopian", 103, true);

        library.displayBooksForward();

        System.out.println("Search for book by Author 'Harper Lee':");
        library.searchBook("Harper Lee");

        System.out.println("\nUpdate book availability for ID 102:");
        library.updateAvailabilityStatus(102, true);

        library.displayBooksReverse();

        System.out.println("Total number of books in the library: " + library.countBooks());
    }
}
