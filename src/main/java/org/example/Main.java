package org.example;

public class Main {
    public static void main(String[] args) {
        User Hubert = new User("Ali Tulegenov");
        User Raxar = new User("Ansar Utenov");

        ChatManager chatManager = new ChatManager();

        Chat pacani = chatManager.createChat();

        chatManager.addUserToChat(pacani, Hubert);
        chatManager.addUserToChat(pacani,Raxar);


        chatManager.sendMessage(pacani, "Надо начать делать файнал");
        chatManager.removeUserFromChat(pacani, Raxar);

        chatManager.sendMessage(pacani, "Ansar надо поздравить с др");
    }

}