package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.DiscountCalculator;
import com.training.ifaces.Function;
import com.training.sevices.CurrencyConverter;
// A class can only extend another class but it can implement one or more interface
//class Dummy extends Function{
//}

public class Application {

	public static void main(String[] args) {
		//subtype = new subtype
//		CurrencyConverter conv = new CurrencyConverter();
		Function conv = new CurrencyConverter();
		double response =conv.apply(200);
		System.out.println(Function.Counter);
		System.out.println(response);
		
		// Line 13 & 15 and Line 18 are identical
		System.out.println(conv.apply(300));
		//casting function to checkcondition
		if(conv instanceof CheckCondition) {
			CheckCondition obj =(CheckCondition)conv;
			System.out.println("Is Discount Allowed:="+obj.test(300));
		}//else {
			//System.out.println("not allowed:="+obj.test(300));

			
		}
		Conditional condObj = new DiscountCalculator();
		
		System.out.println(condObj.test(6000));
		System.out.println(condObj.negate(6000));
		
	}


