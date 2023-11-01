package com.chatapp.stomp.entity;

public class Message {
    private String message;
    private String sender;
    private String receiver;
    private Type type;

    public String getMessage() {
        return this.message;
    }

    public String getSender() {
        return this.sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public Type getType() {
        return this.type;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setSender(final String sender) {
        this.sender = sender;
    }

    public void setReceiver(final String receiver) {
        this.receiver = receiver;
    }

    public void setType(final Type type) {
        this.type = type;
    }

    public Message(final String message, final String sender, final String receiver, final Type type) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
    }

    public Message() {
    }

    public String toString() {
        String var10000 = this.getMessage();
        return "Message(message=" + var10000 + ", sender=" + this.getSender() + ", receiver=" + this.getReceiver() + ", type=" + String.valueOf(this.getType()) + ")";
    }
}
