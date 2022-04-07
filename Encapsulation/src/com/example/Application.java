package com.example;
import com.example.model.*;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student();
	//	ram.rollNumber=101;
		//default method unable to access=>
		//because student class is in com.example.model package
		//and Application is in com.example package
		//ram.setRollNumber(5020);
		//unable to acess bc the method is private in student class
		//ram.setMarkScored(89);
		//ubable to access bc appication is not a subclass of Student and also in diiferent package
		//ram.setFirstName("punnya");
		ram.setBranch("BE");
		System.out.println("Roll Number :="+ram.getRollNumber());
		System.out.println("Mark Scored:="+ram.getMarkScored());
		System.out.println("Student Name:="+ram.getFirstName());
		Student shyam= new Student (89,"punnya",78,"it");
		System.out.println( "Roll Number:="+shyam.getRollNumber());
		System.out.println("Student Name:="+shyam.getMarkScored());
	
	Student magesh = new Student(988, "Subramani", "textile");

	System.out.println("Roll Number:="+magesh.getRollNumber());
	
	
	}
	
	
	
	

}