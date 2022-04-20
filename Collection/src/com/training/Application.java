package com.training;


import java.util.List;

import com.training.ifaces.CrudRepository1;
import com.training.services.BookService;

public class Application {
	public static void print(List<Book>books) {
		//for(Book eachBook:books) {
		//	System.out.println(eachBook);
			
		//}
		books.forEach(System.out::println);	}
	public static void main(String[] args) {
		Book java=new Book(101,"Java","suba",240);
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
		List<Book> bookList1 =service.findAll();
		for(Book eachBook:bookList1) {
			System.out.println(eachBook);
		}
		Book foundBook=service.findById(102);{
			System.out.println(foundBook);
			service.remove(python);
			System.out.println("=========");
			print(service.findAll());
			Book react=new Book(105,"ReactJS","Rahul kanwal",6950);
			service.update(react, java);
			System.out.println("=========AFTER UPDATE==========");
			Book reactNew=new Book(205,"r","r",12220);
			service.update(react,reactNew);
			System.out.println("========after update====s");
			print(service.findAll());
			System.out.println("Greter than 400");
			List<Book> bookList=((BookService)service).getBooksGrtThan(400);
			bookList.forEach(System.out::println);

			}
		
		}

	}


