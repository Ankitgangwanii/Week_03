package com.tit.week03.day01.singlylinkedlist.socialmediafriendconnections;
public class FriendConnectionLinkedList {
    private UserNode head;

    // Add a new user to the system
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Find user by User ID
    private UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        // Add user2 as a friend to user1
        FriendNode newFriend = new FriendNode(userId2);
        newFriend.next = user1.friendList;
        user1.friendList = newFriend;

        // Add user1 as a friend to user2
        FriendNode reciprocalFriend = new FriendNode(userId1);
        reciprocalFriend.next = user2.friendList;
        user2.friendList = reciprocalFriend;

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendList;
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }
        while (temp != null) {
            UserNode friend = findUserById(temp.friendId);
            if (friend != null) {
                System.out.println("Friend ID: " + friend.userId + "\nName: " + friend.name + "\nAge: " + friend.age);
                System.out.println();
            }
            temp = temp.next;
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode friendTemp = temp.friendList;
            while (friendTemp != null) {
                count++;
                friendTemp = friendTemp.next;
            }
            System.out.println("User " + temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
        FriendNode temp1 = user1.friendList;
        boolean found = false;

        while (temp1 != null) {
            FriendNode temp2 = user2.friendList;
            while (temp2 != null) {
                if (temp1.friendId == temp2.friendId) {
                    UserNode mutualFriend = findUserById(temp1.friendId);
                    if (mutualFriend != null) {
                        System.out.println("Friend ID: " + mutualFriend.userId + "\nName: " + mutualFriend.name + "\nAge: " + mutualFriend.age);
                        System.out.println();
                        found = true;
                    }
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }

        if (!found) {
            System.out.println("No mutual friends found.");
        }
    }
}
