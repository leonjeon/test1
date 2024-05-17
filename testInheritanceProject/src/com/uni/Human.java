package com.uni;

public class Human {
	//Filed 
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	//기본생성자
//	+Human()
	public Human() {}
	
	
//	+Human(name:String,age:int,height:int,weight:int)
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	
	//	+printInformation():String
	//@Override 
	public String printInformation() {
		return name + "  " + age + "  "+ height + "  " + weight;
	}

	
	
	//Getters and Setters	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	

	
	
	
	
	

	
	

}
