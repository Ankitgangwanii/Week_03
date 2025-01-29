package com.tit.week03.day01.singlylinkedlist.socialmediafriendconnections;
public class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendList;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }
}
