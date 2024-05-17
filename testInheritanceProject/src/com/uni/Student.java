package com.uni;

public class Student extends Human{
	
	private String number;
	private String major;
	
	
//  	+Student()
	public Student() {}
	
	
	
//	+Student(name:String,age:int,height:int,weight:int,String number,String major)

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}


//	+printInformation():String
	@Override
	public String printInformation() {
		return super.printInformation() + " " + number + " " + major;
		
	}



	
//	+getXXX()
//	+setXXX()
	
	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}
	

	
	
	
	
	
	
	
	
	
	
	



}
