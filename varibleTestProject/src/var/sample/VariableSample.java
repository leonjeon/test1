package var.sample;

//기능 제공용 클래스임 : main 메소드가 없음
public class VariableSample {
	
	//멤버함수 (method) == 기능
	//접근제힌자 [예약어] 반환자료형 메소드명([자료형 매개변수명]) <- 선택사항 { 기능에 대한 처리내용 코드 작성 }
	public void makeVariable() {
		//1. 변수 선언 : 메모리(RAM)에 값(DATA)을 기록할 방(공간)을 만드는 것
		//자료형 변수명;
		//자료형(DATA TYPE : 값의 종류) : 값을 구분하기 위한 단어
		//자료형은 기본 자료형(Primitive Type)과 참조 자료형(Reference Type)이 구분됨
		//기본자료형은 boolean, byte, shory, int, long, float, double, char 8개가 제공됨
		//변수명은 네이밍 룰에 맞춰서 임의대로 지어주면 됨
		boolean flag; // 1 or 0
		byte bnum; // 크기는 1byte 정수만 가능
		short snum;
		int score;
		long  pay;
		float area;
		double perimeter;
		char grade;
		//bnum,snum - 이런식으로의 표기는 권장하지 않는다
		
		//2. 준비된 변수방에 cpu가 사용할 값을 기록해 넣음
		// 대입연산자 = 사용함
		// 변수명 = 기록할값; (왼쪽은 변수명, 오른쪽은 기록할값) 또는 변수명 = 계산식;
		// 변수 선언시 사용된 자료형에 해당되는 값만 변수에 기롣할 수 있음
		flag = false;       // 참(true), 거짓(false)
		bnum = 100;     //1byte : -128 ~ 127
		snum = 12345; //2byte : -32768 ~ 32767
		score = 95;        //4byte : -2147483648 ~ 2147483647
		pay = 5000000000L;    //8byte : long 형 정수 값은 반드시 값 뒤에 대문자"L"을 표기해야 함!
		area = 34.5f;      //4byte : 소수점아래 7번째 자리까지 취급함, float형 실수 값 뒤에는 반드시 소문자 "f"를 표기해야 함.
		perimeter = 250.0; //8byte : 정밀도가 15번째 자리까지 취급함. d의 선택은 사용해되고 안해도 되고 선택사항
		grade = 'A';  //문자 하나를 표기할 때는 반드시 작은따옴표 '문자하나' 로 묶어줘야 함
		
		//3. 값 사용 : 값이 기록된 변수명을 코드 구문으로 사용하면, 변수명 안의 값을 읽어감.
		System.out.println("flag : " + flag);
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("score: " + score);
		System.out.println("pay: " + pay);
		System.out.println("area: " + area);
		System.out.println("perimeter : " + perimeter);
		System.out.println("grade : " + grade);
	}

}
