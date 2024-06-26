		package logic.home.view;

import java.util.Scanner;

import logic.home.model.DoWhileSample;
import logic.home.model.ForSample;
import logic.home.model.IfSample;
import logic.home.model.PrimitiveTypeSample;
import logic.home.model.StaticMethodSample;
import logic.home.model.SwitchSample;
import logic.home.model.VariableSample;
import logic.home.model.WhileSample;

public class Menu { //클래스에 소속된 명은 멤버라 부르는데 대표적으로 3개가 있다.
	//멤버변수(Field)
	//작성방법 : 접근제한자 [예약어] 자료형 변수명 [= 초기값];
	//Filed의 기본은 private 원칙
	private static Scanner sc = new Scanner(System.in); //기본으로 사용해야하고, private 생략 가능.
	
	//생성자함수(Constructor) : 클래스가 가진 모든 멤버가 static이면 필요없음.
	
	//멤버변수(Method)
	public static void mainMenu() {
		do { //do와 while사이에 실행할 문장을 입력
			System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");

			System.out.println("1. 변수 테스트");
			System.out.println("2. 기본 자료형 테스트");
			System.out.println("3. if문 테스트");
			System.out.println("4. switch문 테스트");
			System.out.println("5. for문 테스트");
			System.out.println("6. while문 테스트");
			System.out.println("7. do~while문 테스트");
			System.out.println("8. break문 테스트");
			System.out.println("9. continue문 테스트");
			System.out.println("10. static 메소드 사용 테스트");
			System.out.println("11. non-static 메소드 사용 테스트");
			System.out.println("12. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			// int no = new Scanner(System.in).nextInt(); - 메소드 안에서 하나씩 선언하면 사용할 시
			// 필드를 사용한다면
			int no = sc.nextInt();
			
			switch(no) {
			case 1:	subVarMenu();	break;
			case 2:	subPTypeMenu();	break;
			case 3:	subIfMenu();	break;
			case 4:	subSwitchMenu();	break;
			case 5:	subForMenu();	break;
			case 6:	subWhileMenu();	break;
			case 7:	subDoWhileMenu();	break;
			case 8:	subBreakMenu();	break;
			case 9:	subContinueMenu();	break;
			case 10: subStaticMethodMenu();	break;
			case 11: subNonStaticMethodMenu();	break;
			case 12: System.out.println("정말로 끝내시겠습니까? (Y | N) : ");
					 //char answer = sc.next().toUpperCase().charAt(0); 
					 //toUpperCase의 역할은 대문자를 소문자, 소문자를 대문자로 변형해주는 역할
					 //if(answer == 'Y') {
					 if(sc.next().toUpperCase().charAt(0) == 'Y') {
						// System.exit(0);  //프로그램을 직접 종료하는 방법
						 return;
					 }
					 break;
			default: System.out.println("잘못된 번호를 입력하셨습니다.");
					 System.out.println("확인하고 다시 입력하세요.");
			} //switch
			
		}while(true); //while은 절때 가로안에 비워두면 안된다.
		//true 무조건 반복실행해라
	}

	public static void subVarMenu() { //지역변수란 메소드안에서 생성해라
		//클래스가 제공하는 메소드를 사용하려면, 먼저 클래스에 대한 객체 생성부터 해야 함.
		//작성방법 : 클래스명 레퍼런스변수 = new 클래스생성자([전달인자]);
		VariableSample ref = new VariableSample(); //패키지가 다르기 때문에 import 선언
		
		do {
			System.out.println("\n*** 변수 테스트 부메뉴 ***");

			System.out.println("1. 내 신상정보 변수에 담아 출력하기");
			System.out.println("2. 사원정보를 키보드로 입력받아 출력하기");
			System.out.println("3. 기본 자료형 변수의 초기값 확인하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1:	//VariableSample 클래스의 myProfile() 실행; 
					ref.myProflie();    break;
			case 2:	//VariableSample 클래스의 empInformation() 실행; 
					ref.empInformation(); break;
			case 3:	//VariableSample 클래스의 defaultValue() 실행; 
					ref.defaultValue(); break;
			case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
					return;	//이전 메뉴로 되돌아감.
			default:System.out.println("잘못된 번호를 입력하셨습니다.");
					System.out.println("확인하고 다시 입력하세요.");
			}
			
		}while(true);
	}

	public static void subPTypeMenu() {
		PrimitiveTypeSample ref = new PrimitiveTypeSample();
		
		do {
			System.out.println("*** 기본자료형 테스트 부메뉴 ***");

			System.out.println("1. 기본자료형 메모리 할당크기 확인하기");
			System.out.println("2. 기본자료형 값의 최소값, 최대값 출력하기");
			System.out.println("3. 기본자료형 비트갯수 확인하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			
			case 1:	//PrimitiveTypeSample 클래스의 typeSize() 실행; 
					ref.typeSize();  break;
			case 2:	//PrimitiveTypeSample 클래스의 minMaxValue() 실행; 
					ref.minMaxValue();  break;
			case 3:	//PrimitiveTypeSample 클래스의 bitSize() 실행; 
					ref.bitSize();  break;
			case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
				return;	//이전 메뉴로 되돌아감.
			default:	System.out.println("잘못된 번호를 입력하셨습니다.");
						System.out.println("확인하고 다시 입력하세요.");
						}
			
			
		}while(true);
	}

	public static void subIfMenu() {
		IfSample ref = new IfSample();
		
		do {
			System.out.println("\n*** if문 테스트 부메뉴 ***");

			System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기");
			System.out.println("2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기");
			System.out.println("3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기");
			System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기");
			System.out.println("5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기");
			System.out.println("6. 점수를 입력받아, 학점 확인하기");
			System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기");
			System.out.println("8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no)
			{
			case 1:	//IfSample 클래스의 maxNumber() 실행; 
					ref.maxNumber();  break;
			case 2:	//IfSample 클래스의 minNumber() 실행; 
					ref. minNumber(); break;
			case 3:	//IfSample 클래스의 threeMaxMin() 실행; 
					ref.threeMaxMin(); break;
			case 4:	//IfSample 클래스의 checkEven() 실행; 
					ref.checkEven();  break;
			case 5:	//IfSample 클래스의 isPassFail() 실행; 
					ref.isPassFail(); break;
			case 6:	//IfSample 클래스의 scoreGrade() 실행; 
					ref.scoreGrade(); break;
			case 7:	//IfSample 클래스의 checkPlusMinusZero() 실행;
					ref.checkPlusMinusZero();  break;
			case 8:	//IfSample 클래스의 whatCaracter() 실행; 
					ref.whatCaracter(); break;
			case 9:	System.out.println("메인 메뉴로 돌아갑니다.");
				return;	//이전 메뉴로 되돌아감.
			default:	System.out.println("잘못된 번호를 입력하셨습니다.");
						System.out.println("확인하고 다시 입력하세요.");
			}
		}while(true);
	
		
	}

	public static void subSwitchMenu() {
		SwitchSample ss = new SwitchSample();
		
		do {
			System.out.println("\n *** switch문 테스트 부메뉴 *** ");

			System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기");
			System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no)
			{
			case 1:	//SwitchSample 클래스의 calculator() 실행; 
					ss.calculator();  break;
			case 2:	//SwitchSample 클래스의 fruitPrice() 실행; 
					ss.fruitPrice();  break;
			case 3:	System.out.println("메인 메뉴로 돌아갑니다.");
				return;	//이전 메뉴로 되돌아감.
			default:	System.out.println("잘못된 번호를 입력하셨습니다.");
						System.out.println("확인하고 다시 입력하세요.");
			}
			
		}while(true);
		
	}

	public static void subForMenu() {
		ForSample fs = new ForSample();
		
		do {
		System.out.println("*** for문 테스트 부메뉴 ***");

		System.out.println("1. 1~10까지 정수들의 합계 구하기");
		System.out.println("2. 1~100사이의 짝수들의 합게 구하기");
		System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");
		System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");
		System.out.println("5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기");
		System.out.println("6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
		System.out.println("7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)");
		System.out.println("8. 구구단 2단부터 9단까지 출력하기");
		System.out.println("9. 이전 메뉴로 가기");
		System.out.println("메뉴 선택 : ");
		int no = sc.nextInt();
		
		switch(no)
		{
		case 1:	//ForSample 클래스의 sum1To10() 실행; 
					fs.sum1To10();  break;
		case 2:	//ForSample 클래스의 sumEven1To100() 실행; 
					fs.sumEven1To100();  break;
		case 3:	//ForSample 클래스의 oneGugudan() 실행; 
					fs.oneGugudan();  break;
		case 4:	//ForSample 클래스의 sumMinToMax() 실행; 
					fs.sumMinToMax();  break;
		case 5:	//ForSample 클래스의 printStar() 실행; 
					fs.printStar();  break;
		case 6:	//ForSample 클래스의 printNumberStar() 실행; 
					fs.printNumberStar();  break;
		case 7:	//ForSample 클래스의 printTriangleStar() 실행; 
					fs.printTriangleStar(); break;
		case 8:	//ForSample 클래스의 guguDan() 실행; 
					fs.guguDan();  break;
		case 9:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	System.out.println("잘못된 번호를 입력하셨습니다.");
					System.out.println("확인하고 다시 입력하세요.");
		}
		
		}while(true);
		
	}

	public static void subWhileMenu() {
		
		WhileSample ws = new WhileSample();
		
		do {
			System.out.println( "*** while문 테스트 부메뉴 ***");

			System.out.println( "1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)");
			System.out.println( "2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)");
			System.out.println( "3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");
			System.out.println( "4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
			System.out.println( "5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");
			System.out.println( "6. 이전 메뉴로 가기");
			System.out.println( "메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) 
			{
			case 1:	//WhileSample 클래스의 printUniCode() 실행; 
						ws.printUniCode(); break;
			case 2:	//WhileSample 클래스의 sum1To100() 실행; 
						ws.sum1To100(); break;
			case 3:	//WhileSample 클래스의 numberGame() 실행; 
						ws.numberGame(); break;
			case 4:	//WhileSample 클래스의 countCharacter() 실행; 
						ws.countCharacter(); break;
			case 5:	//WhileSample 클래스의 countInChar() 실행; 
						ws.countInChar(); break;
			case 6:	System.out.println("메인 메뉴로 돌아갑니다.");
				return;	//이전 메뉴로 되돌아감.
			default:	System.out.println("잘못된 번호를 입력하셨습니다.");
						System.out.println("확인하고 다시 입력하세요.");
			}
			
			
		
			}while(true);
		
	}

	public static void subDoWhileMenu() {
		
		DoWhileSample dw = new DoWhileSample();
		
		System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기");
		System.out.println("2. 버거킹 메뉴 주문 테스트");
		System.out.println("3. 문자열 입력받아, 모든 글자 영문자다 / 영문자 아니다. 출력하기");
		System.out.println("4. 이전 메뉴로 가기");
		System.out.println("메뉴 선택 :"); 
		int no = sc.nextInt();
		
		switch(no)
		{
		case 1:	//DoWhileSample 클래스의 addDashToken() 실행; 
				dw.addDashToken();break;
		case 2:	//DoWhileSample 클래스의 burgerKingMenu() 실행; 
				dw.burgerKingMenu();	break;
		case 3:	//DoWhileSample 클래스의 isStringAlphabet() 실행; 
				dw.isStringAlphabet();	break;
		case 4:	System.out.println("메인 메뉴로 돌아갑니다.");
			return;	//이전 메뉴로 되돌아감.
		default:	//잘못된 값 입력시 메뉴 다시 출력되게 처리
		}
	}

	public static void subBreakMenu() {
	}

	public static void subContinueMenu() {
	}

	public static void subStaticMethodMenu() {
		StaticMethodSample ref = new StaticMethodSample();
		
		do {
			System.out.println("\n*** static 메소드 사용 테스트 부메뉴 ***");

			System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");
			System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");
			System.out.println("3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1:	//StaticMethodSample 클래스의 testMathRandom() 실행; 
					ref.testMathRandom(); break;
			case 2:	//StaticMethodSample 클래스의 testMathAbs() 실행; 
					ref.testMathAbs(); break;
			case 3:	//StaticMethodSample 클래스의 testMathMax() 실행; break;
					ref.testMathMax(); break;
			case 4:	//System.out.println("메인 메뉴로 돌아갑니다.");
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;	//이전 메뉴로 되돌아감.
			default:System.out.println("잘못된 번호를 입력하셨습니다.");
					System.out.println("확인하고 다시 입력하세요.");
			}
		}while(true);
		
	}

	public static void subNonStaticMethodMenu() {
	}
}
















