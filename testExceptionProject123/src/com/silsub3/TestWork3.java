package com.silsub3;

public class TestWork3 {

	public static void main(String[] args) {
		// 실습문제 3
		testInteger();
		testDouble();
	}
	
	public static void testInteger() {
		Calculator calc = new Calculator();
		
		try {
			System.out.println("더하기 : " + calc.sum(12, 25));
			System.out.println("빼기 : " + calc.sub(12, 25));
			System.out.println("곱하기 : " + calc.mul(12, 25));
			System.out.println("나누기한 몫 : " + calc.div(12, 25));
			
			System.out.println("곱하기 : " + calc.mul(-12, 25));
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
			return;
		} catch (NotDivideZeroException e) {
			System.out.println(e.getMessage());
			return;
		}
	}
	
	public static void testDouble() {
Calculator calc = new Calculator();
		
		try {
			System.out.println("더하기 : " + calc.sum(12.5, 25.7));
			System.out.println("빼기 : " + calc.sub(12.5, 25.7));
			System.out.println("곱하기 : " + calc.mul(12.5, 25.7));
			System.out.println("나누기한 몫 : " + calc.div(12.5, 25.7));
			
			System.out.println("나누기한 몫 : " + calc.div(12.5, 0.0));
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
			return;
		} catch (NotDivideZeroException e) {
			System.out.println(e.getMessage());
			return;
		}
	}

}
