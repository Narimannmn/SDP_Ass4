package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<User> users;

    public Chat() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        user.subscribe(this);
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            user.unsubscribe(this);
        }
    }

    public void notifyUsers(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}
