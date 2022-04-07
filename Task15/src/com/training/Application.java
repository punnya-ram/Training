package com.training;

public class Application {

	public static void main(String[] args) {
		ObjectFactory factory=new ObjectFactory();
		Automobile marutiObj=factory.getObject(1);
		Automobile toyotaObj=factory.getObject(2);
		
		
		
		factory.printQuote(marutiObj);
		factory.printQuote(toyotaObj);
		
	}

}
