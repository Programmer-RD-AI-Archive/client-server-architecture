package com.mycompany.tut1;
import java.util.logging.Logger;

public class Message {
	private String content;
	private static final Logger logger = Logger.getLogger(Message.class.getName()); 

	public Message(String content){
		this.content = content;	
	}
	
	public String getContent() {
		logger.info("Accessing Content of Message");
		return content;
	}
}
