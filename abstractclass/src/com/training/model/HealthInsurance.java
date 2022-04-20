package com.training.model;

public class HealthInsurance extends Insurance {
	
	
	private String[] preExisitingDiseases;
	
	
		public HealthInsurance(int policyNumber, String policyHolderName, String[] preExisitingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExisitingDiseases = preExisitingDiseases;
	}



	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}



	@Override
	public double calculatePremium() {
		double premium = 10000;
		for(String eachItem: preExisitingDiseases) {
			String item=eachItem.toLowerCase();
			if(eachItem.equalsIgnoreCase ("BP") || eachItem.equalsIgnoreCase("sugar")) {
				premium=15000;
			}
		}
		return premium ;
	}

}
