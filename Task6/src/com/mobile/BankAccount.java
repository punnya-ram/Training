package com.mobile;

public abstract class BankAccount {
	public double getBalance() {
		return balance;
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBusinessAccountholder() {
		return businessAccountholder;
	}
	public void setBusinessAccountholder(String businessAccountholder) {
		this.businessAccountholder = businessAccountholder;
	}
	public String getSavingsAccountholder() {
		return savingsAccountholder;
	}
	public void setSavingsAccountholder(String savingsAccountholder) {
		this.savingsAccountholder = savingsAccountholder;
	}
	private double balance;
	private String businessAccountholder;
	private String savingsAccountholder;
	
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	public BankAccount(double balance2, String accountHolder) {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
}