package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
//		// => 초기값을 부여한 두 개의 객체를 생성함
			Book b1 = new Book();
			Book b2 = new Book();
			
//		   => 두 객체의 정보 출력 처리함  :  toString() 사용
			System.out.println(b1.toString());
			System.out.println(b2.toString());
//		   => 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
			System.out.println(b1.equals(b2));
			
			
			
			Book b3 = new Book();
			
			Book b4 = new Book("자바의 정석","홍길동",12000);
			
//		   => 첫번째 객체를 복제한 객체 생성함 : clone() 사용
			Book b5 = (Book)b4.clone();
			System.out.println(b5);
//		   => 첫번째 객체와 복제 객체의 주소가 같은지 출력
//		   => 첫번째 객체와 복제 객체의 내용이 같은지 출력
		
		

	}

}
