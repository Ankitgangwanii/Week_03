package com.tit.week03.day01.singlylinkedlist.inventorymanagementsystem;
class ItemNode {
    String itemName;
    int itemID;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}