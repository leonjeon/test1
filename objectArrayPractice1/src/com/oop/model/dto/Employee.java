package com.oop.model.dto;

public class Employee {
	
	//Field
	
//	사번 : - empNo:int
//	이름 : - empName:String
//	소속부서 : - dept:String
//	직급 : - job:String
//	나이 : - age:int
//	성별 : - gender:char
//	급여 : - salary:int
//	보너스포인트 : - bonusPoint:double
//	핸드폰 : - phone:String
//	주소 : - address:String
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
//	 1. 디폴트 생성자와 매개변수 있는 생성자 추가함
//		매개변수 있는 생성자 2개 작성함
//		* 사번, 이름, 나이, 성별, 핸드폰, 주소 초기화 생성자
//		* 모든 필드를 초기화하는 생성자
	
	//Constructor
	
	
	public Employee() {}
	
	
	
//	* 사번, 이름, 나이, 성별, 핸드폰, 주소 초기화 생성자
	public Employee(int empNo, String empName, int age, String phone, String address) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.age = age;
	this.phone = phone;
	this.address = address;
}



//	* 모든 필드를 초기화하는 생성자
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
		String phone, String address) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.dept = dept;
	this.job = job;
	this.age = age;
	this.gender = gender;
	this.salary = salary;
	this.bonusPoint = bonusPoint;
	this.phone = phone;
	this.address = address;
	
}
	
	

	// Setter & Getter
	//2. 각 필드에 대한 Setter & Getter 메소드 추가함
	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public double getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
//  3, 모든 필드값을 하나의 문장(문자열합치기)으로 만들어 리턴하는 메소드 추가함	
	
	public String empInformation() {
		
		return "Employee [" + this.empNo + ", " + this.empName + ", " + this.dept + ", " + this.job + 
				"," + this.age + ", " + this.gender + ", " + this.salary + ", " + this.bonusPoint + ", " +
				this.phone + ", " + this.address + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
