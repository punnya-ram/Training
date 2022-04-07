package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Greeting1 s = new Greeting1();
       // System s = new System(;) bc system constructor is private
        System.out.println(s.getMessage());
        System.out.println(Greeting1.getInfo());
        //System.out.println(grtObj.getMessage());
       // System.out.println(grtObj.getInfo());
        
	}
}
