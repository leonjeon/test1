package io.silsub2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SungjukProcess {

	
	//	- Field
    //	- sc:Scanner	//초기화 객체 생성함
   //	 - main() 메소드 포함
   //		1. 실행을 위한 객체 생성
   //		2. 메소드 실행
	private Scanner sc = new Scanner(System.in);
	
	public SungjukProcess() {}
	
	
	//파일입출력스트림과 보조스트림 DataInputStream/DataOutputStream 사용
	
	public void sungjukSave() {
		
		
		//선언먼저 시작
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat"))){
			
//			1. 정수형으로국어, 영어, 수학 점수를 입력받아,	
//			2. 총점(int), 평균(double)을 계산하고
//			3. "score.dat" 파일에 국, 영, 수, 총점, 평균을 기록 저장함
			//1번 2번 do ~ while문 안에서 작성
			do {
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
				System.out.print("수학 점수 : ");
				int mat = sc.nextInt();
				
				int tot = kor + eng + mat;
				double avg = tot / 3.0;
				
				//write 는 쓰기용 메소드 변수값을 버퍼에 보내서 내보내는 
				//메소드 공통으로 write()메소드 사용함
				dout.writeInt(kor);
				dout.writeInt(eng);
				dout.writeInt(mat);
				dout.writeInt(tot);
				dout.writeDouble(avg);

//			4. "계속 저장하시겠습니까? (y/n) : " 에서 'Y'이면 반복 실행함
				//지문대로 출력문 작성 후 do ~ while 문에 조건 작성
				System.out.print("계속 저장하시겠습니까? (y/n) : ");
			//조건 작성하고 맞으면 저장
			}while(sc.next().toUpperCase().charAt(0) != 'N');
//			5. 'N' 이면 반복 종료하고, "score.dat 에 저장 완료." 출력함			
			System.out.println("score.dat 에 저장 완료.");
	
		} catch (Exception e) {
			System.out.println("score.dat 파일에 저장실패...");
			e.printStackTrace();
		}

		
		
		
		
		
	}
	
	public void scoreRead() {
		
//	    1. 파일에 기록된 정보를 국, 영, 수, 총점, 평균 순으로 읽어와서
//   	2. 변수에 저장하고 출력하고, 총점의 합, 평균의 합을 구하고
//			 단, 평균은 소숫점 둘째자리까지만 출력되게 함
//	    3. 전체 총점과 전체 평균을 읽어온 횟수로 나누어 
//			읽은 횟수와 전체총점, 전체 평균 화면 출력함
//			 단, 전체 평균은 소숫점 둘째자리까지만 출력되게 함
//		4. 읽기가 끝나면 "score.dat 파일 읽기 완료." 출력
		
	}

	public static void main(String[] args) {

		

	}

}
