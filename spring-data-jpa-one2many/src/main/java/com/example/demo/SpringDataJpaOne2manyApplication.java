
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
		doc.setDoctorId(2029);
		doc.setDoctorName("Munna");
		doc.setPhoneNumber(90866);
		doc.setDepartment("muscular");
		return doc;
	}
	@Bean
	public Patient kavi() {
		return new Patient(209, "kavitha", 89790);
	}
	@Bean
	public Patient pavi() {
		return new Patient(208, "pavithra", 98970);
	}
	@Bean
	public Patient magi() {
		return new Patient(207, "malathy", 78970);
	}

}
