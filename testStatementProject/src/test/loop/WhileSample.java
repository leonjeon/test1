package test.loop;

import java.util.Scanner;

public class WhileSample {
	//while 문 : 횟수가 정해지지 않은 반복 처리에 주로 사용함
	
	public void printUnicode() {
		//문자 하나를 입력 받아서, 그 문자의 유니코드를 출력함
		//반복 실행함, 단, '0'이 입력되면 반복을 끝내도록 함
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 문자 하나 입력 : " );
		//char ch = sc.next().charAt(0);
		char ch;
		
		//while(ch != '0') {
		while((ch = sc.next().charAt(0)) !='0') {
			System.out.println(ch + " is unicode " + (int)ch);
			
			System.out.print(" 문자 하나 입력 : " );
			//ch = sc.next().charAt(0);
		}
		
		System.out.println("while 반복 종료됨");
	}
	
	public void printUnicode2() {
		//문자 하나를 입력 받아서, 그 문자의 유니코드를 출력함
		//반복 실행함, 단, '0'이 입력되면 반복을 끝내도록 함
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print(" 문자 하나 입력 : " );			
			char ch = sc.next().charAt(0);
			
			if(ch == '0') {
				break;
			}
			
			System.out.println(ch + " is unicode " + (int)ch);
		}
		
		System.out.println("while 반복 종료됨");
	}
	
	public void printUnicode2ChangeFor() {
		//문자 하나를 입력 받아서, 그 문자의 유니코드를 출력함
		//반복 실행함, 단, '0'이 입력되면 반복을 끝내도록 함
		Scanner sc = new Scanner(System.in);
		
		//while 을 for 문으로 바꾼다면
		//for( ; true; ) {
		for( ; ; ) {
		//while(true) {
			System.out.print(" 문자 하나 입력 : " );			
			char ch = sc.next().charAt(0);
			
			if(ch == '0') {
				break;
			}
			
			System.out.println(ch + " is unicode " + (int)ch);
		}
		
		System.out.println("for 반복 종료됨");
	}
	
	public void printUnicodeChangeFor() {
		//문자 하나를 입력 받아서, 그 문자의 유니코드를 출력함
		//반복 실행함, 단, '0'이 입력되면 반복을 끝내도록 함
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 문자 하나 입력 : " );
		//char ch = sc.next().charAt(0);
		char ch;
		
		//while 을 for 문으로 바꾼다면
		for( ; (ch = sc.next().charAt(0)) != '0';) {
		//while((ch = sc.next().charAt(0)) !='0') {
			System.out.println(ch + " is unicode " + (int)ch);
			
			System.out.print(" 문자 하나 입력 : " );
			//ch = sc.next().charAt(0);
		}
		
		System.out.println("while 반복 종료됨");
	}
	
	public void printUnicode2DoWhile() {
		//문자 하나를 입력 받아서, 그 문자의 유니코드를 출력함
		//반복 실행함, 단, '0'이 입력되면 반복을 끝내도록 함
		Scanner sc = new Scanner(System.in);
		
		//while 을 do ~ while 문으로 바꾼다면
		do {
			System.out.print(" 문자 하나 입력 : " );			
			char ch = sc.next().charAt(0);
			
			if(ch == '0') {
				break;
			}
			
			System.out.println(ch + " is unicode " + (int)ch);
		}while(true);
		
		//if(ch == '0') {
		//break; //반복문 밖에서는 사용 못 함 (에러)
		//}
		
		System.out.println("for 반복 종료됨");
		
		
	}
	

}




























