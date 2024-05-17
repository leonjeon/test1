package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {
	
	//메뉴 화면 제공용 클래스
	
//	 	- Field
//		- sc:Scanner	//키보드 입력용 객체 생성 초기화함
//		- mManager:MemberManager   //회원관리 클래스 객체 생성 초기화함
	
	Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();
	
	//- 디폴트 생성자 작성
	
	public MemberMenu () {}
	
	
	//- 메소드 작성
	
	public void mainMenu(){
		
		//메뉴는 반복 출력되게 함
//		<실행 화면> ----------------------------------------------------------
//
//		//MemberManager 클래스의 public static final SIZE(상수필드)값 출력시킴
//		최대 등록 가능한 회원 수는 10 명입니다.
//		//MemberManager 클래스의 memberCount 필드의 값을 리턴받아 출력 !(getter사용)
//		현재 등록된 회원수는 5명 입니다.
//
//		***** 회원 관리 프로그램 *****
//
//		1. 새 회원 등록		객체배열사용
//		2. 회원 조회			java.lang.String 의 equals 사용
//		3. 회원 정보 수정		setter사용
//		4. 회원 정보 정렬		java.lang.String 의 compareto 사용
//		5. 회원 삭제		
//		6. 모두 출력
//		9. 끝내기
//		메뉴 선택 : 
//
//		- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
//		- 조회, 수정, 정렬 메뉴는 각각 부메뉴에 대한 메소드를 실행되게 함
//		  1번 선택시 >> MemberManager 의 memberInput() 실행
//		  2번 선택시 >> searchMenu();
//		  3번 선택시 >> modifyMenu();
//		  4번 선택시 >> sortMenu();
//		  5번 선택시 >> MemberManager 의 deleteMember() 실행
//		  6번 선택시 >> MemberManager 의 printAllMember() 실행
//		- 끝내기는 "정말로 끝내시겠습니까? (y/n) : " 에서
//			대/소문자 'y'가 입력되면 main() 으로 리턴시킴
		
		
		do {

			System.out.println("***** 회원 관리 프로그램 *****");
	
			System.out.println("1. 새 회원 등록");		
			System.out.println("2. 회원 조회");			
			System.out.println("3. 회원 정보 수정");		
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");		
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 선택 :"); 
			int no = sc.nextInt();
			
			switch(no) {
			
			case 1 : mManager.memberInput(); break;
			case 2 : mManager.searchMenu(); break;
			case 3 : mManager.modifyMenu(); break;
			case 4 : mManager.sortMenu(); break;
			case 5 : mManager.deleteMember(); break;
			case 6 : mManager.printAllMember(); break;
			case 9 : System.out.println("정말로 끝내시겠습니까? (y|n) : ");
				if(sc.next().toUpperCase().charAt(0)!= 'Y') {
					return;
				}
			
			}
		}while(true);
		
	}
	public void searchMenu(){
		
		System.out.println("***** 회원 정보 검색 메뉴 *****");
		
		System.out.println("1. 아이디로 검색");
		System.out.println("2. 이름으로 검색");
		System.out.println("3. 이메일로 검색");
		System.out.println("9. 이전 메뉴로 가기");
		System.out.println("메뉴 선택 :"); 
		
		
		
	}
	public void sortMenu(){
		
		do {
		
		System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");
		
		System.out.println("1. 아이디 오름차순 정렬 출력");
		System.out.println("2. 아이디 내림차순 정렬 출력");
		System.out.println("3. 나이 오름차순 정렬 출력");
		System.out.println("4. 나이 내림차순 정렬 출력");
		System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
		System.out.println("9. 이전 메뉴로 가기");
		System.out.println("메뉴 선택 : ");
		int no = sc.nextInt();
		
		switch(no) {

		case 1: //- 1번 선택시 >> MemberManager 클래스의 sortIDAsc() 실행 
			mManager.sortIDAsc(); break;
		case 2: //- 2번 선택시 >> MemberManager 클래스의 sortIDDes() 실행
			mManager.sortIDDes(); break;
		case 3: //- 3번 선택시 >> MemberManager 클래스의 sortAgeAsc() 실행
			mManager.sortAgeAsc(); break;
		case 4: //- 4번 선택시 >> MemberManager 클래스의 sortAgeDes() 실행
			mManager.sortAgeDes(); break;
		case 5: //- 5번 선택시 >> MemberManager 클래스의 sortGenderDes() 실행
			mManager.sortGenderDes(); break;
		case 9: //- 9번 선택시 >> "메인 메뉴로 화면 이동합니다." 출력하고, 리턴함
			System.out.println("메인 메뉴로 화면 이동합니다.");
			return;
			
			
			}
		}while(true);
		
	}
	public void modifyMenu(){
		
		mManager.findMember(0);
	}

}




















































