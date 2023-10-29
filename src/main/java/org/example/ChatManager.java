package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatManager implements IChatManager{
    private List<Chat> chats;

    public ChatManager() {
        this.chats = new ArrayList<>();
    }

    public Chat createChat() {
        Chat chat = new Chat();
        chats.add(chat);
        return chat;
    }

    public void addUserToChat(Chat chat, User user) {
        chat.addUser(user);
    }

    public void removeUserFromChat(Chat chat, User user) {
        chat.removeUser(user);
    }

    public void sendMessage(Chat chat, String message) {
        chat.notifyUsers(message);
    }

}
