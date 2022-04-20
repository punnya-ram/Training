package com.training.exception;

public class Application {


	public static void main(String[] args) throws InvalidEmailException {
		Customer ram = null;
		try {
			ram=new Customer(78,"rwenu",6789054,"punnyarams@gmail.com");
		}catch(InvalidEmailException e) {
			//e.printStackTrace();
			System.out.println();
		}
		System.out.println(ram.getEmail());
		// TODO Auto-generated method stub

	}

}