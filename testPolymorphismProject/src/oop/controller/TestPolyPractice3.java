package oop.controller;

import inherit.model.dto.IShape;
import inherit.model.dto.Triangle;
import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Rectangle;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		//IShape[] iarr = new IShape[5];

		//5개의 객체를 무작위로 생성함(Circle, Rectangle, Triangle)	
		//for loop 문으로 각 객체의 면적과 둘레를 출력 처리함
		//단, Triangle 객체는 빗변길이도 출력 처리함
		
		IShape[] iArr = new IShape[5];

	   //5개의 객체를 무작위로 생성함(Circle, Rectangle, Triangle)
		iArr[0] = new Circle(3.5);
		iArr[1] = new Rectangle(2.0, 2.0);
		iArr[2] = new Circle(5.3);
		iArr[3] = new Triangle(4.0, 5.0);      
		iArr[4] = new Rectangle(7.0, 7.0);      
		
		for(int i = 0; i < iArr.length; i++) {
		    if ( iArr[i] instanceof Circle ) {
	            // Circle            
	            System.out.println("원둘레 : "+ iArr[i].perimeter() );
	            System.out.println("원면적 : "+ iArr[i].area() );
	         } else if ( iArr[i] instanceof Rectangle  ) {
	            // Rectangle
	            System.out.println("사각형둘레 : "+ iArr[i].perimeter() );
	            System.out.println("사각형면적 : "+ iArr[i].area() );
	         } else if (iArr[i] instanceof Triangle  ) {
	            // Triangle
	            System.out.println("삼각형빗변길이 : "+ ((Triangle)iArr[i]).getHypotenuse());
	            System.out.println("삼각형둘레 : "+ iArr[i].perimeter() );
	            System.out.println("삼각형면적 : "+ iArr[i].area() );
	         }   
			
			
			
	
		}
		

	}

}
