package com.mycompany.tut1;

public class Receiver {
	private static final Logger logger = Logger.getLogger(Message.class.getName()); 

	public void recieveMessage(Message message){
		System.out.println("Recieved Message with Content: "+ message.getContent());	
	} 	
}
