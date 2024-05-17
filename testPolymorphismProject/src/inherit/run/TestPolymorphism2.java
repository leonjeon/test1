package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism2 {

	public static void main(String[] args) {
		// 다형성 테스트 2 : 객체배열에 적용
		//Person[] par = new Person[6];
		Object[] par = new Object[6];
		
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
		
		
		//for(Person p : par) {
		for(Object p : par) {
			System.out.println(p);
		}

	}

}
