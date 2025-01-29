package com.tit.week03.day01.circularlinkedlist.onlineticketreservationsystem;
import java.util.Scanner;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationLinkedList reservationSystem = new TicketReservationLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOnline Ticket Reservation System:");
            System.out.println("1. Book a Ticket");
            System.out.println("2. Cancel a Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket by Customer or Movie Name");
            System.out.println("5. Count Total Booked Tickets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int ticketId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    String seatNumber = scanner.nextLine();
                    System.out.print("Enter Booking Time: ");
                    String bookingTime = scanner.nextLine();
                    reservationSystem.addTicket(ticketId, customerName, movieName, seatNumber, bookingTime);
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to Cancel: ");
                    int removeId = scanner.nextInt();
                    reservationSystem.removeTicket(removeId);
                    break;
                case 3:
                    reservationSystem.displayAllTickets();
                    break;
                case 4:
                    System.out.print("Enter Customer or Movie Name to Search: ");
                    String searchValue = scanner.nextLine();
                    reservationSystem.searchTicket(searchValue);
                    break;
                case 5:
                    reservationSystem.countTickets();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
