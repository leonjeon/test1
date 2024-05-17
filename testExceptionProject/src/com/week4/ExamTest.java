package com.week4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExamString es = new ExamString();
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(es.preChar(str));
	}

}
