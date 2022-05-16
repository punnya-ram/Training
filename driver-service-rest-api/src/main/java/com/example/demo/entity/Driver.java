package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Driver {
	@Id
	@Column(name="driver_id")
	private int id;
	@Column(name="drivername")
	private String driverName;
	@Column(name="phone_name")
	private long phoneNumber;
	@Column(name="rating")
	private double rating;

}
