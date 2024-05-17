package silsub.test;

import java.util.Scanner;

public class SilsubSampleMunjae {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		System.out.print(" 국어 점수 : " );
		int kor = sc.nextInt();
		System.out.print(" 영어 점수 : " );
		int eng = sc.nextInt();
		System.out.print(" 수학 점수 : " );
		int mat = sc.nextInt();
		
		int tot = kor+eng+mat;
		double avg = tot / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("국어 점수 : " + kor);
			System.out.println("영어 점수 : " +eng);
			System.out.println("수학 점수 : " +mat);
			System.out.println("총점 : " +tot);
			System.out.println("평균 : " +avg);
			
		}else { 
		
			System.out.println("불합격입니다");
		}
	}
	public void test2() {
		
		//콘솔상에 보여지는 값
		System.out.println(" 1. 입력  ");
		System.out.println(" 2. 수정  ");
		System.out.println(" 3. 조회  ");
		System.out.println(" 4. 삭제  ");
		System.out.println(" 7. 종료  ");
		System.out.print(" 메뉴번호 입력 : " );
		int num = sc.nextInt();
		
		
		/*
		 
		if(num == 1) {
			System.out.println("입력메뉴가 선택되었습니다.");
		}else if(num ==2) {
			System.out.println("수정메뉴가 선택되었습니다.");
		}else if(num ==3) {
			System.out.println("조회메뉴가 선택되었습니다.");
		}else if(num ==4) {
			System.out.println("삭제메뉴가 선택되었습니다.");
		}else if(num ==7) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하십시오.");
		}
		
		*/
		
		switch(num){
		
		case 1:     System.out.println("입력메뉴가 선택되었습니다.");   break;
		case 2:		System.out.println("수정메뉴가 선택되었습니다.");  	break;
		case 3:		System.out.println("조회메뉴가 선택되었습니다.");	break;
		case 4:		System.out.println("삭제메뉴가 선택되었습니다.");	break;
		case 7:		System.out.println("프로그램이 종료됩니다.");		break;
		default :   System.out.println("번호가 잘못 입력되었습니다.");
					System.out.println("다시 입력하십시오.");  //break; <- 생략해도되고 안해도됨.
		
		}
		
	
	}
	
	public void test3() {
		
		System.out.print("정수 하나 입력하시오 : ");
		int num1 = sc.nextInt();
		
		if(num1 > 0) {
			System.out.println(num1 + "은 양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}
	
	public void test4() {
		
		System.out.print(" 정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " 짝수다 ");
		}else {
			System.out.println("홀수다");
		}
	}
	
	public void inputTest() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		if(name != null && name.length() > 0 && age > 0 && height > 0) {
			System.out.println(name + ", " + age + ", " + height);
			System.out.println("확인 : "+ name +"의 나이는 "+ age +"세이고, 키는 "+ height +"cm 이다.");
		}
		
	}
	
	public void test6() {
		
		System.out.print(" 첫번째 정수 : " );
		int num1 = sc.nextInt();
		System.out.print(" 두번째 정수 : " );
		int num2 = sc.nextInt();
		
		if(num1 >= 0 && num2 >= 0) {
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println(num1 / num2);
			System.out.println(num1 % num2);
			
		}
	}
	public void test7() {
		
		System.out.print(" 점수를 입력하시오 : ");
		int score = sc.nextInt();
			
		if(score >= 0) {
			
			char grade;
			
			if(score >= 90) grade = 'A';
			else if(score >= 80) grade = 'B';
			else if(score >= 70) grade = 'C';
			else if(score >= 60) grade = 'D';
			else grade = 'F';
				
			System.out.println(score + " , " + grade);
			
		}
		
	
		
	}

}



















