package com.loop;

import java.util.Scanner;

public class ForWhile {
	
	
	//실습문제 1
//	정수 하나 입력 : 5
//	1
//	*2
//	**3
//	***4
//	****5
//	================
//	정수 하나 입력 : -5
//	양수가 아닙니다.

	Scanner sc = new Scanner(System.in);

	public void printStar1() {
		System.out.print(" 정수 하나 입력 ");
		int num = sc.nextInt();
		if (num > 0) { //양수일때만 실행하도록

			for (int a = 1; a <= num; a++) { //for문(반복문)을 이용 
				for (int b = 1; b <= a; b++) {
					if (a == b)
						System.out.print(a);
					else
						System.out.print('*');

				}
				System.out.println();
			}
		} else {System.out.println("양수가 아닙니다");}
		
		System.out.println("================");

	}
	
	
	//실습문제 2
	
	public void printStar2() {
		System.out.print(" 정수 입력 : ");
		int num1 = sc.nextInt();
		
		if (num1 > 0) {
			
			// 양수일때
			for (int line = 1; line <= num1; line++) {
				for (int count = 1; count <= line; count++) {
					System.out.print('*');
				}
				System.out.println();
			}
			
			
			//	음수일때
		} else if (num1 < 0) {
			
			num1 *= -1;
			
			for (int line = 1; line <= num1; line++) {
				for (int count = 1; count <= num1; count++) {
					if (line > count)
						System.out.print(' ');
					else
						System.out.print('*');
				}
				System.out.println();
			}

		} else {
			System.out.println("출력 기능이 없습니다.");

		}
	}
	
	
	   //실습문제 4
	
//	 : 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
//	   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
//	   단, 영문자만 입력받도록 함.
//	 - 패키지명 : com.loop
//	 - 메소드명 : public void countInputCharacter(){}
//		ex>
//		문자열 입력 : application
//		문자 입력 : p
//		포함된 갯수 : 2 개
//		====================
//		문자열 입력 : apple_test123
//		영문자가 아닙니다.
//		for(초기화식, 조건식, 증감식) {
//		   수행문;
//						}
		
		public void countInputCharacter() {
			
//		문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
		
			//문자열은 String으로 변수만들어
			System.out.print(" 문자열 입력 : ");
			String iv = sc.next();
			//비교문자 알파벳 하나씩 비교 char로 받아 변수생성
			System.out.print(" 비교 문자 입력 : ");
			char fc = sc.next().charAt(0);
	
//			   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
//			   단, 영문자만 입력받도록 함.
			
			int count = 0, index; //for문의 변수값 입력
				 //초기화        조건 비교		  증감식
			for (index = 0; index < iv.length(); index ++) {
				 //수행문
				char ch = iv.charAt(index);
				System.out.println(ch);
				
				if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
					
					System.out.println(" 영문자가 아닙니다. ");
					break; //알파벳문자가 아니면 강제 반복 종료
				}
				
				if (ch == fc) // == 같으냐 , ++1씩 증가
					// ch는 문자열 , fc는 비교문자 두개가 같을때 1씩 증가
					count++;
				
			}
				if (index == iv.length()) //index 변수값 index와 iv가 같을때 숫자 카운트 진행함
					System.out.println("포함된 갯수 : " + count); // 그래서 콘솔창에 갯수 나옴
		}	
		//실습문제 4 변형
//		 : 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
//		   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
//		   단, 영문자만 입력받도록 함.
//		 - 패키지명 : com.loop
//		 - 메소드명 : public void countInputCharacter(){}
//			ex>
//			문자열 입력 : application
//			문자 입력 : p
//			포함된 갯수 : 2 개
//			====================
//			문자열 입력 : apple_test123
//			영문자가 아닙니다.
//			for(초기화식, 조건식, 증감식) {
//			   수행문;
//							}
		
		public void countInputCharacter2() {
			
			System.out.print("문자열 입력 : ");
			String iv = sc.next();
			
			//문자열의 길이를 파악해야 for문 작성 가능
			
			
		//	for(int index; )
			
		}
		
		public void countInputCharacter3() {
			//int 변수 i를 2로 초기화, i가 3보다 작거나 같으면 i는 1씩 증가
			for(int i = 2; i <= 3; i++) {
				//int 변수 j를 1로 초기화, j가 숫자 3보다 작거나 같으면 j는 1씩 증가
				for(int j = 1; j <= 3; j++) {
					//int 변수 k를 1로 초기화, j가 숫자 3보다 작거나 같으면 k는 1씩 증가
					for(int k = 1; k <= 3; k++) {
						System.out.println(" " + i + " ," + j + ", "  + k );
					}
				}
			}
		}

		public void countInputCharacter4() {
			
	//int i라는 변수를 만들어 0값으로 초기화, i가 10이라는 숫자와 같거나 작으면 i는 1씩 증가
			//출력하면 1,2,3...10
//			for(int i = 0; i <= 10; i++) {
//				System.out.print( i + "  ");
//			}
//			
		//int i 변수생성 변수 i는 10값으로 초기화, i(10)가 1이라는 숫자보다 크거나 같으면
		//i는 1씩 감소 출력시 10,9,8...1
		//	for(int i = 10; i >= 1; i--) {
		//		System.out.println(i + "  ");
		//	}
			
			//구구단출력
			//int 변수 i를 2로 초기화, i가 9보다 작거나 같으면 i는 1씩 증가
			//구구단에서 앞자리 
		//	for(int i = 2; i <= 9; i++) {
				//int 변수 j를 1로 초기화,i가 9보다 작거나 같으면 j는 1씩 증가
				//구구단에서 뒷자리 표현
		//		for(int j = 1; j <= 9; j++) {
		//			System.out.println(i + " * " + j + " = " + (i * j));
		//		}
		//	}
			
//			System.out.println("문장을 입력하세요.");
//			System.out.println("입력을 마치려면 x를 입력하세요.");
//			 	
//				int input = 0;
//			
//			do {
//				input = System.in.read();
//				System.out.print((char)input);
//			}while(input != -1 && input != 'x');
//			
//			
//			int sum = 0;
//			int i = 0;
//			
//			while(true ) {
//				if(sum > 100)
//					break;
//				i++;
//				sum += i;
//			}
//			System.out.println("i = " + i);
//			System.out.println("sum = " + sum);
//			
//			int[] score = {100, 90, 80, 70, 60, 50};
//			
//			for(int i = 0; i < score.length; i++) {
//				System.out.println(score[i]);
//			}
//			
			
			//45개의 정수값을 저장하기 위한 배열 생성
//			int[] ball = new int[45];
//			
//			//배열의 각 요소에 1~45의 값을 저장한다. 45개의 방을 만든다고 생각
//			//배열은 [0] = 첫번째방 ball[0]에 1이 저장된다
//			for(int i = 0; i < ball.length; i++) {
//				ball[i] = i+1;
//				
//				int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
//				int j = 0; // 임의의 값을 얻어서 저장할 변수
//				
//				
//				//배열의 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 지정한다
//				//배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
//				for(int i = 0; i < 100; i ++) {
//					j = (int)(Math.random() * 45);
//					temp = ball[0];
//					ball[0] = ball[j];
//					ball[j] = temp;
//				}
//				//배열 ball의 앞에서 부터 6개의 요소를 출력한다.
//				for(int i = 0; i < 6; i++) {
//					System.out.print(ball[i] + " ");
//				}
//			}
			
			char[] hex = {'C', 'A', 'F', 'E'};
			
			String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
					"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
			
			String result = "";
			
			for(int i = 0; i < hex.length; i++) {
				if(hex[i] >= '0' && hex[i] <= '9') {
					result += binary[hex[i]-'0'];
					
				}else {
					result += binary[hex[i]-'A'+10];
				}
				
			}
			System.out.println("hex : " + new String(hex));
			System.out.println("binary" + result);
			
		}
			
			
		









































}




































