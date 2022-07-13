package com.example.demo;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor


public class CabDriver {
	int driverId;
	String driverName;
	long mobileNumber;
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate dateOfBrith;
	
	String location;
	

	double rating;
	

}
