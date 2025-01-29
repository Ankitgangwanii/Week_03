package com.tit.week03.day01.singlylinkedlist.inventorymanagementsystem;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        // Sample items
        inventory.addAtBeginning("Mouse", 101, 10, 25.50);
        inventory.addAtEnd("Keyboard", 102, 5, 45.00);
        inventory.addAtPosition(2, "Monitor", 103, 2, 150.00);

        System.out.println("\nDisplaying all items:");
        inventory.displayAllItems();

        System.out.println("\nSearching for Item ID 102:");
        inventory.searchByItem("102");

        System.out.println("\nUpdating quantity for Item ID 103:");
        inventory.updateQuantity(103, 3);
        inventory.displayAllItems();

        System.out.println("\nCalculating total inventory value:");
        inventory.calculateTotalValue();

        System.out.println("\nSorting inventory by Item Name:");
        inventory.sortByName();
        inventory.displayAllItems();

        System.out.println("\nRemoving Item with ID 101:");
        inventory.removeByItemID(101);
        inventory.displayAllItems();
    }
}