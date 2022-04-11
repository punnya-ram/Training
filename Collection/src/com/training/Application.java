package com.training;


import java.util.List;

import com.training.ifaces.CrudRepository1;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		Book java=new Book(101,"Java","suba",450);
		Book spring=new Book(102,"Spring","Mad",650);
		Book maven=new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","Priya",1450);
		Book python=new Book(105,"Python","Sathya",850);
		
		CrudRepository1 service=new BookService();
		System.out.println("Is added :="+service.add(java));  
		System.out.println(service.add(spring));
		System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));
		List<Book> bookList =service.findAll();
		for(Book eachBook:bookList) {
			System.out.println(eachBook);
		}
		Book foundBook=service.findById(102);{
			System.out.println(foundBook);
		}

	}

}
