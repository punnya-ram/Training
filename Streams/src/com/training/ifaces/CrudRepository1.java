package com.training.ifaces;

import com.training.Book;
import com.training.services.BookService;

import java.util.*;

public interface CrudRepository1 {
	public boolean add(Book book);
	public Book findById(int id);
	public Boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book oldbook,Book recentBook);
	public BookService getBookName();
}
