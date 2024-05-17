package inherit.polymorphism.model;

import inherit.model.dto.IShape;

public class Rectangle implements IShape {
	
//	파생클래스 1 : Rectangle  -----------------------------------
//	Field : double width, heigth;
	private double width;
	private double heigth;
	
	
//	Method : getter/setter 작성
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	
	//	생성자 작성 : default, 가로,세로 값 초기화 생성자
	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
	}
	
	@Override
	public double area() {
		//사각형 면적 계산
		
		return width * heigth;
	}
	
	@Override
	public double perimeter() { //(가로 X 2) + (세로 X 2) 로 (가로 + 세로) X 2
		//사각형 둘레 계산
		return (width * 2) + (heigth * 2);
	}

	
	
	

}
