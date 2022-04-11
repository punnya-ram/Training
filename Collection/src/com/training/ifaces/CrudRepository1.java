package com.training.ifaces;

import com.training.Book;
import java.util.*;

public interface CrudRepository1 {
	public boolean add(Book book);
	public Book findById(int id);
	public Boolean remove(Book book);
	public List<Book> findAll();
}
