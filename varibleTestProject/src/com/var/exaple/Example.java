package com.var.exaple;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);
	public void example1() {
		
		System.out.println("숫자 1을 입력하세요");
		int number1 = sc.nextInt();
		System.out.println("숫자 2를 입력하세요");
		int number2 = sc.nextInt();
		
			System.out.println("더하기 결과  : " + (number1 + number2));
			System.out.println("빼기 결과  : " + (number1 - number2));
			System.out.println("곱하기 결과  : " + (number1 * number2));
			System.out.println("나누기한 몫  : " + (number1 / number2));
			System.out.println("나누기한 나머지 : " + (number1 % number2));
			
	
	}
	public void example2() {
		
		
		System.out.println("가로 값을 입력하세요");
		double box1 = sc.nextDouble();
		System.out.println("세로 값를 입력하세요");
	    double box2 = sc.nextDouble();
	    
		System.out.println("면적  : " + (box1 * box2));
		System.out.println("둘레  : " + ((box1 + box2) * 2));
		
	    
		
	}
	
	public void example3() {
		
		
		System.out.println("문자열을 입력하시오");
		String box1 = sc.next();
		System.out.println("첫번째 문자 = " + box1.charAt(0));
		System.out.println("두번째 문자 = " + box1.charAt(1));
		System.out.println("세번째 문자 = " + box1.charAt(2));
		
		sc.close();
		
	}

}
    
    
    
    
    
    
    
    
    
    
    		