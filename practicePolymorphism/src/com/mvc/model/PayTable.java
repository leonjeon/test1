	package com.mvc.model;
	
	import com.mvc.view.Output;
	
	//3. Salary, Calulate, Output를 PayTable 이 다중 상속받아서 처리(오브젝트배열이용)
	//패키지명 : com.mvc.model
	//- sub클래스명 : PayTable
	
	
	public class PayTable extends Salary implements Calculate, Output{
	
	//	  => default 생성자 작성
		public PayTable() {
			super();
			// TODO Auto-generated constructor stub
		}
	//	  => 매개변수 있는 생성자 작성 : 받은 초기값을 모두 부모 생성자 쪽으로 넘김
		public PayTable(String name, long pay, int family, int overtime) {
			super(name, pay, family, overtime);
			// TODO Auto-generated constructor stub
		}
		
		
	//	  => 상속받은 추상메소드 오버라이딩함.
	
	
		@Override
		public void calc() {
			
//			1. 가족수당 : 가족이 3명 미만이면 //가족수// * 20000,// 3명 이상이면 무조건 60000
			if(super.getFamily() < 3) {
				super.setFamilyP(super.getFamily() * 20000);			
			}else{ super.setFamilyP(60000);
			
			}
//			2. 시간외수당 : 시간외근무 * 5000
			super.setOvertimeP(super.getOvertime() * 5000);
			
//			3. 세금 : 기본급의 10%
			super.setTax((long)(getPay() * 0.1));
			
//			4. 성과금 : 인센티브 * 기본급
			super.setIncenP((long)(super.getIncentive() * super.getPay()));
			
//			5. 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금
			super.setTotalPay(super.getPay() + super.getFamilyP() + super.getOvertimeP() - super.getTax());
			
			
		}
		
		@Override
		public void out() {
			
			// System.out.println(PayTable.getIncentive());
			if(PayTable.getIncentive() == 0.5f) { 
				System.out.println(super.getName() 		// 이름
					+ "\t    " + super.getPay() 		// 기본급
					+ "\t" + super.getFamily() 	// 가족수당
					+ "\t" + super.getFamilyP()
					+ " \t" + super.getOvertime() 	// 시간외근무
					+ "\t    " + super.getOvertimeP() 	// 시간외수당
					+ "\t" + super.getTax() 	// 세금
					+ "\t" + super.getIncentive() 	// 인센티브(%)
					+ "\t" + super.getIncenP() 	// 성과금
					+    " \t " + super.getTotalPay() 	// 실수령액
					 );
				
			} else if(PayTable.getIncentive() == 0.7f) { 
				System.out.println(super.getName() 		// 이름
						+ "\t    " + super.getPay() 		// 기본급
						+ "\t" + super.getFamily() 	// 가족수당
						+ "\t" + super.getFamilyP()
						+ " \t" + super.getOvertime() 	// 시간외근무
						+ "\t    " + super.getOvertimeP() 	// 시간외수당
						+ "\t" + super.getTax() 	// 세금
						+ "\t" + super.getIncentive() 	// 인센티브(%)
						);			}
			
			
		}
	
		
	}
