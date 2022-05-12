package com.example.demo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;



@Service
public class EmployeeService {
	private EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	public Employee add(Employee entity) {
		return this.repo.save(entity);
	}
	public List<Employee> findByDateOfBirth(LocalDate localDate){
		return this.repo.findByDateOfBirth(localDate);
	}
	public List<Employee>findByLocation(String srchString){
		return this.repo.findByLocation(srchString);
	}
	public List<Employee>findBySkill(String srchString){
		return this.repo.findBySkillSet(srchString);
	}
	public List<Employee>findBylocationskill_set(String locname,String skillname){
		return this.repo.getBylocationskill(locname, skillname);
	}
	public List<Employee>findBySkillSetOrLocation(String srchskill,String srchloc){
		return this.repo.findBySkillSetOrLocation(srchskill, srchloc);
	}


}
