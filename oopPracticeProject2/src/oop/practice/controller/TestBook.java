package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {

	public static void main(String[] args) {
//		main() 에서
//		1. Book 클래스에 대한 객체를 디폴트 생성자를 사용해서 생성함
//		2. 매개변수 있는 생성자를 사용해서 두번째 객체 생성함
//		3. 2개의 객체가 가진 정보를 화면출력함
		Book b1 = new Book(); //1번 해결
		
		Book b2 = new Book("뇌를 자극하는 JAVA"  , 20000, 0.2, "김윤영"); //2번 해
		
		
		b1.bookInfomation();
		b2.bookInfomation();
		
//		TestBook 클래스의 main() 메소드 안의 기존의 소스코드 아래에 추가함
//		1. 첫번째 객체가 가진 값을 setter 를 사용해서 수정
//		2. 출력확인함
		
		System.out.println();
		System.out.println("수정된 결과확인");
		b1.setTitle("자바의 정석");
		b1.setPrice(35000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("윤상섭");
		
		b1.bookInfomation();
		
//		TestBook 클래스의 main() 메소드에 소스 추가함
//		1. 두 객체 각각 할인율을 적용한 책 가격을 계산해서 출력함
//		할인된 가격 = 가격 - (가격 * 할인율);
//		
		double dPrice= b1.getPrice() - (b1.getPrice() * b1.getDiscountRate());
		
		System.out.print("도서명 : ");
		System.out.println(b1.getTitle());
		System.out.print("할인된 가격 : ");
		System.out.println(dPrice);
		
		double dPrice2= b2.getPrice() - (b2.getPrice() * b2.getDiscountRate()); 
		System.out.print("도서명 : ");
		System.out.println(b2.getTitle());
		System.out.print("할인된 가격 : ");
		System.out.println(dPrice2);
		
		
	}

}
