package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRespository;
import com.example.demo.services.Invoice;
import com.example.demo.services.ProductService;
import  com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void member() {
		//Connection con;
    	//con =ConnectionFactory.getOracleConnection();
		//MemberRespository res=new MemberRespository(con);
		//System.out.println(con);
		//Member toAdd = new Member(29,"yuvaraj","sipcot",LocalDate.of(2000, 10, 28)
				//,"half",3500.0,3,1200.0);
		
		//int addrow = res.add(toAdd);
		
		//System.out.println("rowAdded:=" + addrow);
		//System.out.println("updated fees:="+res.updatePriceByname("pooja",500.00));
		
		
		//res.findAll().forEach(System.out::println);


    //try {
      //	con=ConnectionFactory.getPostgressConnection();
      	//System.out.println(con);
    //}catch(Exception e) {
    	//e.printStackTrace();
    }
		
	//}
	public static void product() {
		Connection con;
		con =ConnectionFactory.getPostgressConnection();
		ProductService service=new ProductService(con);
		Product toAdd=new  Product(94,"ups",747.00);
		int rowAdded=service.addProduct(toAdd);
	   System.out.println("Row Added :="+rowAdded);
		
	   service.findAll().forEach(System.out::println);
		
	}
public static void main( String[] args ) {
		
		Connection con;
    Connection con1 = ConnectionFactory.getOracleConnection();
	
	ProductService service = new ProductService(con1);
	Product laddu=new Product(01,"laddu",89);
	Invoice mani=new Invoice(03, " mani", 6,4);
	
	service.usingTxn (laddu,mani);
    }
}