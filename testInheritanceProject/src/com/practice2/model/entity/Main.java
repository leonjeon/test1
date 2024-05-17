package com.practice2.model.entity;

public class Main {

	public static void main(String[] args) {
		// 상속 실습문제 1 - 3
		
		
		//부모 타입의 레퍼런스에 후손 객체의 주소 저장할 수 있음 : 상속관계일 때만 가능함
//		* 구현내용
//		1. Point 형 객체 배열 선언, 생성 : 5개
		Point[] pArray = new Point[5];
		
//		2. 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
		pArray[0] = new Circle(150,300,500);
		pArray[1] = new Rectangle(50, 40, 30, 10);
		pArray[2] = new Circle(10, 45, 20);
		pArray[3] = new Rectangle(30, 35, 40, 10);
		pArray[4] = new Circle(50, 40, 60);
		
//		3. for 문 사용 : draw() 메소드 실행함
		
		for(int i = 0; i < pArray.length; i++) {
			pArray[i].draw();
			System.out.println();
		}
		
		
//		


	}

}
