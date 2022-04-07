package com.training.models;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String typeofCollege;
	
	public Principal(String typeofCollege) {
		super();
		this.typeofCollege = typeofCollege;
	}
	public String getTypeofCollege() {
		return typeofCollege;
	}
	public void setTypeofCollege(String typeofCollege) {
		this.typeofCollege = typeofCollege;
	}
	@Override
	public boolean test(Object value) {
		String strLocation =(String)value;
				boolean result = false;
		if(this.typeofCollege.equals("engg") || strLocation.equals("rural")) {
			result =true;
			
		}
		return result;
	}

}
