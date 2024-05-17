package oop.practice.model;

public class Book {
	
	private String title;	//책제목
	private int price;	//가격
	private double discountRate;	//할인율
	private String author;	//저자명
	
	//기본(default) 생성자와 4개의 필드를 초기화하는 매개변수가 있는 생성자 작성함
	
	public Book() {}
	
	public Book(String title, int price, double discountRate, String author ) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//출력용 메소드 작성함 : 객체가 가진 필드값 화면 출력 처리
	
	public void bookInfomation() {
		System.out.println(this.title + ", " + this.price + ", " + this.discountRate + ", " + this.author);
	}
	
	//2단계 시작
	//Book 클래스에 setter 추가함 : 4개의 필드에 대한 setter 메소드 작성함
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//3단계 시작
	//Book 클래스에 getter 추가함 : 4개의 필드에 대한 getter 모두 작성
	
	public String getTitle() {
		return this.title;
	}
	public int getPrice() {
		return this.price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public String getAuthor() {
		return this.author;
	}
	
	
		
}
















