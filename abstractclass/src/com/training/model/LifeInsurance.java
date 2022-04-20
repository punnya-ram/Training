package com.training.model;

public class LifeInsurance extends Insurance {
	private int Age;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		Age = age;
	}



	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public LifeInsurance(int age) {
		super();
		Age = age;
	}

	@Override
	public double calculatePremium() {
		if(Age<50)
			return 5000;
		else
			return 1000;	}
	}
