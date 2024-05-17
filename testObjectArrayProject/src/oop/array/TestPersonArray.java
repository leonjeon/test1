package oop.array;

import java.util.GregorianCalendar;

public class TestPersonArray {

	public static void main(String[] args) {
		// Person 객체 배열 테스트
		/*
		Person p1 = new Person("홍길동" , "010-1234-5678", "직장동룍" , new GregorianCalendar(1995, 11, 15));
		Person p2 = new Person("이순신" , "010-4949-2727", "직장동룍" , new GregorianCalendar(1985, 1, 23));
		Person p3 = new Person("황지니" , "010-9876-4321", "직장동룍" , new GregorianCalendar(1950, 6, 25));
		
		System.out.println(p1.information() + "\n");
		System.out.println(p2.information() + "\n");
		System.out.println(p3.information() + "\n");
		*/
		
		//객체배열은 2번 new 발생
		
		
		Person[] par = new Person[3];  //Person 객체의 주소보관용 레퍼런스변수방 3개 배열로 만들었음
		
		//각 레퍼런스에는 null 로 초기화되었음
		for(int i = 0; i < par.length; i++) {
			System.out.println("par[" + i + "] : " + par[i]);
		}
		
		par[0] = new Person("홍길동" , "010-1234-5678", "직장동룍" , new GregorianCalendar(1995, 11, 15));
		par[1] = new Person("이순신" , "010-4949-2727", "직장동룍" , new GregorianCalendar(1985, 1, 23));
		par[2] = new Person("황지니" , "010-9876-4321", "직장동룍" , new GregorianCalendar(1950, 6, 25));
		
		for(int i = 0; i < par.length; i++) {
			System.out.println(par[i].information());
		}
	}

}
