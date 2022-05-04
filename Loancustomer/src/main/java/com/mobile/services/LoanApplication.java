package com.mobile.services;

import java.util.List;

import com.mobile.Customer;

public class LoanApplication {
	private int applicationNumber;
	private  Customer customer;
	private double loanAmount;
	public LoanApplication(int applicationNumber2, Customer customer1, List<LoanApplication> loanList) {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanApplication(int applicationNumber, Customer customer, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customer = customer;
		this.loanAmount = loanAmount;
	}
	public LoanApplication(int applicationnumber2, int customer2, double loanamount2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", customer=" + customer + ", loanAmount="
				+ loanAmount + "]";
	}
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

}
