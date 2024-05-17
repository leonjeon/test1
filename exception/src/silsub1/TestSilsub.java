package silsub1;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class TestSilsub {
	/*3. 실행용 클래스 : TestSilsub (main 포함)
	실행할 메소드 작성 : public void silsub1(){}
	키보드로 문자열을 입력받아(Scanner 사용)
	countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
	- 반드시 try ~ catch 문 사용.
	에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."*/
	
	public void silsub1() {
		
		//키보드로 입력받아야되니 스캐너 선언
		Scanner sc = new Scanner(System.in);
		
		//문자열을 처리하는 클래스 호출
		CharacterProcess chP = new CharacterProcess();
		
		try {
			System.out.print("문자열을 입력하세요 : ");
			String ipS = sc.nextLine();
			
		}
		
	}
	

	public static void main(String[] args) {

	}

}
