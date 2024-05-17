package silsub1;

public class CharCheckException extends Exception{
	/*<문제 1>
	 1. 사용자 정의 예외클래스 만들기
		클래스명 : CharCheckException
	 2. 클래스 만들기
		클래스명 : CharacterProcess
		디폴트 생성자
		메소드
		//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
		public int countAlpha(String s){}
		//단, 공백문자가 있으면, CharCheckException 발생
	 3. 실행용 클래스 : TestSilsub (main 포함)
		실행할 메소드 작성 : public void silsub1(){}
		키보드로 문자열을 입력받아(Scanner 사용)
		countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
		- 반드시 try ~ catch 문 사용.
		에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."*/
	
	
	//사용자 정의 예외클래스
	public CharCheckException(String message) {
		super(message);
	}
	
	

}
