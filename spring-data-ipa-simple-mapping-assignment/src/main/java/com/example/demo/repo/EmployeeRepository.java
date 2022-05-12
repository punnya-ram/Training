package com.example.demo.repo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findByDateOfBirth(LocalDate localDate);
	public List<Employee> findByLocation(String srch);
	public List<Employee> findBySkillSet(String srch);
	public List<Employee> findBySkillSetOrLocation(String srchskill,String srchloc);

	
	@Query(nativeQuery=true,value="select * from punnya_employee where location=:locname AND skill_set=:skillname")
	public List<Employee>getBylocationskill(@Param("locname")String locname,@Param("skillname")String skillname);

}
