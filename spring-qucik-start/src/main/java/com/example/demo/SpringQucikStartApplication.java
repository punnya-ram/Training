package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.training.model.Author;
import com.training.model.Book;

@SpringBootApplication
@ComponentScan(basePackages = {"com.training","com.example"})
public class SpringQucikStartApplication {
	public static void  trial() {
		//ioc container
		
		
				//when using id need to cast to specific bean since
				//return type of getBean method is object
				Student ram=(Student)ctx.getBean("ram");
				//casting not required,but there should be only one bean of that type
				//will throw Exception
				Student shyam=ctx.getBean(Student.class);
			//	System.out.println(ctx.getBean("teacher"));
				//when more than one bean of the same type available
				//should use id and class name
				Teacher stella = ctx.getBean("stella",Teacher.class);
				Teacher harish = (Teacher) ctx.getBean("harish");
				//stella.setId(494);
				//stella.setName("stella Sundari");
				//stella.setSubject("Fluid Mech");
				System.out.println(harish);
				//System.out.println(stella);
		
	}

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringQucikStartApplication.class, args);
		
		System.out.println(ctx.getBean(Book.class));
		//if we put a kumar as a method name then we will get a output of harish otherwise get a output of default one
		System.out.println("author:="+ctx.getBean(Author.class));
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		
		Bill bill = ctx.getBean(Bill.class);
		System.out.println("Customer:="+bill.getCustomer());
		System.out.println("Product:="+bill.getProduct());
		CustomerList list=ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
	}
		@Bean
		public Author punnya() {
			return new Author(101,"punnya");
		}
		@Bean
		@Primary
		public Author maya() {
			return new Author(101,"maya");
		}
		
	}


