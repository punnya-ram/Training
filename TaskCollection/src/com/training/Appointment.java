package com.training;
import java.util.*;



public class Appointment {
	
	private Map<Doctor,Set<Patient>>list=new HashMap<>();

	public Appointment() {
		super();
		list=new HashMap<>();
	}
	

	public Appointment(Map<Doctor, Set<Patient>> list) {
		super();
		this.list = list;
	}


	public Map<Doctor, Set<Patient>> getList() {
		return list;
	}

	public void setList(Map<Doctor, Set<Patient>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Appointment [list=" + list + "]";
	}
	public Set<Patient>getPatients(Doctor key){
		return this.list.get(key);
	}
	

}
