package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {
	
	//키보드로 입력 스캐너 선언
	Scanner sc = new Scanner(System.in);
	BoardManager bManager = new BoardManager();
	
	public BoardMenu() {
		
	}
	
	public void maimMenu() {
		
		do {
			
			System.out.println("******* 게시글 서비스 프로그램 *******");

			System.out.println("1. 게시글 쓰기		//BoardManager의 writeBoard() 실행");
			System.out.println("2. 게시글 전체 보기		//		displayAllMaps()");
			System.out.println("3. 게시글 한개 보기		//		displayBoard()");
			System.out.println("4. 게시글 제목 수정		//		modifyTitle()");
			System.out.println("5. 게시글 내용 수정		//		modifyContent()");
			System.out.println("6. 게시글 삭제		//		deleteBoard()");
			System.out.println("7. 게시글 검색		//		searchBoard()");
			System.out.println("8. 파일에 저장하기		//		saveMapFile(");
			System.out.println("9. 정렬하기		// BookMenu 의 sortSubMenu() 실행");
			System.out.println("10. 끝내기		//main() 으로 리턴함");

			System.out.println("메뉴 번호 선택 : ");
			int no = sc.nextInt();
			
		switch(no) {
			
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
		
			
			}
			
			
		} while(true);
			
		
	}
	

}
