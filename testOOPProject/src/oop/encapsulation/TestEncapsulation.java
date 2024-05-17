package oop.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// Filed 캡슐화 접근 테스트
		Student std = new Student();
		System.out.println("std : " + std);
		System.out.println("std : " + std.toString());
		System.out.println("std 가 가진 객체의 위치 : " + std.hashCode()); //10진수 위치 표기
		
		//클래스가 소유한 멤버(필드, 메소드)에 접근하려면
		//주소.필드명, 주소.메소드명()
		//std.name = "홍길동"; //private 이므로 접근 불가능

	}

}
