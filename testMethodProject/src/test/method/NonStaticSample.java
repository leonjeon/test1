package test.method;

public class NonStaticSample {
	
	//1. 반환값 없고 매개변수 없는 메소드
	///(실행 요청시 1~45까지)의 (임의의 정수 6개) (중복되지 않게) 발생시켜 출력하는 메소드
	
	
	//배열저장용의 for(int i = 0; i < 배열의 길이만큼; i++)
	
	
	public void printLottoNumbers() {
		
		//1.배열선언 6칸 // 배열은 항상 시작은 0부터
		int[] lottos = new int[6]; // lottos 변수 생성 총 생성 숫자가 6개 int[6] 
		
		//값 발생 영역 for문으로 실행
		for(int i = 0; i < lottos.length; i++) {
			lottos[i] = (int)(Math.random() * 45) + 1; //
			
			for(int j = 0; j < i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
					break;
				}//if
			}//for
		}//for
		
		//출력
		for(int i = 0; i < lottos.length; i++)
			System.out.print(lottos[i] + "  ");
		System.out.println();
		return;
	}//class
	
	//2. 반환값 없고 매개변수 있는 메소드
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	public void outputChar(int count, char c) {
		
		
	}
	
	
	
	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	
	
	
	
	//4. 반환값 있고 매개변수 있는 메소드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리

}
