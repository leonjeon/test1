package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner sc = new Scanner(System.in);

	public void addDashToken() {
		//문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기
		//입력
		System.out.println("문자열을 입력하세요 : ");
		String text = sc.next();
		
		int num = 0;
		int count = text.length();
		
		do { 
			
			
			if(num == count -1) {
				System.out.print(text.charAt(num));
			}else {
				System.out.print(text.charAt(num) + " - ");
			}
			num++;
		}while(num < count);
		
		System.out.println();
	}

	public void burgerKingMenu() {
		//버거킹 메뉴 주문 테스트
		
				
	}

	public void isStringAlphabet() {
		//문자열 입력받아, "모든 글자 영문자다"/"영문자 아니다." 출력하기
//		
//		System.out.println("문자열 입력 : ");
//		String text = sc.next();
//		
//		int num = 0;
//		int count = text.length();
//		do {
//			if()
//			
//		}while();
	}

}
