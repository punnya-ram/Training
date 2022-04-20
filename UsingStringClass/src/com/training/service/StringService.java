package com.training.service;

public class StringService {
	public void stringEquals(String str1,String str2)
	{
		System.out.println("Is Value Same :="+ str1.equals(str2));
		System.out.println("Are they Pointing to Same Location:="+ (str1==str2));
	}
	public void stringObectEquals() {
		String ram = new String("Ram");
		String ramudu = new String("Ram");

		System.out.println("Is Value Same :="+ ram.equals(ramudu));
		System.out.println("Are they Pointing to Same Location:="+ (ram==ramudu));

		
	}
	public String usingTrim(String name) {
		System.out.println("Without Trim:="+name);
		System.out.println("Left Trim:="+name.trim());
		return name.trim();
		
	}
	public void lengthofString(String name) {
		//String resp=usingTrim(name);
		//two ways
		System.out.println("String length:="+name.trim().length());
	}
	public void usingSubString(String name) {
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,3));
	}
	public void usingCharAtIndexOf(String name) {
		System.out.println("Index Position of @:"+name.indexOf('@'));
		
		System.out.println("Character At Position 3:="+name.charAt(3));
	}
	public void usingReplace(String str1,String str2) {
		System.out.println(str1.replace(".com",".org"));
		System.out.println(str2.replace('c','m'));
	}
	public void usingConcat(String str1,String str2) {
		System.out.println(str1.concat(str2));
		StringBuilder builder=new StringBuilder(str1);
		builder.append(str2);
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1,String str2) {
		System.out.println(str1.compareTo(str2));
	}
	public void usingStringFormat(String string,double mark) {
		String frmtString = String.format("Name %S",string);
		System.out.println(frmtString);
		System.out.println(String.format("Mark %,2f",mark));
	}
	public void usingStringFormat(int mark) {
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa Decimal %x", mark));
	}
		public void usingStringFormat(int mark1,int mark2) {
	    	System.out.println(String.format(" octal %1$o,  Hexa %2$x", mark1,mark2));
	    	
	    }
	
	public void usingStringFormat(String str1,String str2) {
		System.out.println(String.format("%1$s,%2$S",str1,str2));
	}
	public void usingStringFormat(long value) {
		System.out.println(String.format("%+d",value));
	}
	
}
