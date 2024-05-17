package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {	
//	1. MemberManager 클래스 작성
//	: 회원 정보 관리용 클래스
// - Field 구성 (+ public)
//	+ SIZE:static int = 10	//배열 크기 지정용 상수
	public static final int SIZE = 10;
//	- memberCount:int		//현재 등록된 객체 수 카운트용
	private int memberCount;
//	- mar:Member[] 		//SIZE 사용 배열 초기화 할당함
	private Member[] mar;
//	~ sc:Scanner	//키보드 입력용 객체 생성 초기화함 (new선언)
	Scanner sc = new Scanner(System.in);	
	
// - 초기화블럭 작성 : 테스트에 사용할 샘플 객체 5개 생성함
	
	{
		mar = new Member[SIZE];
		
		mar[0] = new Member("kim12*3", "김유신", "pwkkk34!", "kim123@naver.com", 'M', 35);
		mar[1] = new Member("yksrose77#", "윤경숙", "yksrose77#", "yksrose77@daum.net", 'F', 29);
		mar[2] = new Member("abcdefg87#", "홍길동", "abcdefg87#", "abcdefg87@daum.net", 'M', 28);
		mar[3] = new Member("bkbkbk97#", "유관순", "bkbkbk97#", "bkbkbk97@daum.net", 'F', 27);
		mar[4] = new Member("clspos107#", "허준", "clspos107#", "clspos107@daum.net", 'M', 26);

		memberCount = 5;
	}

// - 디폴트 생성자 작성
	
	public MemberManager() {
		super();
	}
	
// - 메소드 작성
//	1. memberCount 필드에 대한 getter 작성
		public int getMemberCount(){
			return memberCount;
		}
		
		
//	2. 새 회원 정보 입력용 메소드 작성
		
		 // 키보드로 새 회원의 정보를 입력받아, 배열에 기록함
		//  Member 클래스의 setter 사용함
		//마지막에 memberCount 1증가시킴	
		public void memberInput(){
				
				mar[memberCount] = new Member();
				
		// 키보드로 새 회원의 정보를 입력
				System.out.println("새 회원의 정보를 입력하세요");
		
				
		//  Member 클래스의 setter 사용함
				
				System.out.print("아이디 : ");
				mar[memberCount].setId(sc.next());
				
				System.out.print("이름 : ");
				mar[memberCount].setName(sc.next());
				
				System.out.print("패스워드 : ");
				mar[memberCount].setPassword(sc.next());
				
				System.out.print("이메일 : ");
				mar[memberCount].setEmail(sc.next());
				
				System.out.print("성별 : ");			
				mar[memberCount].setGender(sc.next().charAt(0));
				
				System.out.print("나이 : ");
				mar[memberCount].setAge(sc.nextInt());
				
		//마지막에 memberCount 1증가시킴
				
				memberCount++;
				
		}
			
			public void searchMenu() {
		}
			
			public void modifyMenu() { 
				
				do {
					
				System.out.println("****** 회원 정보 수정 메뉴 *****");

				System.out.println("1. 암호 변경");
				System.out.println("2. 이메일 변경");
				System.out.println("3. 나이 변경");
				System.out.println("9. 이전 메뉴로 가기");
				System.out.println("메뉴 선택 : ");
				int no = sc.nextInt();
				
				switch(no) {

//				- 1번 선택시 >> 변경할 회원의 아이디 : 입력받음
				//case 1: int index = mar[memberCount].searchMemberId();
//					     MemberManager 클래스의 검색메소드 실행함 >>
//					     int index = 레퍼런스.searchMemberId(아이디);
//					     리턴받은 인덱스로 회원의 정보를 출력함
//					     변경할 암호 : 입력받음
//					     Member 클래스의 setPassword(암호) 실행
//					     "회원의 정보가 변경되었습니다." 출력
//					     단, 검색메소드의 리턴값이 -1아닌 경우에만 실행되게 함
//				- 2번 선택시 >> 변경할 회원의 아이디 : 입력받음
//					     MemberManager 클래스의 검색메소드 실행함 >>
//					     int index = 레퍼런스.searchMemberId(아이디);
//					     리턴받은 인덱스로 회원의 정보를 출력함
//					     변경할 이메일주소 : 입력받음
//					     Member 클래스의 setEmail(이메일) 실행
//					     "회원의 정보가 변경되었습니다." 출력
//					     단, 검색메소드의 리턴값이 -1아닌 경우에만 실행되게 함
//				- 3번 선택시 >> 변경할 회원의 아이디 : 입력받음
//					     MemberManager 클래스의 검색메소드 실행함 >>
//					     int index = 레퍼런스.searchMemberId(아이디);
//					     리턴받은 인덱스로 회원의 정보를 출력함
//					     변경할 나이 : 입력받음
//					     Member 클래스의 setAge(나이) 실행
//					     "회원의 정보가 변경되었습니다." 출력
//					     단, 검색메소드의 리턴값이 -1아닌 경우에만 실행되게 함
//				- 9번 선택시 >> "메인 메뉴로 화면 이동합니다." 출력하고, 리턴함 
				}
			}while(true);
		}
			
			public void sortMenu() {
		}
			
//			3. 배열에서 회원 정보 삭제용 메소드 작성
//			public void deleteMember(){
			public void deleteMember() {

//		 	삭제할 회원의 아이디를 입력받음
			System.out.println("아이디 :");
			
			String str = sc.next();
//			리턴받은 인덱스에 대한 회원정보 출력함
			for(int i = 0; i < memberCount; i++) {
				if(str.equals(mar[i].getId())) {
//			정말로 삭제하시겠습니까? (y/n) : 출력
				 System.out.println("정말로 삭제하시겠습니까? (y/n)");
//					입력값이 대소문자 상관없이 'Y' 이면, 해당 인덱스의
//					레퍼런스를 null로 처리함
				 	char a = sc.next().toUpperCase().charAt(0);
				 	if(a == 'Y') {
//						마지막 인덱스일 경우에만 null 처리함
				 		mar[i] = null;
//						단, 검색한 회원의 인덱스가 0 또는 중간 위치일 경우에는
//						지울 위치 뒤의 주소들을 하나씩 앞으로 옮김
				 		for(int j = i; j < memberCount; j++) {
				 			mar[j] = mar[j+1];
//					삭제 후 memberCount 1 줄임
				 		} memberCount --;
				 		
				 	}
				 
				}
				
			} 

		}
			
			public void printAllMember() {
//		Member 클래스의 memberInfo() 사용 출력처리함
				for(int i = 0; i < memberCount; i++) {
					//mar[i]방 0 ~ 5 / memberInfo 출력 for문으로 돌때마다
					System.out.println(mar[i].memberInfo());
				}
		}


//	5. 아이디를 이용한 회원정보 검색용 메소드 작성
		public int searchMemberId(String id){
			
//		  전달받은 아이디와 일치하는 회원이 있는지 찾음
			for(int i = 0; i < memberCount; i++) {
				if(id.equals(mar[i].getId())) {
//		회원이 존재하면, 반복을 종료하고 해당 인덱스를 
					return i;
				}
			}
//		  회원이 존재하면, 반복을 종료하고 해당 인덱스를 
//		  존재하지 않으면 -1을 리턴 처리함
			return -1;
		}
//	6. 이름을 이용한 회원정보 검색용 메소드 작성
		public int searchMemberName(String name){
//		  전달받은 이름과 일치하는 회원이 있는지 찾음
			for(int i = 0; i < memberCount; i++) {
				if(name.equals(mar[i].getName())) {
//		회원이 존재하면, 반복을 종료하고 해당 인덱스를 	
					return i;
				}
			}

//		  존재하지 않으면 -1을 리턴 처리함
			return -1;
		}
//	7. 이메일주소를 이용한 회원정보 검색용 메소드 작성
		public int searchMemberEmail(String email){
//		  전달받은 이메일과 일치하는 회원이 있는지 찾음
			for(int i = 0; i < memberCount; i++) {
				if(email.equals(mar[i].getEmail())) {
//			회원이 존재하면, 반복을 종료하고 해당 인덱스를	
					return i;
				}
			}

//		  존재하지 않으면 -1을 리턴 처리함
			
			return -1;
		}
//	8. 한 사람의 회원 정보 출력용 메소드 작성
		public void printMember(int index){
//		  전달받은 인덱스에 대한 회원정보 출력함
			if(index >= 0 && index < memberCount) {
				mar[index].memberInfo();
			}else {
				System.out.println("유효하지 않습니다.");
			}
			
			class Member{
				
		public void memberinfo() {
					
				}
			}
			
//		  >> Member 클래스의 memberInfo() 메소드 사용함
		}	  
//	
//	9. 아이디순 오름차순 정렬하는 메소드 작성
		public void sortIDAsc(){
//		  현재 등록된 회원에 대한 배열을 복사함 //
			Member[] copy = new Member[memberCount];
			//복사에대한 for문 작성
			for(int i = 0; i < memberCount; i++) {
				copy[i] = mar[i];
			}
//		  복사본에 대해 Select Sort 방식의 오름차순 정렬 처리
			//정렬에 대한 for문 작성
			for(int i = 0; i < memberCount; i++) {
				//j와 i의 초기값이 같으면 비교대상이 되지 않기때문에 i+1로 해야 j가 0, i가 1 비교
				for(int j = i+1; j < memberCount; j++) {
					if(copy[i].getId().compareTo(copy[j].getId()) > 0) {
						 Member tmp = copy[i];
							copy[i] = copy[j];
							copy[j] = tmp;
					}
				}
			}
//			 정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
			for(int i = 0; i < memberCount; i++) {
				System.out.println(copy[i].memberInfo());
			}
		}
//	10. 아이디순 내림차순 정렬하는 메소드 작성
		public void sortIDDes(){
//	  현재 등록된 회원에 대한 배열을 복사함
			Member[] copy = new Member[memberCount];
			for(int i = 0; i < memberCount; i++) {
				for(int j = i+1; j < memberCount; j++) {
			//복사본에 대해 Select Sort 방식의 내림차순 정렬 처리
					if(copy[i].getId().compareTo(copy[j].getId()) < 0) {
						Member tmp = copy[i];
						copy[i] = copy[j];
						copy[j] = tmp;
					}
				}
			}

//		  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
			for(int i = 0; i < memberCount; i++) {
				System.out.println(copy[i].memberInfo());
			}
		}
//	11. 나이순 오름차순 정렬하는 메소드 작성
		public void sortAgeAsc(){
//		  현재 등록된 회원에 대한 배열을 복사함
			Member[] copy = new Member[memberCount];
			for(int i = 0; i < memberCount; i++) {
				for(int j = i+1; j < memberCount; j++) {
//		  복사본에 대해 Select Sort 방식의 오름차순 정렬 처리
				  if(copy[i].getAge() > copy[j].getAge()) {
					  Member tmp = copy[i];
						copy[i] = copy[j];
						copy[j] = tmp;
					}
				}	
			}
//		  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
			for(int i = 0; i < memberCount; i++) {
				System.out.println(copy[i].memberInfo());
			}
		}
//	12. 나이순 내림차순 정렬하는 메소드 작성
		public void sortAgeDes(){
//		  현재 등록된 회원에 대한 배열을 복사함
			Member[] copy = new Member[memberCount];
			for(int i = 0; i < memberCount; i++) {
				for(int j = i+1; j < memberCount; j++) {
//		  복사본에 대해 Select Sort 방식의 내림차순 정렬 처리
					if(copy[i].getAge() < copy[j].getAge()) {
						 Member tmp = copy[i];
							copy[i] = copy[j];
							copy[j] = tmp;
					}
				}
			}
			
//		  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
			for(int i = 0; i < memberCount; i++) {
				System.out.println(copy[i].memberInfo());
			}
		}
//	13. 성별순 내림차순 정렬하는 메소드 작성
		public void sortGenderDes(){
			
//		  현재 등록된 회원에 대한 배열을 복사함
			Member[] copy = new Member[memberCount];
			
			for(int i = 0; i < memberCount; i++) {
				for(int j = i+1; j < memberCount; j++) {
					if(copy[i].getGender() < copy[j].getGender()){ //성별 M,F순으로 정렬(내림차순) 크면 앞으로 오게끔
						 Member tmp = copy[i];
							copy[i] = copy[j];
							copy[j] = tmp;									//뒤에있는애가 크면 앞으로 오게끔
					}
				}
			}
//		  복사본에 대해 Select Sort 방식의 오름차순 정렬 처리			
//		  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
					for(int i = 0; i < memberCount; i++) {
						System.out.println(copy[i].memberInfo());
					}
		}
//	14. MemberMenu 클래스에서 회원정보 수정 기능에서 사용함 3333
//		인덱스를 전달받아, 
//		인덱스 위치//에 기록된 객체//의 주소//를 리턴하는 메소드 작성
		public Member findMember(int index){
//		  배열 인덱스에 기록된 주소를 리턴함
			System.out.println(mar[index] + ", " + index);
			return mar[index];
			
		}
				
			
			
			
		

		

			



			
			

	

}
