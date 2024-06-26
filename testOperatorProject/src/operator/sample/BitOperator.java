package operator.sample;

import java.util.Scanner;

public class BitOperator {
	
	//비트연산자 테스트용
	//비트연산자 : ~(틸드, Tield), <<, >>, >>>, &, ^, |
	//정수에만 사용함, 정수의 2진수 값(비트 0, 비트 1)을 계산에 사용함
	
	//메모리에 기록된 정수의 2진수값을 출력하는 메소드
	public void printBits(int num) {
		System.out.print(num + " : ");
		
		for(int i = 31; i >= 0; i--) {
			//해당 자리의 비트가 0이면 정수 0으로, 비트 1은 정수 1로 출력 처리함
			System.out.print(num >> i & 1);
		}
		System.out.println();
	}
	
	public void testTield() {
		//~ (tield) : 비트반전연산자, 비트 1 -> 0, 비트 0 -> 1로 바꾸는 연산자임
		int num = 24;
		
		//같은 클래스 안에 있는 메소드끼리는 그냥 사용함
		printBits(num);
		printBits(~num); //해당 정수의 1의 보수를 구함
		printBits(~num + 1); //해당 정수의 0의 보수를 구함 (음수의 비트값 확인시 사용함)
		
	}
	
	public void testBitLogical() {
		//정수 & 정수, 정수 ^ 정수, 정수 | 정수
		//두 정수의 각 이진수 자리별로 논리연산을 수행함
		//&(AND), ^(XOR), |(OR)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		printBits(first);
		printBits(second);
		printBits(first & second); //둘다 1이면 1
		System.out.println("---------------------------------------");
		
		printBits(first);
		printBits(second);
		printBits(first ^ second); //둘이 다르면 1
		System.out.println("---------------------------------------");
		
		printBits(first);
		printBits(second);
		printBits(first | second); //둘 중 하나만 1이여도 1
		System.out.println("---------------------------------------");
	}
	
	public void testShift() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		System.out.print("자리이동 칸수 : ");
		int move = sc.nextInt();
		
		printBits(num);   		//2의 4승자리 값
		printBits(num << move);	// << 왼쪽으로 2칸 이동 2의6승 자리로 이동 2의6승+2의4승(64+16)
		printBits(num >> move);	// >>오른쪽으로 2칸 2의4승자리의 값이 2의2승의 값으로 바뀜
		printBits(num >>> move);//>>>오른쪽으로 2칸 
		
		
	}

}

























