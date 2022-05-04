package com.mobile.services;
import java.util.List;
import java.util.Optional;

	public interface CrudRepository<T> {
		public int add(T obj);
		public List<T>findAll();
		public Optional<T> findBy(int id);
		public int update(int Id,T obj);
		public int remove(int id);
		

	}

	


