package com.training.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.*;


class Application {

	public static void main(String[] args) {
		Patient ram=new Patient(111,"ram","Chennai",6754329);
		Patient rajesh=new Patient(112,"rajesh","trivandrum",458993);
		Patient manoj=new Patient(113,"manoj","kottayam",6899448);
		Set<Patient>patients=new HashSet<>();
		patients.add(ram);
		patients.add(rajesh);
		patients.add(manoj);
		Doctor doctor=new Doctor(888,"karthik","ENT",patients);
		Doctor doctor1=new Doctor(980,"karthik","ENT",patients);
		
		//System.out.println(doctor.getDoctorName());
		//for(Patient eachPatient:doctor.getPatients()){
		
		//System.out.println(eachPatient);
		
		
		//}
		//Map<Doctor,Set<Patient>>list=new HashMap<>();
		//list.put(doctor, patients);
		//list.put(doctor1, patients);
		//Appointment app=new Appointment(list);
		//System.out.println(app.getList());
			
		}
	}


