package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.DoctorRepository;
@Service
public class DoctorUtils {
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		doc.setPatientList(patientList);
		Doctor added=repo.save(doc);
		if(added!=null) {
			System.out.println("One Recored added");
		}
	}
	public void findAll() {
		List<Doctor> doctors=repo.findAll();
		for(Doctor eachDoctor:doctors) {
			System.out.println("DoctorName");
			System.out.println("Department := "+eachDoctor.getDepartment());
			List<Patient> patients=eachDoctor.getPatientList();
			for(Patient eachPatient:patients) {
				System.out.println("patient Name:="+eachPatient.getPatientName());
				System.out.println("Patient Number:= "+eachPatient.getMobilenumber());
			}
	
		
	
	
		}
		
	}
	
	}
