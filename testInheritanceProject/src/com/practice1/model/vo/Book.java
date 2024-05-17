package com.practice1.model.vo;

import java.util.Objects;

import testInheritance.sample.Shape;

public class Book {
//	//Field
//		- title : String	//책제목
//		- author : String	//저자명
//		- price : int	//가격
		private String title;
		private String author;
		private	int price;
		
		
		//기본생성자
		public Book() {
			
		}
		
		//매개변수 있는 생성자
		public Book(String title, String author, int price) {
			super();
			this.title = title;
			this.author = author;
			this.price = price;
		}
		
		
//		//Getter and Setter 작성함
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	

//		// Object 클래스의 toString() 메소드 오버라이딩함
//			=> 객체의 모든 필드값 문자열 합치기해서 리턴함
		
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(author, price, title);
		}
	
		
//		// Object 클래스의 equals() 메소드 오버라이딩함
//			=> 두 객체의 모든 필드값이 일치하는지를 물어서
//				모두 일치하면 true, 
//			   	하나라도 다르면 false를 리턴함
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
		}
	
//		// Object 클래스의  clone() 메소드 오버라이딩함
//			=> 접근제한자는 public 으로 변경함
//			=> 예외처리는 삭제함
//			=> this 로 전달된 위치의 객체가 가진 값을 복사한 새 객체 생성하고
//			    주소 리턴함
		public Object clone() {
			
			return new Book(this);
		}
//		
		public Book(Book other) {
			//깊은 복사(deep copy)
			super();
			this.title = other.title;
			this.author = other.author;
			this.price = other.price;
		}

		
		
//		private String title;
//		private String author;
//		private	int price;
//	 - 테스트 클래스 : com.practice1.controller.TestSilsub1.java
//		//main() 포함
//		=> 초기값을 부여한 두 개의 객체를 생성함
//		=> 두 객체의 정보 출력 처리함  :  toString() 사용
//		=> 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
//		=> 첫번째 객체를 복제한 객체 생성함 : clone() 사용
//		=> 첫번째 객체와 복제 객체의 주소가 같은지 출력
//		=> 첫번째 객체와 복제 객체의 내용이 같은지 출력
		
}
