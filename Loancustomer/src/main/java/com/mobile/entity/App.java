package com.mobile.entity;
import java.sql.*;
import java.util.Optional;
import com.mobile.Customer;
import com.mobile.services.CustomerServices;
import com.mobile.services.LoanApplication;
import com.mobile.util.ConectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 
			
			Connection con;
	    	con =ConectionFactory.getOracleConnection();
	    	CustomerServices services=new CustomerServices(con);
	    	//Optional<LoanApplication> findId=services.findBy(111);
	    	//System.out.println(findId);
	    	Customer toAdd = new Customer(80,"todo",853478812,456);
	        LoanApplication toAdd1 = new LoanApplication( 78, toAdd,3500);

	    System.out.println(services.add(toAdd1));
	    	
			//int rowAdded=services.add(loan1);
			//System.out.println("Row Added :="+rowAdded);
			//services.findAll().forEach(System.out::println);
	    	//System.out.println(con);
    }
    
}
