package oop.encapsulation;

public class TestConstructor {

	public static void main(String[] args) {
		// 생성자 사용 테스트용
		// 생성자 사용 : 클래스타입 레퍼런스 = new 생성자();
		Student s1 = new Student(); //기본생성자 사용함
		System.out.println("s1 이 가진 주소 : " + s1.hashCode());
		
		Student s2 = new Student(12, "홍길동", 27, "010-1234-5678"); //매개변수 4개 있는 생성자 사용 테스트
		System.out.println("s2 가 가진 주소 : " + s2.hashCode());
		
		//모든 필드값 전달받아 초기화하는 생성자 사용
		Student s3 = new Student(15, "황지니", 25, "010-7777-8888", '여', "컴퓨터공학", "hwa77@test.org",
				"서울시 서초구 신논현동 77", 88.5);
		System.out.println("s3 가 가진 주소 : " + s3.hashCode());
		
		s1.printInformation();
		s2.printInformation();
		s3.printInformation();
		
		
		//setter 사용 필드값 변경
		s2.setMajor("식품영양");
		s2.setEmail("hong123@test.org");
		s2.setGender('남');
		s2.setAddress("서울시 강서구 당산동");
		s2.setScore(95.2);
		
		s2.printInformation();
		
		//s1 이 참조하는 객체의 인스턴스변수 값 모두 수정 처리
		s1.setSno(3);
		s1.setName("이순신");
		s1.setAge(34);
		s1.setMajor("실용음악");
		s1.setEmail("music@test.org");
		s1.setGender('남');
		s1.setPhone("010-9999-8888");
		s1.setAddress("경기도 하남시 미사동");
		s1.setScore(99.9);
		
		s1.printInformation(); //확인
		
	
	}

}
