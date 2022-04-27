package com.example.util;
import java.sql.*;
import java.util.ResourceBundle;
public class ConnectionFactory {
	
	public static Connection getOracleConnection() {
		Connection con = null;
		ResourceBundle labels = ResourceBundle.getBundle("application");
		try {
			con=DriverManager.getConnection(labels.getString("datasource.oracle.url"),labels.getString("datasource.oracle.username")
					,labels.getString("datasource.oracle.password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static Connection getPostgressConnection() {
		Connection con = null;
		
		try {	
		ResourceBundle labels = ResourceBundle.getBundle("application");
		
		con = DriverManager.getConnection(
				labels.getString("datasource.postgress.url")
				,labels.getString("datasource.postgress.username"),
				labels.getString("datasource.postgress.password"));
		
	          }catch (SQLException e){
		      e.printStackTrace();
	           }
		return con;
		}
	}
		
	


