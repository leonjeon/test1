package com.test.practice;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);
		
	public void sample1() {
		System.out.print(" 국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print(" 영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print(" 수학 점수 : ");
		int mat = sc.nextInt();
		
		int tot = kor+eng+mat;
		int avg = tot / 3;
		
		String result = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60)? "합격" : "불합격";
		System.out.println("결과 " + result);
		
		
	}
	
	public void sample2() {
		
		System.out.print("학생 이름: ");
		String name = sc.next();
		System.out.print(" 학년 : ");
		int grade = sc.nextInt();
		System.out.print(" 반 : ");
		int cls = sc.nextInt();
		System.out.print(" 번호 : ");
		int num = sc.nextInt();
		System.out.print("성별 (M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.println("성적 : ");
		double avg = sc.nextDouble();
		
		char gender1 = (gender == 'M')? '남' : '여';
		
		//System.out.println(name+"학생 이름"+grade+"학년"+cls+"반"+num+"번호"+gender1+"성별(M/F)"+avg+"성적");
		System.out.println(grade +"학년"+ cls + "반" + num + "번" + gender1 + "학생" + name + "성적이" + avg + "다.");
	
	}
	
	public void sample3() {
		System.out.print("정수 하나 입력");
		int num = sc.nextInt();
	
		String result = (num > 0)? "양수다" : ((num < 0)? "음수다" : "0 이다");
		System.out.println(num + "은" + result);
	}
	
	public void sample4() {
		System.out.print("정수 하나 입력");
		int num1 = sc.nextInt();
		char text1 = sc.next().charAt(0);
		
		String result = (num1 % 2 == 0)? "양수다" : "양수가 아니다";
		System.out.println(num1 + "은" + result);
		System.out.println(num1 + "은" + ((num1 % 2 == 0)? "양수다" : "양수가 아니다"));
		
	}
	public void sample5() {
		// java.lang.Duble참조
		//double 자료형의 최대값, 최소값, 비트수, 바이트 그외 상수필드 값 모두 출력 조회
		
		
		
		
		
		
		
	}
	
	public void sample6() {
		//고객이름(customerName), 나이(age), 성별(gender, 남/여), 전화번호(phone)
		//포인트점수(point, 소숫점아래 둘째자리까지 입력받음), 특이사항(etc)을 입력받아 출력 처리함
		//특이사항 입력 예 : 보라색을 좋아하고 무스크향을 즐겨 사용함
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("고객이름:");
		String customerName = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("전화번호 :");
		String phone = sc.next();
		
		System.out.print("포인트점수:");
		double point = sc.nextDouble();
		
		System.out.print("특이사항:");
		input.nextLine();
		String etc = input.nextLine();
		
		char gender1 = (gender == 'M')? '남' : '여';
		
		System.out.println("고객명 : " + customerName);
		System.out.println("나이 : "+ age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("포인트점수 : " + point);
		System.out.println("특이사항 : " + etc);
	}

}






















