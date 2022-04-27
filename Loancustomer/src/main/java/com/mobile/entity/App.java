package com.mobile.entity;
import java.sql.*;

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
	    	System.out.println(con);
    }
}
