package test.loop;

import java.util.Scanner;

public class ForSample {
	
	public void oneTo100() {
		//1부터 100까지 정수들의 합계 계산해서 출력
		//1 + 2 + 3 + ..... + 99 + 100 = 5050
		int sum = 0; // *(곱하기) 누적값은 1;
		for(int su = 1; su < 101; su++) {
			sum += su; //sum = sum + su; 이렇게도 가능하지만 처리속도가 느려서 권장하지 않음
			if(su == 100) {
				System.out.print(su);
			}else {
				System.out.print(su + " + ");
			}
		}
		System.out.println(" = " + sum);
	}
	public void notEvenSum() {
		//1부터 100까지 홀수들의 합계를 계산해서 출력
		//1 + 3 + 5 + ..... + 99 = 2525
		int sum = 0; // *(곱하기) 누적값은 1;
		for(int su = 1; su < 101; su+= 2) {
			sum += su; //sum = sum + su; 이렇게도 가능하지만 처리속도가 느려서 권장하지 않음
			if(su < 99) {
				System.out.print(su + " + " );
			}else {
				System.out.print(su);
			}
		}
		System.out.println(" = " + sum);
	}
	
	public void evenSum() {
		//1부터 100사이의 짝수들의 합게를 계산해서 출력
		//2 + 4 + ... + 98 + 100 = 2550
		int sum = 0; // *(곱하기) 누적값은 1;
		for(int su = 2; su < 101; su+= 2) {
			sum += su; //sum = sum + su; 이렇게도 가능하지만 처리속도가 느려서 권장하지 않음
			if(su < 100) {
				System.out.print(su + " + " );
			}else {
				System.out.print(su);
			}
		}
		System.out.println(" = " + sum);		
	}
	
	public void threeSum() {
		//1부터 100까지 정수 중 3의 배수들의 합계 출력
		//3 + 6 + 9 + ... + 99 = 합계
		
		int sum = 0;
		for(int su = 3; su < 100; su += 3) {
			sum += su;
			if(su < 99) {
				System.out.print(su + " + ");
			}else {
				System.out.print(su);
			}
		}
		System.out.println(" = " + sum);
	}
	
	public void gugudan() {
		//정수를 하나 입력받아, 입력된 수가 양수이면서, 한 자리 정수이면
		//그 수의 구구단 출력하고
		//0이거나 음수 또는 한자리 정수가 아니면 "한 자리 양의 정수만 입력하세요." 출력
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print(" 정수 하나 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 1 && dan <= 9) {
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}else {
			System.out.println("한 자리 양의 정수만 입력하세요.");
		}
	}
	
	public void minToMax() {
		//두 개의 정수를 입력 받아, 두 수 중 작은값을 초기값으로 큰값을 종료값으로 사용해서
		//작은 수에서 큰 수까지의 정수들의 합계를 구해서 출력
		//예: 12 45 입력시
		//출력 : 12에서 45까지 정수들의 합계 : xxxx
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print(" 첫번째 정수 : " );
		int first = sc.nextInt();
		System.out.print(" 두번째 정수 : " );
		int second = sc.nextInt();
		
		int max, min;
		if(first > second) {
			max = first;
			min = second;
		}else { 
			max = second;
			min = first;
			
		}
		 int sum = 0;
		 for(int k = min; k <= max; k++) {
			 sum += k;
		 }
		System.out.println(min + "에서" + max + "까지 정수들의 합게 : " + sum);
	}
	
	public void testRandom() {
		//임의의 난수를 발생(만들어 내고자)할 때 사용하는 메소드
		//java.lang.Math 의 random() 메소드
		//java.utill.Random 의 메소드 사용
		
		//System.out.println("렌덤값 : " + Math.random()); //0.0 <== double 형값 < 1.0
		
		//1 부터 100 사이의 임의의 정수를 하나 만들려면 
		//(int)(Math.random() * 최대값) + 최소값
		
		System.out.println("1 ~ 100사이의 임의의 정수 : " + ((int)(Math.random() * 100) + 1));
		
		//51 ~ 80사이의 임의의 정수를 만들려면
		//(int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값
		System.out.println("51 ~ 80사이의 임의의 정수 : " + ((int)(Math.random() * (80 - 51 + 1)) + 51));
		
		java.util.Random r = new java.util.Random();
		//import 선언하면 : Random r = new Random();
		
		System.out.println("렌덤값 : " + r.nextDouble());
		System.out.println("1 ~ 100사이의 임의의 정수 : " + (r.nextInt(100) + 1));
	}
	
	public void sumRandomNumber() {
		//1 ~ 100사이의 임의의 정수를 하나 발생시켜서
		//1부터 랜덤값까지의 정수들의 합계를 구해서 출력
		//출력 : 1 ~ 랜덤값까지의 정수들의 합계 : xxxxxxxxxxx
		
		
		int num = ((int)(Math.random() * 100) + 1);
		int sum = 0;
		
		for(int begin = 1; begin <= num; begin++) {
			sum += begin;
		}
		System.out.println("1 ~ " + num + "까지의 정수들의 합계 : " + sum);						
	}
	
	//for 문 안에 for 문을 사용하는 경우 : 2중 for 문
	//반복되는 내용 전체가 다시 반복되는 경우에 사용함
	/* ♥♥♥♥♥♥♥♥♥♥ 
	 * ♥♥♥♥♥♥♥♥♥♥
	 * ♥♥♥♥♥♥♥♥♥♥
	 * ♥♥♥♥♥♥♥♥♥♥
	 * ♥♥♥♥♥♥♥♥♥♥
	 * */
	
	public void doubleFor() {
		for(int a = 1; a < 6; a++) {
			for(int k = 1; k < 11; k++) {
			System.out.print('♥');
			}
			System.out.println();
		}
	}
	
	//구구단 2단부터 9단까지 출력
	public void printGugudan() {
		for(int dan = 2; dan < 10; dan++) {
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println("-----------------------------------------");
		}
	}
	
	//*****
	//*****
	//*****
	//*****
	//*****
	
	public void printStar() {
		for(int a = 1; a < 6; a++) {
			for(int k = 1; k < 6; k++) {
			System.out.print('*');
		}
			System.out.println();
		}
	}
	
		//*
		//**
		//***
		//****
		//*****
		
		public void printStar2() {
			for(int a = 1; a < 6; a++) {
				for(int k = 1; k <= a; k++) {
				System.out.print('*');
			}
				System.out.println();
			}
		}
		
		//1****
		//*2***
		//**3**
		//***4*
		//****5
		
		public void printStar3() {
			for(int a = 1; a < 6; a++) {
				for(int k = 1; k < 6; k++) {
					if(a == k)
						System.out.print('k');
					else
						System.out.print('*');
			}
				System.out.println();
			}
		}
        //*****
		// ****
		//  ***
		//   **
		//    *
		
		public void printStar4() {
			for(int a = 1; a < 6; a++) {
				for(int k = 1; k < 6; k++) {
					if(a > k)
						System.out.print(' ');
					else
						System.out.print('*');
			}
				System.out.println();
		}
	}
}



















