package com.example.ifaces;

import java.util.List;

public interface CrudRepository<T> {
	public int add(T obj);
	public List<T>findAll();
	public T findBy(int id);
	public int update(int Id,T obj);
	

}
