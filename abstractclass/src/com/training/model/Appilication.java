package com.training.model;
import com.training.model.VechileInsurance;
import com.training.model.Insurance;
public class Appilication {
	public static void printPremium(Insurance object) {
		System.out.println("Premium="+object.calculatePremium());
	}

	public static void main(String[] args) {
		
		VechileInsurance car = new VechileInsurance(1010,"ramesh","car",2019);
		printPremium(car);
		LifeInsurance life = new LifeInsurance(2020,"ram",76);
		printPremium(life);
		String[] illness = {"bp","sugar","ent","thyroid"};
		HealthInsurance health = new HealthInsurance(3030,"vicky",illness);
		printPremium(health);
	}

}
