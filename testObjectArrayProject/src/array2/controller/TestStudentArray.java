package array2.controller;

import java.util.Scanner;

import array2.model.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		
		// 객체배열실습 문제 2
//		1. 최대 10명의 학생 정보를 기록할 수 있게 배열 할당함
//		2. 학생 정보가 한명씩 추가될 때 마다 카운트함
//			=> while() 문 사용함
//			   계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면
//			   계속 객체 추가하고 키보드로 값 입력받아 기록함.
//		3. 키보드로 3명의 학생 정보를 입력받아, 각 객체에 저장함
//		4. 현재 입력된 학생들의 /점수의 평균/을 구하여 출력함
//		5. 현재 기록된 학생들의 정보를 모두 출력함
		
		
		//1. 변수선언 및 입력(스캐너) 선언먼저
		//1. 최대 10명의 학생 정보를 기록할 수 있게 배열 할당함
		Student[] std = new Student[10]; //객체10개가 아닌 주소만 10개 할당
		Scanner sc = new Scanner(System.in);
		
		int count = 0, totalScore = 0; //점수 평균
		
//		2. 학생 정보가 한명씩 추가될 때 마다 카운트함
		while(true) {
			System.out.println(count + "번째 학생 정보를 입력하세요.");
			std[count] = new Student();
			
			System.out.print("클래스 (A | B | C) : ");
			std[count].setSclass(sc.next().toUpperCase().charAt(0)); //대문자로 기록 처리
			//toUpperCase메소드는 대문자로 바꿔주는 기능
			
			System.out.print("학생 이름 : ");
			std[count].setSname(sc.next());
			
			System.out.println("점수 : ");
			std[count].setScore(sc.nextInt());
			
			totalScore += std[count].getScore();
			
			count++;
			
			System.out.println("계속 추가하시겠습니까? (y | n) : ");
			if(sc.next().toUpperCase().charAt(0) != 'Y') //대문자 Y가 아니면 멈춰라
				break;
			
		}
		//3. 키보드로 3명의 학생 정보를 입력받아, 각 객체에 저장함
//		4. 현재 입력된 학생들의 /점수의 평균/을 구하여 출력함	
		System.out.println(count + "명의 점수 평균 : "	+ (totalScore / count));
		
//		5. 현재 기록된 학생들의 정보를 모두 출력함
		for(int i = 0; i < count; i++) {
			System.out.println(std[i].studentInformation());
		}
		
		
	}

}















