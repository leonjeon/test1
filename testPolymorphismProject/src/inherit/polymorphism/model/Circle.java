package inherit.polymorphism.model;

import inherit.model.dto.IShape;

public class Circle implements IShape{
	
//	파생클래스 2 : Circle  -----------------------------------------
//	Field : 원주율은 Math.PI 사용
//		double radius;
	private double radius;
	
	
//	Method : getter/setter 작성

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
//	생성자 작성 : default, 반지름값 초기화 생성자
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	@Override
	public double area() {
		// 원 면적 계산
		
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {  //2 * π * 반지름
		// 원 둘레 계산
		return 2 * Math.PI * radius;
	}


	
	
	
	
}
