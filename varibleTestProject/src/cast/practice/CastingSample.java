package cast.practice;

import java.util.Scanner;

public class CastingSample {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void printUnicode() {
		
		System.out.print("문자 입력");
		char name = sc.next().charAt(0);
		
		System.out.println(name + " is unicode " + (int)name);
				
						
	}
	
	public void calculatorScore() {
		
		System.out.print("국어");
		double name = sc.nextDouble();
		System.out.print("영어");
		double name1 = sc.nextDouble();
		System.out.print("수학");
		double name2 = sc.nextDouble();
		
		int total = (int)(name + name1 + name2);
		int avg = total / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
				
		
		//System.out.println((int)(name+name1+name2));
		//System.out.println((int)((name+name1+name2)/3));
				
				
	}
	
		public void printBitCoun() {
			
			System.out.print("정수 입력");
			int name = sc.nextInt();
			System.out.println(name + "의 2진수에 포함된 1의 갯수 : " + 
			Integer.bitCount(name)); 
			//static이 붙어있는 메소드는 클래스명.메소드명() 으로 사용함
			
			
		}

}
