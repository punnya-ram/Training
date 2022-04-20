package com.example;
import java.util.logging.*;

public class Application {

	public static void main(String[] args) {
		
		
		Logger log = Logger.getLogger("com.example.Application");
		
		log.setLevel(Level.ALL);
		
		log.fine("I am fine Message ########");
		
		log.info("Info Message");
		
		//System.out.println("Info Message");
		log.warning("Warning message *********");
		
		log.severe("Severe message %%%%%%%%%%%%");
		
		
		
		

	}

}
