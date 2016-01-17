package com.EChallenge.model;

public class hello {
	
	 private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public String getMessage(){
	      System.out.println("Your Message : " + message);
	      return "This is a test messasge";
	   }

}
