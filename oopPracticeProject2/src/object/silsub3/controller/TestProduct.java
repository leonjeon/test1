package object.silsub3.controller;

import object.silsub3.model.Product;

public class TestProduct {

	public static void main(String[] args) {
		// 테스트용 클래스(실행용)
		
		
		//1. 매개변수 있는 생성자를 사용해서 3개의 객체를 생성함
		//2. 객체가 가진 필드값 출력확인
		
		Product p1 = new Product("ssgnote6", "갤럭시노트6", "경기도 수원", 960000, 10.0);
		
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도평택",   780000, 0.7);
		
		Product p3 = new Product("ktnorm3", "KT일반폰3", "서울시강남", 25000, 0.3);
		
		p1.information();
		p2.information();
		p3.information();
		
		// 2단계
		//Product 클래스에 각 필드에 대한 setter 추가함
		//TestProduct 클래스의 main() 에서
		//1. 각 객체의 가격을 모두 120만원으로 변경함
		//2. 각 객체의 부가세율도 모두 0.5로 수정함
		//3. 결과 확인
		
	}

}
