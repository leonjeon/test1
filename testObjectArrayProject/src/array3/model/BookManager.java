package array3.model;

import java.util.Scanner;

public class BookManager {
	
//		1. Field 선언
//		- bar : Book[] //null 로 초기화 명시함
//		~ sc : Scanner
//		- count : int	//현재 추가된 객체 수 : static
		private Book[] bar = null; //null 로 초기화 명시함
		Scanner sc;
		private static int count; //현재 추가된 객체 수 : static
	

//		2. 초기화블럭 {}  작성	: 10개의 Book 배열 할당함
		{
			bar = new Book[10]; //객체가 아닌 주소방이 10개라는 뜻임
			sc = new Scanner(System.in);
		}
		
		public BookManager() {}

//		3. menu() 메소드 작성
//			public void menu()
//			=> do~while 문으로 반복 실행 처리함
//		<메뉴 화면>
//		***** 도서 관리 메뉴 *****
//
//		1. 도서 정보 추가	//선택시 bookInput() 메서드 실행함
//		2. 모두 출력	//선택시 bookAllOutput() 메서드 실행함
//		7. 끝내기		//main() 으로 return함
		public void menu() {
			do {
				System.out.println("***** 도서 관리 메뉴 *****");
				System.out.println("1. 도서 정보 추가");
				System.out.println("2. 모두 출력");
				System.out.println("7. 끝내기");
				int no = sc.nextInt();
				
				switch(no) {
				case 1: bookInput(); break;
				case 2: bookAllOutput(); break;
				case 7: return;
				}
				
			}while(true);
			
		}
		
		
//		=> 새로운 도서 정보 기록을 위한 객체 생성하고
//		   현재 인덱스에 주소 저장함
//		=> 생성자에서 객체 수 카운트 1증가함
//		=> 키보드로 도서 정보 입력받아 객체에 기록함
		public void bookInput() {
			bar[count] = new Book();
			
			//키보드 입력 처리
			System.out.print("책 제목 : ");
			sc.nextLine();
			bar[count].setTitle(sc.nextLine());
			
			System.out.print("가격 : ");
			bar[count].setPrice(sc.nextInt());
			
			System.out.print("저자명 : ");
			bar[count].setAuther(sc.next());
			
			System.out.println("출판사 : ");
			bar[count].setPublisher(sc.nextLine());
			
			count++;
		}
		
		public void bookAllOutput()	{
			for(int i = 0; i < count; i++) {
				System.out.println(bar[i].bookinfo());
			}
		}
		
	

}
