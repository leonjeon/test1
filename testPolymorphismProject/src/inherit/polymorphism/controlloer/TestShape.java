package inherit.polymorphism.controlloer;

import inherit.model.dto.IShape;
import inherit.model.dto.Triangle;
import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Rectangle;

public class TestShape {

	public static void main(String[] args) {

		
//		   메인에서 다형성 사용 원객체와 사각형객체 생성하고,
//		   면적과 둘레 출력
//			{
//			Shape s;
		    IShape s;
//
//			s = new Circle(15.5);
		    s = new Circle(15.5);
//		    syso("원면적 : " + s.area());
		    System.out.println("원 면적 : " + s.area());
//			syso("원둘레 : " + s.perimeter());
		    System.out.println("원 둘레: " + s.perimeter());
//
//			s = new Rectangle(34.5, 42.7);
		    s = new Rectangle(34.5, 42.7);
//			syso("사각형면적 : " + s.area());
		    System.out.println("사각형 면적 : " + s.area());
//			syso("사각형둘레 : " + s.perimeter());
		    System.out.println("사각형둘레 : " + s.perimeter());
//			}
		    
		   
		    
		    
		    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
