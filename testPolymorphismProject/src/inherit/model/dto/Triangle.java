package inherit.model.dto;

public class Triangle implements IShape {
	
//	=> IShape 상속받고, 메소드 오버라이딩 처리
//			필드 : 	- base:double 	//밑변
//		            	- height:double 	//높이
	private double base;
	private double height;
	
	
//	생성자 : 	default 생성자, 
	public Triangle() {
		super();
	}

//	매개변수 있는 생성자(밑변, 높이를 초기화시키도록 작성)
	public Triangle(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}

	
	//Getters ans Setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	


//	메소드 : + area():double //삼각형의 넓이 = (밑변 * 높이) /2
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

//	//빗변길이 = Math.sqrt(밑변*밑변+높이*높이);
	//+ getHypotenuse():double
	public double getHypotenuse(){
		
	
		return Math.sqrt(base * base + height * height);
	}



//           + perimeter():double      //둘레길이 = 밑변 + 높이 + 빗변길이
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return base + height + getHypotenuse();
	}


	
	

	
	
	
	
	
	
}
