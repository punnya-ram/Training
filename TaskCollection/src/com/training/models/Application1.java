package com.training.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.Appointment;
import com.training.Doctor;
import com.training.Patient;

public class Application1 {

	public static void main(String[] args) {
		Patient ram=new Patient(111,"ram","Chennai",6754329);
		Patient rajesh=new Patient(112,"rajesh","trivandrum",458993);
		Patient manoj=new Patient(113,"manoj","kottayam",6899448);
		Set<Patient>patients=new HashSet<>();
		patients.add(ram);
		patients.add(rajesh);
		patients.add(manoj);
		Doctor doctor=new Doctor(888,"karthik","ENT",patients);
		
		
		Patient ram1=new Patient(111,"ram","Chennai",6754329);
		Patient rajesh1=new Patient(112,"rajesh","trivandrum",458993);
		Patient manoj1=new Patient(113,"manoj","kottayam",6899448);
		Set<Patient>patients1=new HashSet<>();
		patients1.add(ram1);
		patients1.add(rajesh1);
		patients1.add(manoj1);
		Doctor doctor1=new Doctor(888,"kiran","ENT",patients);
		
		
		
		
		
		
		Map<Doctor,Set<Patient>>list=new HashMap<>();
		list.put(doctor, patients);
		list.put(doctor1, patients1);
		Appointment app=new Appointment(list);
	
		System.out.println(doctor1.getDoctorName()+app.getPatients(doctor1));
		System.out.println(doctor.getDoctorName()+app.getPatients(doctor));
	}
	

}
