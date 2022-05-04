package com.mobile.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mobile.Customer;



public class CustomerServices implements CrudRepository<LoanApplication> {
	private Connection con;
	public CustomerServices(Connection con) {
	super();
	this.con=con;
	
	}

	public int add(LoanApplication obj) {
		int addrow=0;
		String custsql="insert into PunnyaCustomer values(?,?,?,?)";
		String loansql="insert into PunnyaLoanApplication values(?,?,?)";
		try(PreparedStatement custpstmt=con.prepareStatement(custsql);
				PreparedStatement loanpstmt=con.prepareStatement(loansql)){
					{
						custpstmt.setInt(1,obj.getCustomer().getCustomerId());
						custpstmt.setString(2,obj.getCustomer().getCustomerName());
						custpstmt.setLong(3,obj.getCustomer().getPhoneNumber());
						custpstmt.setDouble(4,obj.getCustomer().getCreditScore());
						custpstmt.executeUpdate();
						loanpstmt.setInt(1,obj.getApplicationNumber());
						loanpstmt.setInt(2,obj.getCustomer().getCustomerId());
						loanpstmt.setDouble(3,obj.getLoanAmount());
						
						addrow=loanpstmt.executeUpdate();
					}
			
		}catch(SQLException e) { 
			e.printStackTrace();
		}
			
		
		
		return addrow;
	}

	public List<LoanApplication> findAll() {
		List <LoanApplication> loanList=new ArrayList<LoanApplication>();
		String sql="Select pc.Customer_id,pc.Customer_name,pc.Phone_number,pc.Credit_score, pa.Application_number,pa.Customer,pa.Loan_amount from PunnyaCustomer pc,PunnyaLoanApplication pa where pc.Customer_id=pa.Customer";
;
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int customerid=rs.getInt(1);
				String customername=rs.getString(2);
				long phonenumber=rs.getLong(3);
				double creditscore=rs.getDouble(4);
				
				
				int applicationNumber=rs.getInt(5);
				int customer=rs.getInt(6);
				double loanamount=rs.getDouble(7);
				Customer customer1=new Customer(customerid ,customername,phonenumber,creditscore);
				LoanApplication loan=new LoanApplication(applicationNumber,customer1,loanamount);
				loanList.add(loan);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		return loanList;
		
	}

	public Optional<LoanApplication> findBy(int id) {
		Optional<LoanApplication> optional= Optional.empty();
		String sql="Select pc.Customer_id,pc.Customer_name,pc.Phone_number,pc.Credit_score, pa.Application_number,pa.Customer,pa.Loan_amount from PunnyaCustomer pc,PunnyaLoanApplication pa where pc.Customer_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int customerid=rs.getInt(1);
				String customername=rs.getString(2);
				long phonenumber=rs.getLong(3);
				double creditscore=rs.getDouble(4);
				int applicationNumber=rs.getInt(5);
				double loanamount=rs.getDouble(6);
				Customer customer1=new Customer(customerid ,customername,phonenumber,creditscore);
				LoanApplication loan=new LoanApplication(applicationNumber,customer1,loanamount);
				optional=Optional.of(loan);
			}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return optional;
	}

	public int update(int Id, LoanApplication obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
