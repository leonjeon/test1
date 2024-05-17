package inherit.run;

import inherit.model.dto.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// overriding method test
		Customer c1 = new Customer();
		Customer c2 = new Customer("김철수", 28, '남', "kim@naver.com", "010-1234-5678", 
				"서울시 서초구 신논현동 77", 1350.77);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		Customer c3 = (Customer)c2.clone();
		System.out.println(c3);
		System.out.println("두 객체의 내용이 같은지 확인 : " + c2.equals(c3));  //true
		System.out.println("두 레퍼런스가 가진 주소가 같은지 확인 : " + (c2 == c3)); //false
	

	}

}
