package com.mycompany.tut1;
import java.util.logging.Logger;

public class Sender {
	private static final Logger logger = Logger.getLogger(Receiver.class.getName()); 

	public Message createMessage(String messageContent){
		Message message = new Message(messageContent);	
		logger.info("Message Created With Content of: " + messageContent);
		return message;
	}	

	public void sendMessage(Message message, Receiver receiver){
		logger.info("Message with Content " + message.getContent() + " is sent to Reciever");	
		receiver.recieveMessage(message);
	}	
}
