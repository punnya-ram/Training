package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Employee;

@SpringBootApplication
public class SpringDataIpaSimpleMappingAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataIpaSimpleMappingAssignmentApplication.class, args);
	  //Employee siva = ctx.getBean(Employee.class);
	  EmployeeService service = ctx.getBean(EmployeeService.class);
	  //Employee added = service.add(siva);
	 // if(added!=null) {
		//System.out.println("One Employee Added");
		//service.findByDateOfBirth(LocalDate.of(1999,8,27)).forEach(System.out::println);//find by date of birth
		//service.findByLocation("Navalur Chennai").forEach(System.out::println);
		service.findBySkill("Java Developer").forEach(System.out::println);
	//}
	//}
	//@Bean
	//public Employee siva() {
		//return new Employee(200,"siva",LocalDate.of(1999,8,27),"Navalur Chennai","Java Developer",9008773);
	//}
	//@Bean
	//@Primary
	//public Employee maya() {
		//return new Employee(202,"maya",LocalDate.of(2000,7,27),"Perumgalathur Chennai","Java Developer",568967);
	}
}
