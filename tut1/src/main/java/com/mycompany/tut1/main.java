package com.mycompany.tut1;

public class main {

    public static void main(String[] args) {
	    Sender sender = new Sender();
	    Message message = sender.createMessage("message?");
	    Receiver receiver = new Receiver();
	    sender.sendMessage(message, receiver);
    }
}

