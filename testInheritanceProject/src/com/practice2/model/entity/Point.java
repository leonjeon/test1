package com.practice2.model.entity;

public class Point {
	
//	- 부모클래스명 : com.practice2.model.entity.Point.java
//	* Field
//	# x : int
//	# y : int
		protected int x;
		protected int y;
//
	
	
//	* Constructor
//		+ Point()
		public Point () {}


//		+ Point(x : int, y : int)
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}


		

//		* Method
//		+ getXXX()
//		+ setXXX()		
		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}

//	+ draw():void	//x, y 좌표값 출력 처리
	
		public void draw() {
			System.out.println("Point [x=" + x + ", y=" + y + "]");
		}


	
}
