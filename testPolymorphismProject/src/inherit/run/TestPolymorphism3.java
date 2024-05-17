package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism3 {
	
	//다형성은 주로 메소드 중복의 갯수를 줄이기 위해 사용함
	public static void print(Object[] array) {
			
				//for(Person p : par) {
				for(Object p : array) {
				System.out.println(p);
			}
		
	}
	
	public static Object[] initArray(int su) {
		
		Object[] par = new Object[su];
		
		par[0] = new Customer("김철수", 28, '남', "kim@naver.com", "010-1234-5678", 
				"서울시 서초구 신논현동 77", 1350.77);
		par[1] = new Customer("홍길순", 55, '남', "hong77@gmail.com", "010-9876-5678", 
				"경기도 하남시 미사동 미사리", 99999.99);
		par[2] = new Customer("스타필드", 30, '여', "Star@hanmail.com", "010-4444-3333", 
				"부산광역시 해운대구 해운대동 102", 1055.55);
		par[3] = new Student("김철수", 28, '남', "kim@naver.com", "010-1234-5678", 
				12, "영어영문학", 3.7);
		par[4] = new Student("홍길순", 55, '남', "hong77@gmail.com", "010-9876-5678", 
				25, "기계공학과", 4.2);
		par[5] = new Student("스타필드", 30, '여', "Star@hanmail.com", "010-4444-3333", 
				30, "실용음악학과", 4.5);
		
		return par;
	}

	public static void main(String[] args) {
		// 다형성 테스트 3 : 메소드 매개변수, 리턴타입에 적용
		
		Object[] arr = initArray(6);
		print(arr);
		
		
	

	}

}
