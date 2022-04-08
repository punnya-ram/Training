package com.training.model;

import com.training.exception.RangeCheckException;

public class Student {
	
	private int rollNumber;
	private String fristName;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", fristName=" + fristName + ", markScored=" + markScored + "]";
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) throws RangeCheckException  {
		if(markScored<0) {
			throw new RangeCheckException("mark should be positive integer[0-100]");
		}else {
			this.markScored = markScored;
		}
		
	}
	public Student(int rollNumber, String fristName, double markScored)throws RangeCheckException {
		super();
		if(markScored<0) {
			try {
				throw new RangeCheckException("mark should be positive integer[0-100]");
			} catch (RangeCheckException e) {
				e.printStackTrace();
			}
		}else {
		this.rollNumber = rollNumber;
		this.fristName = fristName;
		this.markScored = markScored;
	}
	}

}
