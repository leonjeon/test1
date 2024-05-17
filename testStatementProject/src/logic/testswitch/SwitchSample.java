package logic.testswitch;

import java.util.Scanner;

public class SwitchSample {
	/* switch(변수 또는 계산식) {  //값이 뭐냐? (변수 == 값)
	 * case 값:  값이 맞았을 때 실행할 문장;    break;
	 * case 값:  ....................;  break;
	 * default:  위에 제시한 값이 모두 아닐 때 실행할 문장; break;는 생략해도 됨
	 * }
	 * => default는 사용 안 할수도 있음
	 * => case 에 사용하는 값은 양의 정수, 문자리터럴, 문자열값 3가지 종류만 사용할 수 있다.
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		//정수를 하나 입력받아서
		//1이면 "입장하세요." 라고 출력
		//2이면 "줄 서세요." 라고 출력
		//3이면 "퇴장 하세요." 라고 출력
		//제시한 값이 모두 아니면 "즐겁게 구경하세요." 출력 처리함
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:  System.out.println("입장하세요"); break;
		case 2:  System.out.println("줄 서세요"); break;
		case 3:  System.out.println("퇴장 하세요"); break;
		default: System.out.println("즐겁게 구경하세요");
		}
	}
	
	public void calculator() {
		/* 입력 예 :
		 * 첫번째 정수 : 25
		 * 두번째 정수 : 7
		 * 연산문자 (+, -, *, /, %) : +
		 * 출력 예 :
		 * 25 + 7 = 32
		 * => 입력된 연산문자에 따라 계산식과 결과가 출력되게 구현
		 * */
		//출력값
		System.out.print("첫번째 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.print("연산기호 +,-,*,/,% ");
		char n3 = sc.next().charAt(0);
		
		//입력값
		/*
		switch(n3) {
		case '+': System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));  break;
		case '-': System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));  break;
		case '*': System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));  break;
		case '/': System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));  break;
		case '%': System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));  break;
		default : System.out.println("잘못입력하셨습니다");
		
		} */
		
		int result = 0; //지역변수는 반드시 초기화해야 함
		
		switch(n3) {
		case '+': result = n1 + n2; break;
		case '-': result = n1 - n2; break;
		case '*': result = n1 * n2; break;
		case '/': result = n1 / n2; break;
		case '%': result = n1 % n2; break;
		default : System.out.println("잘못입력하셨습니다");
		}
		
		System.out.println(n1 + " " + n2 + " " + " = " + result);
	}
	
	public void calculator2() {
		/* 과일명(String)과 수량(int)을 입력 받아, 가격을 계산해서 출력
		 * 과일에 따라 한개의 가격 저장용 변수 준비 : int price;
		 * 사과 1200
		 * 배   2500
		 * 포도 5000
		 * 오렌지500
		 * 키위  350
		 * 그 외 다른 과일은 0으로 처리
		 * 
		 * 총구매가격 : price * 수량
		 * 출력 :
		 * 사과 한 개의 가격은 1200원
		 * 구매수량은 5개
		 * 총 구매가격 : 6000원
		 * */
		
		System.out.print(" 과일명 : " );
		String fruitName = sc.next();
		System.out.print(" 구매수량 :  " );
		int quantity = sc.nextInt();
		
		int price = 0;
		
		switch(fruitName) {
		case "사과": price = 1200; break;
		case "배": price = 2500; break;
		case "포도": price = 5000; break;
		case "오렌지": price = 500; break;
		case "키위": price = 350; break;
		
		}
		System.out.println( fruitName + " 한 개의 가격은 : "+ + price + " 원 ");
		System.out.println(" 구매수량은 : " + quantity + " 개 ");
		System.out.println(" 총 구매가격 : " +  (price * quantity) + " 원 ");
	}
	
	public void calculator2change() {
	
		System.out.print(" 과일명 : " );
		String fruitName = sc.next();
		
		//입력된 과일명이 판매되는 과일일 때만 아래 내용이 작동되게 함
			if(fruitName.equals("사과") | fruitName.equals("배") |
			fruitName.equals("포도") | fruitName.equals("오렌지") | fruitName.equals("키위")) {
			System.out.print(" 구매수량 :  " );
			int quantity = sc.nextInt();
			
			int price = 0;
			
			//기본자료형(Primitive Type) 변수방에는 값이 기록됨
			//연산자는 값을 계산함
			//클래스(Reference Type)를 자료형으로 만든 변수 == 레퍼런스 변수
			//레퍼런스 변수방에는 할당된 객체의 주소가 기록됨
			//레퍼런스.메소드(전달값)
			
			//switch 를 다중 if 문으로 변
			/*if(fruitName.equals("사과")) price = 1200;
			else if(fruitName.equals("배")) price = 2500;
			else if(fruitName.equals("포도")) price = 5000;
			else if(fruitName.equals("오렌지")) price = 500;
			else if(fruitName.equals("키위")) price = 350; */
			
			//switch 를 if 문으로 변경
			if(fruitName.equals("사과")) price = 1200;
			if(fruitName.equals("배")) price = 2500;
			if(fruitName.equals("포도")) price = 5000;
			if(fruitName.equals("오렌지")) price = 500;
			if(fruitName.equals("키위")) price = 350;
		
			System.out.println( fruitName + " 한 개의 가격은 : "+ + price + " 원 ");
			System.out.println(" 구매수량은 : " + quantity + " 개 ");
			System.out.println(" 총 구매가격 : " +  (price * quantity) + " 원 ");
			
		} //판매되는 과일인지 확인
			else {
			//판매되지 않는 과일이면
				System.out.println("판매되지 않는 과일입니다.");
				System.out.println("확인하고 다시 입력하세요.");
		}
	}
	
}






















