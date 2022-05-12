package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="punnya_patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	@Column(name = "patient_id")
	int patientId;
	@Column(name="patient_name")
	String patientName;
	@Column(name="mobilenumber")
	long mobilenumber;
}