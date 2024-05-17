package com.practice2.model.entity;

public class Rectangle extends Point{
	
//	* Field
//	- width : int 	//가로너비
//	- height : int 	//세로높이
		private int width;
		private int height;
//			//부모의 x, y는 사각형 좌측상단의 좌표값으로 처리
//
//	* Constructor
//	+ Rectangle()
		public Rectangle() {}

		
//	+ Rectangle(x:int, y:int, width:int, height:int)
//		//x, y는 부모 생성자로 넘김
		public Rectangle(int x, int y, int width, int height) {
			super(x, y);
			this.width = width;
			this.height = height;
			
		}

//		* Method : getter, setter 는 직접 구현함.
		public int getWidth() {
			return width;
		}


		public void setWidth(int width) {
			this.width = width;
		}


		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}

//	+ draw() : void	//사각형의 x, y좌표, 면적, 둘레 계산 출력 처리
		public void draw() {
//			* 면적 : 가로 * 세로
			 int area = this.height * this.width;
			
//			* 둘레 : 2 * (가로 + 세로)
			 int cf = 2 * (this.height + this.width);
			 
			
//			* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
			 area = Math.round(area) * 10 / 10;
			 cf = Math.round(cf) * 10 / 10;
			 
			 System.out.println("사각형의 면적 : " + area + " , 둘레 : " + cf);
			 super.draw();
			 
		}


	

}
