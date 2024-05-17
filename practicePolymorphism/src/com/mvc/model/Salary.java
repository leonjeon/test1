package com.mvc.model;

public class Salary {
//	1. super클래스 : com.mvc.model.Salary
//    필드 :  
//        - name:String 	//이름
//        - pay:long  	//기본급      
//		  - familyP:long	//가족수당    
//	      - overtimeP:long	//시간외수당   
//		  - incenP:long	//성과금   
//		  - tax:long		//세금  
//		  - totalPay:long	//실수령액
//        - family:int 	//가족수    
//		  - overtime:int	//초과근무시간
//        - static float incentive //인센티브 - 초기값(0.5)
//        - static int count        //총인원 - 초기값(0)
//	
	//Field 생성
	
	private String name;
	private long pay;
	private long familyP;
	private long overtimeP;
	private long incenP;
	private long tax;
	private long totalPay;
	private int family;
	private int overtime;
	private static float incentive = 0.5f;
	private static int count = 0;
	
	
	
	

//	 생성자 : 디폴트생성자, 매개변수 있는 생성자
//	   + Salary(String name, long pay, int family, int overtime)

	
	public Salary() {
		super();
	}
	
	public Salary(String name, long pay, int family, int overtime) {
		super();
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;
// => 생성자가 실행될 때마다 count 1 증가시킴	
		count++;
	}

	
//	 메소드 : 모든 필드에 대한 getter & setter 작성
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPay() {
		return pay;
	}

	public void setPay(long pay) {
		this.pay = pay;
	}

	public long getFamilyP() {
		return familyP;
	}

	public void setFamilyP(long familyP) {
		this.familyP = familyP;
	}

	public long getOvertimeP() {
		return overtimeP;
	}

	public void setOvertimeP(long overtimeP) {
		this.overtimeP = overtimeP;
	}

	public long getIncenP() {
		return incenP;
	}

	public void setIncenP(long incenP) {
		this.incenP = incenP;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static float getIncentive() {
		return incentive;
	}

	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}


	
	
	
	

	

}
