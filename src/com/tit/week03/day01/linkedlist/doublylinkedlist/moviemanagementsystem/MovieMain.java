package com.tit.week03.day01.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieMain {

        public static void main(String[] args) {
            MovieManagement mm = new MovieManagement();


            mm.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
            mm.addAtEnd("The Matrix", "The Wachowskis", 1999, 8.7);
            mm.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

            System.out.println("\nDisplaying all movies (Forward):");
            mm.displayForward();

            System.out.println("\nDisplaying all movies (Reverse):");
            mm.displayReverse();

            System.out.println("\nSearching for movies by Christopher Nolan:");
            mm.searchByDirectorOrRating("Christopher Nolan", -1);

            System.out.println("\nUpdating rating for 'Inception':");
            mm.updateRating("Inception", 9.0);
            mm.displayForward();

            System.out.println("\nRemoving 'The Matrix':");
            mm.removeByTitle("The Matrix");
            mm.displayForward();
        }

}
