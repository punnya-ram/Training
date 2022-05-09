package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
ApplicationContext ctx = SpringApplication.run(SpringJdbc1Application.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		
		
		//Product tv = ctx.getBean(Product.class);
		
		//System.out.println("Row Added :="+repo.add(tv));
		
		repo.findAll().forEach(System.out::println);
		Optional<Product> prd=repo.findById(17);
		if(prd.isPresent()) {
			System.out.println(prd.get());
		}
		else {
			System.out.println("Hiii varala");
		}
//		Product car = ctx.getBean(Product.class);
//		System.out.println("UPDATE:"+repo.update(car));
		//System.out.println("delete:"+repo.remove(12));
	}
	
	@Bean
	public Product tv()
	{
	return new Product(111,"LG Tv",23400);
	}
	
	@Bean
	@Primary
		public Product car()
		{
		return new Product(3,"bike",23400);
		}
		

}
	
		 
	

