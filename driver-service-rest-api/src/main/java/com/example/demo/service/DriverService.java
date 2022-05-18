package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;
import org.springframework.data.domain.Sort;



@Service
public class DriverService {
	
	private DriverRepository repo;

	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	public Driver add(Driver entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}
	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(id+"Not FOUND"));
	}
//	
//	public Optional<Integer> remove(int id) {
//		   
//		   Optional<Integer> optional = Optional.empty();
//
//		if(this.repo.existsById(id)) {
//
//		this.repo.deleteById(id);
//
//		optional = Optional.of(id);
//		}
//
//		      return optional;  
//		 }
//	 public Optional<Driver> remove(Driver entity) {
//		   
//		   Optional<Driver> optional = Optional.empty();
//
//		if(this.repo.existsById(entity.getId())) {
//
//		this.repo.delete(entity);
//
//		optional = Optional.of(entity);
//		}
//
//		      return optional;  
//		 }
	public Driver remove(Driver entity) {
		boolean result=this.repo.existsById(entity.getId());
		if(result) {
			this.repo.delete(entity);
		}else {
			throw new NoSuchElementException("Element with Id="+entity.getId()+"Not Present");
		}
		return entity;
	}
	public List<Driver>findByDriverName(String srchName){
		return this.repo.findByDriverName(srchName);
	}
	public List<Driver>srchByPhoneNumber(long number){
		return this.repo.findByphoneNumber(number);
	}
	public List<Driver>srchByDriverRating(double rating){
		return this.repo.searchByRating(rating);
		
	}
	public int updateRating(int id,double updatedRating) {
		return this.repo.modifyRating(id, updatedRating);
	}
	public List<Driver>sortedList(String propName){
		return this.repo.findAll(Sort.by(propName));
	}
        
		
}
