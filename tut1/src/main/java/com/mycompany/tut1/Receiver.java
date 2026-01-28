package com.mycompany.tut1;
import java.util.logging.Logger;

public class Receiver {
	private static final Logger logger = Logger.getLogger(Message.class.getName()); 

	public void recieveMessage(Message message){
		logger.info("Recieved Message with Content: "+ message.getContent());	
	} 	
}
