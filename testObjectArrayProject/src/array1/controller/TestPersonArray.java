package array1.controller;

import java.util.Scanner;

import array1.model.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// 객체배열실습
		//1.Person 클래스에 대한 객체 배열 5개 선언함
		Person[] par = new Person[5];
		Scanner sc = new Scanner(System.in);
		
	//	Person p1 = new Person("홍길동", 50, 180.3, '남', 80.3);
		
		
		
		//2.키보드로 5 사람의 정보를 입력받아, 각 객체에 기록함
		
		for(int i = 0; i < par.length; i++) {
			par[i] = new Person();
			
			
			
		}
		
		//3. 출력 따로 구문 작성
		
		//4. 5명의 이름, 나이, 키, 성별, 몸무게의 평균을 구하여 각각 출력함
		
		System.out.println("번째 사람의 정보를 입력하세요.");
		System.out.println(" 이름 : ");
		System.out.println(" 나이 : ");
		System.out.println(" 키 : ");
		System.out.println(" 성별 : ");
		System.out.println(" 몸무게 : ");
		

	}

}
