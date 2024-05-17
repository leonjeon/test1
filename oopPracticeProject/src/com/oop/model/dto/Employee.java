package com.oop.model.dto;

import java.util.Scanner;

public class Employee {
	
/*	//1.사번 : - empNo:int
		2.이름 : - empName:String
	3소속부서 : - dept:String
	4직급 : - job:String
	5나이 : - age:int
	6성별 : - gender:char
	7급여 : - salary:int
	8보너스포인트 : - bonusPoint:double
	9핸드폰 : - phone:String
	10주소 : - address:String*/
	
	private int empNO;
	private String empName;
	private	String	empDept;
	private	String	empJob;
	private	int	empAge;
	private	char empGender;
	private	int	empSalary;
	private	double	empBonusPoint;
	private	String	empPhone;
	private	String empAddress;
	
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번을 입력하세요 : ");
		this.empNO = sc.nextInt();
		
		System.out.print("이름 입력 : ");
		this.empName = sc.next();
		
		System.out.print("소속부서 입력 : ");
		this.empDept = sc.next();
		
		System.out.print("직급 입력 : ");
		this.empJob = sc.next();
		
		System.out.print("나이 입력 : ");
		this.empAge = sc.nextInt();
		
		System.out.print("성별 : ");
		this.empGender = sc.next().charAt(0);
		
		System.out.print("급여 : ");
		this.empSalary = sc.nextInt();
		
		System.out.print("보너스포인트 : ");
		this.empBonusPoint = sc.nextDouble();
		
		System.out.print("전화번호 : ");
		this.empPhone = sc.next();
		
		System.out.print("주소 : ");
		this.empAddress = sc.next();
		
		empOutput();
	}
	
	
	public void empOutput() {
		System.out.println("사번 " + empNO);
		System.out.println("이름 " + empName);
		System.out.println("소속부서 " + empDept);
		System.out.println("직급 " + empJob);
		System.out.println("나이 " + empAge);
		System.out.println("성별 " + empGender);
		System.out.println("급여 " + empSalary);
		System.out.println("보너스포인트 " + empBonusPoint);
		System.out.println("전화번호 " + empPhone);
		System.out.println("주소 " + empAddress);
	}
	
	//setter 영역 => 변경
	public void setEmpNo(int empNo) {
		this.empNO = empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpBonusPoint(double empBonusPoint) {
		this.empBonusPoint = empBonusPoint;
	}
	
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
}
