package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Table(name="punnya_employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name="emp_id")
	int employeeId;
	@Column(name="emp_name")
	String employeeName;
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	@Column(name="dateofbirth")
	LocalDate dateOfBirth;
	@Column(name="location")
	String location;
	@Column(name="skill_set")
	String skillSet;
	@Column(name="phone_number")
	long phoneNumber;
	
	

}
