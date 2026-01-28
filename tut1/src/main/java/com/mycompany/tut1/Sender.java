package com.mycompany.tut1;

public class Sender {
	public Message createMessage(String messageContent){
		Message message = new Message(messageContent);	
		System.out.println("Message Created With Content of: " + messageContent);
		return message;
	}	

	public void sendMessage(Message message, Receiver receiver){
		System.out.println("Message with Content " + message.getContent() + " is sent to Reciever");	
		receiver.recieveMessage(message);
	}	
}
