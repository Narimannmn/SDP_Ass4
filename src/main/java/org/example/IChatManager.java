package org.example;

public interface IChatManager {
    Chat createChat();
    void addUserToChat(Chat chat, User user);
    void removeUserFromChat(Chat chat, User user);
    void sendMessage(Chat chat, String message);
}
