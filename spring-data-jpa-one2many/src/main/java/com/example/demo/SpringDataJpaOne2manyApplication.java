package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;
import com.example.demo.utils.bidirectional.Utility;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext  ctx=SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
	 Utility obj=ctx.getBean(Utility.class);
	 obj.create();
	 //DoctorUtils obj=ctx.getBean(DoctorUtils.class);
	 //obj.create();
	 obj.findAll();
	 ctx.close();
	}
	@Bean
	public Doctor munna() {
		Doctor doc=new Doctor();
		doc.setDoctorId(2020);
		doc.setDoctorName("Munna");
		doc.setPhoneNumber(90866);
		doc.setDepartment("muscular");
		return doc;
	}
	@Bean
	public Patient kavi() {
		return new Patient(201, "kavitha", 89790);
	}
	@Bean
	public Patient pavi() {
		return new Patient(202, "pavithra", 98970);
	}
	@Bean
	public Patient magi() {
		return new Patient(203, "malathy", 78970);
	}

}
