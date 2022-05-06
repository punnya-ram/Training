package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Component
public class Bill {
	Customer customer;
	Product product;
    @Autowired
	public void setCustomer(@Qualifier("magesh")Customer customer) {
    	System.out.println("set customer callrd****");
		this.customer = customer;
	}
    @Autowired
	public void setProduct(Product product) {
    	System.out.println("set product callrd****");
		this.product = product;
	}
	
}
