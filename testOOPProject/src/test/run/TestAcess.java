package test.run;

import oop.encapsulation.Student;
import test.access.PublicClass;
//import test.access.DefaultClass;

public class TestAcess {

	public static void main(String[] args) {
		// public calss 와 default class 테스트
		PublicClass test = new PublicClass();
		//DefaultClass test2 = new DefaultClass();
		//DefaultCalss 는 패키지 밖에서 사용 불가능. import 선언도 안됨!
		//패키지 밖에서 사용할수 있는 클래스는 public클래스만 가능함
		
		
		Student student = new Student();
		//student.name = "황지니"; //private, default, protected 이면 패키지 밖에선 접근 불가능
		//public 이면 접근 가능 : 캡슐화에 위배됨
	}

}
