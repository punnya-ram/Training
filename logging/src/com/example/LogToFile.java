package com.example;
import java.io.IOException;
import java.util.logging.*;
public class LogToFile {

	public static void main(String[] args) {
		Logger log= Logger.getLogger(LogToFile.class.getName());
		log.setLevel(Level.ALL);
		FileHandler handler2;
		try {
			handler2 = new FileHandler("logs2.log");
			log.addHandler(handler2);
			
			
			throw new RuntimeException("K is a gret programmer"); 
		} catch (SecurityException e) {
			log.warning(e.getMessage());

			
		} catch (IOException e) {
			log.warning(e.getMessage());
		
		}
		
	}

}
