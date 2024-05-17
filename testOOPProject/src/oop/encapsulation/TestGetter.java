package oop.encapsulation;

public class TestGetter {

	public static void main(String[] args) {
		// getter 메소드 사용 테스트
		
		Student s1 = new Student(10, "홍길동", 24, "010-1234-5678", '남', "컴퓨터공학", "hwa77@test.org",
				"서울시 서초구 신논현동 77", 88.5);
		Student s2 = new Student(11, "이순신", 25, "010-9876-5432", '여', "실용음악", "music@test.org",
				"경기도 하남시 미사동 100", 97.2);
		Student s3 = new Student(12, "강감찬", 26, "010-7777-8888", '여', "기계공학", "robot@test.org",
				"서울시 강남구 청담동 5", 64.5);
		
		s1.printInformation();
		s2.printInformation();
		s3.printInformation();
		
		
		//수강생 3명의 시험성적의 합계를 구하고 평균을 계산 출력
		double total = s1.getScore() + s2.getScore() + s3.getScore();
		System.out.println("점수 총점 : " + total);
		System.out.println("평균 점수 : " + total / 3);
		
		//수강생들의 나이의 평균을 계산 출력
		int AgeTot = (s1.getAge() + s2.getAge() + s3.getAge()) / 3;
		System.out.println("평균 나이 : " + AgeTot);
	}//main

}//TestGetter

















