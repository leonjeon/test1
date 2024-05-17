package com.oop.model.dto;

import java.util.Scanner;

public class RunEmpTest {

	public static void main(String[] args) {
		
		mainMenu();
		
	}
	
	
	
//	1. 새 사원 정보 입력  => empInput() 메소드 실행
//	2. 사원 정보 수정 => 부메뉴 나타남
//    3. 사원 정보 삭제
//	4. 사원정보 출력 =>  empOutput() 메소드 실행
//	9. 끝내기

	public static void mainMenu() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		char answer = 'A';//끝내기 메뉴작성으로 do ~ while문 밖에서 변수 선언
		
		
		do {
			System.out.println("******* 사원 정보 관리 프로그램 ************");
			System.out.println("1. 새 사원 정보 입력 : ");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			int no = sc.nextInt();
		
			switch(no){
			
			case 1: 
					emp = new Employee();
					emp.empInput();
					
					break;
			
			case 2:  	
					if(emp != null) {
						modifyMenu(emp);
					}else {
						System.out.println("사원 정보 없음");
					}
					break;
			
			case 3: emp = null;					
					break;
			
			case 4:	
					if(emp != null) {
						emp.empOutput();
					}else {
						System.out.println("사원 정보 없음");
					}
					break;
			
			case 9: System.out.println("정말로 끝내시겠습니까? (Y | N) : ");											
				answer = sc.next().toUpperCase().charAt(0);
				if(answer == 'Y') {
						return;
					} break;
			
			
			
			default: System.out.println("잘못된 번호를 입력하셨습니다.");
			 		 System.out.println("확인하고 다시 입력하세요.");
			}
				
		}while(answer != 'Y'); //Y가 아니면 다시 돌아야되기 때문에 != Y 조건입력
		
		
	}
	
	public static void modifyMenu(Employee e) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("**** 사원 정보 수정 메뉴 *****");
			System.out.println("1. 이름변경");
			System.out.println("2. 급여변경");
			System.out.println("3. 부서변경");
			System.out.println("4. 직급변경");
			System.out.println("5. 이전 메뉴로 이동");
			int no = sc.nextInt();
			
			switch(no) {
			case 1:
				System.out.println("변경할 이름 입력 : ");
				String name = sc.next();
				e.setEmpName(name); 		
				e.empOutput();
				break;
				
			case 2:
				System.out.println("변경할 급여 입력 : ");
				int salary = sc.nextInt();
				e.setEmpSalary(salary); 	
				e.empOutput();
				break;
				
			case 3:
				System.out.println("변경할 부서 입력 : ");
				String dept = sc.next();
				e.setEmpDept(dept); 		
				e.empOutput();
				break;
			
			case 4:
				System.out.println("변경할 직급 입력 : ");
				String job = sc.next();
				e.setEmpJob(job); 			
				e.empOutput();
				break;
		
			case 5:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
				
				
			}
		
		}while(true);
	}
}
