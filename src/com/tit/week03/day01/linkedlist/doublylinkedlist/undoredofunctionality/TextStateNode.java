package com.tit.week03.day01.doublylinkedlist.undoredofunctionality;
public class TextStateNode {
    String textState;
    TextStateNode next;
    TextStateNode prev;

    public TextStateNode(String textState) {
        this.textState = textState;
        this.next = null;
        this.prev = null;
    }
}
