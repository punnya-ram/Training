package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.repo.SeminarRepository;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext  ctx=SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
		 SeminarService obj=ctx.getBean(SeminarService.class);
		 SeminarRepository repo=ctx.getBean(SeminarRepository.class);
		 obj.create();
		 ctx.close();
		 
		//List<Seminar>semi=repo.findAll();
		//System.out.println(semi);
	}
	@Bean
	public Seminar Historyofjava() {
		Seminar sem=new Seminar();
		sem.setId(88);
		sem.setName("Historyofjava");
		sem.setDuration(33);
		sem.setSpeaker(munna());
		return sem;
		
	}
	@Bean
	public Speaker munna() {
		return new Speaker(55,"munna","bcaS");
		
		
	}

}
