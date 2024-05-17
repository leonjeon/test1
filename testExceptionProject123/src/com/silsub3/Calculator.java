package com.silsub3;

public class Calculator {
	public Calculator(){}
	
	public int sum(int a, int b) throws NumberRangeException{
		int result = 0;
		
		if((a > 0 && a < 101) && (b > 0 && b < 101))
			result = a + b;
		else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		
		return result;
	}
	
	public double sum(double a, double b) throws NumberRangeException{
		double result = 0.0;
	
		if((a > 0 && a < 101) && (b > 0 && b < 101))
			result = a + b;
		else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
	
		return result;
	}
	
	public int div(int a, int b) throws NumberRangeException, NotDivideZeroException{
		int result = 0;
		
		if((a > 0 && a < 101) && (b >= 0 && b < 101)){
			if(b != 0)
				result = a / b;
			else
				throw new NotDivideZeroException("0 으로 나눌 수 없습니다.");
		}else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		
		return result;
	}
	
	public double div(double a, double b) throws NumberRangeException, NotDivideZeroException{
		double result = 0.0;
		
		if((a > 0 && a < 101) && (b >= 0 && b < 101)){
			if(b != 0)
				result = a / b;
			else
				throw new NotDivideZeroException("0 으로 나눌 수 없습니다.");
		}else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
	
		return result;
	}
	
	public int mul(int a, int b) throws NumberRangeException{
		int result = 0;
		
		if((a > 0 && a < 101) && (b > 0 && b < 101))
			result = a * b;
		else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		
		return result;
	}
	
	public double mul(double a, double b) throws NumberRangeException{
		double result = 0.0;
	
		if((a > 0 && a < 101) && (b > 0 && b < 101))
			result = a * b;
		else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
	
		return result;
	}
	
	public int sub(int a, int b) throws NumberRangeException{
		int result = 0;
		
		if((a > 0 && a < 101) && (b > 0 && b < 101))
			result = a - b;
		else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		
		return result;
	}
	
	public double sub(double a, double b) throws NumberRangeException{
		double result = 0.0;
	
		if((a > 0 && a < 101) && (b > 0 && b < 101))
			result = a - b;
		else
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
	
		return result;
	}
}
