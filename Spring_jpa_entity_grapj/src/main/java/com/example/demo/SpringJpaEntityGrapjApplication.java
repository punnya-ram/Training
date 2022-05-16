package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repo.AddressRepository;
import com.example.demo.service.AddressService;

@SpringBootApplication
public class SpringJpaEntityGrapjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=SpringApplication.run(SpringJpaEntityGrapjApplication.class, args);
		AddressService service=ctx.getBean(AddressService.class);
		service.task4();
		ctx.close();
	}
	//@Bean
//	//commandlinerunner is a interface which has one method ie functional interface
//	public CommandLineRunner runner() {
//		
//		return new CommandLineRunner() {
//			@Autowired
//			AddressRepository repo;
//			
//			@Override
//			public void run(String... args) throws Exception {
//				City chennai=new  City(980,"Chennai");
//				City madurai=new City(982,"Maduri");
//				
//				User ram=new User(700,"Ramesh",48843);
//				User suresh=new User(701,"Suresh",7843);
//				
//				Address address1=new Address(101,"Mr.",madurai,suresh);
//				Address address2=new Address(102,"Dr",chennai,ram);
//				this.repo.save(address1);
//				this.repo.save(address2);
//				
//				
//				
//				
//				
//			}
//		};
//		
//	}

}
