package com.training.model;

public class Student implements Comparable<Student>{
	private int rollNumber;
	private String fristName;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String fristName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.fristName = fristName;
		this.markScored = markScored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", fristName=" + fristName + ", markScored=" + markScored + "]";
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
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fristName == null) ? 0 : fristName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(markScored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rollNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fristName == null) {
			if (other.fristName != null)
				return false;
		} else if (!fristName.equals(other.fristName))
			return false;
		if (Double.doubleToLongBits(markScored) != Double.doubleToLongBits(other.markScored))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}
	@Override
	public int compareTo(Student otherObj) {
		// TODO Auto-generated method stub
		return otherObj.fristName.compareTo(this.fristName);
	}
	
	

}
