package oop.sample;

public class Person {
	//Field : 캡슐화
	private String name; //자바에서 레퍼런스는 주소를 저장하는 
	private int age;
	private	char gender;
	
	//	Constructor : 클래스를 new 할 때 사용하는 함수
	//	heap 메모리에 할당되는 객체공간(instance)의 필드 초기화가 목적인 함수
	//	접근제한자 클래스명(){} => 매개변수가 없는 생성자 : 기본생성자
	//	접근제한자 클래스명(자료형 변수, 자료형 변수, ....) { this.필드명 = 변수; }
	//	 => 매개변수 있는 생성자
	// 	생성자는 반드시 클래스명과 이름이 같아야 함
	//	반환자료형 없음 => new 할 떄 한번 사용하고 함수이기 때문임
	//	생성자 오버로딩(overloading, 중복작성) 가능함 : 매개변수를 반드시 다르게 구성해야 함
	public Person() {}
	
	//매개변수(parameter)가 있는 생성자
	//parameter : 함수가 실행될 때 전달오는 값(argument)을 받는 변수
	//argument : 함수 실행시 함수(전달인자) 함수 괄호 안에 적어주는 값
	public Person(String name, int age, char gender) {//함수 괄호안에 만들어진 함수는 매개변수라 한다.
		this.name = name;
		this.age= age;
		this.gender = gender;
	}
	
	//Method
	//getter : 필드에 기록된 값을 요구하는 쪽으로 넘기는 메소드
	//public 반환자료형 get필드명(){ return this.필드명; }
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	//return이 있으면          return이 없으면 void
	
	//setter : 필드값 변경하는 메소드 
	//public void set필드명(자료형 변수) { this.필드 = 변수; }
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//일반메소드
	//만약 this가 없다면 public void display(Person this){} 이렇게 작성해야 함.
	//void 의미 : 모든 끝에 return이 포함되어 있지만 생략가능하기 때문에 지금까지 사용하지 않았던 
	//표기가 생략이 가능하기 때문에 자동으로 구문. return;은 메소드 맨 마지막에 작성해야 에러 안난다
	public void display() { //this도 레퍼런스 변수이다.
		//클래스 안에 있는 생성자와 메소드 안에는 this 라는 레퍼런스변수가 무조건 존재함 
		System.out.println(this.hashCode() + " : " + this.name + ", " + this.age + ", " + this.gender);
		return; //생략해도됨 void = return; 짝꿍
	}
	
	
}











