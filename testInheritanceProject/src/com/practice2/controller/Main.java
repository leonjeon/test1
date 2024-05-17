package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		* 구현내용
//		Circle 배열 초기화 : 3개
		Circle[] cArray = new Circle[3];
		
		cArray[0] = new Circle(10, 10, 10);
		cArray[1] = new Circle(20, 30, 40);
		cArray[2] = new Circle(30, 40, 50);
		
//		Rectangle 배열 초기화 : 3개
		
		Rectangle[] rArray = new Rectangle[3];
		
		rArray[0] = new Rectangle(10, 10, 10, 10);
		rArray[1] = new Rectangle(20, 30, 40, 50);
		rArray[2] = new Rectangle(30, 40, 50, 60);
		
//		각각 draw() 출력 처리	
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
		System.out.println();
		
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

	}

}
