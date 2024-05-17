package com.practice2.model.entity;


//- 후손클래스 : Point상속받음
public class Circle extends Point {

//	 - 후손클래스 1 : com.practice2.model.entity.Circle.java
//		* Field
//		- radius : int
		private int radius;
//
//		* Constructor
//		+ Circle()
		public Circle() {}
		
//		+ Circle(x:int, y:int, radius:int)	//x, y는 부모생성자로 넘김
		public Circle(int radius) {
			super();
			this.radius = radius;
		}
		
		public Circle(int x, int y, int radius) {
			super(x, y);  //부모의 매개변수 기본생성자 실행
			this.radius = radius;
			
		}
			//center point 로 처리
//
//		* Method
//		+ draw() : void //원의 x, y좌표, 면적과 둘레 계산 출력함
//				java.lang.Math.PI 사용함
		public void draw() {
			
//			
//			* 원면적 = PI * radius * radius;
			double area = Math.PI * radius * radius;
			
//			* 원둘레 = 2 * PI * radius;
			double cf = 2 * Math.PI * radius;
			
//			* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
			area = Math.round(area) * 10 / 10;
			cf = Math.round(cf) * 10 / 10;
			
			System.out.println("원 면적 : " + area + ", 원 둘레 : " + cf);
			super.draw();
			
		}




}
