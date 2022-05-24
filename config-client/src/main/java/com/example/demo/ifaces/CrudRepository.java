package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Product;

public interface CrudRepository<T>{
	public List<T> findAll();
	
	


}
