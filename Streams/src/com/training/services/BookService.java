package com.training.services;
import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

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
	
	public List<Book>fondBookGrtThan(double price){
		this.bookList.stream().filter(e->e.getPrice()>price).collect(toList());
		return this.bookList;

	}
	public List<Book> sortedByName(){
		return this.bookList.stream().sorted(Comparator.comparing(Book::getBookName)).collect(toList());	
		
	}
	public List<Book> sortedByNuberdesc(){
		return this.bookList.stream().sorted(Comparator.reverseOrder()).collect(toList());	
		
	}

	
	public List<String>getBookNames(){
		return this.bookList.stream().map(e->e.getBookName()).collect(toList());
		
	}
	public List<String>getBookNameGrtThanPrice(double price){
		return this.bookList.stream().filter(e->e.getPrice()>price).map(e->e.getBookName()).collect(toList());
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

	@Override
	public BookService getBookName() {
		// TODO Auto-generated method stub
		return null;
	}
}