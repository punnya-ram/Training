package com.training;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;
import com.training.services.SavingsAccountService;
public class Application {

	public static void main(String[] args) {
		BankAccount ramsaccount = new BankAccount(1010,"Ramesh",50000,"saving");
		System.out.println(ramsaccount);
		
       SavingsAccount account = new SavingsAccount(650,"ramesh",1000,"joint","rajesh");
       System.out.println(account.getAccountHolderName());
       System.out.println(account.getNominee());
       SavingsAccountService service = new SavingsAccountService();
       System.out.println (service.getCustomerInfo(account));
       System.out.println(service.calculateInterest(account));
       BankAccountService service2 = new SavingsAccountService();
       
       //cannot access the sub class method with super class reference
       //sevice.gercustomerInfo(account);
       
       SavingsAccountService savingService2 =(SavingsAccountService)service2;
       BankAccountService sc2 = new SavingsAccountService();
       System.out.println(savingService2.getCustomerInfo(account));
	}

}
