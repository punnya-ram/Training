package com.training.services;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;

import com.training.Book;
import com.training.ifaces.CrudRepository1;

public class BookService implements CrudRepository1 {
	private ArrayList<Book>bookList;
	
	@Override
	public boolean add(Book book) {
		//boolean result=bookList.add(book);
		//return result;
		
		return bookList.add(book);
	}

	public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}

	@Override
	public Book findById(int id) {
		Book found=null;
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
				found= eachBook;
			}
		}
		return found;
	}

	@Override
	public Boolean remove(Book book) {
		return bookList.remove(book);

	}
	

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldbook,Book newBook) {
		if(this.bookList.contains(oldbook)) {
			//System.out.println("Inside if block #######3 ");
			int idxPos=this.bookList.indexOf(oldbook);
			this.bookList.set(idxPos,newBook);
		}
		return newBook;
	}
	public List<Book> getBooksGrtThan(double price){
		List<Book> grtThanList=new ArrayList<>();
		
		Predicate<Double> grtThan=(value)->value>300.00;
		this.bookList.forEach(book->
		{
		double bookPrice=book.getPrice();
		if(grtThan.test(bookPrice)) {
			grtThanList.add(book);
			
		}
		});
		return grtThanList;
	}
}