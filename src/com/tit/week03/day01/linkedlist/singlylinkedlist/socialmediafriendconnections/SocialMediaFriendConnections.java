package com.tit.week03.day01.singlylinkedlist.socialmediafriendconnections;
import java.util.Scanner;

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        FriendConnectionLinkedList socialNetwork = new FriendConnectionLinkedList();
        // Add sample users
        socialNetwork.addUser(1, "Aditya", 21);
        socialNetwork.addUser(2, "Aadarsh", 30);
        socialNetwork.addUser(3, "Ankit", 28);
        socialNetwork.addUser(4, "Darshan", 22);
        socialNetwork.addUser(5, "Rajveer" ,25);

        socialNetwork.addFriendConnection(1, 2);
        socialNetwork.addFriendConnection(1, 3);
        socialNetwork.addFriendConnection(2, 4);
        socialNetwork.addFriendConnection(3,5);

        socialNetwork.displayFriends(1);
        socialNetwork.findMutualFriends(1, 2);

        socialNetwork.countFriends();

    }
}
