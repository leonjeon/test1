package inherit.run;

import inherit.model.dto.Customer;

public class TestCustomer2 {

	public static void main(String[] args) {
		// 객체배열 사용 테스트
		Customer[] car = new Customer[3];
		
		car[0] = new Customer("김철수", 28, '남', "kim@naver.com", "010-1234-5678", 
				"서울시 서초구 신논현동 77", 1350.77);
		car[1] = new Customer("홍길순", 55, '남', "hong77@gmail.com", "010-9876-5678", 
				"경기도 하남시 미사동 미사리", 99999.99);
		car[2] = new Customer("스타필드", 30, '여', "Star@hanmail.com", "010-4444-3333", 
				"부산광역시 해운대구 해운대동 102", 1055.55);
		
		//for문 사용
		for(int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		//for each 문 사용 : 객체배열, 컬렉션에서 주로 사용함
		//for(클래스타입 레퍼런스 : 배열명) { 레퍼런스.메소드(); }
		for(Customer c : car) {
			System.out.println(c);
		}
			
		//고객들의 포인트 누적 합산 처리
		double totalPoint = 0.; //0. == 0.0
		for(Customer c : car) {
			System.out.print(c.getPoint() + " + ");
			totalPoint += c.getPoint();
		}
		System.out.println();
		System.out.println("누적 포인트 : " + totalPoint);
		

	}

}
