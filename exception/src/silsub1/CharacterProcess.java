package silsub1;

public class CharacterProcess {
	
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
	
	
	
	//2. 클래스 만들기
	//클래스명 : CharacterProcess
	public CharacterProcess() {}
	//디폴트 생성자
	//메소드
	//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
	public int countAlpha(String s) throws CharCheckException{
		//contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수.
		//대/소문자를 구분한다.
		if(s.contains(" ")) {
			
			//에러발생 메소드 throws CharCheckException 선언
			throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
			//전달된 문자열값에서 영문자가 몇개인지 카운트
			// 변수선언 및 for ~ each문 작성
			int count = 0;
			
			//toCharArray메소드는 String 문자열을 char형 배열로 반환해주는 메소드이다.
			 for(char ch : s.toCharArray()) {
				 
		//Character클래스의 isLetter 메서드는 명시된 char값이 문자인지 여부를 판단하여 true/false를 리턴한다.
				 if(Character.isLetter(ch)) {
					 count++;
				 }
			 }
		
		
		
		
		return count;
		
	}
	//단, 공백문자가 있으면, CharCheckException 발생
	
	
	
	
	
	

}






















