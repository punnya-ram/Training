package com.training;

public class Application {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("Ramesh",1000);
		System.out.println(account.getUpdatedBalance(2000));
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getUpdatedBalance(3000));
		System.out.println("AccountNumber :="+account.getAccountNumber());
		//System.out.println(BankAccount.getCount());
		//System.out.println(BankAccount.getCount());
		BankAccount account2 = new BankAccount("Suresh",2000);
		System.out.println(account2.getUpdatedBalance(2000));
		System.out.println(account2.getAccountHolderName());
		System.out.println(account2.getAccountNumber());
	}

}


