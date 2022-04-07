package com.training.utils;
import com.training.ifaces.*;

public class Objectfactory {
	
	public Conditional getConditional(int key) {
		switch(key) {
		case 1:
			return new Professor("phd");
		case 2:
			return new Student(89);
			default:
				return null;
		}
	}
	public double getValue(Conditional poly,Object value) {
		//here poly reference type is conditional but objects
		//are Student or professor or principal
		//at runtime test method in the respective objects is called
		//heance run time polymorphism
		boolean result = poly.test(value);
		double travelAllowance=1000;
		if(result) {
			travelAllowance=2000;
		}
		return travelAllowance;
		}
		
	}

