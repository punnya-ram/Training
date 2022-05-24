package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController()
@RequestMapping(path="/api/v1")
public class DriverController {
	private DriverService service;
	
	
	public DriverController(DriverService service) {
		super();
		this.service=service;
	}
	@GetMapping(path="/drivers")
	public List<Driver> getAllDrivers(){
		return this.service.findAll();
		
	}
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id")int id) {
		return this.service.findById(id);
	}
	@PostMapping(path="/drivers")
	public ResponseEntity <Driver> addDriver(@RequestBody Driver entity) {
		Driver driver=this.service.add(entity);
		
		URI location=ServletUriComponentsBuilder
				.fromCurrentRequest()                  //=>http://localhost:8080/drivers
				.path("/{id}")                         //=>http://localhost:8080/drivers/{id}
				.buildAndExpand(entity.getId()).toUri();    //=>http://localhost:8080/api/v1/drivers/103
		return ResponseEntity.status(201).body(driver);
	}
//@DeleteMapping(path="/drivers/{id}")
//
//	
//	public ResponseEntity<Driver> remove(@RequestBody Driver entity) {
//	Driver driver=this.service.remove(entity).orElseThrow(()->new NoSuchElementException("Element not found"));
//	return ResponseEntity.status(204).body(driver);
//	
	
	
//	Integer driver = this.service.remove(id).orElseThrow(()->
//	new NoSuchElementException("Element not found"));
//
//	     return ResponseEntity.status(204).body(driver);

	
@DeleteMapping(path="/drivers")
public ResponseEntity<Object> remove(@RequestBody Driver entity) {
	Driver result=this.service.remove(entity);
	if(result !=null) {
		return ResponseEntity.status(204).build();
	}else {
		return ResponseEntity.ok("No record matching");
	
	}
}

@GetMapping(path="/drivers/srch/{phoneNumber}")
public List<Driver> getDriverByphoneNumber(@PathVariable("phoneNumber")long number) {
	return this.service.srchByPhoneNumber(number);
}

//
//@PutMapping(path="/drivers/update/{id}/{rating}")
//public ResponseEntity<Integer> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating) {
//	int updated=this.service.updateRating(id, updatedRating);
//	return ResponseEntity.ok().body(updated);
//	
//	
//	}
@PutMapping(path = "/drivers/update/{id}/{rating}")
public ResponseEntity<String> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating){
int rowUpdated =this.service.updateRating(id, updatedRating);
	
	 
	return ResponseEntity.status(200).body(rowUpdated+"one row updated");
	
}

@GetMapping(path="/drivers/srch/name/{driverName}")
public List<Driver>getDriverByDriverName(@PathVariable("driverName")String srchName){
	return this.service.findByDriverName(srchName);
}
@GetMapping(path="/drivers/srch/rate/{rating}")
public List<Driver>getDriverBYRating(@PathVariable("rating")double rating){
	return this.service.srchByDriverRating(rating);
}

@GetMapping(path="/drivers/sort/{propName}")

public List<Driver> getSort(@PathVariable("propName") String propName)
{
	return this.service.sortedList(propName);
}

	
}


			
				
		
	
	
	

	

