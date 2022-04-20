package com.training.services;

import com.training.model.Converter;

public class Application {
	public static void print(Converter<Double,Double>conv) {
		System.out.println(conv.convert(100.00));
		
	}

	public static void main(String[] args) {
		Converter<Double,Double>  obj=new CurrencyConverter();
		print(obj);
		
		
		Converter<Double,Double> lambda=(val)->val*200.0;
		print(lambda);
		
		Converter<String,Integer> strLength=(str)->str.length();
		System.out.println(strLength.convert("Chennai"));
	}

}
