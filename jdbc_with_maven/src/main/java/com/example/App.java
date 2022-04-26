package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRespository;
import com.example.entity.Member;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			MemberRespository res=new MemberRespository(con);
			
			res.findAll().forEach(System.out::println);
			
    }catch(SQLException e) {
    	e.printStackTrace();
    }
}
}
