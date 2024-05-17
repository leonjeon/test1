package logic.home.model;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);
	
	
	public void maxNumber() {
		// 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
				
			
		if(num1 > num2) {
			System.out.println("두 수중 큰 값은? " + num1);
		
		}else if(num2 > num1) {
			System.out.println("두 수중 큰 값은? " + num2);
		}
	
	}

	public void minNumber() {
		// 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
		System.out.println(" first 정수 : ");
		int first = sc.nextInt();
		System.out.println(" second 정수 : ");
		int second = sc.nextInt();
		
		if(first < second ) {
			System.out.println(" 두 수중 작은 값은? " + "첫번째" + first);
		}else if(second < first)
			System.out.println(" 두 수중 작은 값은? " + "두번째" + second);
				
	}

	public void threeMaxMin() {
		// 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num2) {
			System.out.println(" 세 수중 가장 큰 수는? " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(" 세 수중 가장 큰 수는? " + num2);
		}else if(num3 > num1 && num3 > num1) {
			System.out.println(" 세 수중 가장 큰 수는? " + num3);
		}if(num1 < num2 && num1 <num3) {
			System.out.println(" 세 수중 가장 작은 수는? " + num1);
		}else if(num2 < num1 && num2 < num3) {
			System.out.println(" 세 수중 가장 작은 수는? " + num2);
		}else if(num3 < num1 && num3 < num2) {
			System.out.println(" 세 수중 가장 작은 수는? " + num3);
		}
		
	}

	public void checkEven() {
		// 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기
		System.out.println(" 정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num + "짝수입니다.");
		}else
			System.out.println(num + "홀수입니다.");
		
	}

	public void isPassFail() {
		// 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기
		System.out.println("국어");
		int kor = sc.nextInt();
		System.out.println("영어");
		int eng = sc.nextInt();
		System.out.println("수학");
		int mat = sc.nextInt();
		int tot = kor+eng+mat;
		double avg = tot / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격!!");
			
		}else {
			System.out.println("불합격!!");
		}
		
		
	}

	public void scoreGrade() {
		// 점수를 입력받아, 학점 확인하기
		System.out.println("정수 입력");
		int score = sc.nextInt();
				
		if(score >= 90) {
			System.out.println('A');
		}else if (score >= 80) {
			System.out.println('B');
		}else if (score >= 70) {
			System.out.println('C');
		}else if (score >= 60)
			System.out.println('D');
		else
			System.out.println("F");
		
	}

	public void checkPlusMinusZero() {
		// 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기
		System.out.println("정수 입력");
		int score = sc.nextInt();
		
		if(score > 0) {
			System.out.println("양수");
		}else
			System.out.println("음수");
		
		
		
	}

	public void whatCaracter() {
		// 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기
		
		System.out.println("알파벳을 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z' ) {
			System.out.println("대문자");
			
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		}else
			System.out.println("알파벳만 입력하세요");
		
	}





}
