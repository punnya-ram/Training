package com.training.models;

import com.training.ifaces.Conditional;
import com.training.utils.Objectfactory;

public class NewObjectFactory extends Objectfactory {

	@Override
	public Conditional getConditional(int key) {
			Conditional obj=null;
		
		if(key==3) {
			obj = new Principal("arts");
		}else {
			obj=super.getConditional(key);
	}
return obj;
}
}
