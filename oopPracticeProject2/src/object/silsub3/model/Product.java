package object.silsub3.model;

public class Product {
	
//	- productID:String		//상품아이디
//	- productName:String	//상품명z
//	- productArea:String	//생산지
//	- price:int	//가격
//	- tex:double	//부가세비율
	
	private String productID;
	private String productName;
	private String productArea;
	private int price;
	private double tex;
	
	//default 생성자
	//5개의 필드 초기화하는 매개변수 있는 생성자
	
	//기본생성자
	public Product() {}
	
	//매개변수 있는 생성자
	public Product(String productID, String productName
			, String productArea, int price, double tex) {
		this.productID = productID;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tex = tex;
	}
	
	//Method 만들기
	//객체가 가진 5개의 필드값 출력하는 메소드
	public void information() {
		System.out.println(this.productID + ", " + this.productName 
				+ ", " + this.productArea + ", " + this.price + ", " + this.tex);
	}
	
	// 2단계
	//Product 클래스에 각 필드에 대한 setter 추가함
	//TestProduct 클래스의 main() 에서
	//1. 각 객체의 가격을 모두 120만원으로 변경함
	//2. 각 객체의 부가세율도 모두 0.5로 수정함
	//3. 결과 확인
	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
