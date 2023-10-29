package org.example;

public interface IChat {
    void addUser(User user);
    void removeUser(User user);
    void notifyUsers(String message);

}
