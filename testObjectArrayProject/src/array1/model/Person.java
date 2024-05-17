package array1.model;

public class Person {

	private String name;		//이름
	private	int age;			//나이
	private char gender;		//성별
	private	double height;		//키
	private double weight;		//몸무게
	
	
	//Constructor
	
	public Person(String name, int age, char gender, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	public Person() {}
	
	//getter and setter
	
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	public String toString() {
		return "Person [" + this.name + ", " + this.age + ", " + this.gender + ", " + this.height + ", " + this.weight +"]";
				
		
		//return "Student[" + this.sclass + ", " + this.sname + ", " + this.score +"]";
	}
	
	

	
	

}
