package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Chat> chatRooms;

    public User(String username) {
        this.username = username;
        this.chatRooms = new ArrayList<>();
    }

    public void subscribe(Chat chatRoom) {
        chatRooms.add(chatRoom);
    }

    public void unsubscribe(Chat chatRoom) {
        chatRooms.remove(chatRoom);
    }

    public void receiveMessage(String message) {
        System.out.println(username + " received a message  " + message);
    }
}
