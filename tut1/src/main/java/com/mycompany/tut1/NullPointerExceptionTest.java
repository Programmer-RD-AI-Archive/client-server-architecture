package com.mycompany.tut1;

public class NullPointerExceptionTest {
	public void main(String[] args) throws NullPointerException {
		String randomString = "";	
		try {
			System.out.println("length:" + randomString.length());
		}
		catch (NullPointerException e){
			System.out.println(e.getMessage());	
		}
	}
	
}
