package com.tit.week03.day01.doublylinkedlist.librarymanagementsystem;
public class LibraryLinkedList {
    private BookNode head;
    private BookNode tail;

    // Add book at the beginning
    public void addAtBeginning(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add book at the end
    public void addAtEnd(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add book at a specific position
    public void addAtPosition(int position, String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(bookTitle, author, genre, bookId, isAvailable);
            return;
        }

        BookNode newNode = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        BookNode temp = head;
        int count = 1;

        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            } else {
                tail = newNode;
            }
            temp.next = newNode;
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    // Remove a book by Book ID
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Search for a book by Title or Author
    public void searchBook(String keyword) {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Book Found:");
                System.out.println("Book Title: " + temp.bookTitle);
                System.out.println("Author: " + temp.author);
                System.out.println("Genre: " + temp.genre);
                System.out.println("Book ID: " + temp.bookId);
                System.out.println("Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
                System.out.println();
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with keyword: " + keyword);
        }
    }

    // Update book availability status by Book ID
    public void updateAvailabilityStatus(int bookId, boolean status) {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Book availability updated for ID " + bookId);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("\nLibrary Books (Forward Order):");
        BookNode temp = head;

        while (temp != null) {
            System.out.println("Book Title: " + temp.bookTitle);
            System.out.println("Author: " + temp.author);
            System.out.println("Genre: " + temp.genre);
            System.out.println("Book ID: " + temp.bookId);
            System.out.println("Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
            System.out.println();
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("\nLibrary Books (Reverse Order):");
        BookNode temp = tail;

        while (temp != null) {
            System.out.println("Book Title: " + temp.bookTitle);
            System.out.println("Author: " + temp.author);
            System.out.println("Genre: " + temp.genre);
            System.out.println("Book ID: " + temp.bookId);
            System.out.println("Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
            System.out.println();
            temp = temp.prev;
        }
    }

    // Count total number of books in the library
    public int countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
