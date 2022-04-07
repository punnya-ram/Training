package com.training;

public class ObjectFactory {
    public Automobile getObject(int key){
    	switch (key){
    	case 1:
    		return new MarutiCar();
    	case 2:
    		return new ToyotaCar();
    	default:
    		return null;
    		
    	}
    }
    public void printQuote(Automobile poly){
    	System.out.println("carname:"+poly.getColor());
    	System.out.println("carmodel:"+poly.getModel());
    	System.out.println("carprice:"+poly.getPrice());
    	System.out.println("showroomname:"+poly.showroomname());
    }

}
