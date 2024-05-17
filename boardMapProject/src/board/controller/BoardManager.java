package board.controller;

import java.util.HashMap;
import java.util.Scanner;

import board.model.vo.Board;

 public class BoardManager {
	HashMap<Integer, Board> bmap = new HashMap<Integer, Board>();
	Scanner sc = new Scanner(System.in);

	
	
//	1. 게시글 쓰기 메소드
//	>> 구현내용
//	1> "새 게시글 쓰기 입니다." 출력
//	2> "글제목 : " >> 입력받음(공백포함)
//	3> "작성자 : " >> 이름 입력받음 (공백없이)
//	4> 작성날짜는 현재 날짜로 입력처리함
//	5> "글내용 : " >> 여러 줄로 입력받음
//			"exit" 입력하면 입력종료
//	6> Board 객체 생성시 초기값으로 사용함
//	7> bmap에 추가함(등록하는 글번호가 key 임)
  public void writeBoard(){
	  System.out.println("새 게시글 쓰기 입니다.");
	  
	
	
}
	


//
//
//		2. 게시글 전체 보기	메소드
//	>> 구현내용
//	1> 전달받은 maps에 기록된 정보를 모두 화면에 출력시킴


//  public void displayAllMaps(Map maps){
//	
//}


//		3. 게시글 한개 보기	메소드
//		>> 구현내용
//		1> "조회할 글번호 : " >> 입력받음
//		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
//		3> 해당 글에 대한 조회수 1증가 처리함
   public void displayBoard(){
	 
 }



//		4. 게시글 제목 수정	메소드
//			>> 구현내용
//			1> "수정할 글번호 : " >> 입력받음
//			2> 해당 글번호에 대한 게시글을 화면에 출력시킴
//			3> "변경할 제목 : " >> 새 제목 입력받음 >> 제목변경
//			4> 변경된 객체 정보를 bmap의 해당 번호 객체에 적용함
   public void modifyTitle(){}


//		5. 게시글 내용 수정	메소드
//		>> 구현내용
//		1> "수정할 글번호 : " >> 입력받음
//		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
//		3> "변경할 내용 : " >> 새 내용 입력받음 >> 내용변경
//		4> 변경된 객체 정보를 bmap의 해당 번호 객체에 적용함
   public void modifyContent(){}

//
//
//		6. 게시글 삭제 메소드
//		>> 구현내용
//		1> "삭제할 글번호 : " >> 입력받음
//		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
//		3> "정말로 삭제하시겠습니까? (y/n) : " 
//		    >> 'Y'입력시 list에서 해당 객체 삭제함
//		4> "oo번 글이 삭제되었습니다." 출력
   public void deleteBoard(){
	 
 }

//			
//
//		7. 게시글 검색 메소드
//			>> 구현내용
//			1> "검색할 제목 : " >> 검색할 글자를 입력받음
//			2> 입력된 글자를 제목으로 포함하고 있는 객체들을 bmap에서
//			   찾음
//			3> 화면에 검색된 객체들을 출력함
   public void searchBoard(){
	 
 }

//
//
//		8. 파일에 저장하기 메소드
//			>> 구현내용
//			1> bmap에 저장된 정보를 board_list.dat 파일에 
//			   ObjectOutputStream 클래스 사용하여 기록 저장함
//			   try with resource 문 사용할 것
//			2> "board_map.dat 에 성공적으로 저장되었습니다." 출력
   public void saveMapFile(){
	 
 }

//
//		9. 정렬처리용 메소드
//		>> 구현내용: bmap 을 TreeMap 으로 정렬을 적용하여 displayAllMaps() 사용하여 출력 처리함
//		1> item 이 1이면 번호순 정렬
//		    item 이 2이면 날짜순 정렬
//		    item 이 3이면 제목순 정렬 작동되게 정렬용 클래스 사용함
//		2> isDesc 가 true 이면 내림차순정렬 작동
//		    isDesc 가 false 이면 오름차순정렬 작동되게 함
   public void sortMap(int item, boolean isDesc){
			 
		 }

		

}
