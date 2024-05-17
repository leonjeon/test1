package array3.model;

public class Book {
	//Field
	private String title;	  	//책제목
	private String auther;	  	//저자명
	private int price;			//책가격
	private String publisher;	//출판사
	
	//Constructor
	public Book() {}

	public Book(String title, String auther, int price, String publisher) {
		super();
		this.title = title;
		this.auther = auther;
		this.price = price;
		this.publisher = publisher;
	}

	
	
	//Getter and setter
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	
	//method
	public String bookinfo() {
		return "Book [" + this.title + ", " + this.auther + ", " + this.price + ", " + this.publisher + "]";
	}
	
	
	
	
	
	
	
	
}
