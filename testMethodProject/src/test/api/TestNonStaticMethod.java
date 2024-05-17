package test.api;

public class TestNonStaticMethod {

	public static void main(String[] args) {
		// 자바가 제공하는 메소드에 static 이 표시되지 않은 메소드 사용테스트
		// 실행할 메소드 안에 있는 this 레퍼런스에게로 주소 전달을 반드시 해야 함
		// this 에게 주소 전달을 위해서 레퍼런스.메소드명(....) 형식으로 사용함
		// 주소가 필요하므로 클래스에 대한 객체공간(인스턴스, instance)부터 할당해서 주소 발생시킴
		// 객체공간 할당을 위해, 클래스타입 레퍼런스 = new 생성자(....);
		
		StringBuilder sb = new StringBuilder("    test string   "); //18글자
		System.out.println("value : " + sb.toString());
		
		//저장용량 처리
		sb.ensureCapacity(30);
		System.out.println("저장버퍼크기 확인 : " + sb.capacity());
		
		//1. 반환값 없고 매개변수 없는 메소드
		// 레퍼런스.메소드명();
		sb.trimToSize(); //문자열값을 저장하는 버퍼의 크기를 저장된 글자갯수에 맞춤
		
		//2. 반환값 없고 매개변수 있는 메소드
		// 레퍼런스.메소드명(매개변수에게 전달할 값);
		// 전달값(argument)은 제시된 매개변수 자료형과 순서와 갯수를 반드시 일치시켜야 함
		sb.setCharAt(4, 'b');
		
		//3. 반환값 있고 매개변수 없는 메소드
		// 반환자료형 반환값받을변수 = 레퍼런스.메소드();
		//int length = sb.length();
		//System.out.println("글자갯수 : " + length);
		System.out.println("글자갯수 : " + sb.length()); //위에처럼 사용할 수 있지만 더 간략하게 변수 만들어서 사용가능
		
		//String value = sb.toString();
		//System.out.println("value : " + value);
		System.out.println("value : " + sb.toString());
		
		System.out.println("저장용량 : " + sb.capacity() + "글자");
		
		StringBuilder result = sb.reverse();
		System.out.println("result : " + result);
		
		
		//4. 반환값 있고 매개변수 있는 메소드
		// 반환자료형 반환값받을변수 = 레퍼런스.메소드(전달인자);
		//char c = sb.charAt(5);
		//System.out.println("추출된 문자 : " + c);
		System.out.println("추출된 문자 : " + sb.charAt(5));
		
		
		//글자 앞뒤의 공백을 제거하려면 ?
		//문자열 앞(leading)과 뒤(traling)의 공백을 제거하는 메소드
		//trim() : String = String 클래스에서 제공되고 있음
		sb.reverse();
		String s = sb.toString();
		String str = s.trim();
		System.out.println("공백제거 결과 : " + str);
		System.out.println("글자갯수 : " + str.length());

	}

}
