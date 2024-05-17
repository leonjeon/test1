package logic.testif;

import java.util.Scanner;

public class IfSample {
	//조건문 if만 사용한 경우의 샘플 클래스
	//제시한 조건을 만족하는 경우에만 실행 내용이 작동되게 하는 구문임
	//if(조건표현식) { 조건의 결과가 참일 때 실행하러 구문들 }
	//조건표현식은 반드시 참(true) | 거짓(false)의 결과가 나오게끔 작성해야 함
	
	public void test1() {
		//정수를 하나  입력받아서, 양수일 때만 입력된 수의 구구단이 출력 처리
		//양수가 아니면 실행할 내용 없음
		System.out.print("정수 하나 입력 :");
		int dan = new Scanner(System.in).nextInt();
		
		if(dan > 0) {
			//dan의 값이 양수일 때만 작동
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			
			} //for
			
		} //if
		
	}//test1
	
	public void test2() {
		//문자를 하나 입력받아, 양수이면서 대문자일 때만 유니코드가 출력되게 처리.
		System.out.print("문자 하나 입력 : ");
		/* Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		 char ch = s.charAt(0);*/
		 
		
		char dan = new Scanner(System.in).next().charAt(0);
		
		if(dan > 0 && (dan >= 'A' && dan <= 'Z')) {
			System.out.println(dan + " is unicode " + (int)dan);
		} //if
		
	} //test2
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		//콘솔에 "회원이면 1, 비회원이면 2 입력 : " 출력
		System.out.println("회원이면 1, 비회원이면 2 입력 : ");
		int no = sc.nextInt();
		
		/* 입력값이 1일 때는
		 * "로그인할 아이디 : " 출력하고, 아이디 입력 받음
		 * "암호 : " 출력하고, 암호 입력 받음
		 * 아이디와 암호를 확인 출력 처리
		 */
		
		if(no==1) {
		System.out.print("로그인할 아이디 : ");
		String id = sc.next();
		System.out.print("암호 : ");
		String password = sc.next();
		
		System.out.println("아이디 : " + id + ", "+ password);
		
		}//if
		/* 입력값이 2일 때는
		 * "회원 가입하셔야 합니다." 출력하고
		 * "이름 : " 출력하고, 이름 입력받음
		 * "아이디 지정 : "출력하고, 아이디 입력받음
		 * "암호 지정 : "출력하고, 암호 입력받음
		 * "이메일 : " 출력하고, 이메일 입력받음
		 * "전화번호 : " 출력하고, 전하번호 입력받음
		 * "성별[남/여]: " 출력하고, 성별 입력받음
		 * "나이 : " 출력하고, 나이 입력받음
		 * 
		 *  입력받은 값 모두 출력 처리
		 */
		if(no==2) {
			System.out.print("회원 가입하셔야 합니다");
			System.out.println();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("아이디 지정 : ");
			String id = sc.next();
			System.out.print("암호 지정 : ");
			String password = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			System.out.print("성별[남/여]");
			char gender = sc.next().charAt(0);
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.println("회원정보 : " + name + ", " + id + ", " + password + " ," + email + " ," + phone + ", "
					+ gender + ", " + age);
			
			
		} //if
		
	}//test3

}//class
























