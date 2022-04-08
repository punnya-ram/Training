package com.training.services;

public class ExceptionHandling {
	public void usingArrayIndexException(String[]args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method requires three values to be passed[a,b,c]");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	public void usingNumberFormatException(String value) {
		int age=0;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(age);
		
	}
	public void usingFinallyBlock() {
		int denominator=0;
		try {
			System.out.println(4/denominator);
			
		}catch(ArithmeticException e) {
			System.err.println("Denominator Should not be Zero");
			
		}
		finally {
			System.out.println("Inside FINALLY====");
		}
		System.out.println("Thanks,bye,bye");
	}
	public String underFinallyBlock()   {
		int denominator=0;
		try {
			System.out.println(4/denominator);
			
		}catch(ArithmeticException e) {
			System.err.println("Denominator Should not be Zero");
//			return "welcome";
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			System.out.println("Inside FINALLY====");
		}
		System.out.println("bye,bye");
		return "thanks";
	}

}
