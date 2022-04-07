package com.example.model;

public class Student {
	private int rollNumber;
	private String firstName;
	private double markScored;
	private String branch;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String firstName, double markScored, String branch) {
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
		this.branch = branch;
	}
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,99,branch);
        this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	 void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
}
