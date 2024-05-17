package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {
	
	BoardManager bm = new  BoardManager();
	
	//1. 필드 : Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);
	

	//2. 생성자 : 디폴트생성자
	public BoardMenu() {}
	
	//3. public void mainMenu() 메소드 작성
	//  >> 출력내용
	
	public void mainMenu() {
		
		
		do {
			
			System.out.println("******* 게시글 서비스 프로그램 *******");
	
			System.out.println("1. 게시글 쓰기");		
			//BoardManager의 writeBoard() 실행
		
			System.out.println("2. 게시글 전체 보기");		
			//		displayAllList()
		
			System.out.println("3. 게시글 한개 보기");		
			//		displayBoard()
		
			System.out.println("4. 게시글 제목 수정");		
			//		modifyTitle()
			
			System.out.println("5. 게시글 내용 수정");		
			//		modifyContent()
			
			System.out.println("6. 게시글 삭제");		
			//		deleteBoard()
			
			System.out.println("7. 게시글 검색");		
			//		searchBoard()
			
			System.out.println("8. 파일에 저장하기");		
			//		saveListFile()
			
			System.out.println("9. 정렬하기	");	
			// BookMenu 의 sortSubMenu() 실행
			
			System.out.println("10. 끝내기");		
			//main() 으로 리턴함
			
			int no = sc.nextInt();
			//메뉴 번호 선택 : 

		    //>> 구현내용
			//1. 메뉴 화면 반복 실행 처리
			//2. 해당 메뉴 번호에 따라 BoardManager 클래스 메소드 실행
		
			
			switch(no) {
				
				case 1: bm.writeBoard(); 		break;
				
				case 2: bm.displayAllList(); 	break;
				
				case 3: bm.displayBoard(); 		break;
				
				case 4: bm.modifyTitle(); 		break;
				
				case 5: bm.modifyContent(); 	break;
				
				case 6: bm.deleteBoard(); 		break;
				
				case 7: bm.searchBoard();	    break;
				
				case 8: bm.saveListFile();		break;
				
				case 9: sortSubMenu(); 			break;
				
				case 10: return;
			
			}

		}while(true);


	}
	
	public void sortSubMenu(){
		
		do {
			
			System.out.println("****** 게시글 정렬 메뉴 ******");
	
			System.out.println("1. 글번호순 오름차순정렬");	
			//BookManager 의 	sortList(1, false) 실행
			
			System.out.println("2. 글번호순 내림차순정렬");	
			//		sortList(1, true) 실행
			
			System.out.println("3. 작성날짜순 오름차순정렬");	
			//		sortList(2, false) 실행		
			
			System.out.println("4. 작성날짜순 내림차순정렬");	
			//		sortList(2, true) 실행
			
			System.out.println("5. 글제목순 오름차순정렬");	
			//		sortList(3, false) 실행
			
			System.out.println("6. 글제목순 내림차순정렬");	
			//		sortList(3, true) 실행
			
			System.out.println("7. 이전 메뉴로 이동");		
			//return 처리
			int no = sc.nextInt();
						
				switch(no){
				
					case 1: break;
					case 2:	break;
					case 3: break;
					case 4: break;
					case 5: break;
					case 6: break;
					case 7: return;
				
				
				}
				
		}while(true);
			

		//메뉴 번호 : 번호입력받음
		//>> 반복 출력되게 함
		
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


