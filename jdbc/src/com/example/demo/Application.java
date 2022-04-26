package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
	
		try {
			Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			ProductService service=new ProductService(con);
			Product toAdd=new  Product(94,"ups",747.00);
			//int rowAdded=service.addProduct(toAdd);
			//System.out.println("Row Added :="+rowAdded);
			
			int rowsDeleted=service.deleteById(10);
			System.out.println("row deleted:="+rowsDeleted);
			
			

			Optional<Product> findId=service.findById(94);
			if(findId.isPresent()) {
				System.out.println("FIND ID:="+findId.get());
			}else {
				System.out.println("product with given id not present");
				
			}
			
			System.out.println("updated price:="+service.updatePriceByName("microwave",1500));

			service.findAll().forEach(System.out::println);

		
		
		
		
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}

}
