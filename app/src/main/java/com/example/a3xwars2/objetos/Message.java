package com.example.a3xwars2.objetos;

public class Message {
    String messageType;

    String Emisor;

    public Message(String messageType, String emisor) {
        this.messageType = messageType;
        Emisor = emisor;
    }

    public Message() {
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String emisor) {
        Emisor = emisor;
    }
}
