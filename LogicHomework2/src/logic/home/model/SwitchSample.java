package logic.home.model;

import java.util.Scanner;

public class SwitchSample {
	
	Scanner sc = new Scanner(System.in);
	
	public void calculator() {
		//두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산기호 +, -, *, /, %");
		char num3 = sc.next().charAt(0);
		
		switch(num3) { //스위치는 숫자만 들어감
		case '+': System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  break;
		case '-': System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));  break;
		case '*': System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));  break;
		case '/': System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));  break;
		case '%': System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));  break;
		default : System.out.println("잘못 입력!!");
			
		}
		
		
	}

	public void fruitPrice() {
		//과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기
		System.out.println("과일 입력");
		String fruitName = sc.next();
		System.out.println("구매 수량");
		int count = sc.nextInt();
		
		int price = 0;
		
		switch(fruitName) {
		case "사과" : price = 1200; break;
		case "배" : price = 2400; break;
		case "멜론" : price = 5000; break;
		case "수박" : price = 8800; break;
		case "토마토" : price = 1200; break;
		case "자두" : price = 1500; break;
		}
		
		System.out.println(fruitName + "의 가격은" + price + "원");
		System.out.println(fruitName + "구매 수량은" + count + "개");
		System.out.println("총 구매 수량과 가격은" + (price * count));
		
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

