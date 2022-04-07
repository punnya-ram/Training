package com.training;
import com.training.utils.Objectfactory;
import com.training.ifaces.Conditional;
import com.training.models.NewObjectFactory;

public class Appilication {

	public static void main(String[] args) {
		Objectfactory factory = new NewObjectFactory();
		Conditional profObj =factory.getConditional(1);
		Conditional studObj =factory.getConditional(2);
		Conditional principalObj =factory.getConditional(3);
		
		System.out.println("Allowance:=" +factory.getValue(profObj,"chennai"));
		System.out.println("Allowance:=" +factory.getValue(studObj,"30"));
		System.out.println("Allowance:=" +factory.getValue(principalObj,"arts"));
		 
	}

}
