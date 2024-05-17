package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
		// 객체실습문제
		
//		1. 3개의 생성자를 사용하여 3개의 객체를 배열로 생성함
//		 2. empInformation() 메소드를 사용하여, 3객체의 정보를 출력함
//		 3. 3개의 객체중 값이 없는 필드에 각각 값을 입력해 넣음
//		 4. 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력함
//			연봉 = (급여 + (급여 * 보너스포인트)) * 12 ;
//		 5. 3직원의 1년 연봉의 평균을 구하여 출력함
		
		Employee[] epl = new Employee[3]; //3개의 배열 생성
		
//		epl[0] = new Employee();
//		
//		epl[1] = new Employee(201503, "박길동", 29, "010-1234-5678", "경기도 의정부시");
//		//public Employee(int empNo, String empName, int age, String phone, String address)
//		
//		epl[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123");
//		//(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
//		//String phone, String address)
		
		epl = new Employee[] {
				new Employee(),
				new Employee(201503, "박길동", 29, "010-1234-5678", "경기도 의정부시"),
				new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123")					
		};
		for(int i = 0; i < epl.length; i++) {
			System.out.println(epl[i].empInformation());
		}
		
//		 3개의 객체중 값이 없는 필드에 각각 값을 입력해 넣음
		 //Set이용해서 넣기 
		
				epl[0].setEmpNo(201305);
				epl[0].setEmpName("이영희");
				epl[0].setDept("총무부");
				epl[0].setJob("대리");
				epl[0].setAge(28);
				epl[0].setGender('F');
				epl[0].setSalary(3750000);
				epl[0].setBonusPoint(0.1);
				epl[0].setPhone("010-9512-7534");
				epl[0].setAddress("경기도 동두천");
				
				
//		ear[0] : 201305, 이영희, 총무부, 대리, 28, F, 3750000, 0.1, 010-9512-7534, 경기도 동두천
				
				
				epl[1].setDept("기획부");
				epl[1].setJob("사원");
				epl[1].setGender('M');
				epl[1].setSalary(2900000);
				epl[1].setBonusPoint(0.05);
				
				for(int i = 0; i < epl.length; i++) {
					System.out.println(epl[i].empInformation());
				}
				
//		ear[1] : 201503, 박길동, 기획부, 사원, 29, M, 2900000, 0.05, 010-1234-5678, 경기도 의정부시
				//부서,직급,성별,급여,보너스율,
		
				
//				 4. 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력함
//					연봉 = (급여 + (급여 * 보너스포인트)) * 12 ;
				
				
				

	}

}
