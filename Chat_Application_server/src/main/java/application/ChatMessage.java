package application;

import java.io.Serializable;

public class ChatMessage implements Serializable {
    private String sender;
    private String message;
    private String chatroomID;

    public ChatMessage(String sender, String message, String chatroomID) {
        this.sender = sender;
        this.message = message;
        this.chatroomID=chatroomID;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public String getChatroomID() {
        return chatroomID;
    }
}
