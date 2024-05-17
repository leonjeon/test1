package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	Scanner sc = new Scanner(System.in);
	
	//클래스 안에 생성자가 존재하지 않으면, java virtual machine(jvm)이 컴파일할 때
	//기본생성자를 (public 클래스명() {}) 클래스에 자동 추가하면서 컴파일함

	public void myProflie() {
		// 내 신상정보 변수에 담아 출력하기(이름,나이,성별(남/여),전화번호,이메일)
		String name = sc.next();
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		String phone = sc.next();
		String email = sc.next();
		
		System.out.println(" 이름 : " + name);
		System.out.println(" 나이 : " + age);
		System.out.println(" 성별 : " + gender);
		System.out.println(" 전화번호 : " + phone);
		System.out.println(" 이메일 : " + email);
	
	}

	public void empInformation() {
		// 사원정보를 키보드로 입력받아 출력하기
		
	}

	public void defaultValue() {
		// 기본 자료형 변수의 초기값 확인하기
		// 변수 초기화 : 변수 방 만들면서 바로 초기값을 기록시킴
		// 초기값 : 변수 방에 첫번째로 기록되는 값
		// 작성 : 자료형 변수명 = 초기값;
		boolean flag = false;
		char ch = '\u0000';
		byte bnum = 0;
		short snum = 0;
		int inum = 0; 
		long lnum = 0L;
		float fnum = 0.0f;
		double dnum = 0.0;
		
		System.out.println("flag : " + flag);
		System.out.println("ch : " + ch);
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
									
	}

		
	

}
