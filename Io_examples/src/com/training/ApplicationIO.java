package com.training;

import java.io.File;
import java.security.Provider.Service;

import com.training.services.BookService;

public class ApplicationIO {

	public static void main(String[] args) {
		//Book java = new Book(109," python","rak",780);
		
		BookService service=new BookService();
		//boolean result = service.writeToFile(new File("Books.txt"), java);
		//if(result) {
		//	System.out.println("one record added to file");
			
		//}
		service.readFromFile(new File("Books.txt")).forEach(System.out::println);;
		
	}

}
