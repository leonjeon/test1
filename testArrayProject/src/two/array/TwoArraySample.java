package two.array;

public class TwoArraySample {
	//2차원배열 기능 제공용
	
	public void testTwoArray() {
		//배열 선언과 할당시에 배열기호[]가 한 개 사용 : 1차원배열
		//1차원배열 : 자료형이 같은 변수들의 묶음
		//자료형이 같은 1차원배열들의 묶음 : 2차원배열
		//배열 선언과 할당시에 배열기호 [][] 두 개 사용
		
		//int[] ar = {10, 20, 30};
		//int[] br = {11, 22, 33};
		//int[] cr = {15, 25, 35};
		
		//3묶음 3행3열 정변배열
		//3가지 선언방법
		int[][] tar = {{10, 20, 30}, {11, 22, 33}, {15, 25, 35}};
		//int[] tar[] = {{10, 20, 30}, {11, 22, 33}, {15, 25, 35}};
		//int tar[][] = {{10, 20, 30}, {11, 22, 33}, {15, 25, 35}};
		
		System.out.println("행 갯수 : " + tar.length); //3행
		
		for(int i = 0; i < tar.length; i++) {
			//각 행별 열갯수(1차원배열 방갯수)
			System.out.println(i + "행이 참조하는 1차원 배열의 값갯수 : " + tar[i].length + "열");
		}
		
		//모든 값 출력 처리 : 테이블 구조로 주로 표현함 (3행 3열 => 3줄 3칸)
		//행반복 : 0행, 1행, 2행
		for(int row = 0; row < tar.length; row++) {
			
			//각 행별 열 반복 처리
			for(int col = 0; col < tar[row].length; col++) {
				System.out.print(tar[row][col] + "   ");
			}//inner for
			System.out.println(); //줄바꿈 처리(엔터키)
		}//out for
	}// method
	
	public void testTwoArray2() {
		//2차원배열 선언 : 배열 레퍼런스(주소저장용)변수 만들기
		//자료형[][] 배열명;  자료형[] 배열명[]; 자료형 배열명[][] ==> 3가지 선언방법
		int[][] tar; //지역변수 : stack 메모리에 할당
		
		//2차원배열의 첫번째 new 할당은 레퍼런스(주소)변수들의 배열할당이다.
		tar = new int[3][]; //열갯수는 생략할 수 있음(행만 입력 가능)
		//2차원배열의 두번째 new 할당은 1차원배열 공간 할당이다.
		tar[0] = new int[5];
		tar[1] = new int[7];
		tar[2] = new int[3];
		//자바는 2차원배열이 참조하는 1차원 배열들의 값(방) 갯수가 달라도 됨 : 가변배열이라고 함
		
		System.out.println("tar.length : " + tar.length + "행");
		
		for(int i = 0; i < tar.length; i++) { //방갯수 : 열갯수 몇행 몇열
			System.out.println(i + "행이 참조하는 1차원 배열 방 갯수 : " + tar[i].length + "열");
		}
		
		
		//위 메소드에서 복사한 데이터
		//모든 값 출력 처리 : 테이블 구조로 주로 표현함 (3행 3열 => 3줄 3칸)
				//행반복 : 0행, 1행, 2행
		for(int row = 0; row < tar.length; row++) {
			
			//각 행별 열 반복 처리
			for(int col = 0; col < tar[row].length; col++) {
				System.out.print(tar[row][col] + "   ");
			}//inner for
			System.out.println(); //줄바꿈 처리(엔터키)
		}//out for
		
	}//method
	
	public void testTwoArray3() {
		//정변배열 : 각 행별 열 갯수가 같은(동일한) 배열
		int[][] tar = new int[5][3];
		
		//행에 대한 반복
		for(int i = 0; i < tar.length; i++) {
			System.out.print(i + "행 : ");
			//각 행별 열의대한 반복
			for(int j = 0; j < tar[i].length; j++) {
				tar[i][j] = j + 1; //1,2,3 순으로 기록
				System.out.print(tar[i][j] + "  ");
			}//inner for
			System.out.println();
		}//out for
	}//method
	
	public void testTwoArray4() {
		//가변배열 : 행이 참조하는 1차원 배열의 갯수가 다를 때
		int[][] tar = new int[3][];
		//위의 선언은 heap 메모리에 주소 기록할 레퍼런스 3개를 배열로 할당함
		
		tar[0] = new int[5];
		tar[1] = new int[3];
		tar[2] = new int[7];
		
		for(int i = 0; i < tar.length; i++) {
			System.out.print(i + "행 : ");
			//각 행별 열의대한 반복
			for(int j = 0; j < tar[i].length; j++) {
				tar[i][j] = j + 1; //1,2,3 순으로 기록
				System.out.print(tar[i][j] + "  ");
			}//inner for
			System.out.println();
		}//out for
	}

}//class
























