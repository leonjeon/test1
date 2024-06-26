package test.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestGenerics4 {

	public static void main(String[] args) {
		// Set 계열에 Generics 적용
		Set<Book> set = new HashSet<Book>();
		
		//3개의 book 객체를 저장 처리하는 메소드 실행
		setInit(set);
		
		//set 에 저장된 객체 정보 연속으로 출력 처리 
		printSet(set);	

	}
	
	public static void setInit(Set<Book> set) {
		set.add(new Book("자바 알고리즘", "김동수"));
		set.add(new Book("파이썬 알고리즘", "박동수"));
		set.add(new Book("자바스크립트 알고리즘", "한동수"));
		
	}
	
	
	public static void	printSet(Set<Book> set) {
		//iterator() 사용한 경우 : 연속 처리를 위한 목록화에도 제네릭스 표기해야 함
		Iterator<Book> bookIter = set.iterator();
		while(bookIter.hasNext()) {
			Book b = bookIter.next();
			System.out.println(b);
		}
		
		//for each문 : 객체배열, 컬렉션 연속 처리시 사용하는 루푸문임
		for(Book b : set) {
			System.out.println(b);
		}
	}
	
}
