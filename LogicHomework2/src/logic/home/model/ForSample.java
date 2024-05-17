package logic.home.model;

import java.util.Scanner;

public class ForSample {

	Scanner sc = new Scanner(System.in);

	public void sum1To10() {
		// 1~10까지 정수들의 합계 구하기 // 55
		int num = 0;
		for (int k = 1; k <= 10; k++) {
			num += k;
		}
		System.out.println("합계는" + num);

	}

	public void sumEven1To100() {
		// 1~100사이의 짝수들의 합게 구하기
		int num = 0;
		for (int k = 2; k < 101; k += 2) {
			num += k;
		}
		System.out.println("짝수들의 합은 " + num);
	}

	public void oneGugudan() {
		// 정수 하나 입력받아, 그 수의 구구단 출력하기
		System.out.println("정수 하나 입력");
		int num1 = sc.nextInt();

		for (int k = 1; k < 10; k++) {

			System.out.println(num1 + " * " + k + " = " + (num1 * k));
		}

	}

	public void sumMinToMax() {
		// 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기
		System.out.println("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int second = sc.nextInt();

		int count = 0;
		int max, min;
		if (first >= second) {
			max = first;
			min = second;
			for (; min <= max; min++) {
				count += min;

			}
			System.out.println(second + " 에서 " + first + " 의 값은 " + count);
		} else {
			max = second;
			min = first;
			for (; min <= max; min++) {
				count += min;
			} System.out.println(first + " 에서 " + second + " 의 값은 " + count);
		}
			
	}

	public void printStar() {
		// 입력받을 값을 먼저 생각하고, 
		// 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기
		
		System.out.println("줄 수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.println("칸 수를 입력하시오 : ");
		int num2 = sc.nextInt();
		
		
		for(int a = 1; a <= num1; a++) {
			for(int b = 1; b <= num2; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

	public void printNumberStar() {
		//for문안에 if문을 넣어서 횡과 열이 같을때 
		// 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기
		
		for(int a = 1; a <= 7; a++) {
			for(int b = 1; b <= 7; b++) {
				if(a == b) {
					System.out.print(b);
				}else { 
					System.out.print("*");			
				}		
				
			}
			System.out.println();		
		}
	}

	public void printTriangleStar() {
		// 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)
		
		//양수일때 직각삼각형
		System.out.println("줄 수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num != 0) {
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					for(int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		//음수일때 역삼각형
		if(num < 0) {
			for(int i = 1; i <= -num; i++) {
				for(int j = 1; i <= -num; j++) {
					if(i > j)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}
		if(num == 0)
			System.out.println("잘못 입력하셨습니다.");
		
		
}
	
	public void guguDan() {
		// 구구단 2단부터 9단까지 출력하기
		
		int dan;
		int num;
		
		for(dan = 2; dan <= 9; dan++) {
			for(num = 1; num < 10; num++) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}
			System.out.println();
		}

	}

}
















