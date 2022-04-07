package com.mobile;

public class Application {
	public static void main(String[] args) {
	SavingsAccount ram= new SavingsAccount(1000,"ram");
	ram.deposit(5000);
	ram.withdraw(2000);
	System.out.println(ram.getBalance());
	ram.deposit(15000);
	SavingsAccount ravi= new SavingsAccount(6000,"ravi");
	ravi.deposit(7000);
	ravi.withdraw(2000);
	System.out.println(ram.getBalance());
	ravi.deposit(15000);

	}
}
