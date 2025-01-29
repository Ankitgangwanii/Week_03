package com.tit.week03.day01.singlylinkedlist.inventorymanagementsystem;
class InventoryLinkedList {
    private ItemNode head;

    // Add at the beginning
    public void addAtBeginning(String itemName, int itemID, int quantity, double price) {
        ItemNode newItem = new ItemNode(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add at the end
    public void addAtEnd(String itemName, int itemID, int quantity, double price) {
        ItemNode newItem = new ItemNode(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add at a specific position
    public void addAtPosition(int position, String itemName, int itemID, int quantity, double price) {
        if (position <= 0) {
            System.out.println("Invalid position. Use 1 or higher.");
            return;
        }
        ItemNode newItem = new ItemNode(itemName, itemID, quantity, price);
        if (position == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }

        ItemNode temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    // Remove an item by Item ID
    public void removeByItemID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemID == itemID) {
            head = head.next;
            System.out.println("Item with ID " + itemID + " removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemID != itemID) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item with ID " + itemID + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item with ID " + itemID + " removed.");
        }
    }

    // Update quantity by Item ID
    public void updateQuantity(int itemID, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemID);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    // Search by Item ID or Item Name
    public void searchByItem(String searchQuery) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (String.valueOf(temp.itemID).equals(searchQuery) || temp.itemName.equalsIgnoreCase(searchQuery)) {
                System.out.println("Item Found: " + temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No item found with query: " + searchQuery);
        }
    }

    // Calculate and display total inventory value
    public void calculateTotalValue() {
        double totalValue = 0;
        ItemNode temp = head;

        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: $" + totalValue);
    }

    // Sort inventory based on Item Name (ascending)
    public void sortByName() {
        if (head == null || head.next == null) return;

        head = mergeSortByName(head);
        System.out.println("Inventory sorted by Item Name.");
    }

    private ItemNode mergeSortByName(ItemNode head) {
        if (head == null || head.next == null) return head;

        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSortByName(head);
        ItemNode right = mergeSortByName(nextOfMiddle);

        return sortedMergeByName(left, right);
    }

    private ItemNode sortedMergeByName(ItemNode left, ItemNode right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
            left.next = sortedMergeByName(left.next, right);
            return left;
        } else {
            right.next = sortedMergeByName(left, right.next);
            return right;
        }
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;

        ItemNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Display all items
    public void displayAllItems() {
        if (head == null) {
            System.out.println("No items in inventory.");
            System.out.println();
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName +
                    "\nItem ID: " + temp.itemID +
                    "\nQuantity: " + temp.quantity +
                    "\nPrice: $" + temp.price);
            temp = temp.next;
            System.out.println();
        }
    }

}