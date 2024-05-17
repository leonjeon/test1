package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Student;

public class TestStudent2 {

	public static void main(String[] args) {
		// 객체배열 테스트
		Student[] sar = new Student[3];
		
		sar[0] = new Student("김철수", 28, '남', "kim@naver.com", "010-1234-5678", 
				12, "영어영문학", 3.7);
		sar[1] = new Student("홍길순", 55, '남', "hong77@gmail.com", "010-9876-5678", 
				25, "기계공학과", 4.2);
		sar[2] = new Student("스타필드", 30, '여', "Star@hanmail.com", "010-4444-3333", 
				30, "실용음악학과", 4.5);
		
		//학점 평균을 구한다면
		double totalScore = 0.;
		for(Student s : sar) {
			System.out.println(s);
			totalScore += s.getScore();
		}
		
		System.out.println("학점 평균 : " + ((int)((totalScore / sar.length) * 10)) / 10.0);
		System.out.printf("학점 평균 : %.1f\n", (totalScore / sar.length));
	}

}
