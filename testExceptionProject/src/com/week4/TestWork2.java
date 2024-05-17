package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] args) {

		
//		"J a v a  P r o g r a m " 문자열 값을 //일단 문자열 값 String으로 받음
		String str = "J a v a  P r o g r a m ";
//		공백 단위로 Tocken 처리하여 char [] 에 저장하여 출력하시오.
		StringTokenizer st = new StringTokenizer("J a v a  P r o g r a m");
//		
//		- 토큰 처리전 글자 출력
		System.out.println("토큰 처리전 글자 :" + str);
		System.out.println("토큰 처리전 글자 갯수 : " + str.length());
//		
//		- 전 글자갯수 출력
//		int count = 0;
//		for(int i = 0; i <= str.length(); i++) {
//			if(i == str.length()) {
//				count += i;
//			}
//		}// System.out.println(str.length());
		
//		- 토큰 처리 후 글자갯수 출력 확인
		System.out.println(st.countTokens());

//		- char [] 값 출력
		char[] cArray= str.toCharArray();
		System.out.println(cArray);
	
//		- char [] 을 다시 String 으로 바꾼 후 
		// -->결국 위에 말은 배열을 String으로 변환 하라는말 
//		- 모두 대문자로 변환하여 출력
		
		String str1 = new String(cArray);
		System.out.println(str1);
		
		String str2 = str1.toUpperCase();
		System.out.println(str2);
			
			
		
		
		
		

	}

}
