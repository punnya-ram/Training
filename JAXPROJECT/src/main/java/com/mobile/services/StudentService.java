package com.mobile.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mobile.Student;

public class StudentService {
	private List<Student> studentlist;

	public StudentService() {
		super();
		this.studentlist=new ArrayList<Student>();
	}
	public List<Student> getAll() {
		return this.studentlist;
	}
	public Optional<Student> finfById(int id){
		return this.studentlist.stream().filter(e-> e.getRollNumber()==id).findFirst();
	}
	public boolean remove(int id) {
		return this.studentlist.removeIf(e-> e.getRollNumber()==id);
		
	}
public Student update(int id,Student newValue) {
		
		int idxPos = this.studentlist.indexOf(finfById(id).get());
		
		 this.studentlist.set(idxPos, newValue);
		 return newValue;
		
	}
	 
	public boolean add(Student student) {
		
		return this.studentlist.add(student);
	}

}
