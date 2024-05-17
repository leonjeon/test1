package test.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestGenerics6 {
	
	public static void main(String[] args) {
		Map<String, Book> map; //책 제목이 키, Book 객체가 값
		map = mapAllocation(); //맵객체 생성(메모리 할당) 해서 레퍼런스 리턴 실행
		putMaps(map); //맵에 Book 객체 추가 메소드 실행 : 3개
		printMap(map); //entry 로 추출해서 출력 처리 : 제목=Book객체정보 출력
		
		
	}
	
	public static void printMap(Map<String, Book> map) {
		Iterator<Map.Entry<String, Book>> entryIter = map.entrySet().iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Book> entry = entryIter.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("---------------------------------------------------------");
		
		System.out.println("entry 활용");
		Set<Entry<String, Book>> entries = map.entrySet();
		Iterator<Entry<String, Book>> entryIter1 = entries.iterator();
		while(entryIter1.hasNext()) {
			Entry<String, Book> entry = entryIter1.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("for each문 활용");
		for(Entry<String, Book> el : entries) {
			System.out.println(el);
		}
		
		
 		
	}
	
	public static void putMaps(Map<String, Book> map) {
		map.put("자바의 정석", new Book("자바의 정석", "홍길동"));
		map.put("Oracle 데이터연동", new Book("Oracle 데이터연동", "백길순"));
		map.put("재밌는jdbc", new Book("재밌는jdbc", "홍홍홍"));
		
	}
	
	public static Map<String, Book> mapAllocation(){
		return new HashMap<String, Book>();
	}

}
