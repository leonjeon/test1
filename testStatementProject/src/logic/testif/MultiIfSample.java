package logic.testif;

import java.util.Scanner;

public class MultiIfSample {
	
	Scanner sc = new Scanner(System.in);
	
	
	/* if(조건식1) {
	 *      조건식1이 true 일때 실행할 구문들
	 * }else if(조건식2) {
	 * 		조건식1이 false이고, 조건식 2가 true일때 실행할 구문들
	 * }else if(조건식3) {
	 * 		조건식1, 조건식2가 false이고, 조건식 3가 true일때 실행할 구문들
	 * }else if(조건식4) {
	 * 		조건식1,2,3이 false이고, 조건식 4가 true일때 실행할 구문들
	 * }else if(조건식5) {
	 * 		조건식1,2,3,4이 false이고, 조건식 5가 true일때 실행할 구문들
	 * }else {
	 * 		위에 제시된 모든 조건이 false이면 실행할 구문
	 * }
	 * */
	
	public void testThreeMax() {
		//3개의 정수를 입력 받아서, 세 수중에서 가장 큰 값을 알아내서 출력
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = sc.nextInt();
		
		int max;
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}else if(num2 > num1 && num2 > num3) {
			max = num2;		
		}else {
			max = num3;
		}
		System.out.println("가장 큰 값은 ? " + max);
	}
	
	public void testScoreGrade() {
		//키보드로 점수(int)를 입력받아, 점수에 대한 등급(char)을 부여해서 출력
		//단, 점수는 반드시 0이상의 값이어야 함
		//다중 if문으로
		//점수가 90이상이면 'A'
		//점수가 80이상이면 'B'
		//점수가 70이상이면 'C'
		//점수가 60이상이면 'D'
		//점수가 60미만이면 'F'
		//점수와 등급을 출력 처리함.
		//점수가 0미만이면 "잘못 입력하셨습니다." 출력
		
		
		System.out.print("점수를 입력하세요");
		int Score = sc.nextInt();
		
		if(Score >= 0) {
			 char grade;
			
			 if(Score >= 90) grade = 'A';
		     else if(Score >= 80) grade = 'B';
		     else if(Score >= 70) grade = 'C';
		     else if(Score >= 60) grade = 'D';
		     else    grade = 'F';
				 
	    	 System.out.println(Score + ": " + grade);
		}else {
			System.out.println("잘못 입력하셨습니다.");
			}
		}
	public void testCharacter() {
		//문자를 하나 입력받아서,
		//영문대문자이면 "upper" 라고 출력하고,
		//영어소문자이면 "lower" 라고 출력하고,
		//숫자문자이면 "digit" 라고 출력하고,
		//한글문자이면 "korean'라고 출력하고, (한글의 범위: '가 ~ '힝')
		//그외의 문자이면 "others" 라고 출력되게 함
		
		System.out.print("문자 하나 입력");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " upper ");
		else if(ch >= 'a' && ch <= 'z')
			System.out.println(ch + " lower ");
		else if(ch >= '0' && ch <= '9')
			System.out.println(ch + " digit ");
		else if(ch >= '가' && ch <= '힝')
			System.out.println(ch + " korean ");
		else 
			System.out.println(" others ");
	}
	
	public void testTwoMaxEqual() {
		//두 개의 정수를 입력받아서, 두 수를 비교해서
		//A가 B보다 크다.
		//A가 B와 같다.
		//B가 A보다 크다. 중 하나가 출력되게 구현
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println(num1 + "가" + num2 + " 보다 크다 " );
		else if(num1 == num2)
			System.out.println(num1 + "가" + num2 + "와 같다 ");
		else
			System.out.println(num2 + "가" + num1 + "보다 크다");
						
	}

}
























